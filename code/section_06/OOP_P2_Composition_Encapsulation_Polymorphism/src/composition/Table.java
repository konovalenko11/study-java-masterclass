package composition;

public class Table {
    private String manufacturer;
    private String model;
    private boolean adjustableHeight;

    public Table(String manufacturer, String model, boolean adjustableHeight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.adjustableHeight = adjustableHeight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public boolean isAdjustableHeight() {
        return adjustableHeight;
    }
}
