public abstract class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber  = serialNumber;
        this.price = price;
        this.spec = spec;
    }


    public InstrumentSpec getSpec() {
    return spec;
    }
}
