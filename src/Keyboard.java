
public class Keyboard {
    boolean backlight;
    boolean numPad;

    public Keyboard(boolean backlight, boolean numPad) {
        this.backlight = backlight;
        this.numPad = numPad;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public boolean isNumPad() {
        return numPad;
    }

    public void setNumPad(boolean numPad) {
        this.numPad = numPad;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "backlight=" + backlight +
                ", numPad=" + numPad +
                '}';
    }
}

