/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
// librerias para manejo de conexion a bd
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author JOSUE RAMOS
 */
public class CreateConection {
      static Properties configuracion=new Properties();
    String hostname =null; 
    String port = null;
    String database =null;
    String username =null;
    String password =null;
    
    public CreateConection(){
      InputStream in=null;
     String path ="C:\\Users\\JOSUE RAMOS\\OneDrive\\Documentos\\NetBeansProjects\\MVC\\src\\Conexion\\configuration.properties";

              try{
          in = Files.newInputStream(Paths.get(path));
          configuracion.load(in);
          in.close();
          //invocar un metodo para leer la llave y valor
          // y asignarlo a las variables globales
          loadProperties();//////////////////
          System.out.println("Archivo de configuración cargado exitosamente");
   } catch (IOException ex) {
       System.out.println("Error al cargar el archivo de configuración: " + ex.getMessage());
   }
      }
    public void loadProperties(){
        this.hostname=configuracion.getProperty("hostname");
        this.port=configuracion.getProperty("port");
        this.database=configuracion.getProperty("database");
        this.username=configuracion.getProperty("username");
        this.password=configuracion.getProperty("password");
    }
    public Connection getConnection()throws SQLException{
        Connection conn=null;
        
        String jdbcUrl ="jdbc:postgresql://"+hostname+":"+port+"/"+database;
        conn = DriverManager.getConnection(jdbcUrl,username,password);
        System.out.println("Conexion establecida");
        return conn;
    }
}
