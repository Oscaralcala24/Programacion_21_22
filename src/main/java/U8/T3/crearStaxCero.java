package U8.T3;

import U8.T2.Equipo;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class crearStaxCero {
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

        try{
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U8\\T3\\stax.xml"));
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();
            StartDocument comienzoDocumento = eventFactory.createStartDocument();
            xmlWriter.add(comienzoDocumento);
            Characters saltoLinea = eventFactory.createCharacters("\n");
            Characters saltoLineaTab = eventFactory.createCharacters("\n\t");
            xmlWriter.add(saltoLinea);
            StartElement ligacomienzo = eventFactory.createStartElement("", "", "liga");
            EndElement ligafinal = eventFactory.createEndElement("", "", "liga");
            xmlWriter.add(ligacomienzo);
            xmlWriter.add(saltoLineaTab);
            for (int i = 0; i < listaEquipos.size(); i++) {
                StartElement equipoElementoA = eventFactory.createStartElement("","","equipo");
                xmlWriter.add(saltoLineaTab);

                StartElement nombreEquipoA = eventFactory.createStartElement("","","nombre");
                StartElement presidenteEquipoA = eventFactory.createStartElement("","","presidente");
                StartElement estadioEquipoA = eventFactory.createStartElement("","","estadio");
                StartElement puestoEquipoA = eventFactory.createStartElement("","","puesto");
                EndElement equipoElementoC = eventFactory.createEndElement("","","equipo");
                EndElement nombreEquipoC = eventFactory.createEndElement("","","nombre");
                EndElement presidenteEquipoC = eventFactory.createEndElement("","","presidente");
                EndElement estadioEquipoC = eventFactory.createEndElement("","","estadio");
                EndElement puestoEquipoC = eventFactory.createEndElement("","","puesto");

                Characters contenidoNombre = eventFactory.createCharacters(listaEquipos.get(i).getNombre());
                Characters contenidoPresidente = eventFactory.createCharacters(listaEquipos.get(i).getPresidente());
                Characters contenidoEstadio = eventFactory.createCharacters(listaEquipos.get(i).getEstadio());
                Characters contenidoPuesto = eventFactory.createCharacters(String.valueOf(listaEquipos.get(i).getPuesto()));

                xmlWriter.add(equipoElementoA);

                xmlWriter.add(nombreEquipoA);
                xmlWriter.add(contenidoNombre);
                xmlWriter.add(nombreEquipoC);

                xmlWriter.add(presidenteEquipoA);
                xmlWriter.add(contenidoPresidente);
                xmlWriter.add(presidenteEquipoC);

                xmlWriter.add(estadioEquipoA);
                xmlWriter.add(contenidoEstadio);
                xmlWriter.add(estadioEquipoC);

                xmlWriter.add(puestoEquipoA);
                xmlWriter.add(contenidoPuesto);
                xmlWriter.add(puestoEquipoC);

                xmlWriter.add(equipoElementoC);



            }

            xmlWriter.add(ligafinal);

            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);
            xmlWriter.close();


        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
