package core;

public class TestaConta{
public static void main(String[] args) {
	Conta cliente1 = new Conta();
	cliente1.deposita(1500);

 	cliente1.deposita(500);

	
	System.out.println(cliente1.getSaldo(0));

boolean conseguiuSacar = cliente1.saca(300);

if(conseguiuSacar) {
	System.out.println("Saque efetivado com sucesso");
	
}
else {
	System.out.println(conseguiuSacar);
	
}
	
	
}
}
