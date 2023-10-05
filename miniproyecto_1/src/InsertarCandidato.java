import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertarCandidato {
    public static void main(String[] args) throws Exception {
        ArrayList <Candidato> listaCandidato = new ArrayList<>();
        try(Scanner scannerNombre = new Scanner(System.in)){
            System.out.print("Digite el nombre del candidato: ");
            String nombre = scannerNombre.nextLine();
            System.out.println();
            try(Scanner scannerCedula = new Scanner(System.in)){
                System.out.print("Digite la cedula del candidato: ");
                String cedula = scannerCedula.nextLine();
                System.out.println();
                System.out.println("Ciudad de procedencia");
                System.out.println();
                System.out.println("1. Cali           2. Palmira         3. Yumbo\n" +
                                "4. Tuluá          5. Buenaventura    6. Cartago\n" +
                                "7. Jamundi        8. Buga            9. Andalucia\n" +
                                "10. Bugalagrande");
                System.out.println("0. Salir");
                System.out.print("Digite una opcion: ");
                try(Scanner scannerCIudad = new Scanner(System.in)){
                    byte opcionCiudad = scannerCIudad.nextByte();
                    System.out.println();
                    Ciudades ciudadElegida = null;
                    switch(opcionCiudad){
                        case 1: ciudadElegida = Ciudades.Cali; break;
                        case 2: ciudadElegida = Ciudades.Palmira; break;
                        case 3: ciudadElegida = Ciudades.Yumbo; break;
                        case 4: ciudadElegida = Ciudades.Tuluá; break;
                        case 5: ciudadElegida = Ciudades.Buenaventura; break;
                        case 6: ciudadElegida = Ciudades.Cartago; break;
                        case 7: ciudadElegida = Ciudades.Jamundi; break;
                        case 8: ciudadElegida = Ciudades.Buga; break;
                        case 9: ciudadElegida = Ciudades.Andalucia; break;
                        case 10: ciudadElegida = Ciudades.Bugalagrande; break;
                        case 0: break;
                        default: System.out.println("Opcion incorrecta");
                    }
                    System.out.println("---Ideologia---");
                    System.out.println();
                    System.out.println("1. Derecha");
                    System.out.println("2. Izquierda");
                    System.out.print("Digite una Opcion: ");
                    try(Scanner scannerIdeologia = new Scanner(System.in)){
                        byte opcionIdeologia = scannerIdeologia.nextByte();
                        Ideologia ideologiaElegida = null;
                        switch(opcionIdeologia){
                            case 1:  ideologiaElegida = Ideologia.Derecha; break;
                            case 2: ideologiaElegida = Ideologia.Izquierda; break;
                            default: System.out.println("Opcion incorrecta");
                           }
                        try(Scanner scannerPartido = new Scanner(System.in)){
                            Partidos partidoElejido = null;      
                            if(ideologiaElegida == Ideologia.Derecha){
                                System.out.println();                                            
                                System.out.println("---Partidos politicos de derecha---");
                                System.out.println();
                                System.out.println("1. Centro Democratico");
                                System.out.println("2. Partido Conservador");
                                System.out.println("3. Cambio Radical");
                                System.out.println("4. Partido de la U");
                                System.out.println("0. Salir");
                                System.out.print("Digite una opcion: ");
                                byte opcionPartido = scannerPartido.nextByte();
                                switch(opcionPartido){
                                    case 1: partidoElejido = Partidos.Centro_Democratico; break;
                                    case 2: partidoElejido = Partidos.Partido_Conservador; break;
                                    case 3: partidoElejido = Partidos.Cambio_Radical; break;
                                    case 4: partidoElejido = Partidos.Partido_De_la_U; break;
                                    case 0: break;
                                    default: System.out.println("Opcion incorrecta");
                                }
                                }
                            else{
                                System.out.println();
                                System.out.println("---Partidos politicos de izquierda---");
                                System.out.println();
                                System.out.println("1. Pacto Historico");
                                System.out.println("2. Partido Liberal");
                                System.out.println("3. Alianza Verde");
                                System.out.println("4. Polo Democratico");
                                System.out.println("5. Union Patriotica");
                                System.out.println("6. Fuerza de la Paz");
                                System.out.println("0. Salir");
                                System.out.print("Digite una opcion: ");
                                scannerPartido(System.in);
                                byte opcionPartido = scannerPartido.nextByte();
                                switch(opcionPartido){
                                    case 1: partidoElejido = Partidos.Pacto_Historico; break;
                                    case 2: partidoElejido = Partidos.Partido_Liberal; break;
                                    case 3: partidoElejido = Partidos.Alianza_Verde; break;
                                    case 4: partidoElejido = Partidos.Polo_Democratico; break;
                                    case 5: partidoElejido = Partidos.Union_Patriotica; break;
                                    case 6: partidoElejido = Partidos.Fuerza_De_La_Paz; break;
                                    case 0: break;
                                    default: System.out.println("Opcion incorrecta"); 
                                }
                            }
                                try(Scanner scannerPromesas = new Scanner(System.in)){
                                        System.out.print("Digite las promesas del candidato: ");
                                        String promesas = scannerPromesas.nextLine();
                                        try(Scanner scannerVotos = new Scanner(System.in)){
                                                System.out.print("Digite el numero de votos del candidato: ");
                                                int votos = scannerVotos.nextInt();
                                                System.out.println();
                                                Candidato candidato = new Candidato(ideologiaElegida, partidoElejido, votos, promesas, nombre, cedula, ciudadElegida);
                                                listaCandidato.add(candidato);
                                                listaCandidato.forEach((i)->{
                                                        System.out.println("Nombre del candidato: " + i.getNombre());
                                                        System.out.println("Numero de cedula del candidato: " + i.getCedula());
                                                        System.out.println("Ciudad de procedencia del candidato: " + i.getCiudades());
                                                        System.out.println("La ideologia del candidato: " + i.getIdeologia());
                                                        System.out.println("Partido politico del candidato: " + i.getPartido());
                                                        System.out.println("Las promesas del candidato: " + i.getPromesas());
                                                        System.out.println("Numero de votos del candidato: " + i.getVotos());
                                                });
                                        }    
                                 }            
                        } 
                    }                    
                }
            }
        }
    }
    private static void scannerPartido(InputStream in) { // Se define un método estático privado llamado scannerPartido que toma un objeto InputStream como parámetro y no retorna ningún valor. Este método probablemente esté destinado a escanear y procesar datos de tipo de partido.
    }
}
