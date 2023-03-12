import java.util.Scanner;

public class AverageOfThreeMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char name = sc.next().charAt(0);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();

        System.out.println(name);
        System.out.println((marks1+marks2+marks3)/3);
    }
}
