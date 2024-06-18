package org.acme.models.P16;


import static org.acme.models.Rules3ad5623be4fa4e0fa8efdc4ca37d09dc.*;
import org.acme.models.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence163EDE295D1D1F69B752178924D5609C implements org.drools.model.functions.Block1<org.acme.models.Driver>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "CE9E04626D0DFB9C99990E36189A02FC";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.acme.models.Driver $driver) throws java.lang.Exception {
        $driver.setValidLicense(true);
    }
}
