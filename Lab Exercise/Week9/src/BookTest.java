import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {

                Book[] books = new Book[5];
                books[0] = new Book("Java");
                books[1] = new Book("C++");
                books[2] = new Book("Python");
                books[3] = new Book("Javascript");
                books[4] = new Book("C#");
                Scanner in = new Scanner(System.in);
                while(true){
                    System.out.println("Please select operation: " +
                                    "1. Borrow. 2. Return. 3. Overdue. 0. To Stop the process");
                    int op = in.nextInt();
                    if (op == 0)
                        break;
                    switch (op) {
                        case 1:
                            borrowBook(in, books);
                            break;
                        case 2:
                            returnBook(in, books);
                            break;
                        case 3:
                            overdueAll(books);
                            break;
                    }
                }
    }
    public static void borrowBook(Scanner in, Book[] books) {
        ArrayList<Book> availableBook=new ArrayList<>();
        for (int sequenceInBook = 0; sequenceInBook <books.length ; sequenceInBook++) {
            if(books[sequenceInBook].getStatus().equals(BookStatus.IDLE)){
                availableBook.add(books[sequenceInBook]);
                System.out.printf("%s%n",books[sequenceInBook].toString());
            }
        }
        System.out.println("Please input the book id: ");
        int bookID = in.nextInt();

    }
    public static void returnBook(Scanner in, Book[] books) {
        //todo: return book
    }
    public static void overdueAll(Book[] books) {
        //todo: overdueAll
    }
}

