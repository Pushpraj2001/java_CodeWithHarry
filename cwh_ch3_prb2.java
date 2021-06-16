public class cwh_ch3_prb2 {
    public static void main(String[] args) {
        // Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade); //this will show adding of 8 which is int .
          grade = (char) (grade - 8);
          System.out.println(grade);//now this will exclude the int 8 and will be in main position.
    }
}