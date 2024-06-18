package org.acme.models;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.models.Rules3ad5623be4fa4e0fa8efdc4ca37d09dc.*;
import org.drools.model.Query;

public class Rules3ad5623be4fa4e0fa8efdc4ca37d09dc_LicencesValidationService extends Rules3ad5623be4fa4e0fa8efdc4ca37d09dc {

    @Override
    public String getName() {
        return super.getName() + ".LicencesValidationService";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.model.codegen.execmodel.generator.DRLIdGenerator@5058430
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rules3ad5623be4fa4e0fa8efdc4ca37d09dc_LicencesValidationService_rule_Is_32driver_32license_32valid.rule_Is_32driver_32license_32valid(),
                                       Rules3ad5623be4fa4e0fa8efdc4ca37d09dc_LicencesValidationService_rule_Is_32driver_32license_32expired.rule_Is_32driver_32license_32expired());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Collections.emptyList();
    }

    public static final org.drools.model.Global<java.util.Date> var_currentTime = D.globalOf(java.util.Date.class,
                                                                                             "org.acme.models",
                                                                                             "currentTime");

    public static final org.drools.model.Global<org.acme.models.Driver> var_driver = D.globalOf(org.acme.models.Driver.class,
                                                                                                "org.acme.models",
                                                                                                "driver");

    final Query query_validation = query_validation();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_validation() {
        final org.drools.model.Variable<org.acme.models.Driver> var_$driver = D.declarationOf(org.acme.models.Driver.class,
                                                                                              DomainClassesMetadata3ad5623be4fa4e0fa8efdc4ca37d09dc.org_acme_models_Driver_Metadata_INSTANCE,
                                                                                              "$driver",
                                                                                              D.from(var_driver));
        org.drools.model.Query validation_build = queryDef_validation.build(D.pattern(var_$driver,
                                                                                      D.from(var_driver)));
        return validation_build;
    }

    protected java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        globals.add(var_currentTime);
        globals.add(var_driver);
        queries.add(query_validation);
    }
}
