

public class SSD {
    String memorySize;
    String manufacturer;

    public SSD(String memorySize, String manufacturer) {
        this.memorySize = memorySize;
        this.manufacturer = manufacturer;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "memorySize=" + memorySize +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

