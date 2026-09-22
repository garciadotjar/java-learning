package p06_regex.domain;

public class Product {
    public String name;
    public Double price;
    public String code;
    public Integer year;

    public Product(String name, Double price, String code, Integer year) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", code='" + code + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
