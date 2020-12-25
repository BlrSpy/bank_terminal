package com.mycompany.factory.impl;

import com.mycompany.domain.impl.Mobile_Operations;


public class MobileOperationFactory {
    public static final MobileOperationFactory MOBILE_OPERATION_FACTORY = new MobileOperationFactory();

    private MobileOperationFactory() {}

    public Mobile_Operations create(String mobile_phone, String clientName, String clientSurname, String Sum) {
        Mobile_Operations mobOperation = new Mobile_Operations();

        mobOperation.setMobilePhone(mobile_phone);
        mobOperation.setClientName(clientName);
        mobOperation.setClientSurname(clientSurname);
        mobOperation.setSum(Sum);

        return mobOperation;
    }

    public Mobile_Operations create(long id, String mobile_phone, String ClientName, String ClientSurname, String Sum) {
        Mobile_Operations mobOperation = new Mobile_Operations();

        mobOperation.setMobileOperationId(id);
        mobOperation.setMobilePhone(mobile_phone);
        mobOperation.setClientName(ClientName);
        mobOperation.setClientSurname(ClientSurname);
        mobOperation.setSum(Sum);

        return mobOperation;
    }
}