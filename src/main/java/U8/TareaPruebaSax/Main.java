package U8.TareaPruebaSax;


import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();
            DefaultHandler personaSax = new PersonaSax();
            saxParser.parse(new File("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U8\\T1\\docPrueba.xml"), personaSax);
        } catch (SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }

        System.out.println(Persona.arrayPersonas);
    }
}
