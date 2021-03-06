package com.delinsky.IoC;
import com.delinsky.container.MyContainer;

import java.util.Date;

/**
 * Created by Vladimir on 02.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        MyContainer testContainer = new MyContainer();

        ((HttpRequestService) testContainer.container.get("service")).setAnyRequest((HttpRequest) testContainer.container.get("get"));

        ((HttpRequestService) testContainer.container.get("service")).testMethod();

        HttpRequest testProxy = new ProxyLogger((HttpRequest) testContainer.container.get("put"));
        testProxy.returnMethod();

        System.out.println(new Date());
    }
}
