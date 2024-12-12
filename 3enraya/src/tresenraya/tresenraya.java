package tresenraya;

import java.util.Scanner;
import java.util.Random;

public class tresenraya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Random random = new Random();		

//pregunta los nombres de los dos jugadores
		System.out.println("jugador 1 cual es tu nombre?");
			String jugador1 =s.next();
		System.out.println("jugador 2 cual es tu nombre?");
			String jugador2 =s.next();
			
System.out.println(jugador1+" seras cara, "+jugador2 +" seras cruz");

//Aqui se decide si la moneda sale cara o cruz
			System.out.println("\n Ahora se tirara la moneda");
			
		String Cruz ="cruz";
		String Cara ="cara";
			int moneda= random.nextInt(2);
				if(moneda ==1) {
					System.out.println("\n La moneda a salido " + Cruz);
				}else {
					System.out.println("\n La moneda a salido " + Cara);
				}

				
//matriz declarada para el juego
String matriz[][]= {{".", ".", "."},
					{".", ".", "."},
					{".", ".", "."}};	


while(true) {
for(int i = 0; i < matriz.length; i++) { //primero recore las filas
for(int j = 0; j <matriz[i].length; j++) { // segundo recorre las columnas
	System.out.print("|"+matriz[i][j]+"|");
}
System.out.println("");
}
System.out.println("\nTurno del jugador " + jugador1);




break;
}
		
	}

}
