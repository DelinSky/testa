package com.delinsky.IoC;

/**
 * Created by Vladimir on 02.03.2017.
 */
public class Get implements HttpRequest {
    public void returnMethod(){
        System.out.println("Im GET.");
    }
}
