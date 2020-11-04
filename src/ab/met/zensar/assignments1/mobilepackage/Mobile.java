package ab.met.zensar.assignments1.mobilepackage;

/**
 * Create a Mobile class having data mobileId,model,batteryCapacity and price.
 * Create a collection of * 10 mobile objects and print mobile details having same price.
 */
public class Mobile {
    private static int id_counter = 100;
    private int mobID;
    private String mobileModel;
    private int batteryCapacity;
    private float price;

    public Mobile(String mobileModel, int batteryCapacity, float price) {
        mobID = id_counter++;
        this.mobileModel = mobileModel;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
    }

    public int getMobID() {
        return mobID;
    }

    public String getMobileModel() {
        return mobileModel;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Mobile Details =>" +
                "\tmobID= " + mobID +
                ",\tmobileModel= " + mobileModel  +
                ",\tbatteryCapacity= " + batteryCapacity +
                ",\tprice= " + price ;
    }
}
