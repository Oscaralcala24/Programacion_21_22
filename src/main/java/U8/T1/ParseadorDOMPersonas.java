package U8.T1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseadorDOMPersonas {

    public static void parse(String nomFile) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U8\\T1\\" + nomFile));
            NodeList node1 = doc.getElementsByTagName("persona");
            for (int i = 0; i < node1.getLength(); i++) {
                Node nodo1 = node1.item(i);
                System.out.println("Estos son los atributos: " + nodo1.hasAttributes());
                Element elemento1 = (Element) node1.item(i);
                System.out.println("Estoy en una etiqueta: " + elemento1.getTagName());
                if (nodo1.getNodeType() == Node.ELEMENT_NODE) {
                    NodeList listaInterior = nodo1.getChildNodes();
                    for (int j = 0; j < listaInterior.getLength(); j++) {
                        if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element eHijo = (Element) listaInterior.item(j);
                            System.out.println("Uno de los nodos hijos es la etiqueta " + eHijo.getTagName());
                            System.out.println("Cuyo contenido es: " + eHijo.getTextContent());
                        }
                    }
                }

            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
