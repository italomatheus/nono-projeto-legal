import java.util.Scanner;
public class ProjetoDiciplinaPiloto {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double Prova, Projetos, ListaDeAtividade, media;
		do {
			System.out.print("Nota de Prova: ");
			Prova = sn.nextDouble();
		}while(Prova < 0 || Prova > 10);
			System.out.print("Nota do Projeto: ");
			Projetos = sn.nextDouble();
		while(Projetos < 0 || Projetos > 10);
			System.out.print("Notas das Atividade: ");
			ListaDeAtividade = sn.nextDouble();
	    while(ListaDeAtividade < 0 || ListaDeAtividade > 10);
	    
	    media = (Prova + Projetos + ListaDeAtividade) / 3;
	    
	    if (media >= 8) {
	    	System.out.println("Aprovado.");
	    } else if(media >= 7.9) {
	    	System.out.println("Avaliação Final.");
	    } else if(media >= 5) {
	    	System.out.println("Avaliação Final.");
	    } else {
	    	System.out.println("Reprovado.");
		}
	}
}
