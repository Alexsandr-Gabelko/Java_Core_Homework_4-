package data;

import java.util.Objects;

public class Buyer {
    private  String name;
    private int age;
    private String phoneNumber;
    private Gender gender;

    public Buyer(String name, int age, String phoneNumber, Gender gender) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

//    @Override
//    public String toString() {
//        return "Buyer{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buyer buyer = (Buyer) o;
        return age == buyer.age && Objects.equals(name, buyer.name) && Objects.equals(phoneNumber, buyer.phoneNumber);
    }

    @Override
    public String toString() {
        return String.format("Buyer{name='%s', age=%d, phone='%s'}", name, age, phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phoneNumber);
    }
}
