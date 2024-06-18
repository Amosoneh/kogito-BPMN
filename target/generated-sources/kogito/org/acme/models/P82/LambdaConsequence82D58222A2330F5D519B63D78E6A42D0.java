package org.acme.models.P82;


import static org.acme.models.Rulesac853a2b3822470ea877b803c7508d22.*;
import org.acme.models.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence82D58222A2330F5D519B63D78E6A42D0 implements org.drools.model.functions.Block1<org.acme.models.Driver>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "82CA5AD84B7BDB0040E2DD2CAD6F8C89";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.acme.models.Driver $driver) throws java.lang.Exception {
        $driver.setValidLicense(false);
    }
}
