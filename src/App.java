public class App {
    public static void main(String[] args) throws Exception {
        Guitarra fendeGuitarra = new Guitarra("NS11-11-11", "Fernder", "Strado", "Semi Acustica", "Maple", 5000.00);
        System.err.println(fendeGuitarra.fabricante);
        System.err.println(fendeGuitarra.numeroSerie);
        System.err.println(fendeGuitarra.modelo);
        System.err.println(fendeGuitarra.tipo);
        System.err.println(fendeGuitarra.madeira);
        System.err.println(fendeGuitarra.preco);

        
    }
}
