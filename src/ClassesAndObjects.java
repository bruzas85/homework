public class ClassesAndObjects {
    public static void main(String[] args) {
        //Создание объекта класса car
    Car myCar = new Car();
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
