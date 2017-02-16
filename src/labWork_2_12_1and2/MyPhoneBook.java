package labWork_2_12_1and2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Bulik on 09.08.2016.
 */
public class MyPhoneBook {
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    static class PhoneNumber{
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
