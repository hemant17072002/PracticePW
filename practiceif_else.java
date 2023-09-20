import java.util.Scanner;

public class practiceif_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your Characterr");
    //     char a = sc.next().charAt(0);
    //     boolean b = Character.isUpperCase(a);
    //     if (b == true) {
    //         System.out.println("Your given Character is Upper Case");
    //     } else {
    //         System.out.println("Your given character is Lower Case");
    //     }

    System.out.println("Enter your year to check whether it is leap year or not");
    int year=sc.nextInt();
    if(year==2000){
        if((year%400)==0){
            System.out.println("Year is Leap Year");
        }
        else{
            System.out.println("Your Year is not leap Year");
        }
      
    }
    else if(year==1900){
        if((year%400)==0){
            System.out.println("Year is Leap Year");
        }
        else{
            System.out.println("Your Year is not leap Year");
        }
    }
    else if(year==2100){
        if((year%400)==0){
            System.out.println("Year is Leap Year");
        }
        else{
            System.out.println("Your Year is not leap Year");
        }
    }
    else if((year%4)==0){
         System.out.println("Year is Leap Year");

    }
    else{
        System.out.println("Your Year is not leap Year");
    }

    }



}
