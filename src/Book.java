public class Book {
    public String title;
    public Author author;
    public Integer publishingYear;

    public Book(String title, Author author, Integer publishingYear ){
    this.title = title;
    this.author = author;
    this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }
}
