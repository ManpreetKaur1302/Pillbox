/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sheridanc;

/**
 *
 * @author Owner
 */
public class PillBox {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create the array
        char[] pillbox=new char[7];
        
        //assign values to the each elements of the array
        pillbox[0]='s';
        pillbox[1]='t';
        pillbox[2]='u';
        pillbox[3]='d';
        pillbox[4]='e';
        pillbox[5]='n';
        pillbox[6]='t';
        
        //print each element
        for(int i=0;i<=pillbox.length-1;i++)
        {
            System.out.println(pillbox[i]);
        }
    }
}
