public class Guitarra {
    
String numeroSerie, fabricante, modelo, tipo, madeira;
double preco;

public Guitarra(String numeroSerie, String fabricante, String modelo, String tipo, String madeira, double preco) {
    this.numeroSerie = numeroSerie;
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.tipo = tipo;
    this.madeira = madeira;
    this.preco = preco;
}

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMadeira() {
        return madeira;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
