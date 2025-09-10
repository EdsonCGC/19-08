public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas; // ventas semanales
    private double tarifaComision; // porcentaje

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno,String numeroSeguroSocial,
    double ventasBrutas, double tarifaComision) {

        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public void establecerVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas deben ser >= 0.0");
        this.ventasBrutas = ventasBrutas;
    }

    public double obtenerVentasBrutas() { return ventasBrutas; }

    public void establecerTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException("La tarifa debe ser >0.0 y <1.0");
        this.tarifaComision = tarifaComision;
    }

    public double obtenerTarifaComision() { return tarifaComision; }
    //aqui se modifica el método ingresos para acceder a las variables de instancia
    //tarifaComision y ventasBrutas mediante sus métodos accesores
    @Override //es un metodo, se sobre escribe de la clase object
    public double ingresos() {
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }

    @Override
    public String toString() {
        return String.format("Empleado por comisión: %s%nVentas brutas: $%,.2f; Tarifa de comisión: %.2f",
                super.toString(), obtenerVentasBrutas(), obtenerTarifaComision());
    }
}
