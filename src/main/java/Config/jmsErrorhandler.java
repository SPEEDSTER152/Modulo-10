package Config;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


public class jmsErrorhandler implements ErrorHandler {

    public void handleError(Throwable throwable){
        System.out.println("Erro ao processar");
        throwable.getMessage();
    }

    @Override
    public void warning(SAXParseException exception) throws SAXException {

    }

    @Override
    public void error(SAXParseException exception) throws SAXException {

    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {

    }
}
