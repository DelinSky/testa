package com.delinsky.IoC;

/**
 * Created by Vladimir on 02.03.2017.
 */
public class HttpRequestService {
    public HttpRequest anyRequest;

//    public HttpRequestService(HttpRequest anyRequest) {
//        this.anyRequest = anyRequest;
//
//    }
//}

    public void setAnyRequest(HttpRequest anyRequest) {
        this.anyRequest = anyRequest;
    }

    public void testMethod(){
        anyRequest.returnMethod();
    }
}
