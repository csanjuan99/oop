package models;

public enum Tax {

    IVA(0.19f),
    PRO_UIS(0.02f),
    RF(0.1f);

    private final float value;

    private Tax(float value) {
        this.value = value;
    }

    public float getDiscount(float amount) {
        return amount * this.value;
    }
}
