import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		String no = sc.nextLine();
		int evenSum = 0;
			int oddSum = 0;
		for(int i = 0 ; i < no.length(); i++){
			if(no.charAt(i)% 2 == 0){
				evenSum = evenSum + (int)(no.charAt(i));
			}
			else{
					oddSum = oddSum +  (int)(no.charAt(i));
			}
		}
	System.out.print(evenSum );
		System.out.print(" " );
		System.out.print(oddSum );

    }
}
