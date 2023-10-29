public class Header {
    public String title;
    public String author;
    public String date;
    public String description;

    public Header(String title, String author, String date, String description) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nDate: " + date + "\nDescription: " + description;
    }
}
