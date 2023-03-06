public class Puerta {
    // Atributos
    private String material;
    private String color;
    private boolean cerrada;
    private int ancho;
    private int alto;

    // Constructores
    public Puerta() {
        this.material = "madera";
        this.color = "marrón";
        this.cerrada = true;
        this.ancho = 80;
        this.alto = 200;
    }

    public Puerta(String material, String color, boolean cerrada, int ancho, int alto) {
        this.material = material;
        this.color = color;
        this.cerrada = cerrada;
        this.ancho = ancho;
        this.alto = alto;
    }

    // Métodos de acceso
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCerrada() {
        return cerrada;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    // Método toString
    @Override
    public String toString() {
        return "Puerta{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", cerrada=" + cerrada +
                ", ancho=" + ancho + " cm" +
                ", alto=" + alto + " cm" +
                '}';
    }

    // Métodos de uso general
    public void abrir() {
        this.cerrada = false;
        System.out.println("La puerta ha sido abierta.");
    }

    public void cerrar() {
        this.cerrada = true;
        System.out.println("La puerta ha sido cerrada.");
    }

    public void pintar(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("La puerta ha sido pintada de " + nuevoColor + ".");
    }
}
