public class CriaConta {
	
	public static void main(String[] args) {
		//Para ter acesso a uma conta especifica tem que
		//declarar o nome do arquivo b�sico.
		Conta primeiraConta = new Conta();
		//Para validar o valor do saldo da primeira conta
		//� utilizado ponto para emendar as duas variaveis.
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		segundaConta.agencia = 146;
        System.out.println("agora a segunda conta est� na agencia " + segundaConta.agencia);

        if(primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }
		
		/*
		 Quando os valores n�o s�o atribuidos nas variaveis
		 que est�o fora do main o valor que � dado para ele
		 � o default, no caso de int ser� 0
		 */
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
	}

}
