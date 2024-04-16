public class Book {
    private int id;
    private String name;
    private BookStatus status;
    private static int count = 0;

    public Book(String name) {
        this.name = name;
        this.id = ++count;
        status = BookStatus.IDLE;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BookStatus getStatus() {
        return status;
    }

    public static int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public static void setCount(int count) {
        Book.count = count;
    }
    public String toString(){
        return String.format("[%d][%s][%s]",this.id,this.name,this.status.name());
    }
}
