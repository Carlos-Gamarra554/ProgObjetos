public class Punto {
    private int x;
    private int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia1() {
        return Math.sqrt(x * x+y * y);
    }

    public double distancia2(int x, int y) {
        int distanciax = this.x - x;
        int distanciay = this.y - y;
        return Math.sqrt((distanciax * distanciax) + (distanciay * distanciay));
    }

    public double distancia3() {
        int distanciax = this.x - x;
        int distanciay = this.y - y;
        return Math.sqrt((x-x)*(x-x)+(y-y)*(y-y));
    }
}


