package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@org.springframework.stereotype.Component()
public class DriverService_getDriver_10_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.services.DriverService service;

    public DriverService_getDriver_10_Handler() {
        this(new org.acme.services.DriverService());
    }

    @org.springframework.beans.factory.annotation.Autowired(required = false)
    @org.springframework.context.annotation.Lazy()
    public DriverService_getDriver_10_Handler(org.acme.services.DriverService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.getDriver((java.lang.String) workItem.getParameter("driverId"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("driver", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.services.DriverService_getDriver_10_Handler";
    }
}
