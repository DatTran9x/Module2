package Bai12.ArrayListAndLinkedListInJava;

import java.util.*;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();
//    LinkedList<Product> products = new LinkedList<>();
    Comparator comparator = new Comparator();
    ComparatorReverse comparatorReverse = new ComparatorReverse();

    void menu() {
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Them san pham");
            System.out.println("2.Sua thong tin san pham theo ID");
            System.out.println("3.Xoa san pham theo ID");
            System.out.println("4.Hien thi danh sach san pham");
            System.out.println("5.Tim kiem san pham theo ten");
            System.out.println("6.Sap xep san pham theo gia tang dan,giam dan");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showProducts();
                    break;
                case 5:
                    searchByName();
                    break;
                case 6:
                    sortByPrice();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap lai");
            }
        }
    }

    void addNewProduct() {
        Product newProduct = createNewProduct();
        products.add(newProduct);
    }

    Product createNewProduct() {
        System.out.println("Nhap ten san pham");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham");
        int price = scanner.nextInt();
        return new Product(name, price);
    }

    void editProduct() {
        int index = searchProduct();
        if (index == -1) return;
        int tempID = products.get(index).getId();
        products.set(index, createNewProduct());
        products.get(index).setId(tempID);

        Product.setIdnumber(Product.getIdnumber() - 1);
    }

    int searchProduct() {
        System.out.println("Xin nhap ID san pham");
        int id = scanner.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        System.out.println("Khong tim thay san pham");
        return -1;
    }

    void deleteProduct() {
        int index = searchProduct();
        if (index == -1) return;
        products.remove(index);
    }

    void showProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    void searchByName(){
        System.out.println("Xin nhap ten san pham");
        scanner.nextLine();
        String name  = scanner.nextLine();
        boolean check = true;
        for (Product product : products) {
            if (Objects.equals(product.getName(), name)) {
                System.out.println(product);
                check = false;
            }
        }
        if (check) System.out.println("Khong tim thay san pham");
    }

    void sortByPrice(){
        System.out.println("1.Gia tang dan");
        System.out.println("2.Gia giam dan");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                priceGoUp();
                break;
            case 2:
                priceGoDown();
                break;
            default:
                System.out.println("Vui long chon lai");
        }
    }

    void priceGoUp(){
        products.sort(comparator);
    }

    void priceGoDown(){
        products.sort(comparatorReverse);
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.menu();
    }
}
