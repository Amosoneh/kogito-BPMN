package org.acme.models;

import org.drools.core.common.ReteEvaluator;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.api.conf.RuleConfig;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;

public class LicencesValidationServiceRuleUnitInstance extends ReteEvaluatorBasedRuleUnitInstance<org.acme.models.LicencesValidationService> {

    public LicencesValidationServiceRuleUnitInstance(RuleUnit<org.acme.models.LicencesValidationService> unit, org.acme.models.LicencesValidationService workingMemory, ReteEvaluator reteEvaluator) {
        super(unit,
              workingMemory,
              reteEvaluator);
    }

    public LicencesValidationServiceRuleUnitInstance(RuleUnit<org.acme.models.LicencesValidationService> unit, org.acme.models.LicencesValidationService workingMemory, ReteEvaluator reteEvaluator, RuleConfig ruleConfig) {
        super(unit,
              workingMemory,
              reteEvaluator,
              ruleConfig);
    }

    @Override
    protected void bind(ReteEvaluator evaluator, org.acme.models.LicencesValidationService ruleUnit) {
        evaluator.setGlobal("currentTime",
                            ruleUnit.getCurrentTime());
        evaluator.setGlobal("driver",
                            ruleUnit.getDriver());
    }
}
