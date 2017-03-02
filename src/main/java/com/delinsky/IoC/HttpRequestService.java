package com.delinsky.IoC;

/**
 * Created by Vladimir on 02.03.2017.
 */
public class HttpRequestService {

    HttpRequest anyRequest;

    public void setAnyRequest(HttpRequest anyRequest) {
        this.anyRequest = anyRequest;
    }

    public void getInfoAbout(){
        anyRequest.returnMethod();

    }
}
