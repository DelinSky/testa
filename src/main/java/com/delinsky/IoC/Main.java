package com.delinsky.IoC;
/**
 * Created by Vladimir on 02.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println();

        HttpRequestService testRequest = new HttpRequestService();
        testRequest.getInfoAbout();

    }
}
