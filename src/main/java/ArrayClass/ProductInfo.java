
package ArrayClass;
import java.util.Scanner;
import java.util.Arrays;

/**
 * sample 4.10
 * @author koonp@641102064111
 * Create on 10:28:29 PM Jul 6, 2022
 * This file is part of "ArrayClass" Package.
 */
public class ProductInfo {
    public String[] name; double[] price; int idx;
    public void setdata(){
        name = new String[5]; price = new double[5];
        name[0]="COKE"; price[0]=10.75; name[1]="FANTA"; price[1]=10.50;
        name[2]="MAMA"; price[2]=5.25; name[3]="PEPSI"; price[3]=10.25; 
        name[4]="SPRITE"; price[4]=11.25;
    }
    public void showdata(){
        System.out.printf("%-10s %10s\n","name","prize");
        System.out.printf("===========================================\n");
        for(int i=0;i<5;i++){
            System.out.printf("%-10s %10.2f\n", name[i],price[i]);
        }
        System.out.printf("===========================================\n");
    }
    public void getdata(){
        Scanner scan = new Scanner(System.in);
        do{
            System.err.print("Enter product name : ");
            String g = scan.nextLine();
            idx = Arrays.binarySearch(name, g);
            if(idx<0){
                System.out.println("This product name is not found");
            }
        }while(idx<0);
        System.out.print("Enter product units : ");
        int u = scan.nextInt();
        System.out.printf("===========================================\n");
        System.out.println("Your order is "+name[idx]+" "+u+" units = "+u+" * "+price[idx]+" = "+(u*price[idx])+" bath");
        System.out.printf("===========================================\n");
    }
}
