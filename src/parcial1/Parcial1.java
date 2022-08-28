package parcial1;

import java.util.ArrayList;

/***********************************************
* Parcial1.java
* Yellsmy Toj
*
* Clase principal que contiene el método main para ejecutar las diversas
* funcionalidades de las clases relacionadas
***********************************************/

public class Parcial1
{ 
    public static void main(String[] args)
    {
        // Creación de lista para almacenar todos los productos con dstintos precios para el segundo constructor
        ArrayList<Producto> listaConstructor = new ArrayList<Producto>();
        
        // Creación de productos con dstintos precios
        Producto productoConstructor1 = new Producto("Cereal",22);
        Producto productoConstructor2 = new Producto("Yogurt",4);
        Producto productoConstructor6 = new Producto("Azúcar",9);
        Producto productoConstructor7 = new Producto("Sal",2.2);
        
        // Agregamos los productos a la lista
        listaConstructor.add(productoConstructor1);
        listaConstructor.add(productoConstructor2);
        listaConstructor.add(productoConstructor6);
        listaConstructor.add(productoConstructor7);
        
        // Inicializamos el segundo constructor de la clase Carretilla para que tenga una lista nicial
        Carretilla compraConstructor2 = new Carretilla(listaConstructor);
        
        // Mostramos la lista inicial del segundo constructor
        System.out.println("|---------------------BIENVENIDO--------------------|");
        System.out.println("|               SUPER MERCADO TODTO                 |");
        System.out.println("|-------LISTA INICIAL DEL SEGUNDO CONSTRUCTOR-------|");        
        compraConstructor2.mostrarCarretilla();           
        
        
        // Inicialización de objeto tipo Carretilla
        Carretilla compra = new Carretilla();
        
        Producto producto1 = new Producto("Caja de Leche",13);
        
        // Ejecución de metódos agregar para agregar productos a la carretilla
        compra.agregar(producto1);
        compra.agregar(15);       
        // Creación de una lista para almacenar la compra de distintos productos
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        
        // Creación de productos que se desean comprar para agregar a la lista
        Producto producto3 = new Producto("Libra de Café", 50);
        Producto producto4 = new Producto("Pan de banano", 70);
        Producto producto5 = new Producto("Galletas de vainilla", 7);
        
        // Agregamos los objetos de tipo Producto a la lista
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        listaProductos.add(producto5);
                
        // Ejecución de método agregar para agregar la lista de productos anteriormente definida
        compra.agregar(listaProductos);
        
        // Creación de producto a comprar 
        Producto producto2 = new Producto("Galletas de chocolate",10);
        
        // Ejecución de metodos agregar para agregar el mismo producto con precios distintos
        compra.agregar(producto2);
        compra.agregar(15);   
        
        // Ejecución de método para mostrar la lista de productos agregados 
        System.out.println("");
        System.out.println("|.........Nuevos Productos Agregados..........|");
        compra.mostrarCarretilla();  
        
        
    }
}