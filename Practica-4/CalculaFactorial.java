import java.util.*;


public class CalculaFactorial {
	public static void main(String[] args) 
	{
		//declaramos variables
		Scanner teclado = new Scanner( System.in );
		double fact=1; //inicializamos la variable en 1 para la multiplicación 
		int num;
		
		do {
			System.out.print("Introduce un número >=0: ");
			num=teclado.nextInt();
		}
		while (num <= 0);
        //ciclo for donde se inicializa con el número ingresado, siempre y cuando sea < 0 y con un decremento de 1
		for (int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		//Se multiplican todos los numeros desde 1 hasta n y el resultado de las multiplicaciones
		//se acumula en la variable fact
		System.out.println("El factorial de " + num + " es: " + fact);
		//imprimimos el resultado

	}
}