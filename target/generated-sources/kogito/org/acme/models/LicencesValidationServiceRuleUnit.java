package org.acme.models;

import org.drools.core.SessionConfiguration;
import org.drools.core.common.ReteEvaluator;
import org.drools.core.impl.InternalRuleBase;
import org.drools.modelcompiler.KieBaseBuilder;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.api.conf.RuleConfig;
import org.drools.ruleunits.api.RuleUnits;
import org.drools.ruleunits.impl.factory.AbstractRuleUnit;
import org.drools.ruleunits.impl.factory.AbstractRuleUnits;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;
import org.drools.ruleunits.impl.sessions.RuleUnitExecutorImpl;

@org.springframework.stereotype.Component
public class LicencesValidationServiceRuleUnit extends AbstractRuleUnit<org.acme.models.LicencesValidationService> {

    private static final InternalRuleBase ruleBase = KieBaseBuilder.createKieBaseFromModel(new org.acme.models.Rulesac853a2b3822470ea877b803c7508d22_LicencesValidationService(),
                                                                                           new org.kie.api.conf.KieBaseOption[] { org.kie.api.conf.EventProcessingOption.CLOUD });

    private static final SessionConfiguration sessionConfiguration = ruleBase.getSessionConfiguration().as(SessionConfiguration.KEY);

    static {
        sessionConfiguration.setOption(org.kie.api.runtime.conf.ClockTypeOption.REALTIME);
    }

    public LicencesValidationServiceRuleUnit() {
        this(null);
    }

    @org.springframework.beans.factory.annotation.Autowired(required = false)
    public LicencesValidationServiceRuleUnit(RuleUnits ruleUnits) {
        super(org.acme.models.LicencesValidationService.class,
              ruleUnits);
        this.ruleUnits.register(this);
    }

    @Override
    public LicencesValidationServiceRuleUnitInstance internalCreateInstance(org.acme.models.LicencesValidationService data, RuleConfig ruleConfig) {
        ReteEvaluator reteEvaluator = evaluatorConfigurator.apply(new RuleUnitExecutorImpl(ruleBase,
                                                                                           sessionConfiguration));
        return new LicencesValidationServiceRuleUnitInstance(this,
                                                             data,
                                                             reteEvaluator,
                                                             ruleConfig);
    }
}
