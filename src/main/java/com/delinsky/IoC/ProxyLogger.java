package com.delinsky.IoC;

/**
 * Created by Vladimir on 02.04.2017.
 */
public class ProxyLogger implements HttpRequest{
    private HttpRequest a;

    ProxyLogger (HttpRequest a) {
        this.a = a;
    }


    public void returnMethod() {
        System.out.println("\nstart");
        a.returnMethod();
        System.out.println("end");
    }
}
