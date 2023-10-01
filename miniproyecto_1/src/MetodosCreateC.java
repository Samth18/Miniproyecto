import java.util.ArrayList;
import java.util.Scanner;

public class MetodosCreateC {
    public static void main(String[] args) throws Exception {
        ArrayList <Candidato> listaCandidato = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite su nombre: ");
                   String nombre = scanner.nextLine();
                   System.out.println();
            
                   System.out.print("Digite su numero de cedula: ");
                   String cedula = scanner.nextLine();
                   System.out.println();       
            
                   System.out.println("Ciudad de procedencia");
                   System.out.println();
                   System.out.println("1. Cali      6. Cartago");
                   System.out.println("2. Palmira   7. Jamundi");
                   System.out.println("3. Yumbo     8. Buga");
                   System.out.println("4. Tuluá     9. Andalucia");
                   System.out.println("5. Buenaventura  10. Bugalagrande");
                   System.out.println("0. Salir");
                   System.out.print("Digite una opcion: ");
                   try (Scanner scanner2 = new Scanner(System.in)) {
                    byte opcion = scanner2.nextByte();
                           System.out.println();
                           Ciudades ciudadElegida = null;
                           do{ 
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
                            default: System.out.println("Opcion incorrecta");
                           }
                        }while(opcion != 0);

                           System.out.println("---Ideologia---");
                           System.out.println();
                           System.out.println("1. Derecha");
                           System.out.println("2. Izquierda");
                           System.out.println("0. Salir");
                           System.out.print("Digite una Opcion: ");
                           Scanner scanner3 = new Scanner(System.in);
                           byte opcion2 = scanner3.nextByte();
                           System.out.println();
                           Ideologia ideologiaElegida = null;
                           do{
                           switch(opcion2){
                            case 1:  ideologiaElegida = Ideologia.Derecha;
                                    break;
                            case 2: ideologiaElegida = Ideologia.Izquierda;
                                    break;
                            case 0: break;
                            default: System.out.println("Opcion incorrecta");
                           }
                           }while(opcion2 != 0);
                           listaCandidato.forEach((i)->{
                                if(i.getIdeologia() == Ideologia.Derecha){
                                    System.out.println("---Partidos politicos de derecha---");
                                    System.out.println();
                                    System.out.println("1. Centro Democratico");
                                    System.out.println("2. Partido Conservador");
                                    System.out.println("3. Cambio Radical");
                                    System.out.println("4. Partido de la U");
                                    System.out.println("0. Salir");
                                    System.out.print("Digite una opcion: ");
                                    Scanner scanner4 = new Scanner(System.in);
                                    byte opcion3 = scanner4.nextByte();
                                    Partidos partidoDerecha = null;
                                    do{
                                        switch(opcion3){
                                            case 1: partidoDerecha = Partidos.Centro_Democratico;
                                                    break;
                                            case 2: partidoDerecha = Partidos.Partido_Conservador;
                                                    break;
                                            case 3: partidoDerecha = Partidos.Cambio_Radical;
                                                    break;
                                            case 4: partidoDerecha = Partidos.Partido_De_la_U;
                                                    break;
                                            case 0: break;
                                            default: System.out.println("Opcion incorrecta");
                                        }
                                    }while(opcion3 != 0);
                                }
                                else{
                                    System.out.println("---Partidos politicos de izquierda---");
                                    System.out.println();
                                    System.out.println("1. Pacto Historico");
                                    System.out.println("2. Partido Liberal");
                                    System.out.println("3. Alianza Verde");
                                    System.out.println("4. Polo Democratico");
                                    System.out.println("5. Union Patriotica");
                                    System.out.println("6. Fuerza de la Paz");
                                    System.out.println("0. Salir");
                                    System.out.println("Digite una opcion: ");
                                    Scanner scanner5 = new Scanner(System.in);
                                    byte opcion4 = scanner5.nextByte();
                                    Partidos partidoIzquierda = null;
                                    do{
                                        switch(opcion4){
                                            case 1: partidoIzquierda = Partidos.Pacto_Historico;
                                                    break;
                                            case 2: partidoIzquierda = Partidos.Partido_Liberal;
                                                    break;
                                            case 3: partidoIzquierda = Partidos.Alianza_Verde;
                                                    break;
                                            case 4: partidoIzquierda = Partidos.Polo_Democratico;
                                                    break;
                                            case 5: partidoIzquierda = Partidos.Union_Patriotica;
                                                    break;
                                            case 6: partidoIzquierda = Partidos.Fuerza_De_La_Paz;
                                                    break;
                                            case 0: break;
                                            default: System.out.println("Opcion incorrecta"); 
                                
                                        }
                                    }while(opcion4 != 0);
                                }
                                Scanner scanner6 = new Scanner(System.in);
                                int votos = scanner6.nextInt();
                                System.out.println();

                           });
                           Ciudadano ciudadano = new Ciudadano(nombre, cedula, ciudadElegida);
                           //Candidato candidato = new Candidato(ideologiaEleg);
                           //listaCandidato.add(candidato);

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
