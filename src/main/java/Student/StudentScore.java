
package Student;
import java.util.Scanner;
import ArrayClass.MaxMinAvg;

/**
 * sample 4.8
 * @author koonp@641102064111
 * Create on 6:10:23 PM Jul 9, 2022
 * This file is part of "Student" Package.
 */
public class StudentScore {
    public static void main(String[] args){
        int[] scores;
        Scanner scan = new Scanner(System.in);
        scores= new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Score "+(i+1)+" : ");
            scores[i] = scan.nextInt();
        }
        MaxMinAvg test = new MaxMinAvg();
        int max =test.getmax(scores);
        int min = test.getmin(scores);
        float avg = test.getavg(scores);
        System.out.print("min score is "+min+"\n"+"max score is "+max+"\n"+"mean score is "+avg);
    }
}