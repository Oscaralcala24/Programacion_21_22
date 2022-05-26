package U9.U8U9_Examen.Ejercicio1;

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

    public static void anadirPiloto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre del piloto: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce edad del piloto: ");
        String edad = sc.nextLine();
        System.out.println("Introduce escuderia del piloto: ");
        String escuderia = sc.nextLine();
        System.out.println("Introduce campeonatos del piloto: ");
        String campeonatos = sc.nextLine();
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U9\\U8U9_Examen\\pilotos.xml");
            Node root = doc.getDocumentElement();
            Node node1 = doc.createElement("piloto");
            Node node2 = doc.createElement("nombre");
            node2.setTextContent(nombre);
            Node node3 = doc.createElement("edad");
            node3.setTextContent(edad);
            Node node4 = doc.createElement("escuderia");
            node4.setTextContent(escuderia);
            Node node5 = doc.createElement("campeonatos");
            node5.setTextContent(campeonatos);
            root.appendChild(node1);
            node1.appendChild(node2);
            node1.appendChild(node3);
            node1.appendChild(node4);
            node1.appendChild(node5);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }


    public static void anadirNodo(){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            NodeList nl = doc.getElementsByTagName("piloto");
            for (int i = 0; i < nl.getLength(); i++) {
                Node n1 = doc.createElement("origen");
                n1.setTextContent("Italia");
                nl.item(i).appendChild(n1);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static void escribirFichero(){
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");
            DOMSource origenDOM = new DOMSource(doc);
            File ficheroModificado = new File("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U9\\U8U9_Examen\\ejercicio1.xml");
            StreamResult destino = new StreamResult(ficheroModificado);
            transformer.transform(origenDOM, destino);

        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
