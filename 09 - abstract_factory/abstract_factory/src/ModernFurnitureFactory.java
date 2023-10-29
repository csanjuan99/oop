public class ModernFurnitureFactory implements FurnitureFactory {

    public ModernFurnitureFactory() {}


    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
