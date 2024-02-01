package FaturamentoPharmacia;

import java.util.Scanner;

public class PharmaciaLogin  {
	
	PharmaciaMenu pm = new PharmaciaMenu();
	Scanner loginentrada = new Scanner (System.in);
	private int senha;
	private String login;
	void entrar () {
		System.out.println("Informe seu login");
		login= loginentrada.nextLine();
		System.out.println("Informe sua senha");
		senha= loginentrada.nextInt();
	}
	void validacao () {
		if (login.equals("ph") && senha == 123456) {
			pm.MenuPrincipal();
		}
		
		else {
			System.out.println("Login ou senha incorretos");
		}
	}
	
}
