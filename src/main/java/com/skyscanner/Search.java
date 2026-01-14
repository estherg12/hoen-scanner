package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {
    @JsonProperty
    private String city;

    public Search() {} // Required for the computer to read JSON

    public String getCity() {
        return city;
    }
}