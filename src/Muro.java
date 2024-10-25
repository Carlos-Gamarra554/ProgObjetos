public class Muro {
    private double ancho;
    private double alto;
    private double area;

    public Muro() {

    }

    public Muro(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;

    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
        if (ancho < 0) {
            this.ancho = 0;
        }
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;

        if (alto < 0) {
            this.alto = 0;
        }
    }

    public double getArea(){
        this.area = area;

        area = ancho * alto;

        return area;
    }
}


