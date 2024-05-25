import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lambda {
    public static void main(String[] args) {
        /*лямбда-выражения
        полезны для работы и интерфейсами, у которых ТОЛЬКО ОДИН метод(есть варик обойти это, но не сейчас)

        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        создаём и заполняем коллекцию
        создаём объект компаратора "e" и с помощью лямбда-выражения опускаем имя класса и имя единственного метода
        Comparator<String> e = (String o1, String o2)->{
            return o1.length()-o2.length();                                 опущены new Сomparator<String>() после "=" и вызов метода int compare()
        };                                                                 точка с запятой нужна тк тут скрытое создание класса И создание переменной
        Collections.sort(list,e);

        можно максимально зарофлить и подставить в сорт то значение, которое мы присваивали переменной "e":
        Collections.sort(list,(String ob1,String ob2)->{return ob1.length()-ob2.length();});

        дальше больше - компилятор может сам определить типы переменных
        фигурные скобки и return можно не писать, если в коде всего одна команда
        Comparator<String> compar = (obj1,obj2)->obj1.length()-obj2.length();
        Collections.sort(list,compar);
       или в сразу в сорте
        Collections.sort(list,(obj1,obj2)->obj1.length()-obj2.length());


*/
    }
}