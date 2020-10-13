package com.Bagus.Modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Yoru ni Kakeru");
        Lagu lagu2 = new Lagu("Gurenge", "LiSa");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
