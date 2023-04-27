package ru.netology;


import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }
    public boolean hasAge() {
        return age >= 0;
    }
    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() {
        age++;
    }
    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(this.surname);
        personBuilder.setAddress(this.address);
        return personBuilder;
    }

    @Override
    public String toString() {
        if (age < 0)
            return  "Имя: " + name +
                    "\nФамилия: " + surname +
                    "\nВозраст: " + "возраст не указан" +
                    "\nГород: " +address;
        else
            return  "Имя: " + name +
                    "\nФамилия: " + surname +
                    "\nВозраст: " + age +
                    "\nГород: " +address;
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result = result + (surname == null ? 0 : surname.hashCode());
        result = result + (address == null ? 0 : address.hashCode());
        result = result + age;
        return result;
    }
}
