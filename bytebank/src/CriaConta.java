public class CriaConta {
	
	public static void main(String[] args) {
		//Para ter acesso a uma conta especifica tem que
		//declarar o nome do arquivo básico.
		Conta primeiraConta = new Conta();
		//Para validar o valor do saldo da primeira conta
		//é utilizado ponto para emendar as duas variaveis.
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		segundaConta.agencia = 146;
        System.out.println("agora a segunda conta está na agencia " + segundaConta.agencia);

        if(primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }
		
		/*
		 Quando os valores não são atribuidos nas variaveis
		 que estão fora do main o valor que é dado para ele
		 é o default, no caso de int será 0
		 */
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
	}

}
