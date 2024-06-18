package org.acme;

import org.acme.Traffic_rules_dmnModel;

public class Traffic_rules_dmnProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<Traffic_rules_dmnModel> {

    public Traffic_rules_dmnProcessInstance(org.acme.Traffic_rules_dmnProcess process, Traffic_rules_dmnModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public Traffic_rules_dmnProcessInstance(org.acme.Traffic_rules_dmnProcess process, Traffic_rules_dmnModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public Traffic_rules_dmnProcessInstance(org.acme.Traffic_rules_dmnProcess process, Traffic_rules_dmnModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public Traffic_rules_dmnProcessInstance(org.acme.Traffic_rules_dmnProcess process, Traffic_rules_dmnModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public Traffic_rules_dmnProcessInstance(org.acme.Traffic_rules_dmnProcess process, Traffic_rules_dmnModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(Traffic_rules_dmnModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(Traffic_rules_dmnModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
