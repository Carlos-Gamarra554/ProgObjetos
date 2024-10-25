public class clientePrueba {
    public static void main(String[] args) {

    clienteVip cliente = new clienteVip();
    cliente.setNombre("Miguel Fernández");
    cliente.setLimiteCredito(1244.98);
    cliente.setEmail("Miguelfer@gmail.com");
    cliente.setTipoVip(tipoVip.SILVER);
        System.out.println("Nombre del cliente: " + cliente.getNombre());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Límite del crédito: " + cliente.getLimiteCredito() + "€");
        System.out.println("Clase: " + cliente.getTipoVip());
        System.out.println();

    clienteVip cliente2 = new clienteVip("Fernando García", 9384.89);
    cliente2.setEmail("FernandoGarc@gmail.com");
    cliente2.setTipoVip(tipoVip.GOLD);
        System.out.println("Nombre del cliente: " + cliente2.getNombre());
        System.out.println("Email: " + cliente2.getEmail());
        System.out.println("Límite del crédito: " + cliente2.getLimiteCredito() + "€");
        System.out.println("Clase: " + cliente2.getTipoVip());
        System.out.println();

    clienteVip cliente3 = new clienteVip("Carlos Gutiérrez", "Carlosgut@gmail.com", 98374.45, tipoVip.NORMAL);
        System.out.println("Nombre del cliente: " + cliente3.getNombre());
        System.out.println("Email: " + cliente3.getEmail());
        System.out.println("Límite del crédito: " + cliente3.getLimiteCredito() + "€");
        System.out.println("Clase: " + cliente3.getTipoVip());
    }
}