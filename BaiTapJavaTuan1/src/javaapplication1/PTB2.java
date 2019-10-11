/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author phams
 */
public class PTB2 {
    private double a, b, c;
    Scanner sc = new Scanner(System.in);
    
    public PTB2(){
        a = b = c = 0;
    }
    public PTB2(double c){
        a = b = 0;
        this.c = c;
    }
    public PTB2(double b, double c){
        a= 0;
        this.b = b;
        this.c = c;
    }
    public PTB2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public void nhapPTB2(){
        System.out.println("Nhap he so: ");
        this.a = sc.nextDouble();
        this.b = sc.nextDouble();
        this.c = sc.nextDouble();
    }

 
    public String giaiPTB2(){
        String chuoiKQ;
        if(a==0)
            if(b==0)
                if(c==0)
                    chuoiKQ ="PTVSN";
                else
                    chuoiKQ = "ptvn";
            else
                chuoiKQ ="PT cÃ³ nghiá»‡m x = "+ -c/b;
        else{
            double delta = b*b - 4*a*c;
            if(delta <0)
                chuoiKQ = "PTVN vÃ¬ delta Ã¢m";
            else if(delta ==0)
                chuoiKQ ="PhÆ°Æ¡ng trÃ¬nh cÃ³ nghiá»‡m kÃ©p x1 = x2 = " + -b/(2*a);
            else 
                chuoiKQ = "PhÆ°Æ¡ng trÃ¬nh cÃ³ 2 nghiá»‡m phÃ¢n biá»‡t: x1= " + (-b -Math.sqrt(delta))/(2*a) + 
                        ", x2= " + (-b + Math.sqrt(delta))/(2*a);
        }
        return chuoiKQ;
    }
    public void xuatPTB2() {
        System.out.println("PT: " + a + "x²" + (b >= 0 ? " + " : " - ") +Math.abs(b) + "x + " + c + " = 0 ===> " + giaiPTB2());
    }
}
