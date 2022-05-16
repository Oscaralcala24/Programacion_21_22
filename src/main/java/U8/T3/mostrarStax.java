package U8.T3;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mostrarStax {
    public static void main(String[] args) {
        String tagActual = "";
        int contador = 0;
        int puesto = 0;
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U8\\T3\\stax.xml"));
            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();
                System.out.println(xmlEvent);
                if (xmlEvent.isStartElement()) {
                    StartElement etiquetaAbrir = xmlEvent.asStartElement();
                    String etiqueta = String.valueOf(etiquetaAbrir.getName().getLocalPart());
                    if (etiqueta.equalsIgnoreCase("equipo")) {
                        contador++;
                    }else if (etiqueta.equalsIgnoreCase("puesto")) {
                        XMLEvent xmlEvent2 = xmlReader.nextEvent();
                        if (xmlEvent.isCharacters()){
                            Characters c = xmlEvent2.asCharacters();
                            String texto = c.getData();
                            puesto += Integer.parseInt(texto);
                        }
                    }
                }
            }
            System.out.println(puesto);
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}