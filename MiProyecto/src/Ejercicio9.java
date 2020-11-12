
public class Ejercicio9 {

	public static void main(String[] args) {
		int A = 4;
		int B = 2;
		int C = 3;
		
		System.out.println("Valor A:" + A + ", valor B:" + B + " valor c:" +C);

		A=B;
		System.out.println("Valor A:" + A + ", valor B:" + B + " valor c:" +C);
		
		C=A;
		System.out.println("Valor A:" + A + ", valor B:" + B + " valor c:" +C);
		
		B= (A+B+C)/2;
		System.out.println("Valor A:" + A + ", valor B:" + B + " valor c:" +C);
		
		A=A+C;
		System.out.println("Valor A:" + A + ", valor B:" + B + " valor c:" +C);
		
		C= B-A;
		
		System.out.println("Valor A:" + A + ", valor B:" + B + " valor c:" +C);
		
		C = C-A;
		System.out.println("Valor A:" + A + ", valor B:" + B + " valor c:" +C);
		
		A = A*B;
		System.out.println("Valor A:" + A + ", valor B:" + B + " valor c:" +C);
		
		A = A+3;
		System.out.println("Valor A:" + A + ", valor B:" + B + " valor c:" +C);
		
		A = A%B;
		System.out.println("Valor A:" + A + ", valor B:" + B + " valor c:" +C);
		
		C = C+A;
		System.out.println("Valor A:" + A + ", valor B:" + B + " valor c:" +C);
	}

}
