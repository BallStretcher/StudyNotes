public class WorkWithPotok {
    //Класс Stream создан для лёгкой конструкции цепочек потоков данных. Для этого есть методы, возвращающие объекты типа Stream
    public static void main(String[] args) {
        //Методы:
        // Stream <T> of(T obj) - создаёт поток из набора объектов
        //
        // Stream <T> generate() - генерирует поток по заданному правилу
        // Stream <T> concat() - объединяет вместе несколько потоков
        // Stream <T> filter() - фильтрует данные, пропуская только соответствующие заданному правилу
        // Stream <T> distinct() - удаляет дубликаты, не пропуская данные, которые уже были
        // Stream <T> sorted() - сортирует данные
        // Stream <T> peek() - выполняет действие над каждым данным (аналог forEach?)
        // Stream <T> limit(n) - обрезает данные после достижения лимита n
        // Stream <T> skip(n) - пропускает первые n данных
        // Stream <R> map() - преобразовывает данные из одного типа в другой
        // Stream <R> flatMap() - аналогично

        // boolean anyMatch() - проверяет что среди данных потока наличие хотя бы одного, которое соответствует заданному правилу
        // boolean allMatch() - все данные потока соответствуют правилу?
        // boolean noneMatch() - никакие данные потока не соответствуют правилу?

        //Optional<T> findFirst() - возвращает первый найденный эл-т, соответствующий правилу
        //Optional<T> findAny() - возвращает любой эл-т из потока, соответствующий правилу
        //Optional<T> min() - ищет минимальный эл-т в потоке
        //Optional<T> max() - возвращает максимальный эл-т в потоке

        //long count() - возвращает кол-во элементов в потоке данных
        //R collect() - читает все данные потока и возвращает из в качестве коллекции

        // параметр R - тип результата метода
        // параметр Т - тип элемента в потоке
        // параметр А - тип промежуточных накапливаемых данных


        //                               Intermediate и terminal методы Stream
        // Методы класса Stream можно разделить на
        // 1) Промежуточные - intermediate,non-terminal
        // Возвращают объект, имплементирующий интерфейс Stream, и их можно выстроить в цепочку вызовов
        // 2)Конечные - terminal
        // Возвращают значение, отличное от типа Stream

        // Таким образом можно выстроить цепочки вызовов из любого кол-ва промежуточных и одного конечного в конце.
        // Такой подход позволяет реализовать сложную логику+повысить читаемость кода

        // Промежуточные можно объединять в любом количестве в одной цепочке, но они не производять конечный результат
        // и не запускают обработку данных в потоке. Конечные полностью противоположены - не больше одного в
        // конце, но производят и запускают обработку данных
        //
        //
        //
        //
        //
        //
        //
        //

    }
}





















