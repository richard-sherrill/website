package com.richardsherrill.website.utils;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.richardsherrill.website.model.weather.CurrentWeather;

import java.io.IOException;

/**
 * Deserializer class for CurrentWeather object
 */
public class CurrentWeatherDeserializer extends JsonDeserializer<CurrentWeather> {

    @Override
    public CurrentWeather deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        CurrentWeather currentWeather = new CurrentWeather();

        currentWeather.setCity(jsonNode.get("location").get("name").asText());
        currentWeather.setState(jsonNode.get("location").get("region").asText());
        currentWeather.setCountry(jsonNode.get("location").get("country").asText());
        currentWeather.setTimezone(jsonNode.get("location").get("tz_id").asText());
        currentWeather.setTempF(jsonNode.get("current").get("temp_f").asText());
        currentWeather.setTempC(jsonNode.get("current").get("temp_c").asText());
        currentWeather.setCondition(jsonNode.get("current").get("condition").get("text").asText());
        currentWeather.setFeelsLikeF(jsonNode.get("current").get("feelslike_f").asText());
        currentWeather.setFeelsLikeC(jsonNode.get("current").get("feelslike_c").asText());
        return currentWeather;
    }
}
