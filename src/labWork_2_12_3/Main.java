package labWork_2_12_3;

/**
 * Created by Bulik on 11.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyPhone myPhone = new MyPhone();
        myPhone.swichOn();
        myPhone.myPhoneBook.printPhoneBook();
        myPhone.call(7);
    }
}
