package U8.TareaPruebaDom;

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
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U8\\T1\\docPrueba.xml"));
            NodeList nl = doc.getElementsByTagName("persona");
            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Persona p = new Persona();
                    NodeList nl1 = nl.item(i).getChildNodes();
                    for (int j = 0; j < nl1.getLength(); j++) {
                        if (nl1.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element e = (Element) nl1.item(j);
                            if (e.getTagName().equals("nombre")) {
                                p.setNombre(e.getTextContent());
                            } else if (e.getTagName().equals("edad")) {
                                p.setEdad(Integer.parseInt(e.getTextContent()));
                            }
                        }
                    }
                    System.out.println(p);
                    Persona.arrayPersonas.add(p);
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }

        System.out.println(Persona.arrayPersonas);
    }
}
