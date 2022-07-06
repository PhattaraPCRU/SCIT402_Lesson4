/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;
import java.util.Scanner;
import ArrayClass.MaxMinAvg;
/**
 * sample 4.9
 * @author 641102064111
 */
public class StudentHeight {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] height;
        height = new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Height "+(i+1)+" : ");
            height[i] = scan.nextInt();
        }
        MaxMinAvg std_height = new MaxMinAvg();
        float high = std_height.getavg(height);
        System.out.print("Average height is "+high);
    }
}
