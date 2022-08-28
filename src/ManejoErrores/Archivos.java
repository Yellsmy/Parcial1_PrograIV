
package ManejoErrores;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Esta clase tiene como objetivo leer los datos
 * presentes en un archivo de texto con extensión .txt
 * 
 */
public class Archivos
{
	/**
	 * Método main que lee un archivo de texto y muestra su contenido en pantalla
	 * @throws IOException Excepción que indica que no se pudo leer el archivo
	 */
	public static void main(String[] args)throws Exception
        {          
            String nombreArchivo = "C:/Users\\Lenovo5\\Desktop\\archivos\\Archivo.txt"; /* Definición del archivo de texto a leer */
            FileInputStream archivo; // Definición de flujo de datos
            InputStreamReader conversor; // Definición del flujo de lectura
            BufferedReader filtro=null; // Definición del buffer
            String línea;
            
            // Incio Manejo de excepciones
            try 
            {
                /* Crea los objetos FileInputStream, BufferedReader y BufferedReader */
                archivo = new FileInputStream(nombreArchivo);
		conversor = new InputStreamReader(archivo);
		filtro = new BufferedReader(conversor);
		línea = filtro.readLine();
		while(línea != null)
                {
                    System.out.println(línea); /* Imprime en pantalla una línea del archivo */
                    línea = filtro.readLine(); // Lee la siguiente línea 
		}                           
            }
            catch(FileNotFoundException exceptionFile) // Captura el error si no encuentra el archivo
            {
                throw new FileNotFoundException("Archivo no encontrado"); // Se lanza el error
            }
            catch (IOException exeption) // Captura los errores del sistema
            {
                System.out.println(exeption.getMessage());
            }
            catch(Exception exception) // Captura cualquier error que impda la ejecución
            {               
                System.out.println(exception.getMessage());              
            }
            finally
            {
                filtro.close(); // Cierra el archivo               
            }
            System.out.println("Archvos");           
	}
}
