/**Clase Calculadora hace las operaciones aritmeticas: sumar, restas, multiplicar, dividir, potencia y módulo
@author Ian Flores*/
package calculadora11;

public class Calculadora11 {
	
	/**Método sumar, recibe dos números y muestra la suma*/ 
	public int sumar(int a, int b) {
		 return a + b;
		 }
	
	/**Método restas, recibe dos números y muestra la resta*/
	public int restar(int a, int b) {
		return a - b; 
	}
	
	/**Método multiplicar, recibe dos números y muestra su multiplicación*/
	public int multiplicar(int a, int b) {
		return a * b; 
	}  
	
	/**Método dividir, recibe dos números y muestra su división*/
	public double dividir(int a, int b) {
		if (b == 0) { 
        System.out.println("Error: división entre cero");
        return 0; 
    }     return (double) a / b; 
} 

	/**Método potencia, recibe dos números una base y un exponente y muestra la operación*/
	public int potencia(int base, int exponente) {
		int resultado = 1;
		for (int i = 0; i < exponente; i++) {
			resultado *= base; 
    }     return resultado; 
   }	
	/**Método modulo, recibe dos números y devuelve el resto*/
	public int modulo(int a, int b) {
		return a % b; 
} 

	
} 
