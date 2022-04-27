package U8.T2;



import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U8\\T1\\docPrueba.xml"));
            Node root = doc.getDocumentElement();
            NodeList nl = doc.getElementsByTagName("persona");
            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE){
                   Node nodeAux = nl.item(i);
                   Node elementoAux = doc.createComment("<!-- COMENTARIO AÑADIDO DESDE DOM -->");
                   root.insertBefore(elementoAux, nodeAux);
                }
            }
            Node n1 = doc.createElement("persona");
            root.appendChild(n1);
            Node anadirNombre = doc.createElement("nombre");
            anadirNombre.setTextContent("Oscar");
            Node anadirEdad = doc.createElement("edad");
            anadirEdad.setTextContent("24");
            root.getLastChild().appendChild(anadirNombre);
            root.getLastChild().appendChild(anadirEdad);

            Node nReemplazar1 = doc.createElement("persona");
            Node nReemplazar2 = doc.createElement("nombre");
            nReemplazar2.setTextContent("Luis");
            Node nReemplazar3 = doc.createElement("edad");
            nReemplazar3.setTextContent("53");
            nReemplazar1.appendChild(nReemplazar2);
            nReemplazar1.appendChild(nReemplazar3);
            root.replaceChild(nReemplazar1, nl.item(0));


            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer t = factory.newTransformer();
            DOMSource xml = new DOMSource(doc);
            StreamResult s = new StreamResult(new File("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U8\\T2\\dom_modificado.xml"));
            t.transform(xml,s);

        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            e.printStackTrace();
        }
    }
}



