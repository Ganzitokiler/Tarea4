public class Casa {
    // Atributos
    private int numeroCuartos;
    private int numeroBanos;
    private boolean tienePatio;
    private String color;
    private int precio;

    // Constructores
    public Casa(int numeroCuartos, int numeroBanos, boolean tienePatio, String color, int precio) {
        this.numeroCuartos = numeroCuartos;
        this.numeroBanos = numeroBanos;
        this.tienePatio = tienePatio;
        this.color = color;
        this.precio = precio;
    }

    public Casa() {
        this.numeroCuartos = 3;
        this.numeroBanos = 2;
        this.tienePatio = true;
        this.color = "Blanco";
        this.precio = 100000;
    }

    // Métodos de acceso
    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public int getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(int numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public boolean isTienePatio() {
        return tienePatio;
    }

    public void setTienePatio(boolean tienePatio) {
        this.tienePatio = tienePatio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Método toString
    @Override
    public String toString() {
        return "Casa{" +
                "numeroCuartos=" + numeroCuartos +
                ", numeroBanos=" + numeroBanos +
                ", tienePatio=" + tienePatio +
                ", color='" + color + '\'' +
                ", precio=$" + precio +
                '}';
    }

    // Métodos de uso general
    public void mostrarPrecio() {
        System.out.println("El precio de la casa es: $" + this.precio);
    }

    public void calcularPrecioConDescuento(double descuento) {
        double precioConDescuento = this.precio * (1 - descuento/100);
        System.out.println("El precio con descuento es: $" + precioConDescuento);
    }

    public void pintarCasa(String nuevoColor) {
        System.out.println("Pintando casa de " + this.color + " a " + nuevoColor);
        this.color = nuevoColor;
    }
}
