import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int rep = in.nextInt();
		
		for(int r = 0; r < rep; r++){
			int numOfAlum = in.nextInt();
			
			ArrayList<Integer> cal = new ArrayList<Integer>();
			double av = 0;
			
			for(int nAlum = 0; nAlum < numOfAlum; nAlum++){
				int tmp = in.nextInt();
				av += tmp;
				cal.add(tmp);
			}
			
			av = av/numOfAlum;
			
			int sup = 0;
			for(int a : cal){
				if(a > av)
					sup ++;
			}
			
			double res = (100000 * (double)sup / (double)numOfAlum);
			res = Math.round(res);
			res = res / 1000;
			
			System.out.println(String.format(Locale.ROOT, "%.3f", res)+"%");
		}

	}

}