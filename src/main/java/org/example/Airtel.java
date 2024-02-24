package org.example;

public class Airtel implements Sim{

    @Override
    public void Calling() {
        System.out.println("Inside Airtel Calling Method");
    }

    @Override
    public void Data() {
        System.out.println("Inside Airtel Data Method");
    }
}
