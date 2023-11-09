public class ConcreteAbstraction implements IAbstraction {
  private Implementation implementation;

  public ConcreteAbstraction(Implementation implementation) {
    this.implementation = implementation;
  }

  @Override
  public void draw() {
    implementation.draw();
  }
}
