
package primerparcial00140302;


public class PrimerParcial00140302 {

  
    public static void main(String[] args) {
       /*Gato*/
       Gato gat1=new Gato("ULF0001", "Minou", "Balinés", "12-15 años");
       
       /*Perro*/
       Perro per1=new Perro ("YFK0012", "Duke", "Bulldog", "8-10 años");
    

        /*Gato*/
        System.out.println(gat1.getMaullarGato());
        System.out.println(gat1.getId());
        System.out.println(gat1.getNombre());
        System.out.println(gat1.getRaza());
        
        /*Perro*/
        System.out.println(per1.getLadrarPerro());
        System.out.println(per1.getId());
        System.out.println(per1.getNombre());
        System.out.println(per1.getRaza());
        
    }
    
}
