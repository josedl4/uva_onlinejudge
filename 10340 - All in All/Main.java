import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine()){
			String line = in.nextLine();
			String[] words = line.split(" ");
			
			int cont = 0;
			for(int i = 0; i < words[1].length(); i++){
				if(cont < words[0].length() && (words[1].charAt(i) == words[0].charAt(cont)))
					cont ++;

			}
			
			if(cont == words[0].length())
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
