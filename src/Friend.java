/*
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend {
    public String name;
    public int age;
    public String sex;
    public void initialize(String name) {
        this.name = name;
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
