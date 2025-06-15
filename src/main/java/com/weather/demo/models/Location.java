package com.weather.demo.models;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "region",
        "country",
        "lat",
        "lon",
        "tz_id",
        "localtime_epoch",
        "localtime"
})
@Generated("jsonschema2pojo")
public class Location {

    /**
     * (Required)
     */
    @JsonProperty("name")
    private String name;
    /**
     * (Required)
     */
    @JsonProperty("region")
    private String region;
    /**
     * (Required)
     */
    @JsonProperty("country")
    private String country;
    /**
     * (Required)
     */
    @JsonProperty("lat")
    private Double lat;
    /**
     * (Required)
     */
    @JsonProperty("lon")
    private Double lon;
    /**
     * (Required)
     */
    @JsonProperty("tz_id")
    private String tzId;
    /**
     * (Required)
     */
    @JsonProperty("localtime_epoch")
    private Integer localtimeEpoch;
    /**
     * (Required)
     */
    @JsonProperty("localtime")
    private String localtime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * (Required)
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * (Required)
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * (Required)
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * (Required)
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * (Required)
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * (Required)
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * (Required)
     */
    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    /**
     * (Required)
     */
    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * (Required)
     */
    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    /**
     * (Required)
     */
    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * (Required)
     */
    @JsonProperty("tz_id")
    public String getTzId() {
        return tzId;
    }

    /**
     * (Required)
     */
    @JsonProperty("tz_id")
    public void setTzId(String tzId) {
        this.tzId = tzId;
    }

    /**
     * (Required)
     */
    @JsonProperty("localtime_epoch")
    public Integer getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    /**
     * (Required)
     */
    @JsonProperty("localtime_epoch")
    public void setLocaltimeEpoch(Integer localtimeEpoch) {
        this.localtimeEpoch = localtimeEpoch;
    }

    /**
     * (Required)
     */
    @JsonProperty("localtime")
    public String getLocaltime() {
        return localtime;
    }

    /**
     * (Required)
     */
    @JsonProperty("localtime")
    public void setLocaltime(String localtime) {
        this.localtime = localtime;
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
        return "Location{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", tzId='" + tzId + '\'' +
                ", localtimeEpoch=" + localtimeEpoch +
                ", localtime='" + localtime + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
