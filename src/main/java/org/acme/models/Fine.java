package org.acme.models;

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
public class Fine {
    
    @JsonProperty("Amount")
    private Double amount;

    @JsonProperty("Points")
    private Integer points;

}
