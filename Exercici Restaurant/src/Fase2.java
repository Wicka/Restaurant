import java.util.*;

/*
 * FASE 2 (3 punts)
●	Amb un bucle for haurem d’omplir els dos arrays anteriorment creats. Afegirem el nom del plat i després el preu. (1 punt)

●	Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per menjar, guardarem la informació en una 
	List fent servir un bucle while. (1 punt)
	
●	Haurem de preguntar si es vol seguir demanant menjar. 
	Podeu fer servir el sistema (1:Si / 0:No), 
	
	per tant haureu de crear un altre variable int per guardar la informació. (1 punt)
 */


public class Fase2 {

	public static void main(String[] args) {
		
		//DECLARO LAS VARIBLES 		
		
		int cinco=5, diez=10, veinte=20, cincuenta=50, cien=100, doscientos=200, quinientos=500;
		
		int i, precioTotal, seguir=1, iplato;
		
		String plato;
		String precio;
		
		String[] nombre = {"Primer", "Segundo", "Tercer", "Cuarto", "Quinto", "Sexto"};
		String [] Platos = new String[5];
		int[] Precios= new int[5];		

		List<String> Pedidos = new ArrayList <String>();
		
		Scanner entrada = new Scanner(System.in);
		
		for (i =0; i < 5; i++) {								//BUCLE FOR PARA RELLENAR AMBOS ARRAY PLATOS Y PRECIOS

			System.out.println("Introduce el Plato  : \n");		//PIDO POR CONSOLA EL NOMBRE DEL PLATO
			plato=entrada.nextLine() ;							//GUARDO EN STRING LO QUE SE INTRODUCE
				
			Platos[i]=plato;									//ALMACENO EL STRING plato EN EL ARRAY DE Platos[i]
			
			System.out.println("Introduce el Precio del Plato  : \n");			//PIDO POR CONSOLA EL NOMBRE DEL PLATO
			precio=entrada.nextLine() ;											//GUARDO EN STRING LO QUE SE INTRODUCE
			
			Precios[i]=Integer.parseInt(precio);								//ALMACENO EL STRING plato EN EL ARRAY DE Precios[i]
		
		}
	
		System.out.println(" --------------- MENU ---------------- "+"<br><br>");			//IMPRIMO POR CONSOLA EL LISTADO DE PLATOS CON SUS PRECIOS
		
		for (i=0; i < 5 ; i++) {
			System.out.println((i+1) +" -- "+ nombre[i] + " Plato :  " + Platos[i] + "-----  Precio : " + Precios[i]+"<br><br>");
			
		}
		
		do {												   //BUCLE DONDE PIDO QUE ELIJAN UN PLATO INDICANDO EL NUMERO QUE SE MUESTRA A LA IZQUIERDA
			
			System.out.println("\n QUE DESEAS PARA COMER ? Introduce el numero correspondiente ");
			
			iplato=entrada.nextInt();							//RECOJO LA SELECCION EN UN INTEGER
			
			if(iplato>5 || iplato<1) {							//MIRO QUE ESTE DENTRO DE MI INTERVALO DE PLATOS
				System.out.println("ERROR INTRODUCE UN NUMERO DEL MENU");		//SI ESTA FUERA MUESTRO UN MENSAJE ERROR Y SIGO A LA ESPERA INTRODUZCA
			}else {
				Pedidos.add(Platos[iplato-1]);					//SI ELIGIO CORRECTO AÑADO EL PLATO A LA LISTA DESDE EL MISMO ARRAY QUE LO RECOJO SABIENDO EL INDICE
			
				precio=""+Precios[iplato-1] + " €";				//CONCATENO PARA CONVERTIRLO EN STRING EL PRECIO DEL PLATO DESDE EL ARRAY PRECIOS QUE LO SE BUSCANDOLO POR EL INDICE 
				Pedidos.add(precio);							//AÑADA EL PRECIO A LA LISTA
			}	
			
			System.out.println("Quieres otro plato 1:Si / 0:No ");				//PREGUNTO POR SI DESEA SEGUIR SELECCIONANDO PLATOS
			
			seguir=entrada.nextInt();							//RECOJO EL NUMERO POR CONSOLA
			
		}while (seguir!=0);										//MIENTRAS NO INTRODUZCA 0 SEGUIRE EJECUTANDO EL BUCLE
		
		
		System.out.println("Tu pedido contiene los siguientes platos y sus precios : \n" + Pedidos);	//MUESTRO LOS PLATOS SELECCIONADOS 
			
	}

}
