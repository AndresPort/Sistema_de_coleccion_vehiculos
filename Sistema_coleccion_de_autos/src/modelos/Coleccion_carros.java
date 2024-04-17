
package modelos;
import java.util.List;
import java.util.ArrayList;
import modelos.Carro;

public class Coleccion_carros {
    //atributos
    //Lista que va a contener los carros
    private List<Carro> coleccion= new ArrayList<>();
    
    //metodos
    //metodo constructor
    public Coleccion_carros(){
    }
    
    //Metodo para agrear los autos en la coleccion
    public int agregar_autos_a_coleccion(Carro carro){
       coleccion.add(carro);
       return 1;//el 1 significa que se agrego el auto correctamente a
       //la lista, para que lance un mensaje de confirmacion
    } 
    
    public int borrar_auto_de_la_lista(int ano_serie, int num_serie){
        Carro carro= new Carro();
        for(int i=0;i<this.coleccion.size();i++){
            carro=coleccion.get(i);
            if(ano_serie == carro.getAno_serie() && num_serie== carro.getNum_serie()){
                this.coleccion.remove(i);
                return 1;//1 = se elimino correctamente el carro   
            }          
        }
        return 2; // 2 = no se pudo encontrar el carro
    }
    
    public String buscar_auto_en_la_lista(int ano_serie, int num_serie){
        Carro carro= new Carro();
        String auto="No se pudo encontrar el auto";
        for(int i=0;i<this.coleccion.size();i++){
                        carro=coleccion.get(i);

            if(ano_serie == carro.getAno_serie() && num_serie== carro.getNum_serie()){
                auto= "Color: "+carro.getColor()+"\nMarca: "+carro.getMarca()+"\nTotal autos en la serie: "+carro.getCant_total_serie()+"\nAno de serie: "+carro.getAno_serie()+"\nNumero de serie:"+carro.getNum_serie();
            }          
        }
        return  auto; //Si se encuentra el auto retorna las caracteristicas, si no un mensaje 
    }
    
    public String mostrar_coleccion(){
        Carro carro= new Carro();
        String colec= "";
        for(int i=0;i<this.coleccion.size();i++){
            carro=coleccion.get(i);
            colec+="Carro "+(i+1)+"/nColor: "+carro.getColor()+"\nMarca: "+carro.getMarca()+"\nTotal autos en la serie: "+carro.getCant_total_serie()+"\nAno de serie: "+carro.getAno_serie()+"\nNumero de serie:"+carro.getNum_serie()+"\n\n"; 
        }
        return colec;
    }
}
