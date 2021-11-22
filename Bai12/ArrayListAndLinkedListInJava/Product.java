package Bai12.ArrayListAndLinkedListInJava;
class Product {
    private String name;
    private int id;
    private int price;
    public static int idnumber = 1;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.id = idnumber++;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getIdnumber() {
        return idnumber;
    }

    public static void setIdnumber(int idnumber) {
        Product.idnumber = idnumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
