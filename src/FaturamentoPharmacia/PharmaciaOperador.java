package FaturamentoPharmacia;

public class PharmaciaOperador extends Pharmacia {
	
	@Override
	public void imprimirExtrato() {
		
		// vetores para ter informações sobre os operadores do sistema
		
		String [] operador = new String [3];	
		operador [0] = "Clara";
		operador [1] = " Gabriel";
		operador [2] = " Pedro";
		
		int [] ano = new int [3];
		ano [0] = 2010;
		ano [1] =  2008;
		ano [2] =  2017;
		
		int [] horas = {30, 40, 40};
		int soma = 0;
		for (int horas2 : horas) {
			soma+=horas2;
			
		}
		
		// matriz para administrar o plantão
		String [] [] plantao = {{"Segunda", "Terça", "Quarta"}, {"Quinta", "Sexta", "Sábado"}};
		
		System.out.println("Atuais operadores da Pharmacia:");
		System.out.print(operador[0]);
		System.out.print(operador[1]);
		System.out.println(operador[2]);
		
		System.out.println("O ano de contratação de cada operador:");
		System.out.println(ano[0]);
		System.out.println(ano[1]);
		System.out.println(ano[2]);
		
		System.out.println("Quantidade de horas trabalhadas de todos operadores por semana");
		System.out.println(soma);
		
		System.out.println("Plantão de Clara");
		System.out.println(plantao [0][1] );
		System.out.println("Plantão de Gabriel");
		System.out.println(plantao [0][0] );
		System.out.println("Plantão de Pedro");
		System.out.println(plantao [1][0] );
		
		
		
	}

}
