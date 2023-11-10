public class ConcreteAbstraction implements IAbstraction {

  private IImplementation implementation;

  public ConcreteAbstraction(IImplementation implementation) {
    this.implementation = implementation;
  }

  @Override
  public void draw() {
    implementation.draw();
  }
}
