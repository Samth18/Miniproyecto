import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Crud {
    static ArrayList <Candidato> listaCandidato = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void limparPantalla() {  //Método para limpiar la pantalla 
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void crearCandidato(){
        limparPantalla();
        System.out.println("---CREAR CANDIDATO---");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el nombre del candidato: ");
        String nombre = scanner.nextLine();
        System.out.println();

        System.out.print("Digite la cedula del candidato: ");
        String cedula = scanner.nextLine();
        System.out.println();
        
        limparPantalla();
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

        limparPantalla();
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
            
        limparPantalla();    
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
                default: System.out.println("Opcion incorrecta");}
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
        limparPantalla();
    }

    public static void leerCandidato(){
        limparPantalla();
        System.out.println("---CANDIDATOS ACTIVOS---\n");
        listaCandidato.forEach((i)->{
            System.out.println("Nombre del candidato: " + i.getNombre());
            System.out.println("Numero de cedula del candidato: " + i.getCedula());
            System.out.println("Ciudad de procedencia del candidato: " + i.getCiudades());
            System.out.println("La ideologia del candidato: " + i.getIdeologia());
            System.out.println("Partido politico del candidato: " + i.getPartido());
            System.out.println("Las promesas del candidato: " + i.getPromesas());
            System.out.println("Numero de votos del candidato: " + i.getVotos());
            System.out.println("------------------------------\n");
        });
    }

    public static void EliminarCandidato() {
        limparPantalla();
        Scanner scannerEliminar = new Scanner(System.in);

        System.out.print("Digite la cedula del candidato que desea eliminar: ");
        String cedulaEliminar = scannerEliminar.nextLine();

        eliminarCandidato(cedulaEliminar);

        leerCandidato();// Llamar al método para mostrar la lista actualizada
    }

    // Método de elminar candidato por medio de la cedula
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
// Método para actualizar candidato
    public static void ActualizarCandidato(){
        limparPantalla();
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

            limparPantalla();
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
                case 1 :ciudadElegida = Ciudades.Cali; break;
                case 2: ciudadElegida = Ciudades.Palmira;break;
                case 3: ciudadElegida = Ciudades.Yumbo; break;
                case 4: ciudadElegida = Ciudades.Tuluá; break;
                case 5: ciudadElegida = Ciudades.Buenaventura; break;
                case 6: ciudadElegida = Ciudades.Cartago; break;
                case 7: ciudadElegida = Ciudades.Jamundi; break;
                case 8: ciudadElegida = Ciudades.Buga; break;
                case 9: ciudadElegida = Ciudades.Andalucia; break;
                case 10: ciudadElegida = Ciudades.Bugalagrande; break;
                case 0: break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            if (ciudadElegida != null) {
                if (candidatoModificar != null) {
                    candidatoModificar.setCiudades(ciudadElegida);
                }
            limparPantalla();    
            System.out.println("---Ideologia---");
            System.out.println();
            System.out.println("1. Derecha");
            System.out.println("2. Izquierda");
            System.out.print("Digite una Opcion: ");
            byte opcionIdeologia = scanner.nextByte();
            scanner.nextLine();
            Ideologia ideologiaElegida = null;
        
            switch (opcionIdeologia) {
                case 1: ideologiaElegida = Ideologia.Derecha; break;
                case 2: ideologiaElegida = Ideologia.Izquierda; break;
                default: System.out.println("Opcion incorrecta");
                }
        
            Partidos partidoElegido = null;

            limparPantalla();    
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

                if (ciudadElegida != null) {
                    if (candidatoModificar != null) {
                        candidatoModificar.setIdeologia(ideologiaElegida);
                    }
                } 

                switch (ideologiaElegida) {
                    case Derecha:
                        switch (opcionPartido) {
                            case 1: partidoElegido = Partidos.Centro_Democratico; break;
                            case 2: partidoElegido = Partidos.Partido_Conservador; break;
                            case 3: partidoElegido = Partidos.Cambio_Radical; break;
                            case 4: partidoElegido = Partidos.Partido_De_la_U; break;
                            case 0: break;
                            default:System.out.println("Opcion incorrecta"); 
                        } break;

                    case Izquierda:
                        switch (opcionPartido) {
                            case 1: partidoElegido = Partidos.Pacto_Historico; break;
                            case 2: partidoElegido = Partidos.Partido_Liberal; break;
                            case 3: partidoElegido = Partidos.Alianza_Verde; break;
                            case 4: partidoElegido = Partidos.Polo_Democratico; break;
                            case 5: partidoElegido = Partidos.Union_Patriotica; break;
                            case 6: partidoElegido = Partidos.Fuerza_De_La_Paz; break;
                            case 0:break;
                            default: System.out.println("Opcion incorrecta"); 
                        } break; 
                    }                
                    if (ciudadElegida != null) {
                        if (candidatoModificar != null) {
                            candidatoModificar.setPartido(partidoElegido);
                        } 
                    }
                }
                System.out.println("Ideologia actualizada ");
                System.out.println("Partido actualizado ");
            }
        }   
            limparPantalla();
            System.out.print("Nuevas promesas: ");
            String nuevasPromesas = scanner.nextLine();
            candidatoModificar.setPromesas(nuevasPromesas);
            System.out.println();

            System.out.print("Nuevos votos: ");
            int votosActualizados = scanner.nextInt();
            candidatoModificar.setVotos(votosActualizados);
            
            System.out.print("");

            System.out.println("Candidato actualizado:\n");
            System.out.println("Nuevo nombre: " + candidatoModificar.getNombre());
            System.out.println("Nueva cedula: "+ candidatoModificar.getCedula());
            System.out.println("Nuvea ciudad: "+ candidatoModificar.getCiudades());
            System.out.println("Nueva ideologia: " + candidatoModificar.getIdeologia());
            System.out.println("Nuevo partido politico: " + candidatoModificar.getPartido());
            System.out.println("Nuevas promesas: " + candidatoModificar.getPromesas());
            System.out.println("Votos actualizados: " + candidatoModificar.getVotos() + "\n");
        }
    
    public static Candidato buscarCandidatoPorCedula(List<Candidato> listaCandidato, String cedula) {
        limparPantalla();
        for (Candidato candidato : listaCandidato) {
            if (candidato.getCedula().equals(cedula)) {
                return candidato;
            }
        }
        return null;
    }

    public static void reporte(){
    
        System.out.println("-----VOTOS DE LOS CANDIDATOS-----\n");
        for (Candidato candidato : listaCandidato) {
        System.out.println(candidato.getNombre() + ": " + candidato.getVotos() + " votos");
        System.out.println();
    }
    }

    public static void candidatoGanador(List<Candidato> candidatos){
        if(listaCandidato.isEmpty()){
            System.out.println("No hay candidatos por mostrar");
        }
        
        Candidato candidatoConMasVotos = listaCandidato.get(0);

        
        for (Candidato candidato : listaCandidato) {
            if (candidato.getVotos() > candidatoConMasVotos.getVotos()) {
                candidatoConMasVotos = candidato;
            } 
        }
        System.out.println("-----CANDIDATO GANADOR-----\n");
        System.out.println("El Candidato ganador es " + candidatoConMasVotos.getNombre() + " con " + candidatoConMasVotos.getVotos() + " votos." );
        System.out.println();

    }
    public static void top3Ciudades(List<Candidato> listaCandidato){
        
        if (listaCandidato.isEmpty()) {
            System.out.println("No hay nada mi rey");
        }
        Map<Ciudades, Integer> contadorCiudades = new HashMap<>(); //Permite representar una estructura de datos para almacenar pares “clave/valor".

        System.out.println("---CIUDADES CON MENOS CANDIDATOS DE ORIGEN---\n");
        for (Candidato candidato : listaCandidato){
            Ciudades ciudad = candidato.getCiudades();
            contadorCiudades.put(ciudad, contadorCiudades.getOrDefault(ciudad, 0) + 1); 
        }

        List<Map.Entry<Ciudades, Integer>> listaOrdenada = contadorCiudades.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        
        int top = Math.min(3, listaOrdenada.size());

        
        for (int i = 0; i < top; i++) {
            Map.Entry<Ciudades, Integer> entry = listaOrdenada.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue() + " candidatos");
            System.out.println("");
        }
        
    }
    
    public static Partidos partidoConMasCandidatos(List<Candidato> listaCandidato) {
        Map<Partidos, Integer> conteoPartidos = new HashMap<>();
        
        for (Candidato candidato : listaCandidato) {
            
            conteoPartidos.put(candidato.getPartido(), conteoPartidos.getOrDefault(candidato.getPartido(), 0) + 1);
        }

        Partidos partidoMasCandidatos = null;
        int maxCandidatos = 0;
        
        for (Map.Entry<Partidos, Integer> entry : conteoPartidos.entrySet()) {
            if (entry.getValue() > maxCandidatos) {
                maxCandidatos = entry.getValue();
                partidoMasCandidatos = entry.getKey();
            }
        }

        System.out.println("Partido con más candidatos:\n " + partidoMasCandidatos);
        System.out.println();
		return null;
    }
}
