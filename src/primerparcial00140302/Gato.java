
package primerparcial00140302;


public class Gato extends Animal {
    
   private String MaullarGato;
    
 public Gato(String Id, String nombre, String raza){
        super(Id, nombre, raza);
    }

 public Gato(String MaullarGato, String nombre, String raza, String edad) {
    
    super( nombre, raza, edad);
    this.MaullarGato = MaullarGato;
    }

    public String getMaullarGato() {
        return MaullarGato;
    }
}
