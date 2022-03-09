package xml.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"articyl", "name", "year"}, name = "book")
public class Book {
    private int articyl;
    private String name;
    private int year;

    public Book(int articyl, String name, int year) {
        this.articyl = articyl;
        this.name = name;
        this.year = year;
    }

    public int getArticyl() {
        return articyl;
    }

    public void setArticyl(int articyl) {
        this.articyl = articyl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "articyl=" + articyl +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

