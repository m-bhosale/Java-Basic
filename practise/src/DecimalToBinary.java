import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no  = sc.nextInt();
        int temp = no;
        String decimal= "";
        while(temp > 0){
            int tempDecimal = temp % 2;
            temp = temp /2;
            decimal = String.valueOf(tempDecimal)+decimal;
        }
        System.out.println(decimal);
        sc.close(); // cl
    }
}
