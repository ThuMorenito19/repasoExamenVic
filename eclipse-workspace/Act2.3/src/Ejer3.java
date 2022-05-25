import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eleccion,cantidad,suma=0;
		Scanner lector=new Scanner(System.in);
		System.out.println("Elige un bucle");
		System.out.println("1. Bucle for");
		System.out.println("2. Bucle do");
		System.out.println("3. Bucle while");
		eleccion=lector.nextInt();
		System.out.println("Introduce un numero");
		cantidad=lector.nextInt();
		switch(eleccion) {
		case 1:
			for(int i=1;i<=cantidad;i++) {
				suma=suma+i;
			}System.out.println(suma);
			break;
		case 2:
			int b=1;
			do {
				suma=suma+b;
				b++;
			}while(b<=cantidad);
			System.out.println(suma);
			break;
		case 3:
			
			int a=1;
			while(a<=cantidad) {
				suma=suma+a;
				a++;	
			}System.out.println(suma);
			break;
		default:
			System.out.println("ERROR");
		}
		
	}

}
