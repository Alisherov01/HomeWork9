
public class Computer {
    String display;
    String brand;
    String color;
    String SSD;
    String OS;
    String videoCard;
    boolean USBports;
    String keyboard;

    public Computer(String display, String brand,
                    String color, String SSD,
                    String OS, String videoCard,
                    boolean USBports, String keyboard) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.SSD = SSD;
        this.OS = OS;
        this.videoCard = videoCard;
        this.USBports = USBports;
        this.keyboard = keyboard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public boolean isUSBports() {
        return USBports;
    }

    public void setUSBports(boolean USBports) {
        this.USBports = USBports;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "display='" + display + '\'' +
                ", brand= '" + brand + '\'' + "\n" +
                "color= '" + color + '\'' +
                ", SSD= '" + SSD + '\'' +
                ", OS= '" + OS + '\'' + "\n" +
                "videoCard= '" + videoCard + '\'' +
                ", USBports= '" + USBports +'\'' +
                ", keyboard= '" + keyboard + '\'' +
                '}';
    }
}

