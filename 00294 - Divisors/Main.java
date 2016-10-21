import java.util.Scanner;

public class Main {
	
	public static int maxim;
	public static int num;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i = 0; i < x; i++){
			int l = in.nextInt();
			int u = in.nextInt();
			
			numOfDivisors(l, u);
			
			System.out.println("Between " + l + " and " + u + ", " + num +
					" has a maximum of " + maxim + " divisors.");
		}
		
		
		in.close();
	}
	
	public static void numOfDivisors(int min, int max) {
		int cont;
		int result = min;
		int maxDivisors = 0;
		
		for(int i = min; i <= max; i++){
			cont = 0;
			for(int j = 1; j <= (int)Math.pow(i, 0.5); j++){
				if((i%j) == 0){
					if(i/j != j){
						cont += 2;
					}else {
						cont += 1;
					}
				}
			}
			if(cont > maxDivisors){
				maxDivisors = cont;
				result = i;
			}
			
		}
		num = result;
		maxim = maxDivisors;
	}
}
