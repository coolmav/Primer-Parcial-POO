
package primerparcial00140302;


public class Perro extends Animal{
    
    
 private String LadrarPerro;
    
 public Perro(String Id, String nombre, String raza){
        super(Id, nombre, raza);
    }

 public Perro(String LadrarPerro, String nombre, String raza, String edad) {
    
    super(nombre, raza, edad);
    this.LadrarPerro = LadrarPerro;
    }

    public String getLadrarPerro() {
        return LadrarPerro;
    }
}
