
/*
FASE 1 (2 punts)
●	Creeu una variable int per cada un dels bitllets que existeixen des de 5€ a 500€, haureu de crear un altre variable per guardar el preu total del menjar. (1 punt)
●	Creeu dos arrays, un on guardarem el menú (5 plats) i un altre on guardarem el preu de cada 
plat. (1 punt)

*/


function Fase1() {

   //DECLARO LAS VARIBLES 	UNA PARA CADA BILLETE QUE EXISTE DESDE 5€ A 500€
		
		var cinco=5, diez=10, veinte=20, cincuenta=50, cien=100, doscientos=200, quinientos=500;
		
		var precioTotal;						//VARIABLE INT PARA GUARDAR PRECIO TOTAL
		
		var Platos = [5];		        //DOS ARRAY UNO PARA GUARDAR LOS CINCO PLATOS 
		var Precios= [5];				//Y EL ARRAY PARA GUARDAR LOS PRECIOS DE CADA PLATOS TAMBIEN DE 5
        
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


/*
 FASE 2 (3 punts)
●	Amb un bucle for haurem d’omplir els dos arrays anteriorment creats. 
    Afegirem el nom del plat i després el preu. (1 punt)
●	Un cop plens els dos arrays haurem de mostrar-los i preguntar 
    que es vol per menjar, guardarem la informació en una List 
    fent servir un bucle while. (1 punt)
●	Haurem de preguntar si es vol seguir demanant menjar. 
    Podeu fer servir el sistema (1:Si / 0:No), 
    per tant haureu de crear un altre variable int per 
    guardar la informació. (1 punt)
*/




function Fase2() {   

    		//DECLARO LAS VARIBLES 		
		
		var cinco=5, diez=10, veinte=20, cincuenta=50, cien=100, doscientos=200, quinientos=500;
		
        var i, precioTotal, seguir=1, iplato, plato, precio;
 		
		var  nombre = ["Primer", "Segundo", "Tercer", "Cuarto", "Quinto", "Sexto"];
		var Platos = [5];
		var Precios= [5];		

		var Pedidos = new Array();
		
		for (i =0; i < 5; i++) {								//BUCLE FOR PARA RELLENAR AMBOS ARRAY PLATOS Y PRECIOS

            plato=prompt("Introduce el Plato  : ");       	//PIDO POR PROMPT EL NOMBRE DEL PLATO Y LO GUARDO DIRECTAMENTE EN STRING 
				
			Platos[i]=plato;									//ALMACENO EL STRING plato EN EL ARRAY DE Platos[i]
			
            precio=prompt("Introduce el Precio del Plato  : "); 			//PIDO POR CONSOLA EL NOMBRE DEL PLATO
			
			Precios[i]=parseInt(precio);								    //ALMACENO EL STRING plato EN EL ARRAY DE Precios[i]
		
		}
        
        document.getElementById("resultado").innerHTML+=" --------------- MENU ---------------- "+ "<br><br>";			//IMPRIMO POR CONSOLA EL LISTADO DE PLATOS CON SUS PRECIOS
		
		for (i=0; i < 5 ; i++) {
			document.getElementById("resultado").innerHTML+=((i+1) +" -- "+ nombre[i] + " Plato :  " + Platos[i] + "-----  Precio : " + Precios[i]+ "<br><br>");			
		}
		
		do {												   //BUCLE DONDE PIDO QUE ELIJAN UN PLATO INDICANDO EL NUMERO QUE SE MUESTRA A LA IZQUIERDA
			
   		
			iplato=prompt(" QUE DESEAS PARA COMER ? Introduce el numero correspondiente " ); 							//RECOJO LA SELECCION EN UN INTEGER
			
			if(iplato>5 || iplato<1) {							//MIRO QUE ESTE DENTRO DE MI INTERVALO DE PLATOS
    			alert ("ERROR INTRODUCE UN NUMERO DEL MENU"); 
 			}else {
				Pedidos.push(Platos[iplato-1]);					//SI ELIGIO CORRECTO AÑADO EL PLATO A LA LISTA DESDE EL MISMO ARRAY QUE LO RECOJO SABIENDO EL INDICE
			
				precio=""+Precios[iplato-1] + " €";				//CONCATENO PARA CONVERTIRLO EN STRING EL PRECIO DEL PLATO DESDE EL ARRAY PRECIOS QUE LO SE BUSCANDOLO POR EL INDICE 
				Pedidos.push(precio);							//AÑADA EL PRECIO A LA LISTA
			}	
        
            seguir=prompt(" Quieres otro plato 1:Si / 0:No  " ); 							//RECOJO LA SELECCION EN UN INTEGER
		
		
		}while (seguir!=0);										//MIENTRAS NO INTRODUZCA 0 SEGUIRE EJECUTANDO EL BUCLE
		
        document.getElementById("resultado").innerHTML+="<br><br>"+"Tu pedido contiene los siguientes platos y sus precios : " + Pedidos;			
	
}		


/*
 * FASE 3 (5 punts)
●	Un cop hem acabat de demanar el menjar, 
	haurem de comparar la llista amb l’array que hem fet al principi. 
	En el cas que la informació que hem introduït a la List coincideixi amb la del array, 
	haurem de sumar el preu del producte demanat; 
	en el cas contrari haurem de mostrar un missatge que digui 
	que el producte que hem demanat no existeix.
 */


 
function Fase3() {

            //DECLARO LAS VARIBLES 		
            
    var cinco=5, diez=10, veinte=20, cincuenta=50, cien=100, doscientos=200, quinientos=500;
                    
    var i, precioTotal=0,iSeguir=1;
                    
    var plato, seguir;
            
    var comanda="";
    var precio;
            
    var existe=false;
            
            
    var arryNombre = ["Primer", "Segundo", "Tercer", "Cuarto", "Quinto", "Sexto"];
    var arryMenu =  [5];
    var arryPrecios= [5];		
    
    var  Pedidos=[];
            
            
    for (i =0; i < 5; i++) {								//BUCLE FOR PARA RELLENAR AMBOS ARRAY Menus Y PRECIOS
    
        plato=prompt("Introduce el Plato  : ");		//PIDO POR CONSOLA EL NOMBRE DEL PLATO
                    
        arryMenu[i]=plato;									//ALMACENO EL STRING plato EN EL ARRAY DE Menus[i]
                
        precio=prompt("Introduce el Precio del Plato  : ");			//PIDO POR CONSOLA EL NOMBRE DEL PLATO
               
        arryPrecios[i]=parseInt(precio);								//ALMACENO EL STRING plato EN EL ARRAY DE Precios[i]
            
    }
        
    document.getElementById("resultado").innerHTML+=" --------------- MENU ---------------- "+ "<br><br>";			//IMPRIMO POR CONSOLA EL LISTADO DE PLATOS CON SUS PRECIOS
		
    for (i=0; i < 5 ; i++) {
        document.getElementById("resultado").innerHTML+=(i+1) +" -- "+ arryNombre[i] + " Plato :  " + arryMenu[i] + "-----  Precio : " + arryPrecios[i]+ "<br><br>";			
    }
         
    do {					//BUCLE DONDE PIDO QUE INTRODUZCA SU ELECCION Y SE EJECUTA HASTA QUE CONTESTA A LA PREGUNTA SI/NO CON UN 0
 
        plato="";
        plato=prompt("QUE DESEAS PARA COMER ?   ");			//PIDO POR CONSOLA EL NOMBRE DEL PLATO
         
        Pedidos.push(plato);				//LO VOY ALMACENANDO EN UNA LISTA		
            
        do {
 
            seguir=prompt("Quieres otro plato 1:Si / 0:No ");	//PIDO SI DESEAN CONTINUAR PIDIENDO PLATOS								//RECOJO LA RESPUESTA (0 NO, 1 SI)
  
            if (!isNaN (seguir)) {					//ME ASUGURO QUE LA SELECCION SEA UN NUMERO
            
                iSeguir=parseInt(seguir);			//SI ES NUMERO LO PASO A INTEGER Y LO GUARDO EN iSeguir
                        
            }else{
                alert("Error Debes Introducir numeros");	//SINO ES UN NUMERO MUESTRO MSJ ERROR
            
                }
                if (iSeguir !=0 && iSeguir!=1) {							//SI EL NUMERO ES DISTINTO 0 ó 1 MUESTRO MSJ ERROR
                        
                    alert("Error introduce 0 Continuar o 1 Seguir");			//MSJ ERROR	
                        
                }
                
        }while (iSeguir !=0 && iSeguir!=1)	;		//CONTINUARA BUCLE HASTA QUE INTRODUZCA UN 0 ó UN 1
            
    }while (iSeguir!=0);					//SI SELECCIONARON 0 SALDRE DEL BUCLE SINO CONTINUO GUARDANDO LAS ENTRADAS EN LA LISTA Pedidos
            
        
    //AQUI YA TENGO MI LISTA LLENA DE LO PEDIDO Y COMPRUEBO QUE LO TENGA EN EL MENU 
            
  
    Pedidos.forEach(platos => {    		//RECORRO LA LISTA CADA UNO DE SUS ELEMENTOS
                
        i=0;
        existe=false;
                
        do {			//EJECUTARE EL BUCLE PARA IR IGUALANDO LOS PLATOS DE LA LISTA CON MI ARRAY
    
            if(platos==arryMenu[i] ) {
     
                existe=true;
                precioTotal+=arryPrecios[i];			//VOY ACUMULANDO LOS PRECIOS DE LOS PLATOS
                comanda+=platos + " , ";				//ACUMULU LOS PLATOS PEDIDOS EN string PARA MOSTRAR AL FINAL
            }
     
            i++;										//INCREMENTO POSICION DEL ARRAY Menus
            
        }while(!existe && i<arryMenu.length);		//SALGO SI LO ENCUENTRO Y SI CONTADOR IGUALA LA LONGKTUD ARRAY PARA EVITAR EL ERROR FUERA INDEX
         
    });
    
 
    document.getElementById("resultado").innerHTML+="Tu pedido contiene los siguientes platos : ---" + Pedidos + "<br><br>";				//IMPRIMO MSJ POR CONSOLA
    document.getElementById("resultado").innerHTML+="Solo Podemos servirte estos Platos : --------- " + comanda + "<br><br>";
    document.getElementById("resultado").innerHTML+="Tu pedido tiene un Precio Total de : --------- " + precioTotal+ "<br><br>";
    document.getElementById("resultado").innerHTML+="Y nuestro menu es: ---------- "  + arryMenu+ "<br><br>";
    document.getElementById("resultado").innerHTML+="Y nuestros Precios son: ----- " + arryPrecios + "<br><br>";
            
}
