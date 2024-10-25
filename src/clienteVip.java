public class clienteVip {
    private String nombre;
    private double limiteCredito;
    private String email;
    private enum tipoVip{
        GOLD, SILVER, NORMAL
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito() {
        this.limiteCredito = limiteCredito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public clienteVip() {
    }

    public clienteVip(String nombre, double limiteCredito) {
        this.nombre = nombre;
        this.limiteCredito = limiteCredito;
    }

    public clienteVip(String nombre, String email, double limiteCredito) {
        this.nombre = nombre;
        this.email = email;
        this.limiteCredito = limiteCredito;
    }
}



