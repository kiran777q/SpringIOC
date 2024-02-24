package org.example;

public class TMobile implements Sim{


    @Override
    public void Calling() {
        System.out.println("Inside the TMobile Calling Method");
    }

    @Override
    public void Data() {
        System.out.println("Inside the TMobile Data Method");
    }
}
