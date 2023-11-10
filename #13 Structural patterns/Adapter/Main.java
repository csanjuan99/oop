public class Main {
  public static void main(String[] args) {

    ClienteAntiguo clienteAntiguo = new ClienteAntiguo();
    Adaptador adaptador = new Adaptador(clienteAntiguo);

    SistemaGestionClientes sistemaGestionClientes = new SistemaGestionClientes();
    sistemaGestionClientes.gestionarCliente(adaptador);
  }
}