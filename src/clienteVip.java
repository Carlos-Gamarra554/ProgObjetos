public class clienteVip {
    private String nombre;
    private double limiteCredito;
    private String email;

    private tipoVip tipoVip;

    public tipoVip getTipoVip() {
        return tipoVip;
    }

    public void setTipoVip(tipoVip tipoVip) {
        this.tipoVip = tipoVip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
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

    public clienteVip(String nombre, String email, double limiteCredito, tipoVip tipoVip) {
        this.nombre = nombre;
        this.email = email;
        this.limiteCredito = limiteCredito;
        this.tipoVip = tipoVip;
    }
}



