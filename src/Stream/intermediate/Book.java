package Stream.intermediate;

public class Book {
    String title;
    double price;
    int publishedYear;
    String category;

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    Book(String title, double price, String category, int publishedYear){
        this.title=title;
        this.price=price;
        this.category=category;
        this.publishedYear=publishedYear;


    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", publishedYear=" + publishedYear +
                ", category='" + category + '\'' +
                '}';
    }
}
