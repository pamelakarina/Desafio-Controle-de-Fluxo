
import java.util.InputMismatchException;
import java.util.Scanner;
public class Contador {
	public static void main(String[] args) {
        try {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = Scanner.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = Scanner.nextInt();

            //chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
	
            Scanner.close();
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}catch (InputMismatchException e) {
            System.out.println("Insira um valor numérico.");
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
          if(parametroUm > parametroDois){
              throw new ParametrosInvalidosException();
          }
    
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
         for(int x = 1; x <= contagem; x++){
           System.out.println("Imprimindo o número: " + x);

         }
	}
}