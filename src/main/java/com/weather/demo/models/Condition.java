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
        "text",
        "icon",
        "code"
})
@Generated("jsonschema2pojo")
public class Condition {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("text")
    private String text;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("icon")
    private String icon;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("code")
    private Integer code;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
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
        return "Condition{" +
                "text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", code=" + code +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}