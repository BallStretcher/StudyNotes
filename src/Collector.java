import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collector {
    //Коллекторы в java
    //Метод collect() класса Stream позволяет перейти от потоков к привычным коллекциям - List<T>,Map<T,R> и другим
    //В метод нужно передать специальный объект - collector, который считывает все данные из потока и преобразует их к
    // определённой колекции и возвращает её.
    // объект collector имеет тип Collector<T,A,R>.
    //Самостоятельно создавать этот объект не нужно - для этого есть статические методы класса Collector.
    // Методы, возвращающие объекты-коллекторы:
    //toList() - объект, преобразующий поток в список - List<T>
    //toSet() - объект, преобразующий поток в множество - Set<T>
    //toMap() - объект, преобразующий поток в мэп - Map<K,V>
    //joining() - склеивает элементы потока в одну строку
    //mapping() - преобразует элементы потока в Map<K,V>
    //groupingBy() - группирует элементы, возвращает Map<K,V>


    //Преобразование в лист и множество выглядит вполне стандартно:
    public static void main(String[] args) {
        ArrayList<String> e = new ArrayList<>();
        Collections.addAll(e, "A=1", "B=2", "C=3","D==4");
        Set<String> res = e.stream()
                .filter(s->Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toSet());//идентично с toList()
        //Преобразование в мэп требует разделить ключ и значение:
        Map<String,Integer> res2= e.stream()
                .map(w->w.split("="))//преобразовываем каждую строку в массив строк, разделяя их по регулярному выражению
                .filter(w->w.length==2)//пропускаем массивы, содержащие два элемента - "D==4" разбит на три элемента и не пройдёт
                .collect(Collectors.toMap(w->w[0],w->Integer.parseInt(w[1])));//передаются две функии - одна возвращает ключ String, вторая - значение, преобразованное в Integer
    }
    //
    //
    //
    //
    //
    //
    //
}
