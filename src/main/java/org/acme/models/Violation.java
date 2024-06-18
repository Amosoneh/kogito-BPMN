package org.acme.models;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Violation {
    @JsonProperty("Code")
    private String code;

    @JsonProperty("Date")
    private Date date;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Speed Limit")
    private BigDecimal speedLimit;

    @JsonProperty("Actual Speed")
    private BigDecimal actualSpeed;
}
