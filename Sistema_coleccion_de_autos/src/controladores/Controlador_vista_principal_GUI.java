package controladores;
import modelos.Coleccion_carros;
import java.awt.event.ActionEvent;
import vistas.Vista_principal_GUI;
import java.awt.event.ActionListener;

public class Controlador_vista_principal_GUI implements ActionListener {
    
    private Vista_principal_GUI vista_principal;
    private Coleccion_carros coleccion_carros
    
    //Metodos
    //metodo constructor
    public Controlador_vista_principal_GUI(){
        //instancia del objeto vista_principal
        this.vista_principal = new Vista_principal_GUI();
        //Hacer visible la vista_principal
        this.vista_principal.setVisible(true);
        //instanciar el objeto coleccion
        this.coleccion_carros= new Coleccion_Carros();
        
        //Escuchas que interpretan las acciones sobre los botones
        this.vista_principal.jbtn_agregar.addActionListener(this);
        this.vista_principal.jbtn_borrar.addActionListener(this);
        this.vista_principal.jbtn_buscar.addActionListener(this);
        this.vista_principal.jbtn_mostrar_coleccion.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Lo que va a pasar si se oprime el boton agregar auto
        if (e.getSource()== this.vista_principal.jbtn_agregar){
            
        }
        
        //Lo que va a pasar si se oprime el boton borrar auto
        if (e.getSource()== this.vista_principal.jbtn_borrar){
            //Obtener los datos de los de los TextFields de la vista_principal
            int ano_serie= Integer.parseInt(this.vista_principal.jtf_ano_serie.getText());
            int num_serie= Integer.parseInt(this.vista_principal.jtf_num_serie.getText());
            
            //
        }
        
        //Lo que va a pasar si se oprime el boton buscar auto
        if(e.getSource()==this.vista_principal.jbtn_buscar){
            
        }
        
        //Lo que va a pasar si se oprime el boton mostrar coleccion
        if(e.getSource()==this.vista_principal.jbtn_mostrar_coleccion){
            
        }
        
    }
    
    
}
