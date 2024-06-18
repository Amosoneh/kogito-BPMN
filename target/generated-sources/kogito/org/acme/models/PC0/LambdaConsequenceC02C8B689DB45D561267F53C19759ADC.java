package org.acme.models.PC0;


import static org.acme.models.Rules3ad5623be4fa4e0fa8efdc4ca37d09dc.*;
import org.acme.models.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceC02C8B689DB45D561267F53C19759ADC implements org.drools.model.functions.Block1<org.acme.models.Driver>, org.drools.model.functions.HashedExpression {

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
