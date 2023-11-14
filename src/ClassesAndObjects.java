public class ClassesAndObjects {
    public static void main(String[] args) {
        //Создание объекта класса car
    Car myCar = new Car();
    //Создание объекта класса person
    Person person1 = new Person();
    Person person2 = new Person();

    //установка значений класса person
    person1.name = "Vasja";
    person1.age = 45;
    person2.name = "Andrey";
    person2.age = 32;
    person2.speak(); //вывод метода speak

//Вывод значений класса person
        System.out.println("Your neme is: "+person1.name+ ", and your age: "+person1.age);

    //установка значений полей
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;

        //Вызов метода
        myCar.start();

        //Вывод значений полей
        System.out.println("make: "+ myCar.make);
        System.out.println("model: "+ myCar.model);
        System.out.println("year: "+ myCar.year);
    }
}
class Person{ //Добавляем класс person
    String name;
    int age;
    void speak(){ //Добавляем метод speak
        System.out.println("Моё имя: "+ name +", и мне " + age);
    }

}