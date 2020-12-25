package com.mycompany.domain.impl;

import com.mycompany.domain.Entity;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class Mobile_Operations extends Entity {
    private SimpleLongProperty mobile_operationId;
    private SimpleStringProperty clientName;
    private SimpleStringProperty clientSurname;
    private SimpleStringProperty mobile_phone;
    private SimpleStringProperty Sum;

    public Mobile_Operations() {
        long currentId = getId();
        setId(currentId++);
    }

    public Mobile_Operations (String mobile_phone, String clientName, String clientSurname, String Sum) {
        long currentId = getId();
        setId(currentId++);
        this.clientName = new SimpleStringProperty(clientName);
        this.clientSurname = new SimpleStringProperty(clientSurname);
        this.mobile_phone = new SimpleStringProperty(mobile_phone);
        this.Sum = new SimpleStringProperty(Sum);
    }

    public Mobile_Operations (Long mobile_operationId, String mobile_phone, String clientName, String clientSurname, String Sum) {
        long currentId = getId();
        setId(currentId++);
        this.mobile_operationId = new SimpleLongProperty(mobile_operationId);
        this.clientName = new SimpleStringProperty(clientName);
        this.clientSurname = new SimpleStringProperty(clientSurname);
        this.mobile_phone = new SimpleStringProperty(mobile_phone);
        this.Sum = new SimpleStringProperty(Sum);
    }

    public long getMobileOperationId() {
        return mobile_operationId.get();
    }

    public void setMobileOperationId(long mobile_operationId) {
        this.mobile_operationId = new SimpleLongProperty(mobile_operationId);
    }

    public String getClientName() {
        return clientName.get();
    }

    public void setClientName(String clientName) {
        this.clientName = new SimpleStringProperty(clientName);
    }

    public String getClientSurname() {
        return clientSurname.get();
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = new SimpleStringProperty(clientSurname);
    }

    public String getMobilePhone() {
        return mobile_phone.get();
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobile_phone = new SimpleStringProperty(mobilePhone);
    }

    public void setSum(String Sum) {
        this.Sum = new SimpleStringProperty(Sum);
    }

    public String getSum() {
        return Sum.get();
    }
}
