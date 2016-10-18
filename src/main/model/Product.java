package main.model;

/**
 * Created by Admin on 16.10.2016.
 */
public class Product {
    private int id;
    private String name;
    private long price;



    public Product() {
    }

    public Product(int id ,String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return name != null ? name.equals(product.name) : product.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", price= " + price +
                '}';
    }
}
