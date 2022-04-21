package U8.TareaPruebaSax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PersonaSax extends DefaultHandler {

    private Persona p;
    static String contenido;

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Comienzo del parseado del documento personasXML.xml");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Fin del parseado del documento personasXML.xml");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        if (qName.equals("persona")){
            p = new Persona();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if (qName.equals("nombre")){
            p.setNombre(contenido);
        }else if (qName.equals("edad")){
            p.setEdad(Integer.parseInt(contenido));
        }
        if (qName.equals("persona")){
            Persona.arrayPersonas.add(p);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        String content = new String(ch, start, length);
        contenido = content;
    }
}
