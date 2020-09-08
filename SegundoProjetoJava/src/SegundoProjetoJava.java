import java.util.Scanner;
public class SegundoProjetoJava {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int multiplicando;
		do {
			System.out.print("Digite um numero de 1 à 10: ");
			multiplicando = sn.nextInt();
		}while(multiplicando < 1 || multiplicando > 10);
		for(int c = 1; c <=10; c++)
		{
             int resultado = multiplicando * c;
             System.out.println(multiplicando + " x " + c + " = "+ resultado);
     	}
	}
}
