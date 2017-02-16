package labWork_2_12_3;

/**
 * Created by Bulik on 11.08.2016.
 */
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Bulik on 09.08.2016.
 */
public class MyPhone {
    MyPhoneBook myPhoneBook;
    public MyPhone(){
        myPhoneBook = new MyPhoneBook();
    }
    public class MyPhoneBook {
        private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

         class PhoneNumber{
            private String name,
                    phone;


            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;

            }
            public String getName() {
                return name;
            }

            public String getPhone() {
                return phone;
            }

            @Override
            public String toString() {
                return "name=" + name + ", phone=" + phone;
            }
        }
        public void addPhoneNumber(String name, String phone){
            PhoneNumber phoneNumber = new PhoneNumber(name, phone);
            for (int i =0; i<phoneNumbers.length; i++){
                if (phoneNumbers[i] == null){
                    phoneNumbers[i] = phoneNumber;
                    break;
                }
            }
        }
        public void printPhoneBook(){
            int index = 0;
            while (index < phoneNumbers.length && phoneNumbers[index] != null ){

                System.out.println(phoneNumbers[index]);
                index++;
            }
        }

        public void sortByName(){
            Arrays.sort(phoneNumbers, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    PhoneNumber obj_1 = (PhoneNumber) o1;
                    PhoneNumber obj_2 = (PhoneNumber) o2;
                    String name_1 = obj_1.getName();
                    String name_2 = obj_2.getName();
                    return name_1.compareTo(name_2);
                }
            });
        }
        public void sortByPhoneNumber(){
            Arrays.sort(phoneNumbers, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    String str_1 = ((PhoneNumber)o1).getPhone();
                    String str_2 = ((PhoneNumber)o2).getPhone();

                    return str_1.compareTo(str_2);
                }
            });
        }
    }
    public void swichOn(){
        System.out.println("Loading PhoneBook records… ");

        myPhoneBook.addPhoneNumber("Sasha", "0502313252");
        myPhoneBook.addPhoneNumber("Dasha", "0982316252");
        myPhoneBook.addPhoneNumber("Masha", "0992386252");
        myPhoneBook.addPhoneNumber("Ivan", "0932396862");
        myPhoneBook.addPhoneNumber("Vasya", "0939876352");
        myPhoneBook.addPhoneNumber("Alex", "0508531275");
        myPhoneBook.addPhoneNumber("Olga", "0736583276");
        myPhoneBook.addPhoneNumber("Igor", "0985789553");
        myPhoneBook.addPhoneNumber("Peter", "0968898696");
        myPhoneBook.addPhoneNumber("Vasya", "0987894552");

        System.out.println("OK!");

    }
    public void call(int number){
        try{
            System.out.println("Calling to: " + myPhoneBook.phoneNumbers[number]);
        }catch (ArrayIndexOutOfBoundsException ee){
            System.out.println(number +" not exist!");
        }


    }

    class Camera{

    }
    class Bluetooth{

    }
    static class MemoryCard{

    }
    static class SimCard{

    }
    class TouchScreen{

    }
    class PowerOnButton{}
    class PhoneBattery{}
    class PhoneDisplay{}
    class PhoneSpeaker{}


}
