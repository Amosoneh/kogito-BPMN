/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
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
package org.kie.kogito.app;

@org.springframework.stereotype.Component
public class ConfigBean extends org.kie.kogito.config.StaticConfigBean {

    @org.springframework.beans.factory.annotation.Value("${kogito.service.url:#{null}}")
    java.util.Optional<java.lang.String> kogitoService;

    @org.springframework.beans.factory.annotation.Value("${kogito.messaging.as-cloudevents:#{true}}")
    boolean useCloudEvents;

    @org.springframework.beans.factory.annotation.Value("${kogito.jackson.fail-on-empty-bean:#{false}}")
    boolean failOnEmptyBean;

    @javax.annotation.PostConstruct
    protected void init() {
        setServiceUrl(kogitoService.orElse(""));
        setCloudEvents(useCloudEvents);
        setFailOnEmptyBean(failOnEmptyBean);
        setGav(new org.kie.kogito.KogitoGAV("org.acme", "traffic-violation-process", "1.0-SNAPSHOT"));
    }
}
