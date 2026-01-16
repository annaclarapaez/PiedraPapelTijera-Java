
package piedrapapeltijera2;
import java.util.Scanner; 

public class Piedrapapeltijera2 {

	public static void main(String[] args) {
		
		int puntosJugador1 = 0;

		int puntosJugador2 = 0;

		int partidasJugadas = 0;

		String respuesta;



		do {

		Scanner sc = new Scanner(System.in);

		System.out.println("JUGADOR 1 - ¿Piedra, Papel o Tijera?");


		String jugador1 = sc.nextLine().toLowerCase();


		System.out.println("JUGADOR 2 - ¿Piedra, Papel o Tijera?");


		String jugador2 = sc.nextLine().toLowerCase();


		System.out.println("Jugador 1 : " + jugador1 ); // MUESTTRA EN PANTALLA QUE ELIJIO CADA UNO


		System.out.println("Jugador 2 : " + jugador2);


		boolean esValorValido1 = false;

		switch(jugador1) {

		case "piedra":

		case "papel":

		case "tijera":

		esValorValido1 = true;

		break;

		}

	boolean esValorValido2 = false;

		switch(jugador2) {

		case "piedra":

		case "papel":

		case "tijera":

		esValorValido2 = true;

		break;

		}

		// SE ANALIZAN LAS JUGADAS UNA VEZ VALIDADOS LOS DATOS QUE INGRESARON LOS USUARIOS

		if (!esValorValido1 || !esValorValido2 ) {
			System.out.println("ERROR: Uno de los valores es invalido.");

			System.out.println("¿Quiere volver a intentar? (SI/NO)");
			respuesta = sc.nextLine().toLowerCase(); continue; }

		if (jugador1.equals(jugador2)) {


		System.out.println("Empate");} // CASO EMPATE SI SACARON LO MISMO


		 else if  (jugador1.equals("piedra") && jugador2.equals("tijera") || 
				 jugador1.equals("papel") && jugador2.equals("piedra") || 
				 (jugador1.equals("tijera") && jugador2.equals("papel")))
		 	{
			 	puntosJugador1++;

			 	System.out.println("GANADOR: Jugador 1");
			 // ESCENEARIOS DONDE GANA EL JUGADOR 1
			 	
			 	} 

		 	else  {

		 			puntosJugador2++;

		 			System.out.println("GANADOR: Jugador 2");} // SINO LOS QUE GANA EL JUGADOR 2

		  

			System.out.println("¿Desea seguir jugando? SI/NO");

			respuesta = sc.nextLine().toLowerCase();
	
			partidasJugadas++;

			} while (respuesta.equals("si"));


		if (respuesta.equals("no")){


			System.out.println("Gracias por jugar!");
	
			System.out.println("Partidas Jugadas: " +partidasJugadas);

			System.out.println("Puntos jugador 1: " + puntosJugador1);
	
			System.out.println("Puntos jugador 2: " + puntosJugador2);

		}












		
		

		
		}}
