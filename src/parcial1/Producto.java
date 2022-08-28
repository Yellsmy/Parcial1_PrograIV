
package parcial1;

/**
 * Esta clase define objetos de tipo Producto de un comercio
 * cada producto se identifica con un nombre y precio
 *
 */
public class Producto
{
	  private String nombre; // Atributo que define el nombre del producto
	  private double precio; // Atritubo que define el precio del producto
	  
	  /**
	   * Setters y Getters de los atributos de la clase Producto
	   * 
	   */
	  public String getNombre()
          {
	    return nombre;
	  }
	  
	  public void setNombre(String nombre)
          {
	    this.nombre = nombre;
	  }
	  
	  public double getPrecio()
          {
	    return precio;
	  }
	  
	  public void setPrecio(double precio)
          {
	    this.precio = precio;
	  }
	  
	  /**
	   * Constructor de la clase Producto
	   * @param nombre Define el nombre del producto
	   * @param precio Define el precio del producto
	   */
	  public Producto(String nombre, double precio)
          {
	    super();
	    this.nombre = nombre;
	    this.precio = precio;
	  }   
}