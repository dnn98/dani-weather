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

	public String getCityId(String con, Date datetime) throws IOException {
		if (con == null) {
			return "Invalid city";
		}
		if (datetime == null) {
			datetime = new Date();
		}
		if (datetime.before(new Date(new Date().getTime() + (1000 * 60 * 60 * 24 * 6)))) {
			JSONArray cityarray = new JSONArray(con);
			String cityid = cityarray.getJSONObject(0).get("woeid").toString();
			return cityid;
		}else {
			return "Invalid date";
		}
	}
	
	public String getCityWeather(String con, Date datetime) throws IOException {
		if (con == null) {
			return "Invalid city id";
		}
		if (datetime == null) {
			datetime = new Date();
		}
		if (datetime.before(new Date(new Date().getTime() + (1000 * 60 * 60 * 24 * 6)))) {
			//JSONArray results = new JSONObject(con).getJSONArray("consolidated_weather");
			JSONArray results = new JSONObject(con).getJSONArray("consolidated_weather");
			for (int i = 0; i < results.length(); i++) {
				if (new SimpleDateFormat("yyyy-MM-dd").format(datetime)
					.equals(results.getJSONObject(i).get("applicable_date").toString())) {
					return results.getJSONObject(i).get("weather_state_name").toString();
				}
			}
		}else {
			return "Invalid date";
		}
		return "";
	}
}