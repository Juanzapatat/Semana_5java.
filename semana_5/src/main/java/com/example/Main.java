package com.example;
import java.util.Arrays;
import java.sql.Array;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
       
//Punto 1
//         int[] numeros={10,20,30,40,50};
// System.out.println("Primer Array:"+ Arrays.toString(numeros));

// int x=  numeros[0];
// numeros [0] = numeros[4] ;
// numeros [4] = x;

// System.out.println("Arrays Cambios" + Arrays.toString(numeros) );

   // Punto 2
// int [] datos={1,20,50,40,70,};
// int [] datos1={100,20,50,40,70,};
// boolean iguales1= Arrays.equals(datos, datos1);
// System.out.println("Tus datos son iguales :" + iguales1 );

//Punto 3


// int[] base={80,60,1,90,5};
// int maximoElemento= Arrays.stream(base).max().getAsInt();
// System.out.println("Tus elmentos son" + Arrays.toString(base));
// System.out.println("Tu elemento máximo es: " + maximoElemento);

//Punto 4
// int[] base2={100,200,40,90,50};
// int minimoElemento= Arrays.stream(base2).min().getAsInt();
// System.out.println("Tus elmentos son" + Arrays.toString(base2));
// System.out.println("Tu elemento minimo es: " + minimoElemento);

//Punto 5 
//  int [] suma= {10,20,30,40,50};
//  int sumaElementos= suma[0]+suma[1]+suma[2]+suma[3]+suma[4];
// System.out.println("Tus datos son: " + Arrays.toString(suma));
// System.out.println("El valor total de tus datos es:" + sumaElementos) ;

//Punto 6
int [] promedio = {80,70,100,200,60};
int promedioValores= promedio[0]+promedio[1]+promedio[2]+promedio[3]+promedio[4];
int promedioFinal= promedioValores/ promedio.length;
System.out.println("Tus datos son:" + Arrays.toString(promedio));
System.out.println("El promedio de tus datos es:" + promedioFinal);

//Punto 7



}
}