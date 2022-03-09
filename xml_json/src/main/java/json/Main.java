package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.model.Books;

import java.io.File;
import java.io.IOException;

public class Main {

    private static final String FILE_NAME = "./books.json";

    private static void toJson(Books books) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(FILE_NAME), books);
        System.out.println("JSON created.");
    }

    private static Books toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(FILE_NAME), Books.class);
    }

    public static void main(String[] args) throws IOException {
        Books first = new Books(1, "Cat", 2010, 100);
        toJson(first);
        System.out.println("Записали.");
        Books books = toJavaObject();
        System.out.println(books);
    }
}
