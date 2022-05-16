package U8.SAX;

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
            DefaultHandler comidaSax = new ComidaSax();
            saxParser.parse(new File("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U8\\SAX\\menu.xml"), comidaSax);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        System.out.println(Comida.arrayComida);
    }


}
