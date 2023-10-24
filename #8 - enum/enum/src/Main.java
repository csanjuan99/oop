import models.Tax;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("IVA: " + Tax.IVA.getDiscount(1000));
        System.out.println("RF: " + Tax.RF.getDiscount(1000));
        System.out.println("PRO_UIS: " + Tax.PRO_UIS.getDiscount(1000));
    }
}
