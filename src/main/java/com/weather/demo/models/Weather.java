package com.weather.demo.models;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "location",
        "current"
})
@Generated("jsonschema2pojo")
public class Weather {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("location")
    private Location location;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("current")
    private Current current;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("current")
    public Current getCurrent() {
        return current;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("current")
    public void setCurrent(Current current) {
        this.current = current;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Weather{" +
                "location=" + location +
                ", current=" + current +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}