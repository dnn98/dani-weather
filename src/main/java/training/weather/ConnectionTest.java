package training.weather;

public class ConnectionTest {
	public ConnectionTest() {
		
	}
	
	public String connectCityId(String param) {
		String apiResponseCityArray = "[{\"latt_long\":\"40.420300,-3.705770\",\"woeid\":766273,\"title\":\"Madrid\",\"location_type\":\"City\"}]";	
		return apiResponseCityArray;
	}
	
	public String connectCityWeather(String param) {
		String apiResponseResult = "{\"consolidated_weather\":[{\"visibility\":14.411151375964367,\"created\":\"2022-05-18T10:15:55.262572Z\",\"applicable_date\":\"2022-05-18\",\"wind_direction\":211.2013313980823,\"predictability\":70,\"wind_direction_compass\":\"SSW\",\"weather_state_name\":\"Light Cloud\",\"min_temp\":15.945,\"weather_state_abbr\":\"lc\",\"the_temp\":28.729999999999997,\"humidity\":37,\"wind_speed\":4.245472711307298,\"id\":6546293431205888,\"max_temp\":31.435000000000002,\"air_pressure\":1017.5},{\"visibility\":14.470492324823033,\"created\":\"2022-05-18T10:15:58.135884Z\",\"applicable_date\":\"2022-05-19\",\"wind_direction\":155.11786537824972,\"predictability\":73,\"wind_direction_compass\":\"SSE\",\"weather_state_name\":\"Showers\",\"min_temp\":17.134999999999998,\"weather_state_abbr\":\"s\",\"the_temp\":31.575,\"humidity\":33,\"wind_speed\":5.197282076218882,\"id\":4694349167198208,\"max_temp\":33.46,\"air_pressure\":1017},{\"visibility\":14.463346556112304,\"created\":\"2022-05-18T10:16:01.185035Z\",\"applicable_date\":\"2022-05-20\",\"wind_direction\":89.23890856455279,\"predictability\":71,\"wind_direction_compass\":\"E\",\"weather_state_name\":\"Heavy Cloud\",\"min_temp\":19.05,\"weather_state_abbr\":\"hc\",\"the_temp\":30.72,\"humidity\":28,\"wind_speed\":5.2380549634640365,\"id\":5853048229330944,\"max_temp\":33.58,\"air_pressure\":1019.5},{\"visibility\":14.409908633579892,\"created\":\"2022-05-18T10:16:04.151395Z\",\"applicable_date\":\"2022-05-21\",\"wind_direction\":88.33329571956082,\"predictability\":73,\"wind_direction_compass\":\"E\",\"weather_state_name\":\"Showers\",\"min_temp\":20.075,\"weather_state_abbr\":\"s\",\"the_temp\":33.010000000000005,\"humidity\":25,\"wind_speed\":5.448686713680108,\"id\":5735074168307712,\"max_temp\":35.66,\"air_pressure\":1017.5},{\"visibility\":14.358645510220313,\"created\":\"2022-05-18T10:16:07.154900Z\",\"applicable_date\":\"2022-05-22\",\"wind_direction\":188.8562547118564,\"predictability\":73,\"wind_direction_compass\":\"S\",\"weather_state_name\":\"Showers\",\"min_temp\":20.335,\"weather_state_abbr\":\"s\",\"the_temp\":27.369999999999997,\"humidity\":33,\"wind_speed\":4.882363778066757,\"id\":5687174746865664,\"max_temp\":31.505,\"air_pressure\":1014.5},{\"visibility\":9.999726596675416,\"created\":\"2022-05-18T10:16:10.150717Z\",\"applicable_date\":\"2022-05-23\",\"wind_direction\":227.99999999999997,\"predictability\":70,\"wind_direction_compass\":\"SW\",\"weather_state_name\":\"Light Cloud\",\"min_temp\":17.215000000000003,\"weather_state_abbr\":\"lc\",\"the_temp\":28.2,\"humidity\":30,\"wind_speed\":4.042736220472441,\"id\":6578611181060096,\"max_temp\":31.055,\"air_pressure\":1013}]}";
		return apiResponseResult;
	}
}