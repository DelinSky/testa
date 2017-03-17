package com.delinsky.IoC;
import com.delinsky.container.MyContainer;

/**
 * Created by Vladimir on 02.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        MyContainer testContainer = new MyContainer();

        ((HttpRequestService) testContainer.container.get("service")).setAnyRequest((HttpRequest) testContainer.container.get("get"));

        ((HttpRequestService) testContainer.container.get("service")).testMethod();
    }
}
