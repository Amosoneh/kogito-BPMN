package org.acme.models.P03;


import static org.acme.models.Rulesac853a2b3822470ea877b803c7508d22.*;
import org.acme.models.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence037BD38F9FEC39FE2527DA1EB6085F39 implements org.drools.model.functions.Block1<org.acme.models.Driver>, org.drools.model.functions.HashedExpression {

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
