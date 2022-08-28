package parcial1;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase define la Carretilla de compras del cliente
 * en ella pueden haber muchos productos, los cuales 
 * se van agreando de diferentes formas.
 */
public class Carretilla {
    // Atributo que define una lista de productos contenidos en la carretilla
    private List<Producto> lista = new ArrayList<Producto>();
    
    //**************************************************************
	
    /**
     * Constructor de la clase Carretilla
     */
    public Carretilla() 
    {
	super();
    }
    
    /**
     * Sobrecarga de constructor de la clase Carretilla que recbe una lista inicial
     */
    public Carretilla(ArrayList<Producto> lista){
        this.lista= (ArrayList<Producto>) lista.clone();       
    }      

    //**************************************************************
    
    // Métodos accesor y modificador
    public List<Producto> getLista()
    {
        return lista;
    }

    public void setLista(List<Producto> lista) {
        this.lista = lista;
    }
        
    //************************************************************** 
	
    /**
     * Método que agrega un producto a la lista de la carretilla
     * @param p Parámetro de tipo Producto a agregar a la lista
     */
    public void agregar(Producto p) 
    {
	lista.add(p);
    }
        
    //**************************************************************
    
    /**
     * Método que agrega un producto a la lista de la carretilla
     * @param precio: nombre del producto a agregar a la lista
     */
    public void agregar( double precio)
    {    
        // Variable que almacenará el último nombre de producto de la lista
        String nombreProducto=""; 
        int size = lista.size(); // Tamaño de la lista
        for(int i =0; i<lista.size(); i++)
        {   
            // Si la lista solo tiene un producto, que agregue el nombre de ese producto
            if(size ==1){ 
                nombreProducto = lista.get(i).getNombre();
            }
            
            // Si la lista tiene más de 1 producto, que agregue el último nombre del producto
            else{
                nombreProducto = lista.get(size-1).getNombre();
            }                
        }
        
        // Inicializamos un objeto de tipo producto y lo agregamos a la lista
        Producto p = new Producto(nombreProducto, precio);
        lista.add(p);
        
    }
    
    //**************************************************************
    
    /**
     * Método que agrega un producto a la lista de la carretilla
     * @param productos: lista de productos que se desean agregar a la lista
     */
     public void agregar(ArrayList<Producto> productos){
        for(int i =0; i<productos.size(); i++){
            Producto p = new Producto(productos.get(i).getNombre(), productos.get(i).getPrecio());           
            lista.add(p);   
        }
     }
     
    //**************************************************************
     
    //Método que muestra los productos de la lista de la carretilla
    public void mostrarCarretilla()
    {
        System.out.println("Producto--------------Precio");
        for(int i =0; i<lista.size(); i++)
        {
            System.out.print(lista.get(i).getNombre()+"------Q."+lista.get(i).getPrecio());
            System.out.println("");
        }
    }
}
