/*
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/
public class Friend1 {
    public String name;
    public int age;
    public String sex;

    public Friend1 (String name)
    {
        this.name = name;
    }
    public Friend1 (String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public Friend1 (String name, int age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
