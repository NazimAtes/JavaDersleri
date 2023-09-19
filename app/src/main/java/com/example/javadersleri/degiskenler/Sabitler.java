package com.example.javadersleri.degiskenler;

public class Sabitler {
    public static void main(String[] args) {
        // Sabit-Constant-> final
        // let(swift) - val (kotlin) - dart (cons)

        //Örneğin:

        int sayi=10;
        System.out.println(sayi);// çıktı burada 10 oldu
        sayi=80;
        System.out.println(sayi);  // çıktı burada 80 oldu

        final int  numara =10;
        System.out.println(numara); // çıktı burada 10 oldu
        /*
        numara=20; // burada çıktı alamadım bile çünkü tipi int olan numara değişkenini "final" ilarak tanımladık. ve bu bir "sabit" oldu artık.

         */

    }
}
