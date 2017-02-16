package labWork_2_12_1and2;

/**
 * Created by Bulik on 09.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        // lab 2_12_1
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Sasha", "0502313252");
        myPhoneBook.addPhoneNumber("Dasha", "0982316252");
        myPhoneBook.addPhoneNumber("Masha", "0992386252");
        myPhoneBook.addPhoneNumber("Ivan", "0932396862");
        myPhoneBook.addPhoneNumber("Vasya", "0939876352");

        myPhoneBook.printPhoneBook();
        // lab 2_12_2
        System.out.println("******************************************");

        myPhoneBook.addPhoneNumber("Alex", "0508531275");
        myPhoneBook.addPhoneNumber("Olga", "0736583276");
        myPhoneBook.addPhoneNumber("Igor", "0985789553");
        myPhoneBook.addPhoneNumber("Peter", "0968898696");
        myPhoneBook.addPhoneNumber("Vasya", "0987894552");

        myPhoneBook.printPhoneBook();
        myPhoneBook.sortByName();
        System.out.println("Sort by name :");
        myPhoneBook.printPhoneBook();

        myPhoneBook.sortByPhoneNumber();
        System.out.println("Sort by phone");
        myPhoneBook.printPhoneBook();
    }
}
