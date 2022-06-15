import java.util.Random;
import java.util.Scanner;



public class main {

	public static void main (String[] args) {
		String [] palabras = {"casa", "avion" , "zapato" ,"vaca"}; 
		Random r = new Random();
		int n = r.nextInt(palabras.length);
		
		String palabrasecreta = palabras[n];
		System.out.println(palabrasecreta);
		
		int nletraspalabrasecreta = palabrasecreta.length();
		
		char [] palabralongitud = new char[nletraspalabrasecreta];
		
		for(int i=0; i<palabralongitud.length; i++) {
			palabralongitud[i] = '_' ;
		}
		boolean findeljuego = false;
		Scanner lector =new Scanner(System.in);
		do {
			System.out.println(palabralongitud);
			System.out.println("introduce una letra: ");
			
			char letra = lector.next().charAt(0);
			boolean letraacertada= false;
			for(int i = 0; i<palabrasecreta.length();i++) {
				if(palabrasecreta.charAt(i)==letra) {
					palabralongitud[i] = letra;
					letraacertada =true;
				}
			}if(!letraacertada)System.out.println("no has adivinado ninguna letra ")
;		}while(!findeljuego);
		System.out.println(palabralongitud);
	}
	/*static void getPalabrasecreta(){
		String [] palabras = {"casa", "avion" , "zapato" ,"vaca"}; 
		Random r = new Random();
		int n = r.nextInt(palabras.length);
		
		String palabrasecreta = palabras[n];
		}*/
	/*static char[] getlongitudfrompalabra(String palabra) {
		int nletraspalabrasecreta = palabrasecreta.length();
		char [] palabralongitud = new char[nletraspalabrasecreta];
		for(int i=0; i<palabralongitud.length; i++) {
			palabralongitud[i] = '_' ;
		}
		
	}*/
}

