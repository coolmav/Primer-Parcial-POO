
package primerparcial00140302;


public class Animal {
    
    private String Id;
    private String Nombre;
    private String Raza;
    private String Edad;
    
    
    
    //Creacion de constructor por defecto
    
public Animal(){
        
    }
    
    //Constructor con tres parametros

 public Animal(String id, String nomb, String raza){
        this.Id=id;
        this.Nombre=nomb;
        this.Raza=raza;
    }

 
 /*Metodo Set...*/

public void setId(String Id) {
        this.Id = Id;
    }

public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

public void setRaza(String Raza) {
        this.Raza = Raza;
    }

public void setEdad(String Edad) {
        this.Edad = Edad;
    }
   

    
    
    /*Metodo Get...*/

public String getId() {
        return Id;
    }

public String getNombre() {
        return Nombre;
    }

public String getRaza() {
        return Raza;
    }

public String getEdad() {
        return Edad;
    }


 
 
 
 
 
}
   
   

