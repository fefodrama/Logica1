import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConversorBinarioDECIMAL {

	public static void main(String[] args) throws Exception {
		
		// VARIAVEIS
	String leitor="";
	int[] vetor = new int [1000];
	int numero = 0;
	int contador = 0;
	int resto = 0;
	int resultado = 0;
	
		//ENTRADA DE DADOS

		System.out.println("DIGITE UM DECIMAL");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		numero = Integer.parseInt(leitor);
		
		//PROCESSAMENTO
		
		resultado = numero;
	do {
		resto = resultado % 2;
		resultado = resultado / 2;
		vetor[contador] = resto;
		contador++;
	} while (resultado > 0);
			
		//SAÍDA DE DADOS
		
	for (int i = (contador - 1); i >= 0; i--) {
		System.out.print(vetor[i]);
			}
	
		}
		
	}
