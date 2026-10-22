package resultcalculationfeature;

/************************************
*Author: Hock Cheng Tao
*Program Name: ResultCalculationFeature.java
*Description: To create a Java program that will be managed using Git
*Date: 21 October 2026
*Modified Date: None
*Version: 1.0
*************************************/
public class ResultCalculationFeature {

    public static void main(String[] args) {
         /* Declare two marks using variables */
        int mark1 = 80;
        int mark2 = 70;
        /* Calculate the total marks */
        int total = mark1 + mark2;
        
        /* Display The Total */
        System.out.println("Total marks = " + total);
        
        /* USe if...else to diplay message based on the total */
        if (total >= 160){
            System.out.println("Excellent.");
        }
        else if (total < 160 && total >= 100){
            System.out.println("Good.");
        }
        else{
            System.out.println("Needs Improvement.");
        }
    }
    
}
