/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayClass;
import java.util.Arrays;

/**
 *
 * @author 641102064111
 */
public class MaxMinAvg {
    public int getmax(int[] s){
        Arrays.sort(s);
        int max = s[s.length-1];
        return max;
    }
    public int getmin(int[] s){
        Arrays.sort(s);
        int min = s[0];
        return min;
    }
    public float getavg(int[] s){
        float sum=0.0f,avg;
        for(int i=0;i<s.length;i++){
            sum = sum + s[i];
        }
        avg = sum/s.length;
        return avg;
    }
}
