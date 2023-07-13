package com.theinternetapp.model.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UserCredentials(@JsonProperty("username") String username,
                              @JsonProperty("password") String password) {
}
