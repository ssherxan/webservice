package Entyti;

public class Product {
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String article;
    private String picture;
    private  int price;
    private String catalog;

    public Product() {
    }

    public Product(String name, String article, String picture, String catalog,int price) {
        this.name = name;
        this.article = article;
        this.picture = picture;
        this.price = price;
        this.catalog = catalog;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", article='" + article + '\'' +
                ", picture='" + picture + '\'' +
                ", price=" + price +
                '}';
    }
}
