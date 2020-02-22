
public class RevisaoMetodos {
	public static void main(String[] args) {
		int proximo = proximoValor(3);
		System.out.println("Resultado : " + proximo);
		
		int dobro = dobroProximo(6);
		System.out.println("Resultado : " + dobro);
		
	}
	
	public static int proximoValor(int valor) {
		return  valor + 1;
	}
	
	public static int dobroProximo(int valor){
		//return  (valorDobro + 1) * 2; 
		
		 return proximoValor(valor) * 2;
				 
	}

}
