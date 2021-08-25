package server_client;


public class function {

    public static void main(String[] args) {
        int value;
        int weigth;
        int tax;

        String v;
        String pe;
        String pi;

        v = javax.swing.JOptionPane.showInputDialog("Ingrese el valor del producto: ");
        value = Integer.parseInt(v);

        pe = javax.swing.JOptionPane.showInputDialog("Ingrese el peso del producto: ");
        weigth = Integer.parseInt(pe);

        pi = javax.swing.JOptionPane.showInputDialog("Ingrese el porcentaje correspondiente a impuestos. Recuerde que debe ser un número entero: ");
        tax = Integer.parseInt(pi);

        //x = nota(num);
        //javax.swing.JOptionPane.showMessageDialog(null, "La condición del estudiante es: " + x);

    }
}
