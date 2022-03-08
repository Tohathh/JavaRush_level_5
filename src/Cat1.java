/*
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null).
То же касается адреса: null.
*/
public class Cat1 {
    public String catname = null;
    public int catweight;
    public int catage;
    public int catcolor;
    public String catadress = null;

    public Cat1 (String name) {
        this.catname = name;
    }
    public Cat1 (String name, int weight, int age) {
        this.catname = name;
        this.catweight = weight;
        this.catage = age;
    }
    public Cat1 (String name, int age) {
        this.catname = name;
        this.catage = age;
    }
    public Cat1 (int weight, int color) {
        this.catweight = weight;
        this.catcolor = color;
    }
    public Cat1 (int weight, int color, String adress) {
        this.catweight = weight;
        this.catcolor = color;
        this.catadress = adress;
    }
}
