package com.weather.demo.models;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "last_updated_epoch",
        "last_updated",
        "temp_c",
        "temp_f",
        "is_day",
        "condition",
        "wind_mph",
        "wind_kph",
        "wind_degree",
        "wind_dir",
        "pressure_mb",
        "pressure_in",
        "precip_mm",
        "precip_in",
        "humidity",
        "cloud",
        "feelslike_c",
        "feelslike_f",
        "windchill_c",
        "windchill_f",
        "heatindex_c",
        "heatindex_f",
        "dewpoint_c",
        "dewpoint_f",
        "vis_km",
        "vis_miles",
        "uv",
        "gust_mph",
        "gust_kph"
})
@Generated("jsonschema2pojo")
public class Current {

    /**
     * (Required)
     */
    @JsonProperty("last_updated_epoch")
    private Integer lastUpdatedEpoch;
    /**
     * (Required)
     */
    @JsonProperty("last_updated")
    private String lastUpdated;
    /**
     * (Required)
     */
    @JsonProperty("temp_c")
    private Double tempC;
    /**
     * (Required)
     */
    @JsonProperty("temp_f")
    private Double tempF;
    /**
     * (Required)
     */
    @JsonProperty("is_day")
    private Integer isDay;
    /**
     * (Required)
     */
    @JsonProperty("condition")
    private Condition condition;
    /**
     * (Required)
     */
    @JsonProperty("wind_mph")
    private Double windMph;
    /**
     * (Required)
     */
    @JsonProperty("wind_kph")
    private Double windKph;
    /**
     * (Required)
     */
    @JsonProperty("wind_degree")
    private Integer windDegree;
    /**
     * (Required)
     */
    @JsonProperty("wind_dir")
    private String windDir;
    /**
     * (Required)
     */
    @JsonProperty("pressure_mb")
    private Integer pressureMb;
    /**
     * (Required)
     */
    @JsonProperty("pressure_in")
    private Double pressureIn;
    /**
     * (Required)
     */
    @JsonProperty("precip_mm")
    private Double precipMm;
    /**
     * (Required)
     */
    @JsonProperty("precip_in")
    private Integer precipIn;
    /**
     * (Required)
     */
    @JsonProperty("humidity")
    private Integer humidity;
    /**
     * (Required)
     */
    @JsonProperty("cloud")
    private Integer cloud;
    /**
     * (Required)
     */
    @JsonProperty("feelslike_c")
    private Double feelslikeC;
    /**
     * (Required)
     */
    @JsonProperty("feelslike_f")
    private Double feelslikeF;
    /**
     * (Required)
     */
    @JsonProperty("windchill_c")
    private Double windchillC;
    /**
     * (Required)
     */
    @JsonProperty("windchill_f")
    private Double windchillF;
    /**
     * (Required)
     */
    @JsonProperty("heatindex_c")
    private Double heatindexC;
    /**
     * (Required)
     */
    @JsonProperty("heatindex_f")
    private Double heatindexF;
    /**
     * (Required)
     */
    @JsonProperty("dewpoint_c")
    private Integer dewpointC;
    /**
     * (Required)
     */
    @JsonProperty("dewpoint_f")
    private Double dewpointF;
    /**
     * (Required)
     */
    @JsonProperty("vis_km")
    private Integer visKm;
    /**
     * (Required)
     */
    @JsonProperty("vis_miles")
    private Integer visMiles;
    /**
     * (Required)
     */
    @JsonProperty("uv")
    private Double uv;
    /**
     * (Required)
     */
    @JsonProperty("gust_mph")
    private Double gustMph;
    /**
     * (Required)
     */
    @JsonProperty("gust_kph")
    private Double gustKph;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * (Required)
     */
    @JsonProperty("last_updated_epoch")
    public Integer getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    /**
     * (Required)
     */
    @JsonProperty("last_updated_epoch")
    public void setLastUpdatedEpoch(Integer lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    /**
     * (Required)
     */
    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * (Required)
     */
    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * (Required)
     */
    @JsonProperty("temp_c")
    public Double getTempC() {
        return tempC;
    }

    /**
     * (Required)
     */
    @JsonProperty("temp_c")
    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    /**
     * (Required)
     */
    @JsonProperty("temp_f")
    public Double getTempF() {
        return tempF;
    }

    /**
     * (Required)
     */
    @JsonProperty("temp_f")
    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    /**
     * (Required)
     */
    @JsonProperty("is_day")
    public Integer getIsDay() {
        return isDay;
    }

    /**
     * (Required)
     */
    @JsonProperty("is_day")
    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    /**
     * (Required)
     */
    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    /**
     * (Required)
     */
    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * (Required)
     */
    @JsonProperty("wind_mph")
    public Double getWindMph() {
        return windMph;
    }

    /**
     * (Required)
     */
    @JsonProperty("wind_mph")
    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

    /**
     * (Required)
     */
    @JsonProperty("wind_kph")
    public Double getWindKph() {
        return windKph;
    }

    /**
     * (Required)
     */
    @JsonProperty("wind_kph")
    public void setWindKph(Double windKph) {
        this.windKph = windKph;
    }

    /**
     * (Required)
     */
    @JsonProperty("wind_degree")
    public Integer getWindDegree() {
        return windDegree;
    }

    /**
     * (Required)
     */
    @JsonProperty("wind_degree")
    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    /**
     * (Required)
     */
    @JsonProperty("wind_dir")
    public String getWindDir() {
        return windDir;
    }

    /**
     * (Required)
     */
    @JsonProperty("wind_dir")
    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    /**
     * (Required)
     */
    @JsonProperty("pressure_mb")
    public Integer getPressureMb() {
        return pressureMb;
    }

    /**
     * (Required)
     */
    @JsonProperty("pressure_mb")
    public void setPressureMb(Integer pressureMb) {
        this.pressureMb = pressureMb;
    }

    /**
     * (Required)
     */
    @JsonProperty("pressure_in")
    public Double getPressureIn() {
        return pressureIn;
    }

    /**
     * (Required)
     */
    @JsonProperty("pressure_in")
    public void setPressureIn(Double pressureIn) {
        this.pressureIn = pressureIn;
    }

    /**
     * (Required)
     */
    @JsonProperty("precip_mm")
    public Double getPrecipMm() {
        return precipMm;
    }

    /**
     * (Required)
     */
    @JsonProperty("precip_mm")
    public void setPrecipMm(Double precipMm) {
        this.precipMm = precipMm;
    }

    /**
     * (Required)
     */
    @JsonProperty("precip_in")
    public Integer getPrecipIn() {
        return precipIn;
    }

    /**
     * (Required)
     */
    @JsonProperty("precip_in")
    public void setPrecipIn(Integer precipIn) {
        this.precipIn = precipIn;
    }

    /**
     * (Required)
     */
    @JsonProperty("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    /**
     * (Required)
     */
    @JsonProperty("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    /**
     * (Required)
     */
    @JsonProperty("cloud")
    public Integer getCloud() {
        return cloud;
    }

    /**
     * (Required)
     */
    @JsonProperty("cloud")
    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    /**
     * (Required)
     */
    @JsonProperty("feelslike_c")
    public Double getFeelslikeC() {
        return feelslikeC;
    }

    /**
     * (Required)
     */
    @JsonProperty("feelslike_c")
    public void setFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    /**
     * (Required)
     */
    @JsonProperty("feelslike_f")
    public Double getFeelslikeF() {
        return feelslikeF;
    }

    /**
     * (Required)
     */
    @JsonProperty("feelslike_f")
    public void setFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    /**
     * (Required)
     */
    @JsonProperty("windchill_c")
    public Double getWindchillC() {
        return windchillC;
    }

    /**
     * (Required)
     */
    @JsonProperty("windchill_c")
    public void setWindchillC(Double windchillC) {
        this.windchillC = windchillC;
    }

    /**
     * (Required)
     */
    @JsonProperty("windchill_f")
    public Double getWindchillF() {
        return windchillF;
    }

    /**
     * (Required)
     */
    @JsonProperty("windchill_f")
    public void setWindchillF(Double windchillF) {
        this.windchillF = windchillF;
    }

    /**
     * (Required)
     */
    @JsonProperty("heatindex_c")
    public Double getHeatindexC() {
        return heatindexC;
    }

    /**
     * (Required)
     */
    @JsonProperty("heatindex_c")
    public void setHeatindexC(Double heatindexC) {
        this.heatindexC = heatindexC;
    }

    /**
     * (Required)
     */
    @JsonProperty("heatindex_f")
    public Double getHeatindexF() {
        return heatindexF;
    }

    /**
     * (Required)
     */
    @JsonProperty("heatindex_f")
    public void setHeatindexF(Double heatindexF) {
        this.heatindexF = heatindexF;
    }

    /**
     * (Required)
     */
    @JsonProperty("dewpoint_c")
    public Integer getDewpointC() {
        return dewpointC;
    }

    /**
     * (Required)
     */
    @JsonProperty("dewpoint_c")
    public void setDewpointC(Integer dewpointC) {
        this.dewpointC = dewpointC;
    }

    /**
     * (Required)
     */
    @JsonProperty("dewpoint_f")
    public Double getDewpointF() {
        return dewpointF;
    }

    /**
     * (Required)
     */
    @JsonProperty("dewpoint_f")
    public void setDewpointF(Double dewpointF) {
        this.dewpointF = dewpointF;
    }

    /**
     * (Required)
     */
    @JsonProperty("vis_km")
    public Integer getVisKm() {
        return visKm;
    }

    /**
     * (Required)
     */
    @JsonProperty("vis_km")
    public void setVisKm(Integer visKm) {
        this.visKm = visKm;
    }

    /**
     * (Required)
     */
    @JsonProperty("vis_miles")
    public Integer getVisMiles() {
        return visMiles;
    }

    /**
     * (Required)
     */
    @JsonProperty("vis_miles")
    public void setVisMiles(Integer visMiles) {
        this.visMiles = visMiles;
    }

    /**
     * (Required)
     */
    @JsonProperty("uv")
    public Double getUv() {
        return uv;
    }

    /**
     * (Required)
     */
    @JsonProperty("uv")
    public void setUv(Double uv) {
        this.uv = uv;
    }

    /**
     * (Required)
     */
    @JsonProperty("gust_mph")
    public Double getGustMph() {
        return gustMph;
    }

    /**
     * (Required)
     */
    @JsonProperty("gust_mph")
    public void setGustMph(Double gustMph) {
        this.gustMph = gustMph;
    }

    /**
     * (Required)
     */
    @JsonProperty("gust_kph")
    public Double getGustKph() {
        return gustKph;
    }

    /**
     * (Required)
     */
    @JsonProperty("gust_kph")
    public void setGustKph(Double gustKph) {
        this.gustKph = gustKph;
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
        return "Current{" +
                "lastUpdatedEpoch=" + lastUpdatedEpoch +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", tempC=" + tempC +
                ", tempF=" + tempF +
                ", isDay=" + isDay +
                ", condition=" + condition +
                ", windMph=" + windMph +
                ", windKph=" + windKph +
                ", windDegree=" + windDegree +
                ", windDir='" + windDir + '\'' +
                ", pressureMb=" + pressureMb +
                ", pressureIn=" + pressureIn +
                ", precipMm=" + precipMm +
                ", precipIn=" + precipIn +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelslikeC=" + feelslikeC +
                ", feelslikeF=" + feelslikeF +
                ", windchillC=" + windchillC +
                ", windchillF=" + windchillF +
                ", heatindexC=" + heatindexC +
                ", heatindexF=" + heatindexF +
                ", dewpointC=" + dewpointC +
                ", dewpointF=" + dewpointF +
                ", visKm=" + visKm +
                ", visMiles=" + visMiles +
                ", uv=" + uv +
                ", gustMph=" + gustMph +
                ", gustKph=" + gustKph +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
