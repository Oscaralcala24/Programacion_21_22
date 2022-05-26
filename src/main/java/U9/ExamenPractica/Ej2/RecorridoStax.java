package U9.ExamenPractica.Ej2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoStax {
    public static void main(String[] args) {
        String titulo = "";
        String autor = "";
        String editorial = "";
        int paginas = 0;
        String tituloAux = "";
        String autorAux = "";
        String editorialAux = "";
        int paginasAux = 0;
        String etiqueta = "";
        Characters character = null;
        try{
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\ExamenPractica\\prueba.xml"));
            while (xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();
                if (xmlEvent.isStartElement()){
                    StartElement etiquetaAbrir = xmlEvent.asStartElement();
                    etiqueta = String.valueOf(etiquetaAbrir.getName().getLocalPart());
                }else if (xmlEvent.isCharacters()){
                     character = xmlEvent.asCharacters();
                     if (etiqueta.equalsIgnoreCase("titulo")){
                         titulo = character.getData();
                         etiqueta = "";
                     }else if (etiqueta.equalsIgnoreCase("autor")){
                         autor = character.getData();
                         etiqueta = "";
                     }else if (etiqueta.equalsIgnoreCase("editorial")){
                         editorial = character.getData();
                         etiqueta = "";
                     }else if (etiqueta.equalsIgnoreCase("paginas")){
                         paginas = Integer.parseInt(character.getData());
                         etiqueta = "";
                     }
                }
                if (paginas > paginasAux){
                    tituloAux = titulo;
                    autorAux = autor;
                    editorialAux = editorial;
                    paginasAux = paginas;
                }
            }
            System.out.println(tituloAux);
            System.out.println(autorAux);
            System.out.println(editorialAux);
            System.out.println(paginasAux);
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
