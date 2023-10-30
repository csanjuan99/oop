package singletonPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Registro registro = Registro.obtenerInstancia();

	        registro.agregarEntrada("Inicio de sesión exitoso");
	        registro.agregarEntrada("Acceso a la base de datos");

	        Registro otroRegistro = Registro.obtenerInstancia();
	        otroRegistro.agregarEntrada("Operación realizada");

	
	        System.out.println(registro == otroRegistro);  // Salida: true

	}

}
