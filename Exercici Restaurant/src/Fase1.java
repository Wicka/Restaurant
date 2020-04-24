/*
 * FASE 1 (2 punts)
●	Creeu una variable int per cada un dels bitllets que existeixen des de 5€ a 500€, haureu de crear un altre variable 
	per guardar el preu total del menjar. (1 punt)
●	Creeu dos arrays, un on guardarem el menú (5 plats) i un altre on guardarem el preu de cada	plat. (1 punt)
*/


public class Fase1 {

	public static void main(String[] args) {
		
		//DECLARO LAS VARIBLES 	UNA PARA CADA BILLETE QUE EXISTE DESDE 5€ A 500€
		
		int cinco=5, diez=10, veinte=20, cincuenta=50, cien=100, doscientos=200, quinientos=500;
		
		int precioTotal;						//VARIABLE INT PARA GUARDAR PRECIO TOTAL
		
		String [] Platos = new String[5];		//DOS ARRAY UNO PARA GUARDAR LOS CINCO PLATOS 
		int[] Precios= new int[5];				//Y EL ARRAY PARA GUARDAR LOS PRECIOS DE CADA PLATOS TAMBIEN DE 5
		
		Platos[0]="1. Arroz caldoso con Bogavante ";
		Platos[1]="2. Ensalada tibia con Queso de cabra ";
		Platos[2]="3. Lasaña de verduras y piñones ";
		Platos[3]="4. Rodaballo salvaje al horno ";
		Platos[4]="5. Chuleton de Avila 800 gr.";
		
		Precios[0]= 23;
		Precios[1]= 11;
		Precios[2]= 18;
		Precios[3]= 34;
		Precios[4]= 28;
		
	}

}
