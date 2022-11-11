
public class Display {
    double diagonal;
    String manufacturer;
    String typeOfMatrix;

    public Display(double diagonal, String manufacturer, String typeOfMatrix) {
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.typeOfMatrix = typeOfMatrix;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTypeOfMatrix() {
        return typeOfMatrix;
    }

    public void setTypeOfMatrix(String typeOfMatrix) {
        this.typeOfMatrix = typeOfMatrix;
    }

    @Override
    public String toString() {
        return "Display{" +
                "diagonal=" + diagonal +
                ", manufacturer='" + manufacturer + '\'' +
                ", typeOfMatrix='" + typeOfMatrix + '\'' +
                '}';
    }
}
