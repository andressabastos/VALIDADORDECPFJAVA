package meuPacote;

import java.util.Scanner;
            // importanto a classe "ValidaCPF" do pacote "meuPacote"
        import meuPacote.ValidaCPF;

        @SuppressWarnings("unused")
		public class aval2N2 {          public static void main(String[] args) {
            try (Scanner ler = new Scanner(System.in)) {
				String CPF;

				System.out.printf("Informe um CPF: ");
				CPF = ler.next();

				System.out.printf("\nResultado: ");
				    // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
				if (ValidaCPF.isCPF(CPF) == true)
				   System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
				else System.out.printf("Erro, CPF invalido !!!\n");
			}
            }
        }
