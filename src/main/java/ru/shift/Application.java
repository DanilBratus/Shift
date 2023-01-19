package ru.shift;

import ru.shift.service.Distributor;

public class Application {
    public static void main(String[] args) {
        Distributor distributor = new Distributor(args);
        distributor.start();
    }
}
