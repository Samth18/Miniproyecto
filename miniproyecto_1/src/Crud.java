import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Crud {
    static ArrayList <Candidato> listaCandidato = new ArrayList<>();
    public static void crearCandidato(){
        System.out.println("---CREAR CANDIDATO---");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el nombre del candidato: ");
        String nombre = scanner.nextLine();
        System.out.println();

        System.out.print("Digite la cedula del candidato: ");
        String cedula = scanner.nextLine();
        System.out.println();
        
        System.out.println("Ciudad de procedencia");
        System.out.println();
        System.out.println("1. Cali           2. Palmira         3. Yumbo\n" +
                        "4. Tuluá          5. Buenaventura    6. Cartago\n" +
                        "7. Jamundi        8. Buga            9. Andalucia\n" +
                        "10. Bugalagrande");
        System.out.println("0. Salir");
        System.out.print("Digite una opcion: ");
        byte opcionCiudad = scanner.nextByte();
        scanner.nextLine();
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
        byte opcionIdeologia = scanner.nextByte();
        scanner.nextLine();
        Ideologia ideologiaElegida = null;
        switch(opcionIdeologia){
            case 1:  ideologiaElegida = Ideologia.Derecha; break;
            case 2: ideologiaElegida = Ideologia.Izquierda; break;
            default: System.out.println("Opcion incorrecta");
            }

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
            byte opcionPartido = scanner.nextByte();
            scanner.nextLine();
            System.out.println();
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
            byte opcionPartido = scanner.nextByte();
            scanner.nextLine();
            System.out.println();
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
        System.out.print("Digite las promesas del candidato: ");
        String promesas = scanner.nextLine();
        System.out.println();

        System.out.print("Digite el numero de votos del candidato: ");
        int votos = scanner.nextInt();

        System.out.println();
        Candidato candidato = new Candidato(ideologiaElegida, partidoElejido, votos, promesas, nombre, cedula, ciudadElegida);
        listaCandidato.add(candidato);
        
    }

    public static void leerCandidato(){
        System.out.println("---CANDIDATOS ACTIVOS---");
        listaCandidato.forEach((i)->{
            System.out.println("Nombre del candidato: " + i.getNombre());
            System.out.println("Numero de cedula del candidato: " + i.getCedula());
            System.out.println("Ciudad de procedencia del candidato: " + i.getCiudades());
            System.out.println("La ideologia del candidato: " + i.getIdeologia());
            System.out.println("Partido politico del candidato: " + i.getPartido());
            System.out.println("Las promesas del candidato: " + i.getPromesas());
            System.out.println("Numero de votos del candidato: " + i.getVotos() + "\n");
        });
    }

    public static void EliminarCandidato() {
        Scanner scannerEliminar = new Scanner(System.in);

        System.out.print("Digite la cedula del candidato que desea eliminar: ");
        String cedulaEliminar = scannerEliminar.nextLine();

        eliminarCandidato(cedulaEliminar);

        // Llamar al método para mostrar la lista actualizada
        leerCandidato();
    }


    public static void eliminarCandidato(String cedulaEliminar) {
        Iterator<Candidato> iterator = listaCandidato.iterator();
        while (iterator.hasNext()) {
            Candidato candidato = iterator.next();
            if (candidato.getCedula().equals(cedulaEliminar)) {
                iterator.remove();
            }
        }
}



//-----------------------------------------------------------





    public static void ActualizarCandidato(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite la cédula del candidato que desea modificar: ");
        String cedulaModificar = scanner.nextLine();

        Candidato candidatoModificar = buscarCandidatoPorCedula(listaCandidato, cedulaModificar);

        if (candidatoModificar != null) {
            System.out.println("Candidato encontrado:");
            System.out.println("Nombre actual: " + candidatoModificar.getNombre());
            System.out.println("Cedula actual: " + candidatoModificar.getCedula());
            System.out.println("Ciudad de procedencia actual: " + candidatoModificar.getCiudades());
            System.out.println("Ideologia actual: " + candidatoModificar.getIdeologia());
            System.out.println("Partido politico actual: " + candidatoModificar.getPartido());
            System.out.println("Promesas actuales: " + candidatoModificar.getPromesas());
            System.out.println("Numero de votos actuales: " + candidatoModificar.getVotos());
            System.out.println("");


            System.out.print("Nuevo nombre: ");
            String nuevoNombre = scanner.nextLine();
            candidatoModificar.setNombre(nuevoNombre);

            System.out.print("Nueva cedula: ");
            String nuevaCedula = scanner.nextLine();
            candidatoModificar.setCedula(nuevaCedula);

            System.out.println("Nueva ciudad de procedencia: ");
            System.out.println();
            System.out.println("1. Cali           2. Palmira         3. Yumbo\n" +
                    "4. Tuluá          5. Buenaventura    6. Cartago\n" +
                    "7. Jamundi        8. Buga            9. Andalucia\n" +
                    "10. Bugalagrande");
            System.out.println("0. Salir");
            System.out.print("Digite una opcion: ");
            byte opcionCiudad = scanner.nextByte();
            scanner.nextLine();
            System.out.println();
            Ciudades ciudadElegida = null;
    
            switch (opcionCiudad) {
                case 1:
                    ciudadElegida = Ciudades.Cali;
                    break;
                case 2:
                    ciudadElegida = Ciudades.Palmira;
                    break;
                case 3:
                    ciudadElegida = Ciudades.Yumbo;
                    break;
                case 4: 
                    ciudadElegida = Ciudades.Tuluá;
                    break;
                case 5: 
                    ciudadElegida = Ciudades.Buenaventura;
                    break;
                case 6: 
                    ciudadElegida = Ciudades.Cartago;
                    break;
                case 7: 
                    ciudadElegida = Ciudades.Jamundi;
                    break;
                case 8: 
                    ciudadElegida = Ciudades.Buga;
                    break;
                case 9: 
                    ciudadElegida = Ciudades.Andalucia;
                    break;
                case 10: 
                    ciudadElegida = Ciudades.Bugalagrande;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            if (ciudadElegida != null) {
                if (candidatoModificar != null) {
                    candidatoModificar.setCiudades(ciudadElegida);
                }
            System.out.println("---Ideologia---");
            System.out.println();
            System.out.println("1. Derecha");
            System.out.println("2. Izquierda");
            System.out.print("Digite una Opcion: ");
            byte opcionIdeologia = scanner.nextByte();
            scanner.nextLine();
            Ideologia ideologiaElegida = null;
        
            switch (opcionIdeologia) {
                case 1:
                    ideologiaElegida = Ideologia.Derecha;
                    break;
                case 2:
                    ideologiaElegida = Ideologia.Izquierda;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                }
        
            Partidos partidoElegido = null;
        
            if (ideologiaElegida != null) {
                System.out.println();
                System.out.println("---Partidos politicos---");
                System.out.println();
                switch (ideologiaElegida) {
                    case Derecha:
                        System.out.println("1. Centro Democratico");
                        System.out.println("2. Partido Conservador");
                        System.out.println("3. Cambio Radical");
                        System.out.println("4. Partido de la U");
                        break;
                    case Izquierda:
                        System.out.println("1. Pacto Historico");
                        System.out.println("2. Partido Liberal");
                        System.out.println("3. Alianza Verde");
                        System.out.println("4. Polo Democratico");
                        System.out.println("5. Union Patriotica");
                        System.out.println("6. Fuerza de la Paz");
                        break;
                    }
        
                System.out.println("0. Salir");
                System.out.print("Digite una opcion: ");
                byte opcionPartido = scanner.nextByte();
                scanner.nextLine();
                System.out.println();
        
                switch (ideologiaElegida) {
                    case Derecha:
                        switch (opcionPartido) {
                            case 1:
                                partidoElegido = Partidos.Centro_Democratico;
                                break;
                            case 2:
                                partidoElegido = Partidos.Partido_Conservador;
                                break;
                            case 3:
                                partidoElegido = Partidos.Cambio_Radical;
                                break;
                            case 4:
                                partidoElegido = Partidos.Partido_De_la_U;
                                break;
                            case 0:
                                break;
                            default:
                                    System.out.println("Opcion incorrecta");
                            }
                            break;
                    case Izquierda:
                        switch (opcionPartido) {
                            case 1:
                                partidoElegido = Partidos.Pacto_Historico;
                                break;
                            case 2:
                                partidoElegido = Partidos.Partido_Liberal;
                                break;
                            case 3:
                                partidoElegido = Partidos.Alianza_Verde;
                                break;
                            case 4:
                                partidoElegido = Partidos.Polo_Democratico;
                                break;
                            case 5:
                                partidoElegido = Partidos.Union_Patriotica;
                                break;
                            case 6:
                                partidoElegido = Partidos.Fuerza_De_La_Paz;
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                            }
                        break; 
                    }
                }
        
                // Ahora tienes la ideología y el partido seleccionados
                System.out.println("Ideologia actualizada ");
                System.out.println("Partido actualizado ");
            }
        }

        
            System.out.print("Nuevas promesas: ");
            String nuevasPromesas = scanner.nextLine();
            candidatoModificar.setPromesas(nuevasPromesas);

            System.out.print("Nuevos votos: ");
            int votosActualizados = scanner.nextInt();
            candidatoModificar.setVotos(votosActualizados);
            

            System.out.print("");

            System.out.println("Candidato actualizado:");
            System.out.println("Nuevo nombre: " + candidatoModificar.getNombre());
            System.out.println("Nueva cedula: "+ candidatoModificar.getCedula());
            System.out.println("Nuvea ciudad: "+ candidatoModificar.getCiudades());
            System.out.println("Nueva ideologia: " + candidatoModificar.getIdeologia());
            System.out.println("Nuevo partido politico: " + candidatoModificar.getPartido());
            System.out.println("Nuevas promesas: " + candidatoModificar.getPromesas());
            System.out.println("Votos actualizados: " + candidatoModificar.getVotos());
        }
    
    public static Candidato buscarCandidatoPorCedula(List<Candidato> listaCandidato, String cedula) {
        for (Candidato candidato : listaCandidato) {
            if (candidato.getCedula().equals(cedula)) {
                return candidato;
            }
        }
        return null;
    }

    
}
