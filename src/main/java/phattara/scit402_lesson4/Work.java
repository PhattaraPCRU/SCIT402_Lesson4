/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phattara.scit402_lesson4;
import java.util.Scanner;
import java.util.Arrays;
import ArrayClass.MaxMinAvg;

/**
 *
 * @author 641102064111
 */
public class Work {
    /*Public Obj Below Here*/
    public static Scanner scn = new Scanner(System.in);
    public static <PrintableToString> void p(PrintableToString... args) {
        for(PrintableToString pts: args)
            System.out.print(pts);
        //System.out.println();
    }
    /*Work Below Here*/
    public static void samp41(){
        double[] scores={15,20,25,18,22};
        for(int i=0;i<scores.length;i++){
            p(scores[i]);
        }
    }
    public static void samp42(){
        int i;float[] temp;float sum=0.0f,avg_temp;
        temp = new float[12];
        for(i=0;i<12;i++){
            p("temp["+(i+1)+"] = ");
            temp[i] = scn.nextFloat();
            sum=sum+temp[i];
        }
        avg_temp = sum/12;
        p("Average Temperature = "+"%.2f\n",avg_temp);
    }
    public static void samp43(){
        int num[] = {15,22,33,10,7,27,16};
        p("Total Number of num = "+num.length);
    }
    public static void samp44(){
        int num[] = {15,22,33,10,7,27,16};
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            p(num[i]+"");
        }
    }
    public static void samp45(){
        int num[] = {15,22,33,10,7,27,16};
        Arrays.sort(num);
        int idx = Arrays.binarySearch(num, 22);
        for(int i=0;i<num.length;i++){
            p(num[i]+"");
        }
        p("\nFound \"22\" at index = "+idx+"\n");
    }
    public static void samp45edit(){
        int num[]={15,22,33,10,7,27,16},search=0;
        Arrays.sort(num);
        p("Search : ");
        search = scn.nextInt();
        int idx=Arrays.binarySearch(num, search);
        for(int i=0;i<num.length;i++){
            p(num[i]+" ");
        }
        if(idx<=num.length&&idx>=0){
            p("\nFound \""+search+"\" at index = "+idx+"\n");
        }else{
            p("\nNot Found \""+search+"\"");
        }
    }
    public static void samp46(){
        int num[]={15,22,33,10,7,27,16};
        for(int i=0;i<num.length;i++){
            p(num[i]+" ");
        }
        Arrays.fill(num,0);
        p("\nAfter Call \"Arrays.fill(num, 0)\"");
        for(int i=0;i<num.length;i++){
            p(num[i]+" ");
        }
    }
    public static void samp47(){
        int num1[]={15,22,33,10,7,27,16};
        int num2[]={15,22,33,10,7,27,16};
        p("Array num1 equals to Array num2 is "+Arrays.equals(num1, num2));
        Arrays.sort(num1);
        p("Array num1 equals to Array num2 is "+Arrays.equals(num1, num2));
    }
}
