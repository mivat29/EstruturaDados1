
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestaVetor {

	public static void main(String[] args) {
		int opcao = 0;
		int pos;
        int numero;
        String nome;
		Scanner sc = new Scanner(System.in);
		
        Object[] objetos = new Object[10];
		Vetor lista = new Vetor();

    do {
        System.out.println("\n\n### Menu ###");
        System.out.println("\n                  =========================");
        System.out.println("                  |     1 - Adicionar Final         |");
        System.out.println("                  |     2 - Adiciona Na Posição      |");
        System.out.println("                  |     3 - Pesquisar Posição        |");
        System.out.println("                  |     4 - Remover       |");
        System.out.println("                  |     5 - Buscar Posicao na Lista       |");  
		System.out.println("                  |     6 - Indice Inicial       |");                 
        System.out.println("                  |     7 - Indice Final          |");
        System.out.println("                  |     8 - Mostrar Lista          |");
		System.out.println("                  |     9 - Limpar Lista          |");
		System.out.println("                  |     0 - Sair          |");
        System.out.println("                  =========================\n");

        opcao = sc.nextInt();
        System.out.print("\n");
        switch (opcao) {
        case 1:
			System.out.println("\nOpcao escolhida :"+opcao);
			
            System.out.println("\nDigite o nome :");
            nome = sc.next();
			System.out.println("\nDigite o numero :");
			numero = sc.nextInt();
			
            Object novoObjeto = new Object(nome, numero);
			lista.inserir(novoObjeto);
			
			System.out.println("\nAdicionado!");
			
			break;
        case 2:
			System.out.println("\nOpcao escolhida :"+opcao);
			System.out.println("\nDigite o nome :");
			nome = sc.next();
			
			System.out.println("\nDigite o numero :");
			numero = sc.nextInt();
			
			System.out.println("\nDigite a posicao :");
			pos = sc.nextInt();
			Object novoObjetoPos = new Object(nome, numero);
            lista.inserirPos(novoObjetoPos, pos);
			
			break;
        case 3: 
			System.out.println("\nOpcao escolhida :"+opcao);

			System.out.println("\nDigite a posicao :");
			pos = sc.nextInt();
			
			System.out.println(lista.obtem(pos));
			break;
        case 4:
			System.out.println("\nOpcao escolhida :"+opcao);

			System.out.println("\nDigite a posicao :");
			pos = sc.nextInt();
			
			lista.removerInt(pos);
			
			break;
        case 5:
			System.out.println("\nOpcao escolhida :"+opcao);

			System.out.println("\nDigite o nome :");
			nome = sc.next();
			
			System.out.println("\nDigite o numero :");
			numero = sc.nextInt();
			
			Object ConsultaPosObjeto = new Object(nome, numero);
            lista.busca(ConsultaPosObjeto);
			break;
		case 6: 
			System.out.println("\nOpcao escolhida :"+opcao);
			System.out.println("\nDigite o nome :");
			nome = sc.next();
			
			System.out.println("\nDigite o numero :");
			numero = sc.nextInt();
			Object primeiroObjeto = new Object(nome,numero);
			System.out.print(lista.indexOf(primeiroObjeto));
			break;
		case 7:
			System.out.println("\nOpcao escolhida :"+opcao);
			System.out.println("\nDigite o nome :");
			nome = sc.next();
			
			System.out.println("\nDigite o numero :");
			numero = sc.nextInt();
			Object ultimoObjeto = new Object(nome,numero);
			System.out.print(lista.lastIndexOf(ultimoObjeto));
			break;
		case 8:
			System.out.println("\nOpcao escolhida :"+opcao);
			JOptionPane.showMessageDialog(null, lista);
			break;
		case 9:
			System.out.println("\nOpcao escolhida :"+opcao);
			lista.clear();
			JOptionPane.showMessageDialog(null, lista);
			break;
		case 0:
			break;
        default:
            System.out.println("Opção Inválida!");
            break;
        }
    } while (opcao != 0);
		sc.close();
	}
}
