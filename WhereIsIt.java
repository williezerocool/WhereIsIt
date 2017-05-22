/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whereisit;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
public class WhereIsIt {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Random r = new Random();
        int input;
        Integer arr[] = new Integer[10];
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Array: ");
        int count = 0;
       
        
        
        for(int i=0; i<10; i++){
        
            int num = 1 + r.nextInt(50);
            arr[i] = num;
            if(i >= 0){
               
                System.out.print(arr[i] + " ");
            }
        }
         System.out.println();
         System.out.print("value to find: ");
         input = keyboard.nextInt();
         
         int slot = 0;
         
         for(int i=0; i<10; i++){
         
             if(input == arr[i]){
             
                 count++;
             }
             
             
         }
       
       
         
         
         
         if(arr[0] == input){
         
             System.out.println(input + " is in the array " + count + " time(s)");
             System.out.println(Arrays.asList(arr).lastIndexOf(input) + " is the last index of " + input);
         }else if(arr[1] == input){
         
             System.out.println(input + " is in the array " + count + " time(s)");
             System.out.println(Arrays.asList(arr).lastIndexOf(input) + " is the last index of " + input);
         }else if(arr[2] == input){
         
             System.out.println(input + " is in the array " + count + " time(s)");
             System.out.println(Arrays.asList(arr).lastIndexOf(input) + " is the last index of " + input);
         }else if(arr[3] == input){
         
             System.out.println(input + " is in the array " + count + " time(s)");
             System.out.println(Arrays.asList(arr).lastIndexOf(input) + " is the last index of " + input);
         }else if(arr[4] == input){
         
             System.out.println(input + " is in the array " + count + " time(s)");
             System.out.println(Arrays.asList(arr).lastIndexOf(input) + " is the last index of " + input);
         }else if(arr[5] == input){
         
             System.out.println(input + " is in the array " + count + " time(s)");
             System.out.println(Arrays.asList(arr).lastIndexOf(input) + " is the last index of " + input);
         }else if(arr[6] == input){
         
             System.out.println(input + " is in the array " + count + " time(s)");
             System.out.println(Arrays.asList(arr).lastIndexOf(input) + " is the last index of " + input);
         }else if(arr[7] == input){
         
             System.out.println(input + " is in the array " + count + " time(s)");
             System.out.println(Arrays.asList(arr).lastIndexOf(input) + " is the last index of " + input);
         }else if(arr[8] == input){
         
             System.out.println(input + " is in the array " + count + " time(s)");
             System.out.println(Arrays.asList(arr).lastIndexOf(input) + " is the last index of " + input);
         }else if(arr[9] == input){
         
             System.out.println(input + " is in the array " + count + " time(s)");
             System.out.println(Arrays.asList(arr).lastIndexOf(input) + " is the last index of " + input);
         }else{
         
             System.out.println(input + " isn't in the array ");
         }
         
             
         
    }
    
}

