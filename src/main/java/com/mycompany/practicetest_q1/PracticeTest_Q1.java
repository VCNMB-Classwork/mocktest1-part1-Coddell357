/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicetest_q1;

/**
 *
 * @author lab_services_student
 */
public class PracticeTest_Q1 {

    public static void main(String[] args) 
    {
        String [] camera = {"CANON", "SONY", "NIKON"};
        String [] cameraType = {"MIRRORLESS", "DSLR"};
        int [][] amount = {{10500, 8500},
                            {9500, 7200},
                            {12000,8000}};

                
        System.out.println("--------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("--------------------------------------------");
        
        System.out.println("\t" + cameraType[0] + "\t" + cameraType[1]);
        
        for (int i=0;i<amount.length;i++)
        {
            System.out.println(camera[i] + "\t" + amount[i][0] + "\t" + amount[i][1]);
        }
        
        
        System.out.println("--------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("--------------------------------------------");
        
         int []tAmount = new int[amount.length];
        
        System.out.println();
        
        for (int x = 0; x< camera.length; x++) 
        {
            int mirrorlessPrice = amount[x][0];
            int dslrPrice = amount[x][1];
            int difference = mirrorlessPrice - dslrPrice;
            priceDifference[x] = difference;
                    
         }
        
        
        
        System.out.println("--------------------------------------------");
    }
}
