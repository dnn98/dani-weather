package training.weather;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import org.junit.Test;
import org.mockito.Mockito;

public class WeatherForecastTest {
	
	@Test
	public void cityIdTest() throws IOException, ParseException {
		WeatherForecast weatherForecast = new WeatherForecast();
		
		String cityName = "Madrid";
		
		String expectedId = "766273";
		
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		Date weatherDate = d.parse("18/05/2022");
		
		//Primera peticion con Mock
		/*
		Connection conMock = Mockito.mock(Connection.class);
		conMock = new Connection();
		when(conMock.connectCityId(cityName)).thenReturn(apiResponseCityArray);
		String cityId = weatherForecast.getCityId(conMock.connectCityId(cityName), new Date());
		*/
		
		ConnectionTest conTest = new ConnectionTest();
		String cityId = weatherForecast.getCityId(conTest.connectCityId(cityName), weatherDate);

		assertEquals(expectedId, cityId);
	}
	
	@Test
	public void weatherTest() throws ParseException, IOException {
		WeatherForecast weatherForecast = new WeatherForecast();

		String cityId = "766273";
		
		String expectedWeather = "Light Cloud";
		
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		Date weatherDate = d.parse("18/05/2022");
		
		//Segunda peticion con Mock
		/*
		Connection conMock = Mockito.mock(Connection.class);
		conMock = new Connection();
		when(conMock.connectCityWeather(cityId)).thenReturn(apiResponseResult);
		String weather = weatherForecast.getCityWeather(conMock.connectCityWeather(cityId), new Date());
		*/
		
		ConnectionTest conTest = new ConnectionTest();
		String weather = weatherForecast.getCityWeather(conTest.connectCityWeather(cityId), weatherDate);
				
		assertEquals(expectedWeather, weather);	
	}
	
	@Test
	public void cityIdTestNull() throws IOException, ParseException {
		WeatherForecast weatherForecast = new WeatherForecast();
						
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		Date weatherDate = d.parse("18/05/2022");
		
		ConnectionTest conTest = new ConnectionTest();
		String cityId = weatherForecast.getCityId(null, weatherDate);

		System.out.println(cityId);
	}
	
	@Test
	public void weatherTestNull() throws IOException, ParseException {
		WeatherForecast weatherForecast = new WeatherForecast();
				
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		Date weatherDate = d.parse("18/05/2022");
		
		ConnectionTest conTest = new ConnectionTest();
		String weather = weatherForecast.getCityWeather(null, weatherDate);
				
		System.out.println(weather);
	}
	
	@Test
	public void cityIdTestInvalidDate() throws IOException, ParseException {
		WeatherForecast weatherForecast = new WeatherForecast();
		
		String cityName = "Madrid";
				
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		Date weatherDate = d.parse("18/05/2025");
		
		ConnectionTest conTest = new ConnectionTest();
		String cityId = weatherForecast.getCityId(conTest.connectCityId(cityName), weatherDate);

		System.out.println(cityId);
	}
	
	@Test
	public void weatherTestInvalidDate() throws ParseException, IOException {
		WeatherForecast weatherForecast = new WeatherForecast();

		String cityId = "766273";
				
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		Date weatherDate = d.parse("18/05/2025");
		
		ConnectionTest conTest = new ConnectionTest();
		String weather = weatherForecast.getCityWeather(conTest.connectCityWeather(cityId), weatherDate);
				
		System.out.println(weather);
	}
	
	//En el momento de escribir este test, la api se encontraba caida
	@Test
	public void apiTest() throws IOException {
		Connection con = new Connection();
		WeatherForecast weatherForecast = new WeatherForecast();
		String cityName = "Madrid";
		String cityId = weatherForecast.getCityId(con.connectCityId(cityName), new Date());
		String forecast = weatherForecast.getCityWeather(con.connectCityWeather(cityId), new Date());
		System.out.println(forecast);
	}
	
	
}
