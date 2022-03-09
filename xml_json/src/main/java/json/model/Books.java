package json.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Books {

    @JsonProperty("Articyl")
    private int articyl;
    @JsonProperty("First name")
    private String name;
    @JsonProperty("Year")
    private int year;

    @JsonIgnore
    private int price;

    public Books() {

    }

    public Books(int articyl, String name, int year, int price) {
        this.articyl = articyl;
        this.name = name;
        this.year = year;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "articyl=" + articyl +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
