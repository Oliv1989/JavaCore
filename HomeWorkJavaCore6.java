import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;

public class HomeWorkJavaCore6 {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClientBuilder.create().build();
        ObjectMapper objectMapper = new ObjectMapper();
        HttpGet request = new HttpGet("http://dataservice.accuweather.com/forecasts/v1/daily/5day/294021?apikey=JUBXhN3gbnWkLQzdkRKq4CZ9HZRsXbGe");

        try {
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();

            String content = EntityUtils.toString(entity);
            JsonNode DailyForecasts = objectMapper
                    .readTree(content);
            DailyForecasts = DailyForecasts.at("/DailyForecasts");

            for (Object jsonNode: DailyForecasts) {
                ArrayList tmpList = readJson(jsonNode);
                System.out.println("Moscow weather is "+tmpList.get(1)+" "+tmpList.get(2)+" at "+tmpList.get(0));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList readJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper
                .readTree(String.valueOf(object));
        JsonNode Date = jsonNode.at("/Date");
        JsonNode minValue = jsonNode.at("/Temperature/Minimum/Value");
        JsonNode maxValue = jsonNode.at("/Temperature/Maximum/Value");
        JsonNode Unit = jsonNode.at("/Temperature/Maximum/Unit");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Date.asText());
        arrayList.add((minValue.asDouble()+maxValue.asDouble())/2);
        arrayList.add(Unit.asText());
        return arrayList;
    }
}
