import java.util.ArrayList;
import java.util.Scanner; 

public class Main {
	private ArrayList<Character> listaLetras;
	private ArrayList<Integer> listadeRepeticiones;
	private ArrayList<String> vectorLineas;
	
	public Main(){
		listaLetras= new ArrayList<Character>(0);
		listadeRepeticiones = new ArrayList<Integer>(0);
		vectorLineas = new ArrayList<String>(0);
	}
	
	public static void main(String[] args) {
		E10008 miObjeto = new E10008();
		
		Scanner entrada=new Scanner(System.in);
		String numero;
		
		numero =entrada.nextLine();
		int entero=0;
		 
		try{
			entero = Integer.parseInt(numero);
			
			

		}catch(Exception e){
			System.out.println("Error, int value expected");
		}
		
		for(int i=0; i<entero; i++){
			
			String tmp = entrada.nextLine();	
			tmp=tmp.toUpperCase();	
			miObjeto.contarLetras(tmp);
		}
			
		miObjeto.mostrarListas();

	}
	
	public void contarLetras(String linea){
		
		for(int j=0; j<linea.length();j++){
			char letra= linea.charAt(j);
			if((letra>=65)&&(letra<=90)){
				if(indiceLetra(letra)==-1){
					listaLetras.add(letra);
					listadeRepeticiones.add(1);
				}else{
					int num = listadeRepeticiones.get(indiceLetra(letra))+1;
					listadeRepeticiones.set(indiceLetra(letra), num);
				}
			}
		}
		
	}
	
	public int indiceLetra(char letra){
		for(int i=0; i<listaLetras.size();i++){
			if(listaLetras.get(i).equals(letra)){
				return i;
			}
		}
		return -1;
	}
	
	public void mostrarListas() {
		
		for(int i=0; i< listaLetras.size();i++){
			
			int contador=0, indice=-1;
			for(int j=0;j< listaLetras.size();j++){
				if(listadeRepeticiones.get(j)>contador){
					contador=listadeRepeticiones.get(j);
					indice=j;
				}else{
					if((listadeRepeticiones.get(j)==contador)&&(contador!=0)){
						if(listaLetras.get(j).charValue()<listaLetras.get(indice).charValue()){
							contador=listadeRepeticiones.get(j);
							indice=j;
						}
					}
				}
			}
			
			System.out.println(listaLetras.get(indice)+" "+Integer.toString(listadeRepeticiones.get(indice)));
			listadeRepeticiones.set(indice, 0);
		}
		
	}
}
