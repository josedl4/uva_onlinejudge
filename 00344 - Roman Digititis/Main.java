import java.util.Scanner;

public class Main {

	public static int[] numOfCharacters;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while((n = in.nextInt()) != 0){
			System.out.println(result(n));
		}

		in.close();
	}
	
	public static String result(int n) {
		String result;
		numOfCharacters = new int[5];
		
		for(int i = 1; i <= n; i++){
			op(i);
		}
		result = n+": " + numOfCharacters[0] + " i, " + numOfCharacters[1] + " v, " + numOfCharacters[2]
				+ " x, " + numOfCharacters[3] + " l, " + numOfCharacters[4] + " c";
		return result;
	}
	
	public static void op(int i) {
		while(i >= 100){
			i -= 100;
			numOfCharacters[4] ++;
		}
		while(i >= 90){
			i -= 90;
			numOfCharacters[4] ++;
			numOfCharacters[2] ++;
		}
		while(i >= 80){
			i -= 80;
			numOfCharacters[3] ++;
			numOfCharacters[2] += 3;
		}
		while(i >= 70){
			i -= 70;
			numOfCharacters[3] ++;
			numOfCharacters[2] += 2;
		}
		while(i >= 60){
			i -= 60;
			numOfCharacters[3] ++;
			numOfCharacters[2] ++;
		}
		while(i >= 50){
			i -= 50;
			numOfCharacters[3] ++;
		}
		while(i >= 40){
			i -= 40;
			numOfCharacters[3] ++;
			numOfCharacters[2] ++;
		}
		while(i >= 30){
			i -= 30;
			numOfCharacters[2] += 3;
		}
		while(i >= 20){
			i -= 20;
			numOfCharacters[2] += 2;
		}
		while(i >= 10){
			i -= 10;
			numOfCharacters[2] ++;
		}
		switch(i){
			case 9:
				i -= 9;
				numOfCharacters[2] ++;
				numOfCharacters[0] ++;
				break;
			case 8:
				i -= 8;
				numOfCharacters[1] ++;
				numOfCharacters[0] += 3;
				break;
			case 7:
				i -= 7;
				numOfCharacters[1] ++;
				numOfCharacters[0] += 2;
				break;
			case 6:
				i -= 6;
				numOfCharacters[1] ++;
				numOfCharacters[0] ++;
				break;
			case 5:
				i -= 5;
				numOfCharacters[1] ++;
				break;
			case 4:
				i -= 4;
				numOfCharacters[1] ++;
				numOfCharacters[0] ++;
				break;
			case 3:
				i -= 3;
				numOfCharacters[0] += 3;
				break;
			case 2:
				i -= 2;
				numOfCharacters[0] += 2;
				break;
			case 1:
				i -= 1;
				numOfCharacters[0] ++;
				break;
		}
	}

}
