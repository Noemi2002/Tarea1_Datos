package server_client;

public class serverr {
    public serverr(double value, double weigth, double tax) {
    }

    public double serverr(int value, int weigth, int tax) {
        //Monto = (valor del producto * porcentaje / 100) + (peso del producto * 0,15)

        double operation;

        operation = (value * tax / 100) + (weigth * 0.15);
        return operation;
    }

}
