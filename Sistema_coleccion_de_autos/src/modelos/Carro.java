package modelos;

public class Carro {
    //Atributos
    private int ano_serie;
    private int cant_total_serie;
    private int num_serie;
    private String marca;
    private String color;

    //Metodos
    //metodo constructor
    public Carro(){
    }
    
    //metodos get
    public int getAno_serie() {
        return ano_serie;
    }

    public int getCant_total_serie() {
        return cant_total_serie;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }
    
    //metodos set

    public void setAno_serie(int ano_serie) {
        this.ano_serie = ano_serie;
    }

    public void setCant_total_serie(int cant_total_serie) {
        this.cant_total_serie = cant_total_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
