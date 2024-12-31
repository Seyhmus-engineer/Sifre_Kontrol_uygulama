
package sifre_kontrol;

import java.util.Scanner;


public class Sifre_kontrol {

   
    //en az 8 karakter
    //en az bir harf ve en az bir rakam
    //en az bir büyük harf ve en az bir küçük harf
    //şifre harf veya rakamdan oluşşun
    
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("Şifreniz aşağıdaki şekilde olmalı ");
        System.out.println("en az 8 karakter\n en az bir harf ve en az bir rakam\n en az bir büyük harf ve en az bir küçük harf\n şifre harf veya rakamdan oluşsun\n ");
       
        System.out.println("*****************************************");
        System.out.print("Lütfen bir şifre giriniz: ");
        String s=k.nextLine();
        if (SifreGecerlimi(s)) {
            System.out.println("Şifreniz oluşturuldu");
        }
    }
    public static boolean SifreGecerlimi(String s){
        boolean Sifre_Gecerlimi=true;
        if (s.length()<8) {
            System.out.println("Şifre uzunluğu en az 8 olamalıdır");
            Sifre_Gecerlimi=false;
        }
        int rakamsayısı=0,harfsayısı=0,büyükKaraktersayısı=0,kucukKaraktersayısı=0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))) {
                System.out.println("şifre harf veya rakamdan oluşmalıdır ");
                Sifre_Gecerlimi=false;
            }
            if (Character.isDigit(s.charAt(i))) {
                rakamsayısı++;
            }
            if (Character.isLetter(s.charAt(i))) {
                harfsayısı++;
                if (Character.isUpperCase(s.charAt(i))) {
                    büyükKaraktersayısı++;
                }
                if (Character.isLowerCase(s.charAt(i))) {
                    kucukKaraktersayısı++;
                }
            }
        }
        if (harfsayısı==0) {
            System.out.println("şifre en az bir harf içermelidir");
            Sifre_Gecerlimi=false;
        }
        if (rakamsayısı==0) {
            System.out.println("şifre en az bir rakam içermelidir");
            Sifre_Gecerlimi=false;
        }
        if (büyükKaraktersayısı==0) {
            System.out.println("şifre en az bir büyük harf  içermelidir");
            Sifre_Gecerlimi=false;
        }
        if (kucukKaraktersayısı==0) {
            System.out.println("şifre en az bir küçük harf içermelidir");
            Sifre_Gecerlimi=false;
        }
        return Sifre_Gecerlimi;
    }
    
    
}
