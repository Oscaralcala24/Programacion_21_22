package U8.SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ComidaSax extends DefaultHandler {
    Comida c;
    String contenido;

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if (qName.equals("comida")){
            c = new Comida();
            c.setId(Integer.parseInt(attributes.getValue("id")));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if (qName.equals("nombre")){
            c.setNombre(contenido);
        }
        if (qName.equals("precio")){
            c.setPrecio(Double.parseDouble(contenido));
        }
        if (qName.equals("descripcion")){
            c.setDescripcion(contenido);
        }
        if (qName.equals("calorias")){
            c.setCalorias(Integer.parseInt(contenido));
        }
        if (qName.equals("comida")){
            Comida.arrayComida.add(c);
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        contenido = new String(ch,start,length);
    }
}
