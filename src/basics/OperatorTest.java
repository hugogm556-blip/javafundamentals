/**
 * 
 */
package basics;

/**
 * @author hugog26 sept 2025
 */
public class OperatorTest {
	public static void main(String[] args) {
		aritmeticOperations();
		// declaring three variables of the same type
		
	}

	/**
	 * 
	 */
	private static void aritmeticOperations() {
		// TODO Auto-generated method stub
		float num1=10, num2=12.341f, num3; 
		System.out.println(num1);
		//
		num1= 23.34f;
		System.out.println(num1);
		// addition
		float result = num1 + num2;
		System.out.println("the result is " + result);
		/*
		 *  operacion de resta 
		 *  1 el cpu lee el valor de la variable result 
		 *  2 se realiza la resta  con el numero 1 
		 *  3 se guarda el resultado en la misma  varible result
		 *  
		 *  el orden de la operacion es de la derecha a la izquierda 
		 */
		// es lo mismo que el de abajo  -=
		result = result -1;
		System.out.println("the result is " + result);

		result-=1;
		System.out.println("the result is " + result);
		//multiplicacion
		result=result*2;
		
		System.out.println("the result is " + result);
		result*=2;
		System.out.println("the result is " + result);
		// division 
		result= result /2;
		System.out.println("the result is " + result);
		result/=2;
		System.out.println("the result is " + result);
	}

}
