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
public class BedmasAndCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x = 22;
       int y=x*2;
       double z =(double)y/7; //must cast y to double
        System.out.println("x is "+x);
        System.out.println("y is "+y);
        System.out.println("z is "+z);
        
        //mod --> % = remainder of a calculation
        //44 candies/ 7 kids, remainder = 2
        int leftover=44%7;
        System.out.format("I have %d candy left over\n",leftover);
        
        //BEDMAS
        System.out.println("\n\nBEDMAS\n======\n\n");
        int e,f,g;
        e=f=g=5;
        int ans;
        
        ans = e+f*g; //30
        System.out.println(""+ans);
        ans= (e+f)*g;//50
        System.out.println(""+ans);
        ans= e+f %g;//5
        System.out.println(""+ans);
        ans=(e+f)%g;//0
        System.out.println(""+ans);
    }
    
}
