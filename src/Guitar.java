import enums.*;

public class Guitar
{
    private GuitarSpec spec;
    private String serialNumber;
    private double price;

    public Guitar(String serialNumber, double price, GuitarSpec spec)
    {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

	public String getSerialNumber()
    {
        return serialNumber;
    }

    public double getPrice()
    {
        return price;
    }
    public void setPrice(float newPrice)
    {
        this.price = newPrice;
    }
    public GuitarSpec getSpec() {
        return spec;
    }
}
