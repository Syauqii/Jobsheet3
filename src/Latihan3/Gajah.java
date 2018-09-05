/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author SYSTEM
 */
public class Gajah extends Hewan{
    public static void testClassMethod(){
        System.out.println("The class Method in hewan ...");
    }
    //meng-override method pada class hewan
    public void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah ...");
    }
    public static void main(String[] args){
        Gajah MyGajah = new Gajah();
        Hewan MyHewan = MyGajah;
        Hewan hewan1 = new Hewan();
        Hewan.testClassMethod();
        MyHewan.testInstanceMethod();
        hewan1.testInstanceMethod();
        MyGajah.testClassMethod();
    }
}