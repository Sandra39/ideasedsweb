
public class Cliente {

	
		String nombre;
		int  saldo;
		
		
		//esto es constructor
		public Cliente ( String nombreC, int saldoC ){
			nombre = nombreC;
			saldo = saldoC;
			
		}
		public void depositar (int deposito) {
				saldo = saldo + deposito;
		}
		public void extraer (int dinero) {
			saldo = saldo - dinero;	
		
		
		}

		public static void main(String[] args) {
		String nombreC ="Juan";
		int saldoC =1200;
			
		Cliente uno =new Cliente(nombreC,saldoC);
		
		System.out.println("he creado a "+ uno.nombre +" y tiene saldo inicial " + uno.saldo);
		
		uno.depositar(1000);
		System.out.println("saldo tras deposito "+ uno.saldo);
		
		uno.extraer(1000);
		System.out.println("saldo tras extraccion "+ uno.saldo);
		
		
		

	}

}
