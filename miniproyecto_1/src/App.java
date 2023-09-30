import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("-----Datos Personales-----");
       System.out.println();

       try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Digite su nombre: ");
               String nombre = scanner.nextLine();
               System.out.println();
        
               System.out.print("Digite su numero de cedula: ");
               String cedula = scanner.nextLine();
               System.out.println();       
        
               System.out.println("Ciudad de procedencia");
               System.out.println();
               System.out.println("1. Cali");
               System.out.println("2. Palmira");
               System.out.println("3. Yumbo");
               System.out.println("4. Tuluá");
               System.out.println("0. Salir");
               System.out.print("Digite una opcion: ");
               try (Scanner scanner2 = new Scanner(System.in)) {
                byte opcion = scanner2.nextByte();
                       System.out.println();
                       Ciudades ciudadElegida = null;
                
                       switch(opcion){
                        case 1: ciudadElegida = Ciudades.Cali;
                                break;
                        case 2: ciudadElegida = Ciudades.Palmira;
                                break;
                        case 3: ciudadElegida = Ciudades.Yumbo;
                                break;
                        case 4: ciudadElegida = Ciudades.Tuluá;
                                break;
                        case 0: break;
                       }
                
                       Ciudadano ciudadano = new Ciudadano(nombre, cedula, ciudadElegida);
                
                       System.out.println("Sus Datos: ");
                       System.out.println("Su nombre es: " + ciudadano.getNombre());
                       System.out.println("Su numero de cedula: " + ciudadano.getCedula());
                
                       if (ciudadElegida != null){
                            System.out.println("Su lugar de residencia: " + ciudadano.getCiudades().name()); 
                
                       }else{
                        System.out.println("No se selecciono un lugar de residencia");
                       }
        }
}
       

    }   

}
