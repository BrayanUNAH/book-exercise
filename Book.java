/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private int borrowed;

    /**
        La clase no es inmutable, debido a que aún se puede modificar el
        atributo "borrowed". Para que los objetos sean inmutables es
        necesario que no haya ni un método que cambie el estado del
        objeto.        
    */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        borrowed = 0;
    }

    // Add the methods here ...
    public void printAutor()
    {
        System.out.println("Author: " + this.author);
    }
    
    public void printTitle()
    {
        System.out.println("Title: " + this.title);
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void borrow()
    {
        borrowed++;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void printDetail()
    {
        String detail = "------------------\n" +
                        "Autor: " + author +
                        "\nTitle: " + title +
                        "\nPages: " + pages +
                        "\nBorrowed: " + borrowed +
                        "\n------------------";
        System.out.println(detail);
    }
}
