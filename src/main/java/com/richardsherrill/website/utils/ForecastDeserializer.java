package com.richardsherrill.website.utils;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.richardsherrill.website.model.weather.Forecast;
import com.richardsherrill.website.model.weather.ForecastDay;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Deserializer class for Forecast object
 * (JSON structure example available in forecast.json file)
 */
public class ForecastDeserializer extends JsonDeserializer<Forecast> {

    @Override
    public Forecast deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        final JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        final JsonNode forecastNode = jsonNode.get("forecast").get("forecastday");
        //System.out.println("forecast node size: " + forecastNode.size());
        final List<ForecastDay> forecastDayList = new ArrayList<>();

        if (forecastNode.isArray()) {
            final ArrayNode arrayNode = (ArrayNode) forecastNode;
            arrayNode.forEach(node -> {
                final ForecastDay forecastDay = new ForecastDay();
                forecastDay.setDate(node.get("date").asText());
                forecastDay.setHighF(node.get("day").get("maxtemp_f").asText());
                forecastDay.setHighC(node.get("day").get("maxtemp_c").asText());
                forecastDay.setLowF(node.get("day").get("mintemp_f").asText());
                forecastDay.setLowC(node.get("day").get("mintemp_c").asText());
                forecastDay.setCondition(node.get("day").get("condition").get("text").asText());

                forecastDayList.add(forecastDay);
            });
        }

        System.out.println("forecast list size: " + forecastDayList.size());

        return new Forecast(forecastDayList);
    }
}
