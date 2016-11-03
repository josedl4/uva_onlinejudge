import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int repeat = in.nextInt();
		
		for(int r = 0; r < repeat; r++){
			int n = in.nextInt();
			int m = in.nextInt();
			
			n -= 2;
			m -= 2;
			
			int result = 0;
			
			if(n == 1){
				result = (int) Math.floor(m/3);
			}
			
			if(m == 1){
				result = (int) Math.floor(n/3);
			}
			
			if((n != 1) && (m != 1)){
				result = (int) Math.ceil((double)n/(double)3) * (int) Math.ceil((double)m/(double)3);
			}
			
			System.out.println(result);
		}

	}

}
