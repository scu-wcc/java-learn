package scu.wcc.arraylist.homework.librarysystem;

public class Book {
    private String id;
    private String bookName;
    private String writerName;
    private int price;

    public Book() {
    }

    public Book(String id, String bookName, String writerName, int price) {
        this.id = id;
        this.bookName = bookName;
        this.writerName = writerName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
