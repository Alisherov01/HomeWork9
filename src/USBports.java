
public class USBports {
    double typeOfPort;
    int idOfPort;

    public USBports(double typeOfPort, int idOfPort){
        this.typeOfPort = typeOfPort;
        this.idOfPort = idOfPort;
    }

    public double getTypeOfPort() {
        return typeOfPort;
    }

    public void setTypeOfPort(double typeOfPort) {
        this.typeOfPort = typeOfPort;
    }

    public int getIdOfPort() {
        return idOfPort;
    }

    public void setIdOfPort(int idOfPort) {
        this.idOfPort = idOfPort;
    }

    @Override
    public String toString() {
        return "USBports{" +
                "typeOfPort=" + typeOfPort +
                ", idOfPort=" + idOfPort +
                '}';
    }
}


