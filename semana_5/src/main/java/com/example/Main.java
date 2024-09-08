package com.example;
import java.util.Arrays;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //Ejercios de Arrays   
//Punto 1
        int[] numeros={10,20,30,40,50};
System.out.println("Primer Array:"+ Arrays.toString(numeros));

int x=  numeros[0];
numeros [0] = numeros[4] ;
numeros [4] = x;

System.out.println("Arrays Cambios" + Arrays.toString(numeros) );

   //Punto 2
int [] datos={1,20,50,40,70,};
int [] datos1={100,20,50,40,70,};
boolean iguales1= Arrays.equals(datos, datos1);
System.out.println("Tus datos son iguales :" + iguales1 );

//Punto 3


int[] base={80,60,1,90,5};
int maximoElemento= Arrays.stream(base).max().getAsInt();
System.out.println("Tus elmentos son" + Arrays.toString(base));
System.out.println("Tu elemento máximo es: " + maximoElemento);

//Punto 4
int[] base2={100,200,40,90,50};
int minimoElemento= Arrays.stream(base2).min().getAsInt();
System.out.println("Tus elmentos son" + Arrays.toString(base2));
System.out.println("Tu elemento minimo es: " + minimoElemento);

//Punto 5 
 int [] suma= {10,20,30,40,50};
 int sumaElementos= suma[0]+suma[1]+suma[2]+suma[3]+suma[4];
System.out.println("Tus datos son: " + Arrays.toString(suma));
System.out.println("El valor total de tus datos es:" + sumaElementos) ;

//Punto 6
int [] promedio = {80,70,100,200,60};
int promedioValores= promedio[0]+promedio[1]+promedio[2]+promedio[3]+promedio[4];
int promedioFinal= promedioValores/ promedio.length;
System.out.println("Tus datos son:" + Arrays.toString(promedio));
System.out.println("El promedio de tus datos es:" + promedioFinal);

//Punto 7
int [] numerosB={20,33,42,55,68,};
int contadorPares=0;

contadorPares +=(numerosB[0] % 2 ==0) ? 1:0;
contadorPares +=(numerosB[1] % 2 ==0) ? 1:0;
contadorPares +=(numerosB[2] % 2 ==0) ? 1:0;   // +=(numerosB[2] % 2 ==0) ? 1:0; (esto se hace para encontrar un número divisible por 2 y el resultado sea 0)
contadorPares +=(numerosB[3] % 2 ==0) ? 1:0;
contadorPares +=(numerosB[4] % 2 ==0) ? 1:0;
System.out.println("La cantidad de elementos pares es :" + contadorPares);

//Punto 8
int[] imprares={2,33,42,55,68};
int contadorImpares=0;

contadorImpares +=(numerosB[0] % 2 !=0) ? 1:0;
contadorImpares +=(numerosB[1] % 2 !=0) ? 1:0;
contadorImpares +=(numerosB[2] % 2 !=0) ? 1:0;  // lo mismo que el comentario de arriba pero esta vez se usa "!="" para distinguir que el resultadso no sea 0
contadorImpares +=(numerosB[3] % 2 !=0) ? 1:0;
contadorImpares +=(numerosB[4] % 2 !=0) ? 1:0;
System.out.println("La cantidad de elementos impares es:" + contadorImpares);

//Punto 9
int[] buscar={10,20,30,40,50};
Scanner sc= new Scanner(System.in);
System.out.println("Ingrese el númeor a buscar: ");
int numeroBusqueda= sc.nextInt();

boolean existe= (buscar[0]==numeroBusqueda)||
(buscar[1]==numeroBusqueda)||
(buscar[2]==numeroBusqueda)||
(buscar[3]==numeroBusqueda)||
(buscar[4]==numeroBusqueda);
 if (existe) {System.out.println(" El número" + " " + numeroBusqueda + " existe en el array" );}
    else{System.out.println("El número" + " " +numeroBusqueda + " no existe en el array");}
 
//Punto 10
int[] prueba={90,60,110,80,40};
Arrays.sort(prueba);
System.out.println("tus elementos son:" + Arrays.toString(prueba));

//Ejercici Arrayslist

//Punto 1 y 2
ArrayList<String> ejemplo= new ArrayList<String>();

ejemplo.add("10");
ejemplo.add("20");
ejemplo.add("30");
ejemplo.add("40");
ejemplo.add("50");

System.out.println("Tus datos son :" + ejemplo);

ejemplo.add(0,"5");
ejemplo.add("60");
System.out.println("Tus datos se han actualizado:" + ejemplo);

//Punto 3 y 4
ArrayList<String> exmaple= new ArrayList<>();
exmaple.add("10");
exmaple.add("20");
exmaple.add("30");
exmaple.add("40");
exmaple.add("50");

System.out.println("Tu información es: " + exmaple);

exmaple.remove(0);
exmaple.remove(exmaple.size()-1);  //uso del size para encontrar el número en dicha posición puesto que es el último

System.out.println("Tus información se ha actualizado: " + exmaple);

//Punto 5 y 6
ArrayList<String> numeros1= new ArrayList<>();
numeros1.add("10");
numeros1.add("20");
numeros1.add("30");
numeros1.add("40");
numeros1.add("50");
System.out.println("Tu información es: " + numeros);

String elementoP=numeros1.get(0);                     //debo almacenar el número a encontrar en una variable 
String elementoF=numeros1.get(numeros1.size()-1);
System.out.println("Tus información específica  es:" + elementoP +", " + elementoF);

//Punto 7 y 8
ArrayList<String> number= new ArrayList<>();
number.add("10");
number.add("20");
number.add("30");
number.add("40");
number.add("50");

boolean estaVacio=number.isEmpty();
if ( estaVacio) {System.out.println("El Array esta vacío");}
else{System.out.println("El Array no esta vacío");}
int tamaño= number.size();

System.out.println("Tu Array tiene un tamaño de :" + tamaño + " "+ "elementos");

//Punto 9 y 10
ArrayList<String> lista= new ArrayList<>();
lista.add("10");
lista.add("20");
lista.add("30");
lista.add("40");
lista.add("50");
Scanner scanner= new Scanner(System.in);
System.out.println("Ingrese el valor a buscar: ");
String valorBusqueda = scanner.nextLine();
boolean existeS= lista.contains(valorBusqueda);
if (existeS) { System.out.println("El elemento si existe");}
else{System.out.println("El elemento no existe");}

int indice = lista.indexOf(valorBusqueda);
if (indice !=-1) {System.out.println("la posición del elemento" + " " +valorBusqueda + " "+ "es la: " + indice);}
    else{System.out.println("El elemento" + " " + valorBusqueda +" " +"no se encuentra en el Array = " + indice);}


























}}  
