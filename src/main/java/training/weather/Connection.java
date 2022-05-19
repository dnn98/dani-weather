package training.weather;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;

public class Connection {
	public Connection() {
		
	}
	
	public String connectCityId(String param) throws IOException {
		HttpRequestFactory rf = new NetHttpTransport().createRequestFactory();
		HttpRequest req = rf.buildGetRequest(new GenericUrl("https://www.metaweather.com/api/location/search/?query="+param));
		String r = req.execute().parseAsString();
		return r;
	}
	
	public String connectCityWeather(String param) throws IOException {
		HttpRequestFactory rf = new NetHttpTransport().createRequestFactory();
		HttpRequest req = rf.buildGetRequest(new GenericUrl("https://www.metaweather.com/api/location/"+param));
		String r = req.execute().parseAsString();
		return r;
	}
}