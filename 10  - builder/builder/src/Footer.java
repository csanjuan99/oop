public class Footer {

    private final String signature;
    private final String date;

    public Footer(String signature, String date) {
        this.signature = signature;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Signature: " + signature + "\nDate: " + date;
    }
}
