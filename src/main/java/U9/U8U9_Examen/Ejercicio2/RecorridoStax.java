package U9.U8U9_Examen.Ejercicio2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecorridoStax {
    public static void mostrarMasCampeonatos(){
        String nombre = "";
        String edad = "";
        String escuderia = "";
        int campeonatos = 0 ;
        String nombreAux = "";
        String edadAux = "";
        String escuderiaAux = "";
        int campeonatosAux = 0;
        String etiqueta = "";
        Characters character = null;

        try{
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U9\\U8U9_Examen\\pilotos.xml"));
            while (xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();
                if (xmlEvent.isStartElement()){
                    StartElement etiquetaAbre = xmlEvent.asStartElement();
                    etiqueta = String.valueOf(etiquetaAbre.getName().getLocalPart());
                }else if (xmlEvent.isCharacters()){
                    character = xmlEvent.asCharacters();
                    if (etiqueta.equalsIgnoreCase("nombre")){
                        nombre = character.getData();
                        etiqueta = "";
                    }else if (etiqueta.equalsIgnoreCase("edad")){
                        edad = character.getData();
                        etiqueta = "";
                    }else if (etiqueta.equalsIgnoreCase("escuderia")){
                        escuderia = character.getData();
                        etiqueta = "";
                    }else if (etiqueta.equalsIgnoreCase("campeonatos")){
                        campeonatos = Integer.parseInt(character.getData());
                        etiqueta = "";
                    }
                }
                if (campeonatos > campeonatosAux){
                    nombreAux = nombre;
                    edadAux = edad;
                    escuderiaAux = escuderia;
                    campeonatosAux = campeonatos;
                }
            }
            System.out.println("El piloto con mas campeonatos es " + nombreAux + " que tiene " + edadAux +
                    " años, esta en la escuderia " + escuderiaAux + " con un total de " + campeonatosAux + " campeonatos");
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void numPilotosEscuderia(){
        String etiqueta = "";
        String escuderiaAux = "";
        Characters character = null;
        int numPilotos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una escuderia: ");
        String escuderia = sc.nextLine();
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U9\\U8U9_Examen\\pilotos.xml"));
            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement etiquetaAbre = xmlEvent.asStartElement();
                    etiqueta = String.valueOf(etiquetaAbre.getName().getLocalPart());
                }else if (xmlEvent.isCharacters()){
                    character = xmlEvent.asCharacters();
                    if (etiqueta.equalsIgnoreCase("escuderia")){
                        escuderiaAux = character.getData();
                        if (escuderiaAux.equalsIgnoreCase(escuderia)){
                            numPilotos++;
                        }
                    }
                }
            }
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("La escuderia " + escuderia + " tiene " + numPilotos + " pilotos");
    }
}
