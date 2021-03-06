package com.example.backend.travelexpense.handler;

import com.sap.cloud.server.odata.*;

public class ReportHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private com.example.backend.travelexpense.MainServlet servlet;
    private com.example.backend.travelexpense.proxy.TravelexpenseService service;

    public ReportHandler(com.example.backend.travelexpense.MainServlet servlet, com.example.backend.travelexpense.proxy.TravelexpenseService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
    }

    @Override public DataValue executeQuery(DataQuery query) {
        return service.executeQuery(query).getResult();
    }

    @Override public void createEntity(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.Report entity = (com.example.backend.travelexpense.proxy.Report)entityValue;
        service.createEntity(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.Report entity = (com.example.backend.travelexpense.proxy.Report)entityValue;
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.Report entity = (com.example.backend.travelexpense.proxy.Report)entityValue;
        service.deleteEntity(entity);
    }
}
