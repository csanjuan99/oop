public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();

        Chair modernChair = modernFurnitureFactory.createChair();
        Chair victorianChair = victorianFurnitureFactory.createChair();

        Sofa modernSofa = modernFurnitureFactory.createSofa();
        Sofa victorianSofa = victorianFurnitureFactory.createSofa();

        modernChair.sitOn();
        victorianChair.sitOn();

        modernSofa.lieOn();
        victorianSofa.lieOn();
    }
}
