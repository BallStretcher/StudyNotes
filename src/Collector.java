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
    //
    //
    //
    //
    //
    //
    //
    //
}