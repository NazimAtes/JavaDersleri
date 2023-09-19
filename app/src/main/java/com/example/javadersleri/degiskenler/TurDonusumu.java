package com.example.javadersleri.degiskenler;

public class TurDonusumu {
    public static void main(String[] args) {
        // Tür Dönüşümü - Type Casting
        // Sayısaldan metine dönüşüm;
        int i =65;
        double d= 45.78;

        String sonuc1=String.valueOf(d);//"45.78"
        String sonuc2=String.valueOf(i);//"65"

        System.out.println(sonuc1);
        System.out.println(sonuc2);

        // Metinden Sayısala;
        String yazi1="56"; //int
        String yazi2="23.87"; // double

        int sonuc3=Integer.parseInt(yazi1);
        double sonuc4=Double.parseDouble(yazi2);

        System.out.println(yazi1);
        System.out.println(yazi2);






    }
}
