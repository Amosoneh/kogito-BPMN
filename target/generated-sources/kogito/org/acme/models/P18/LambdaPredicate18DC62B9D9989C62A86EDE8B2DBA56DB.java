package org.acme.models.P18;


import static org.acme.models.Rules3ad5623be4fa4e0fa8efdc4ca37d09dc.*;
import org.acme.models.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate18DC62B9D9989C62A86EDE8B2DBA56DB implements org.drools.model.functions.Predicate2<org.acme.models.Driver, java.util.Date>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9E7BDBB3455E83149DCC285C622C2E26";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.models.Driver _this, java.util.Date currentTime) throws java.lang.Exception {
        return _this.getLicenseExpiration().after(currentTime);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("licenseExpiration.after(currentTime)");
        info.addRuleNames("Is driver license expired", "C:/Users/Amos Khaled/Desktop/trafficViolationProcess/src/main/resources/org/acme/rules/LicencesValidationService.drl", "Is driver license valid", "C:/Users/Amos Khaled/Desktop/trafficViolationProcess/src/main/resources/org/acme/rules/LicencesValidationService.drl");
        return info;
    }
}
