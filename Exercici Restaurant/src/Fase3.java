import java.util.*;
/*
 * FASE 3 (5 punts)
●	Un cop hem acabat de demanar el menjar, 
	haurem de comparar la llista amb l’array que hem fet al principi. 
	En el cas que la informació que hem introduït a la List coincideixi amb la del array, 
	haurem de sumar el preu del producte demanat; 
	en el cas contrari haurem de mostrar un missatge que digui 
	que el producte que hem demanat no existeix.
 */
public class Fase3 {

public static void main(String[] args) {
		
		//DECLARO LAS VARIBLES 		
		
		int cinco=5, diez=10, veinte=20, cincuenta=50, cien=100, doscientos=200, quinientos=500;
				
		int i, precioTotal=0,iSeguir=1;
				
		String plato, seguir;
		
		String comanda="";
		String precio;
		
		boolean existe=false;
		
		
		String[] arryNombre = {"Primer", "Segundo", "Tercer", "Cuarto", "Quinto", "Sexto"};
		String [] arryMenu = new String[5];
		int[] arryPrecios= new int[5];		

		List<String> Pedidos = new ArrayList <String>();
		
		Scanner entrada = new Scanner(System.in);
		
		for (i =0; i < 5; i++) {								//BUCLE FOR PARA RELLENAR AMBOS ARRAY Menus Y PRECIOS

			System.out.println("Introduce el Plato  : \n");		//PIDO POR CONSOLA EL NOMBRE DEL PLATO
			plato=entrada.nextLine() ;							//GUARDO EN STRING LO QUE SE INTRODUCE
				
			arryMenu[i]=plato;									//ALMACENO EL STRING plato EN EL ARRAY DE Menus[i]
			
			System.out.println("Introduce el Precio del Plato  : \n");			//PIDO POR CONSOLA EL NOMBRE DEL PLATO
			precio=entrada.nextLine() ;											//GUARDO EN STRING LO QUE SE INTRODUCE
			
			arryPrecios[i]=Integer.parseInt(precio);								//ALMACENO EL STRING plato EN EL ARRAY DE Precios[i]
		
		}
	
		System.out.println(" --------------- MENU ---------------- ");			//MUESTRO POR CONSOLA LA LISTA DE PLATOS Y SUS PRECIOS
		
		for (i=0; i < 5 ; i++) {
			System.out.println((i+1) +" -- "+ arryNombre[i] + " Plato :  " + arryMenu[i] + "-----  Precio : " + arryPrecios[i]);
			
		}
		
		
		do {					//BUCLE DONDE PIDO QUE INTRODUZCA SU ELECCION Y SE EJECUTA HASTA QUE CONTESTA A LA PREGUNTA SI/NO CON UN 0
			
		//	iSeguir=0;
			plato="";
			System.out.println("\n QUE DESEAS PARA COMER ?  ");
		
			plato=entrada.nextLine();		//RECOJO EL STRING plato DE LA INTRODUCCION USUARIO POR CONSOLA
			
			Pedidos.add(plato);				//LO VOY ALMACENANDO EN UNA LISTA		
			
				
			do {
				
				System.out.println("Quieres otro plato 1:Si / 0:No ");		//PIDO SI DESEAN CONTINUAR PIDIENDO PLATOS
	
				seguir=entrada.nextLine();									//RECOJO LA RESPUESTA (0 NO, 1 SI)
	
				if (seguir.matches("[0-9]*")) {					//ME ASUGURO QUE LA SELECCION SEA UN NUMERO
		
					iSeguir=Integer.parseInt(seguir);			//SI ES NUMERO LO PASO A INTEGER Y LO GUARDO EN iSeguir
					
				}else{
					System.out.println("Error Debes Introducir numeros");	//SINO ES UN NUMERO MUESTRO MSJ ERROR
		
				}
				if (iSeguir !=0 && iSeguir!=1) {							//SI EL NUMERO ES DISTINTO 0 ó 1 MUESTRO MSJ ERROR
					
					System.out.println("Error introduce 0 Continuar o 1 Seguir");			//MSJ ERROR	
					
				}
				
			
			}while (iSeguir !=0 && iSeguir!=1)	;		//CONTINUARA BUCLE HASTA QUE INTRODUZCA UN 0 ó UN 1
			
		
		
		}while (iSeguir!=0);					//SI SELECCIONARON 0 SALDRE DEL BUCLE SINO CONTINUO GUARDANDO LAS ENTRADAS EN LA LISTA Pedidos
		
	
		//AQUI YA TENGO MI LISTA LLENA DE LO PEDIDO Y COMPRUEBO QUE LO TENGA EN EL MENU 
		
		for (String platos : Pedidos) {		//RECORRO LA LISTA CADA UNO DE SUS ELEMENTOS
			
		
			i=0;
			existe=false;
			
			do {			//EJECUTARE EL BUCLE PARA IR IGUALANDO LOS PLATOS DE LA LISTA CON MI ARRAY

				if(platos.equalsIgnoreCase(arryMenu[i]) ) {
					existe=true;
					precioTotal+=arryPrecios[i];			//VOY ACUMULANDO LOS PRECIOS DE LOS PLATOS
					comanda+=platos + " , ";				//ACUMULU LOS PLATOS PEDIDOS EN string PARA MOSTRAR AL FINAL
				}
				i++;										//INCREMENTO POSICION DEL ARRAY Menus
		
			}while(!existe && i<arryMenu.length);		//SALGO SI LO ENCUENTRO Y SI CONTADOR IGUALA LA LONGKTUD ARRAY PARA EVITAR EL ERROR FUERA INDEX
				
		
			
			
		}
		System.out.println("Tu pedido contiene los siguientes platos : ---" + Pedidos + "\n");				//IMPRIMO MSJ POR CONSOLA
		System.out.println("Solo Podemos servirte estos Platos : --------- " + comanda + "\n");
		System.out.println("Tu pedido tiene un Precio Total de : --------- " + precioTotal+ "€ \n" );
			
		System.out.println("Y nuestro menu es: ---------- "  + Arrays.toString(arryMenu) + "\n");
		System.out.println("Y nuestros Precios son: ----- " + Arrays.toString(arryPrecios) + "\n");
		
		
	}


}
