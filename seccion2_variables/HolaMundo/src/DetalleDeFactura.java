import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la descripcion de la factura: ");
        String descripcionFactura = scanner.nextLine();

        System.out.print("Ingrese el precio del primer producto: ");
        double precioProducto1 = scanner.nextDouble();

        System.out.print("Ingrese el precio del segundo producto: ");
        double precioProducto2 = scanner.nextDouble();

        // Cálculo del total bruto, impuesto y total neto
        double totalBruto = precioProducto1 + precioProducto2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        // Mostrar el resultado
        System.out.println("La factura " + descripcionFactura + " tiene un total bruto de " + totalBruto +
                ", con un impuesto de " + impuesto + " y el monto después de impuesto es de " + totalNeto);
    }
}
