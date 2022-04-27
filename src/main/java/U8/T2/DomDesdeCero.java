package U8.T2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

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
import java.util.ArrayList;

public class DomDesdeCero {
    public static void main(String[] args) {
        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        Equipo e1 = new Equipo("Sevilla FC","Pepe Castro", "Ramon Sanchez Pizjuan", 3);
        Equipo e2 = new Equipo("Barcelona","Joan Laporta", "Camp nou", 2);
        Equipo e3 = new Equipo("Real Madrid","Florentino Perez", "Bernabeu", 1);
        Equipo e4 = new Equipo("Cadiz","Manuel Vizcaíno Fernández", "Nuevo Mirandilla", 17);
        Equipo e5 = new Equipo("Real Sociedad de Fútbol","Jokin Aperribay", "Reale Arena", 6);
        Equipo e6 = new Equipo("Club Atlético Osasuna","Luis Sabalza", "Estadio El SADAR", 9);
        Equipo e7 = new Equipo("Valencia Club de Fútbol","Peter Lim", "Estadio de Mestalla", 10);
        Equipo e8 = new Equipo("RCD Espanyol","Roger Guasch ", "RCDE Stadium", 13);
        Equipo e9 = new Equipo("Levante Unión Deportiva","Francisco Catalán", " Estadio Ciudad de Valencia", 19);
        Equipo e10 = new Equipo("Granada Club de Fútbol","Quique Pina", "Estadio Nuevo Los Cármenes", 18);

        listaEquipos.add(e1);
        listaEquipos.add(e2);
        listaEquipos.add(e3);
        listaEquipos.add(e4);
        listaEquipos.add(e5);
        listaEquipos.add(e6);
        listaEquipos.add(e7);
        listaEquipos.add(e8);
        listaEquipos.add(e9);
        listaEquipos.add(e10);
        System.out.println(listaEquipos);
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            Element root = doc.createElement("Liga");
            for (int i = 0; i < listaEquipos.size(); i++) {
                Element nAux = doc.createElement("equipo");
                Element nombre = doc.createElement("nombre");
                Element presidente = doc.createElement("presidente");
                Element estadio = doc.createElement("estadio");
                Element puesto = doc.createElement("puesto");
                nombre.setTextContent(listaEquipos.get(i).getNombre());
                presidente.setTextContent(listaEquipos.get(i).getPresidente());
                estadio.setTextContent(listaEquipos.get(i).getEstadio());
                puesto.setTextContent(String.valueOf(listaEquipos.get(i).getPuesto()));
                nAux.appendChild(nombre);
                nAux.appendChild(presidente);
                nAux.appendChild(estadio);
                nAux.appendChild(puesto);
                root.appendChild(nAux);
            }
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            DOMSource xml = new DOMSource(doc);
            StreamResult s = new StreamResult(new File("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U8\\T2\\domcero.xml"));
            transformer.transform(xml,s);
        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }


    }
}
