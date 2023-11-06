public class Adaptador implements ICliente {
  private ClienteAntiguo clienteAntiguo;

  public Adaptador(ClienteAntiguo clienteAntiguo) {
    this.clienteAntiguo = clienteAntiguo;
  }

  @Override
  public void solicitarPrestamo() {
    clienteAntiguo.solicitarPrestamoAntiguo();
  }
}
