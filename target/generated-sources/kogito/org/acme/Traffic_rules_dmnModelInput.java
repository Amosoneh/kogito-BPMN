/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;
import org.kie.kogito.ProcessInput;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "traffic_rules_dmn", name = "Traffic_rules_dmn", hidden = true)
@ProcessInput(processName = "traffic_rules_dmn")
public class Traffic_rules_dmnModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<Traffic_rules_dmnModel> {

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "driverId")
    @javax.validation.Valid()
    private java.lang.String driverId;

    public java.lang.String getDriverId() {
        return driverId;
    }

    public void setDriverId(java.lang.String driverId) {
        this.driverId = driverId;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "driver")
    @javax.validation.Valid()
    private org.acme.models.Driver driver;

    public org.acme.models.Driver getDriver() {
        return driver;
    }

    public void setDriver(org.acme.models.Driver driver) {
        this.driver = driver;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "fine")
    @javax.validation.Valid()
    private org.acme.models.Fine fine;

    public org.acme.models.Fine getFine() {
        return fine;
    }

    public void setFine(org.acme.models.Fine fine) {
        this.fine = fine;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "violation")
    @javax.validation.Valid()
    private org.acme.models.Violation violation;

    public org.acme.models.Violation getViolation() {
        return violation;
    }

    public void setViolation(org.acme.models.Violation violation) {
        this.violation = violation;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "suspended")
    @javax.validation.Valid()
    private java.lang.String suspended;

    public java.lang.String getSuspended() {
        return suspended;
    }

    public void setSuspended(java.lang.String suspended) {
        this.suspended = suspended;
    }

    @Override()
    public Traffic_rules_dmnModel toModel() {
        Traffic_rules_dmnModel result = new Traffic_rules_dmnModel();
        result.setDriverId(getDriverId());
        result.setDriver(getDriver());
        result.setFine(getFine());
        result.setViolation(getViolation());
        result.setSuspended(getSuspended());
        return result;
    }
}
