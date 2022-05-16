package U8.DOM;

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

public class Main {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db. parse(new File("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U8\\SAX\\menu.xml"));

            NodeList nl = doc.getElementsByTagName("comida");
            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE){
                    Comida c = new Comida();
                    NodeList nl1 = nl.item(i).getChildNodes();
                    for (int j = 0; j <  nl1.getLength(); j++) {
                        if (nl1.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element e = (Element) nl1.item(j);
                            if (e.getTagName().equals("nombre")){
                                c.setNombre(e.getTextContent());
                            }else if (e.getTagName().equals("precio")){
                                c.setPrecio(Double.parseDouble(e.getTextContent()));
                            }else if (e.getTagName().equals("descripcion")){
                                c.setDescripcion(e.getTextContent());
                            }else if (e.getTagName().equals("calorias")){
                                c.setCalorias(Integer.parseInt(e.getTextContent()));
                            }
                        }
                    }
                    Comida.arrayComida.add(c);
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        System.out.println(Comida.arrayComida);
    }
}
