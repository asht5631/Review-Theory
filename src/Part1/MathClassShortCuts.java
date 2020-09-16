/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

/**
 *
 * @author asht5631
 */
public class MathClassShortCuts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //math class is a part of java language so no import is needed
        int x=10;
        
        System.out.println(Math.pow(x,3));//1000 (to the power of)
        System.out.println(Math.sqrt(x));//square root (10)
        double y=8.9876;
        System.out.println(Math.round(y));//rounds to nearest (9)
        System.out.println(Math.max(x,y));//10 also min
        int roll =(int) (Math.random()*6+1);//from 1 to 6 
        //math.random()*range+start number
        //ex -> 30 and 50 /(int)(Math.random()*21+30);
        System.out.println(roll);
        System.out.println((int)Math.random()*10+1);//from 1 to ten first number is range, second is starting number
        
        System.out.println("\n\nSHORTCUTS\n=========");
        int a =10;
        a+=10;
        System.out.println("a is"+a);
        int b=a;
        b++;
        System.out.println("b is"+b);
        a*=2;
        System.out.println("a is"+a);
        int c=b++;//c =b and then adds one to b
        System.out.format("c=%d and b=%d\n",c,b);
        int d =++b;//c= one plus b
        System.out.format("d=%d and b=%d\n",d,b);
        
        
        
    }
    
}
