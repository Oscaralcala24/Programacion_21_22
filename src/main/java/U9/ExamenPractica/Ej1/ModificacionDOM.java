package U9.ExamenPractica.Ej1;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ModificacionDOM {
    static Document doc;

    public static void anadirLibro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce titulo del libro");
        String titulo = sc.nextLine();
        System.out.println("Introduce autor del libro");
        String autor = sc.nextLine();
        System.out.println("Introduce editorial del libro");
        String editorial = sc.nextLine();
        System.out.println("Introduce paginas del libro");
        String numPaginas = sc.nextLine();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\ExamenPractica\\prueba.xml");
            Node root = doc.getDocumentElement();
            Node node1 = doc.createElement("libro");
            Node node2 = doc.createElement("titulo");
            node2.setTextContent(titulo);
            Node node3 = doc.createElement("autor");
            node3.setTextContent(autor);
            Node node4 = doc.createElement("editorial");
            node4.setTextContent(editorial);
            Node node5 = doc.createElement("paginas");
            node5.setTextContent(numPaginas);
            root.appendChild(node1);
            node1.appendChild(node2);
            node1.appendChild(node3);
            node1.appendChild(node4);
            node1.appendChild(node5);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");
            DOMSource origenDOM = new DOMSource(doc);
            File nuevaCarta = new File("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\ExamenPractica\\prueba1.xml");
            StreamResult destino = new StreamResult(nuevaCarta);
            transformer.transform(origenDOM, destino);


            /*TransformerFactory factory = TransformerFactory.newInstance();
            Transformer t = factory.newTransformer();
            DOMSource xml = new DOMSource(doc);
            StreamResult s = new StreamResult(new File("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\ExamenPractica\\prueba1.xml"));
            t.transform(xml,s);*/

        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            e.printStackTrace();
        }
    }

    public static void anadirOrigenEditorial(){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            NodeList nl = doc.getElementsByTagName("editorial");
            for (int i = 0; i < nl.getLength(); i++) {
                Node node1 = doc.createElement("origen");
                node1.setTextContent("españa");
                nl.item(i).appendChild(node1);
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");
            DOMSource origenDOM = new DOMSource(doc);
            File nuevaCarta = new File("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\ExamenPractica\\prueba1.xml");
            StreamResult destino = new StreamResult(nuevaCarta);
            transformer.transform(origenDOM, destino);
        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }


}
