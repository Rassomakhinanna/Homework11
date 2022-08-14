import java.util.Objects;

public class Book {
    private final String titleBook;
    private int yearPublish;
    private final Author author;

    public Book(String titleBook, int yearPublish, Author author) {
        this.titleBook = titleBook;
        this.yearPublish = yearPublish;
        this.author = author;
    }

        public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("Книга \"%s\", опубликована в \"%s\", автор \"%s\"", titleBook, yearPublish, author);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublish == book.yearPublish && Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, author);
    }
}
