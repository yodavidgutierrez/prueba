package mundo;
import java.util.Scanner;

public class suma {
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String palabra;
	System.out.print("para sumar la cadena es necesario dejar un espacio despues del numero: ");
	palabra = sc.nextLine();
	
	String[] arr = palabra.split(" ");
	System.out.println(Integer.valueOf(arr[0]) + Integer.valueOf(arr[1]));
	  
	  
	/*String[] arre=palabra.split("\\s+");
	
    for(int a=0;a<arre.length;a++){
        System.out.println("los elementos son: "+arre[a]);
        System.out.println(Integer.valueOf(arre[0]) + Integer.valueOf(arre[1]));   
    }x
    */
 }
}

/*
 String cadena="1 2";
  String[] arr = cadena.split(" ");
  System.out.println(Integer.valueOf(arr[0]) + Integer.valueOf(arr[1]));


Necesito implementar lo siguiente:

Entrada (una cadena):

5+45+100-125+5-10
Salida:

= 20
Aquí el código implementado sólo para números positivos:

String operacion="10+200+3000";
    int tam = operacion.length();
    String A[] = new String[100];
    int pos = 0;
    int sum = 0;
    String aux = "";
    for(int i = 0; i<tam ; i++)
    {
        if(operacion.charAt(i) == '+')
        {
            A[pos] = aux;
            pos++;
            aux = "";
        }
        else
        {
            aux = aux + operacion.charAt(i);
        }
    }
    A[pos] = aux;
    pos++;
    for(int i = 0; i<pos ; i++)
    {
        sum=sum+Integer.parseInt(A[i]);
    }
    System.out.println("=  "+sum);
    
    
    String cadena= "1 2";
    
    String [] arre = cadena.splith(" ");
    
    Systen.out.println(Integer.valueof(arre[0])+Integer.valueof(arr[1]));
    *
    *
    *
    *
    *
    *
    */



