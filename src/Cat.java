    /* Создать класс Cat
    Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
    */
    /* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/
    /* Создать три объекта типа Cat
    В методе main создать три объекта типа Cat и заполнить их данными.
    Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
    */
    /* Провести три боя  попарно между котами
    Создать три кота используя класс Cat.
    Провести три боя попарно между котами.
    Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
    Результат каждого боя вывести на экран.
    */

public class Cat {
    String name;
    int age;
    int weight;
    int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    boolean fight(Cat anotherCat) {
        return anotherCat.strength <= this.strength && anotherCat.weight <= this.strength;
    }
    public static void main(String[] args) {
        Cat catVaska = new Cat("Vaska", 4, 10, 5);
        Cat catMurzik = new Cat ("Murzik", 4, 8, 4);
        Cat catMasha = new Cat ("Masha", 3, 5, 2);

        System.out.println (catVaska.fight(catMurzik));
        System.out.println (catVaska.fight(catMasha));
        System.out.println (catMurzik.fight(catMasha));
    }
}
