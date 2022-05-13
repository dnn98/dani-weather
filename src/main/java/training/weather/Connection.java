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
	
	public String connect(String query) throws IOException {
		HttpRequestFactory rf = new NetHttpTransport().createRequestFactory();
		HttpRequest req = rf.buildGetRequest(new GenericUrl(query));
		String r = req.execute().parseAsString();
		return r;
	}
}