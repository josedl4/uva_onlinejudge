import java.util.ArrayList;
import java.util.Scanner;

/*
 * Ejercicio 10019 - Funny Encryption Method
 * UVa Online Judge
 */

class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(0);
		while(in.hasNextInt()){
			int n = in.nextInt();
		
			for(int i = 0; i < n; i++){
				list.add(in.nextInt());
			}
		
			for(int i = 0; i < n; i++){
				System.out.println(encryption(list.get(i)));
			}
		}

	}
	
	static String encryption(int x) {
		String bin = Integer.toBinaryString(x);
		String hex = Integer.toBinaryString((Integer.parseInt(Integer.toString(x), 16)));
		String res = numberOfOnes(bin) + " " + numberOfOnes(hex);
		return res;
	}
	
	static int numberOfOnes(String chain) {
		int counter = 0;
		for(int i = 0; i < chain.length(); i++){
			if(chain.charAt(i) == '1'){counter ++;}
		}
		return counter;
	}

}
