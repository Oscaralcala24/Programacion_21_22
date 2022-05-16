package U8.U8_Entregable;

import com.google.gson.Gson;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessPosts {
    static Document doc;
    static ArrayList<Post> listaPost = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------METODO PARSEDOM----------------------------------");
        parseDOM("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U8\\U8_Entregable\\posts.xml");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta titulo: ");
        String title = sc.nextLine();
        System.out.println("Inserta link: ");
        String link= sc.nextLine();
        System.out.println("Inserta descripcion: ");
        String description = sc.nextLine();
        System.out.println("Inserta fecha: ");
        String pubdate = sc.nextLine();
        System.out.println("Inserta id: ");
        String guid = sc.nextLine();
        Post p = new Post(title,link,description,pubdate,guid);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------METODO ADDPOST----------------------------------");
        addPost(p);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------METODO GETPOST----------------------------------");
        listaPost = getPosts();
        System.out.println(listaPost);
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------METODO CONVERTTOJSON----------------------------------");
        System.out.println(convertToJSON());
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------METODO NUMPOSTSSTAX----------------------------------");
        System.out.println(numPostsStax("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U8\\U8_Entregable\\posts.xml"));
    }

    private static int numPostsStax(String s) {
        int contadorPost = 0;
        try{
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(s));
            while (xmlEventReader.hasNext()){
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()){
                    StartElement comienzoElemento = xmlEvent.asStartElement();
                    String etiqueta = comienzoElemento.getName().getLocalPart();
                    if (etiqueta.equals("post")){
                        contadorPost++;
                    }
                }
            }
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return contadorPost;
    }

    private static String convertToJSON() {
        Gson gson = new Gson();
        String cadenaJson = gson.toJson(listaPost);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U8\\U8_Entregable\\posts.json"))) {
            bw.write(cadenaJson);
            System.out.println("Fichero creado");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return cadenaJson;
    }

    private static ArrayList<Post> getPosts() {
        ArrayList<Post> arrayPost = new ArrayList<>();
        NodeList nl1 = doc.getElementsByTagName("post");
        for (int i = 0; i < nl1.getLength(); i++) {
            if (nl1.item(i).getNodeType() == Node.ELEMENT_NODE){
                Post p = new Post();
                NodeList nl2 = nl1.item(i).getChildNodes();
                for (int j = 0; j < nl2.getLength(); j++) {
                    if (nl2.item(j).getNodeType() == Node.ELEMENT_NODE){
                        Element e = (Element) nl2.item(j);
                        if (e.getTagName().equals("title")){
                            p.setTitle(e.getTextContent());
                        }else if (e.getTagName().equals("link")){
                            p.setLink(e.getTextContent());
                        }else if (e.getTagName().equals("description")){
                            p.setDescription(e.getTextContent());
                        }else if (e.getTagName().equals("pubDate")){
                            p.setPubdate(e.getTextContent());
                        }else if (e.getTagName().equals("guid")){
                            p.setGuid(e.getTextContent());
                        }
                    }
                }
                arrayPost.add(p);
            }
        }
        return arrayPost;
    }

    private static void addPost(Post p) {
        System.out.println(p);
        Node root = doc.getDocumentElement();
        Node postAnadir = doc.createElement("post");
        Node titleAnadir = doc.createElement("title");
        titleAnadir.setTextContent(p.getTitle());
        Node linkAnadir = doc.createElement("link");
        linkAnadir.setTextContent(p.getLink());
        Node descripcionAnadir = doc.createElement("descripcion");
        descripcionAnadir.setTextContent(p.getDescription());
        Node pubDateAnadir = doc.createElement("pubDate");
        pubDateAnadir.setTextContent(p.getPubdate());
        Node guidAnadir = doc.createElement("guid");
        guidAnadir.setTextContent(p.getGuid());
        postAnadir.appendChild(titleAnadir);
        postAnadir.appendChild(linkAnadir);
        postAnadir.appendChild(descripcionAnadir);
        postAnadir.appendChild(pubDateAnadir);
        postAnadir.appendChild(guidAnadir);
        root.appendChild(postAnadir);
    }

    private static void parseDOM(String s) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new File(s));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
