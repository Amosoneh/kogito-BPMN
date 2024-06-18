package org.acme.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
        private String id;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("State")
    private String state;

    @JsonProperty("City")
    private String city;

    @JsonProperty("Points")
    private Integer points;

    @JsonProperty("Age")
    private Integer age;

    private Date licenseExpiration;

    @Setter
    @Builder.Default()
    private Boolean validLicense = Boolean.FALSE;

}
