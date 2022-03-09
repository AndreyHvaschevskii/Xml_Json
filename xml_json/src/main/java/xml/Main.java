package xml;

import xml.model.Book;
import xml.model.Library;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    private static final String FILE_NAME = "./test.xml";

    private Library createJavaObject() {
        Library library = new Library();
        library.setName("Library One");
        library.getBookList().add(new Book(1, "Ono", 2001));
        library.getBookList().add(new Book(2, "Sea", 2010));
        library.getBookList().add(new Book(3, "Cat", 2005));
        return library;
    }

    private void marshall() {
        try {
            JAXBContext context = JAXBContext.newInstance(Library.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(createJavaObject(), new File(FILE_NAME));
        } catch (JAXBException e) {
            System.out.println("Something wrong while marshalling");
        }
    }

    private Library unmarshall() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Library.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Library) unmarshaller.unmarshal(new File(FILE_NAME));
    }

    public static void main(String[] args) throws JAXBException {
        Main instance = new Main();
        instance.marshall();
        System.out.println(instance.unmarshall());
        System.out.println("End.");
    }
}