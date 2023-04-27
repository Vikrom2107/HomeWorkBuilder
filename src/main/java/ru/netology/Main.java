package ru.netology;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.setName("Татьяна")
                .setSurname("Петрова")
                .setAge(25)
                .setAddress("Екатеринбург")
                .build();
        System.out.println(person);
        System.out.println("*************************");
        Person daughter = person.newChildBuilder()
                .setName("Анна").build();
        System.out.println(daughter);
        System.out.println("*************************");
        // Проверка happyBirthday() и setAddress()
        person.happyBirthday();
        person.setAddress("Орёл");
        System.out.println(person);

//        try {
//            // Не хватает обязательных полей
//            new PersonBuilder().build();
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        }

//        try {
//            // Неправильный возраст
//            new PersonBuilder().setAge(-100).build();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
    }

}