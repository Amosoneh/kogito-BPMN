package org.acme.models;


import java.util.Date;

import org.drools.ruleunits.api.RuleUnitData;

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
public class LicencesValidationService implements RuleUnitData {
    private Driver driver;
    
    @Builder.Default()
    private Date currentTime = new Date();
}
