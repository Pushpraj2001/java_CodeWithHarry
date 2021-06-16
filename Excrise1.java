import java.util.Scanner;
public class Excrise1 {
    public static void main(String[] args) {
        // WAP to calculate percentage of a given student in CBSE board exam . His marks from 5 subject must be taken as input from the Keyboard.
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter English Marks : ");
       float English = sc.nextFloat();

       System.out.println("Enter Hindi Marks : ");
       float Hindi = sc.nextFloat();
       
       System.out.println("Enter Math Marks : ");
       float Maths = sc.nextFloat();
       
       System.out.println("Enter Science Marks : ");
       float Science = sc.nextFloat();
       
       System.out.println("Enter Social Science Marks : ");
       float SocialSci = sc.nextFloat();
    //    to calulate the percentage of total subject
    float total_percentage = (English+Hindi+Maths+Science+SocialSci)/5; 
    System.out.println("The total Percentage : ");
    System.out.print( total_percentage);
  
}
}
