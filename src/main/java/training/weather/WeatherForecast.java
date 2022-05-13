package training.weather;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherForecast {

	public String getCityWeather(String city, Date datetime) throws IOException {
		Connection con = new Connection();
		if (datetime == null) {
			datetime = new Date();
		}
		if (datetime.before(new Date(new Date().getTime() + (1000 * 60 * 60 * 24 * 6)))) {
			JSONArray cityarray = new JSONArray(con.connect("https://www.metaweather.com/api/location/search/?query=" + city));
			String cityid = cityarray.getJSONObject(0).get("woeid").toString();
			
			JSONArray results = new JSONObject(con.connect("https://www.metaweather.com/api/location/" + cityid)).getJSONArray("consolidated_weather");
			for (int i = 0; i < results.length(); i++) {
				if (new SimpleDateFormat("yyyy-MM-dd").format(datetime)
					.equals(results.getJSONObject(i).get("applicable_date").toString())) {
					return results.getJSONObject(i).get("weather_state_name").toString();
				}
			}
		}
		return "";
	}
}