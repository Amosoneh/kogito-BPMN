package org.acme.models;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.models.Rulesac853a2b3822470ea877b803c7508d22.*;
import static org.acme.models.Rulesac853a2b3822470ea877b803c7508d22_LicencesValidationService.*;

public class Rulesac853a2b3822470ea877b803c7508d22_LicencesValidationService_rule_Is_32driver_32license_32valid {

    /**
     * Rule name: Is driver license valid
     */
    public static org.drools.model.Rule rule_Is_32driver_32license_32valid() {
        final org.drools.model.Variable<org.acme.models.Driver> var_$driver = D.declarationOf(org.acme.models.Driver.class,
                                                                                              DomainClassesMetadataac853a2b3822470ea877b803c7508d22.org_acme_models_Driver_Metadata_INSTANCE,
                                                                                              "$driver",
                                                                                              D.from(var_driver));
        org.drools.model.Rule rule = D.rule("org.acme.models",
                                            "Is driver license valid")
                                      .unit(org.acme.models.LicencesValidationService.class)
                                      .build(D.pattern(var_$driver).expr("GENERATED_0C38E1A277C40C3BF5E0CD8909DD1E8C",
                                                                         var_currentTime,
                                                                         org.acme.models.PBB.LambdaPredicateBB454F91F0709F6AB0A21802D2268959.INSTANCE,
                                                                         D.reactOn("licenseExpiration")),
                                             D.on(var_$driver).execute(org.acme.models.P03.LambdaConsequence037BD38F9FEC39FE2527DA1EB6085F39.INSTANCE));
        return rule;
    }
}
