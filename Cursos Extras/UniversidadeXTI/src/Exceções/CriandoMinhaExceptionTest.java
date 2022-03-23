package Exceções;


public class CriandoMinhaExceptionTest {
	
	static void autenticar(String senha)
			throws CriandoMinhaException 
	{
		if("123".equals(senha)) {
			System.out.println("Autenticado");
		}else {
			throw new CriandoMinhaException("Senha incorreta");
		}
	}
	public static void main(String[] args) {
		
		try {
			autenticar("12334");
			
		}catch(CriandoMinhaException e) {
			System.out.println(e.getMessage());
		}
	}
}
