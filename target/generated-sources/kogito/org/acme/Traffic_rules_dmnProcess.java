package org.acme;

import org.acme.Traffic_rules_dmnModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@org.springframework.stereotype.Component("traffic_rules_dmn")
public class Traffic_rules_dmnProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.Traffic_rules_dmnModel> {

    public Traffic_rules_dmnProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.DriverService_getDriver_10_Handler());
    }

    @org.springframework.beans.factory.annotation.Autowired()
    public Traffic_rules_dmnProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.DriverService_getDriver_10_Handler driverService_getDriver_10_Handler) {
        super(app, java.util.Arrays.asList(driverService_getDriver_10_Handler), correlations);
        activate();
    }

    public Traffic_rules_dmnProcess() {
    }

    @Override()
    public org.acme.Traffic_rules_dmnProcessInstance createInstance(org.acme.Traffic_rules_dmnModel value) {
        return new org.acme.Traffic_rules_dmnProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.Traffic_rules_dmnProcessInstance createInstance(java.lang.String businessKey, org.acme.Traffic_rules_dmnModel value) {
        return new org.acme.Traffic_rules_dmnProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.acme.Traffic_rules_dmnProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.acme.Traffic_rules_dmnModel value) {
        return new org.acme.Traffic_rules_dmnProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.acme.Traffic_rules_dmnModel createModel() {
        return new org.acme.Traffic_rules_dmnModel();
    }

    public org.acme.Traffic_rules_dmnProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.Traffic_rules_dmnModel) value);
    }

    public org.acme.Traffic_rules_dmnProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.Traffic_rules_dmnModel) value);
    }

    public org.acme.Traffic_rules_dmnProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.Traffic_rules_dmnProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.Traffic_rules_dmnProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.Traffic_rules_dmnProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("traffic_rules_dmn", true);
        factory.variable("suspended", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("driverId", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("violation", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.models.Violation.class), null, "customTags", null);
        factory.variable("fine", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.models.Fine.class), null, "customTags", null);
        factory.variable("driver", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.models.Driver.class), null, "customTags", null);
        factory.name("traffic-rules-dmn");
        factory.packageName("org.acme");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode1 = factory.endNode(1);
        endNode1.name("End");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_9CC1882F-66FA-4D0B-8E0D-B8AA032DE6EE");
        endNode1.metaData("x", 1509);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 389);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode2 = factory.endNode(2);
        endNode2.name("End");
        endNode2.terminate(false);
        endNode2.metaData("UniqueId", "_03FA8BEF-F7F4-4CC3-8ACD-FED809F21C53");
        endNode2.metaData("x", 1518);
        endNode2.metaData("width", 56);
        endNode2.metaData("y", 179);
        endNode2.metaData("height", 56);
        endNode2.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode3 = factory.actionNode(3);
        actionNode3.name("Not Suspended task");
        actionNode3.action(kcontext -> {
            java.lang.String suspended = (java.lang.String) kcontext.getVariable("suspended");
            System.out.println("Driver is not suspended!");
        });
        actionNode3.metaData("UniqueId", "_F95E4F40-FA9B-44A5-B8A7-41DCDDCD7216");
        actionNode3.metaData("elementname", "Not Suspended task");
        actionNode3.metaData("NodeType", "ScriptTask");
        actionNode3.metaData("x", 1240);
        actionNode3.metaData("width", 154);
        actionNode3.metaData("y", 366);
        actionNode3.metaData("height", 102);
        actionNode3.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode4 = factory.actionNode(4);
        actionNode4.name("Suspended  task");
        actionNode4.action(kcontext -> {
            java.lang.String suspended = (java.lang.String) kcontext.getVariable("suspended");
            System.out.println("Driver is suspended!");
        });
        actionNode4.metaData("UniqueId", "_2448457B-4653-4A57-8C80-CFAFFE1059B2");
        actionNode4.metaData("elementname", "Suspended  task");
        actionNode4.metaData("NodeType", "ScriptTask");
        actionNode4.metaData("x", 1240);
        actionNode4.metaData("width", 154);
        actionNode4.metaData("y", 156);
        actionNode4.metaData("height", 102);
        actionNode4.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode5 = factory.splitNode(5);
        splitNode5.name("Split");
        splitNode5.type(2);
        splitNode5.metaData("UniqueId", "_A74CE2C8-31D3-44CD-B16D-D99DD21E9E8B");
        splitNode5.metaData("x", 1135);
        splitNode5.metaData("width", 56);
        splitNode5.metaData("y", 295);
        splitNode5.metaData("Default", null);
        splitNode5.metaData("height", 56);
        splitNode5.constraint(4, "_EDDA07C6-E7C0-47A9-AAD6-06A11ADC507E", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String suspended = (java.lang.String) kcontext.getVariable("suspended");
            java.lang.String driverId = (java.lang.String) kcontext.getVariable("driverId");
            org.acme.models.Violation violation = (org.acme.models.Violation) kcontext.getVariable("violation");
            org.acme.models.Fine fine = (org.acme.models.Fine) kcontext.getVariable("fine");
            org.acme.models.Driver driver = (org.acme.models.Driver) kcontext.getVariable("driver");
            return "yes".equalsIgnoreCase(suspended);
        }, 0, false);
        splitNode5.constraint(3, "_4E80BBDD-260A-494B-9DBB-049B0CD767C9", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String suspended = (java.lang.String) kcontext.getVariable("suspended");
            java.lang.String driverId = (java.lang.String) kcontext.getVariable("driverId");
            org.acme.models.Violation violation = (org.acme.models.Violation) kcontext.getVariable("violation");
            org.acme.models.Fine fine = (org.acme.models.Fine) kcontext.getVariable("fine");
            org.acme.models.Driver driver = (org.acme.models.Driver) kcontext.getVariable("driver");
            return "no".equalsIgnoreCase(suspended);
        }, 0, false);
        splitNode5.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode6 = factory.endNode(6);
        endNode6.name("End");
        endNode6.terminate(false);
        endNode6.metaData("UniqueId", "_F5715E93-E98A-4BE1-B2FA-0AD2F70DBAA6");
        endNode6.metaData("x", 743);
        endNode6.metaData("width", 56);
        endNode6.metaData("y", 492);
        endNode6.metaData("height", 56);
        endNode6.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode7 = factory.ruleSetNode(7);
        ruleSetNode7.name("TrafficViolation DMN");
        ruleSetNode7.decision("https://kiegroup.org/dmn/_F88EF08E-9B7C-4F6A-9DCF-B5842DDA653C", "Traffic violation", "Traffic violation", () -> {
            return app.get(org.kie.kogito.decision.DecisionModels.class).getDecisionModel("https://kiegroup.org/dmn/_F88EF08E-9B7C-4F6A-9DCF-B5842DDA653C", "Traffic violation");
        });
        ruleSetNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_A2A6C9E1-B9B0-4E6A-B675-58FC9913E44C_namespaceInputX", "namespace", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("14af0d50-d3c4-4b76-876f-f8d1b5305f0e", "EXPRESSION (https://kiegroup.org/dmn/_F88EF08E-9B7C-4F6A-9DCF-B5842DDA653C)", "java.lang.Object", "https://kiegroup.org/dmn/_F88EF08E-9B7C-4F6A-9DCF-B5842DDA653C"), new org.jbpm.workflow.core.impl.DataDefinition("_A2A6C9E1-B9B0-4E6A-B675-58FC9913E44C_namespaceInputX", "namespace", "java.lang.String", null))), null));
        ruleSetNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_A2A6C9E1-B9B0-4E6A-B675-58FC9913E44C_decisionInputX", "decision", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("07c71c54-013c-41c4-a682-de40250b97dc", "EXPRESSION (Traffic violation)", "java.lang.Object", "Traffic violation"), new org.jbpm.workflow.core.impl.DataDefinition("_A2A6C9E1-B9B0-4E6A-B675-58FC9913E44C_decisionInputX", "decision", "java.lang.String", null))), null));
        ruleSetNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_A2A6C9E1-B9B0-4E6A-B675-58FC9913E44C_modelInputX", "model", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("a470c5f3-4051-4629-b5da-cf4dc9a0cadb", "EXPRESSION (Traffic violation)", "java.lang.Object", "Traffic violation"), new org.jbpm.workflow.core.impl.DataDefinition("_A2A6C9E1-B9B0-4E6A-B675-58FC9913E44C_modelInputX", "model", "java.lang.String", null))), null));
        ruleSetNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("violation", "violation", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A2A6C9E1-B9B0-4E6A-B675-58FC9913E44C_violationInputX", "violation", "org.acme.models.Violation", null), null, null));
        ruleSetNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("driver", "driver", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A2A6C9E1-B9B0-4E6A-B675-58FC9913E44C_driverInputX", "driver", "org.acme.models.Driver", null), null, null));
        ruleSetNode7.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_A2A6C9E1-B9B0-4E6A-B675-58FC9913E44C_suspendedOutputX", "suspended", "String", null)), new org.jbpm.workflow.core.impl.DataDefinition("suspended", "suspended", "java.lang.Object", null), null, null));
        ruleSetNode7.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_A2A6C9E1-B9B0-4E6A-B675-58FC9913E44C_fineOutputX", "fine", "org.acme.models.Fine", null)), new org.jbpm.workflow.core.impl.DataDefinition("fine", "fine", "java.lang.Object", null), null, null));
        ruleSetNode7.metaData("UniqueId", "_A2A6C9E1-B9B0-4E6A-B675-58FC9913E44C");
        ruleSetNode7.metaData("elementname", "TrafficViolation DMN");
        ruleSetNode7.metaData("x", 915);
        ruleSetNode7.metaData("width", 154);
        ruleSetNode7.metaData("y", 272);
        ruleSetNode7.metaData("height", 102);
        ruleSetNode7.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode8 = factory.splitNode(8);
        splitNode8.name("Split");
        splitNode8.type(2);
        splitNode8.metaData("UniqueId", "_6007DAA9-1AAC-440D-8CE1-0D104E12ACF4");
        splitNode8.metaData("x", 743);
        splitNode8.metaData("width", 56);
        splitNode8.metaData("y", 295);
        splitNode8.metaData("Default", null);
        splitNode8.metaData("height", 56);
        splitNode8.constraint(7, "_DFF477A8-6170-4028-B9D9-B94C312E6752", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String suspended = (java.lang.String) kcontext.getVariable("suspended");
            java.lang.String driverId = (java.lang.String) kcontext.getVariable("driverId");
            org.acme.models.Violation violation = (org.acme.models.Violation) kcontext.getVariable("violation");
            org.acme.models.Fine fine = (org.acme.models.Fine) kcontext.getVariable("fine");
            org.acme.models.Driver driver = (org.acme.models.Driver) kcontext.getVariable("driver");
            return driver.getValidLicense();
        }, 0, false);
        splitNode8.constraint(6, "_85134370-9573-4F60-A2D6-D8E7A3F9AB42", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String suspended = (java.lang.String) kcontext.getVariable("suspended");
            java.lang.String driverId = (java.lang.String) kcontext.getVariable("driverId");
            org.acme.models.Violation violation = (org.acme.models.Violation) kcontext.getVariable("violation");
            org.acme.models.Fine fine = (org.acme.models.Fine) kcontext.getVariable("fine");
            org.acme.models.Driver driver = (org.acme.models.Driver) kcontext.getVariable("driver");
            return !driver.getValidLicense();
        }, 0, false);
        splitNode8.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode9 = factory.ruleSetNode(9);
        ruleSetNode9.name("LicenseValidationDRL");
        ruleSetNode9.ruleUnit("org.acme.models.LicencesValidationService", new org.jbpm.workflow.core.node.RuleUnitFactory<org.acme.models.LicencesValidationService>() {

            public org.acme.models.LicencesValidationService bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                org.acme.models.LicencesValidationService unit = new org.acme.models.LicencesValidationService();
                unit.setDriver((org.acme.models.Driver) (kcontext.getVariable("driver")));
                return unit;
            }

            public org.drools.ruleunits.api.RuleUnit<org.acme.models.LicencesValidationService> unit() {
                return app.get(org.kie.kogito.rules.RuleUnits.class).create(org.acme.models.LicencesValidationService.class);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, org.acme.models.LicencesValidationService unit) {
                kcontext.setVariable("driver", unit.getDriver());
            }
        });
        ruleSetNode9.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("driver", "driver", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_688FB112-9C79-437B-91A7-B80566906D21_driverInputX", "driver", "org.acme.models.Driver", null), null, null));
        ruleSetNode9.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_688FB112-9C79-437B-91A7-B80566906D21_driverOutputX", "driver", "org.acme.models.Driver", null)), new org.jbpm.workflow.core.impl.DataDefinition("driver", "driver", "java.lang.Object", null), null, null));
        ruleSetNode9.metaData("UniqueId", "_688FB112-9C79-437B-91A7-B80566906D21");
        ruleSetNode9.metaData("elementname", "LicenseValidationDRL");
        ruleSetNode9.metaData("x", 493);
        ruleSetNode9.metaData("width", 203);
        ruleSetNode9.metaData("y", 290);
        ruleSetNode9.metaData("height", 75);
        ruleSetNode9.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode10 = factory.workItemNode(10);
        workItemNode10.name("Get Driver's Details");
        workItemNode10.workName("org.acme.services.DriverService_getDriver_10_Handler");
        workItemNode10.workParameter("NodeName", "Get Driver's Details");
        workItemNode10.workParameter("Interface", "org.acme.services.DriverService");
        workItemNode10.workParameter("Operation", "getDriver");
        workItemNode10.workParameter("interfaceImplementationRef", "org.acme.services.DriverService");
        workItemNode10.workParameter("operationImplementationRef", "getDriver");
        workItemNode10.workParameter("implementation", "Java");
        workItemNode10.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("driverId", "driverId", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_E7C1AB3E-6EE3-4BB5-BFFA-9391F2055D66_driverIdInputX", "driverId", "String", null), null, null));
        workItemNode10.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_E7C1AB3E-6EE3-4BB5-BFFA-9391F2055D66_driverOutputX", "driver", "org.acme.models.Driver", null)), new org.jbpm.workflow.core.impl.DataDefinition("driver", "driver", "java.lang.Object", null), null, null));
        workItemNode10.done();
        workItemNode10.metaData("UniqueId", "_E7C1AB3E-6EE3-4BB5-BFFA-9391F2055D66");
        workItemNode10.metaData("Implementation", "Java");
        workItemNode10.metaData("elementname", "Get Driver's Details");
        workItemNode10.metaData("Type", "Service Task");
        workItemNode10.metaData("OperationRef", "_E7C1AB3E-6EE3-4BB5-BFFA-9391F2055D66_ServiceOperation");
        workItemNode10.metaData("x", 285);
        workItemNode10.metaData("width", 154);
        workItemNode10.metaData("y", 272);
        workItemNode10.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode11 = factory.startNode(11);
        startNode11.name("Start");
        startNode11.interrupting(true);
        startNode11.metaData("UniqueId", "_2CE84660-67D4-469A-97A9-26207F4716E7");
        startNode11.metaData("x", 131);
        startNode11.metaData("width", 56);
        startNode11.metaData("y", 295);
        startNode11.metaData("height", 56);
        startNode11.done();
        factory.connection(3, 1, "_11AA2E40-514F-4123-B7B0-8C5E7557B257");
        factory.connection(4, 2, "_5B1CF7C7-9F1C-4C90-9DAB-726390A5895B");
        factory.connection(5, 3, "_4E80BBDD-260A-494B-9DBB-049B0CD767C9");
        factory.connection(5, 4, "_EDDA07C6-E7C0-47A9-AAD6-06A11ADC507E");
        factory.connection(7, 5, "_ACE6B0E6-B699-4B3C-98EA-45E39412EA7F");
        factory.connection(8, 6, "_85134370-9573-4F60-A2D6-D8E7A3F9AB42");
        factory.connection(8, 7, "_DFF477A8-6170-4028-B9D9-B94C312E6752");
        factory.connection(9, 8, "_F62CDE9E-DE17-4A22-BA50-9A05F59F1764");
        factory.connection(10, 9, "_5A6553EF-DE13-4FA2-B51D-80C69600D588");
        factory.connection(11, 10, "_AC26ABB6-A57A-4F8F-8E3A-81AD30B67AE8");
        factory.validate();
        return factory.getProcess();
    }
}
