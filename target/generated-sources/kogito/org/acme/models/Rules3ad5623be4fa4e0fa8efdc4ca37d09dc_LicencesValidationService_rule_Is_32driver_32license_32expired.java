package org.acme.models;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.models.Rules3ad5623be4fa4e0fa8efdc4ca37d09dc.*;
import static org.acme.models.Rules3ad5623be4fa4e0fa8efdc4ca37d09dc_LicencesValidationService.*;

public class Rules3ad5623be4fa4e0fa8efdc4ca37d09dc_LicencesValidationService_rule_Is_32driver_32license_32expired {

    /**
     * Rule name: Is driver license expired
     */
    public static org.drools.model.Rule rule_Is_32driver_32license_32expired() {
        final org.drools.model.Variable<org.acme.models.Driver> var_$driver = D.declarationOf(org.acme.models.Driver.class,
                                                                                              DomainClassesMetadata3ad5623be4fa4e0fa8efdc4ca37d09dc.org_acme_models_Driver_Metadata_INSTANCE,
                                                                                              "$driver",
                                                                                              D.from(var_driver));
        org.drools.model.Rule rule = D.rule("org.acme.models",
                                            "Is driver license expired")
                                      .unit(org.acme.models.LicencesValidationService.class)
                                      .build(D.pattern(var_$driver).expr("GENERATED_0C38E1A277C40C3BF5E0CD8909DD1E8C",
                                                                         var_currentTime,
                                                                         org.acme.models.P18.LambdaPredicate18DC62B9D9989C62A86EDE8B2DBA56DB.INSTANCE,
                                                                         D.reactOn("licenseExpiration")),
                                             D.on(var_$driver).execute(org.acme.models.PC0.LambdaConsequenceC02C8B689DB45D561267F53C19759ADC.INSTANCE));
        return rule;
    }
}
