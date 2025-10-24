/*Write a java program to input electricity unit charges and calculate total electricity bill according to the given condition:

For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.*/

import java.util.Scanner ; 
public class ELECTRICITY {
 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    double x = sc.nextInt();
    double bill = 0;
    if(x<=50){
    bill = x*0.50;
    }
    else if(x<=150){
    bill = (50*0.50)  +  (x-50)*0.75;
    }
    else if(x<=250){
    bill = (50*0.50)  +  (100*0.75) +    (x-150)*1.20;
    }
    else if(x>250){
    bill =  (50*0.50)  +  (100*0.75) +  (100*1.20) +  (x-250)*1.50;
    }
    double surcharge = bill * 0.20  ;
    double finalbill = bill + surcharge ; 
System.out.println("electricity bill is : Rs" + finalbill);   
 }   
}
