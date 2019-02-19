public class CriaConta {
	
	public static void main(String[] args) {
		//Para ter acesso a uma conta especifica tem que
		//declarar o nome do arquivo básico.
		Conta primeiraConta = new Conta();
		//Para validar o valor do saldo da primeira conta
		//é utilizado ponto para emendar as duas variaveis.
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
	}

}
