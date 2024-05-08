import java.lang.reflect.Array;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class WorkWithPotok {
    //Класс Stream создан для лёгкой конструкции цепочек потоков данных. Для этого есть методы, возвращающие объекты типа Stream
    public static void main(String[] args) {
        //Методы:
        // Stream <T> of( - создаёт поток из набора объектов
        // Может быть как поток из одного элемента - Stream <T> of(T obj)
        // Или нескольких - Stream <T> of(T obj1, T obj2,...T obj x)

        // Stream <T> generate(Supplier<T> obj) - генерирует поток по заданному правилу. Например это может быть каждый раз
        // случайное число:
        Stream<Double> s = Stream.generate(Math::random);
        // Stream <T> concat(Stream<T> one, Stream<T> two) - объединяет вместе несколько потоков в один.
        // Stream <T> filter(Predicate<T>) - фильтрует данные, пропуская только соответствующие заданному правилу.
        // Возвращает новый поток с отфильтрованными данными из оригинального. Для задания правила нужно использовать лямбда-функцию
        Stream<Integer> ss = Stream.of(1,2,3,4,5,6,7);
        Stream<Integer> ssFiltered = ss.filter(x->(x%2==0));//оставляем только числа кратные 2

        // Stream <T> distinct() - удаляет дубликаты, не пропуская данные, которые уже были
        // Stream <T> sorted(Comparator<T>) - сортирует данные.В кач-ве параметра можно передать компаратор
        // Stream <T> peek(Consumer<T>) - выполняет действие над каждым данным (аналог forEach?). Если передать
        // функцию Sysout::println то данные будут выводиться в момент прохода через поток

        // Stream <T> limit(int n) - обрезает данные после достижения лимита n
        // Stream <T> skip(int n) - пропускает первые n данных
        // Stream <R> map() - преобразовывает данные из одного типа в другой. Возвращает поток Stream<R>, но уже с элементами нового типа. В качестве параметра нужно передать преобразовывающую функцию
        Stream<Integer> one = Stream.of(1,2,3,4,5);
        Stream<String> oneString = one.map(String::valueOf);
        Stream<Double> oneStringDouble = oneString.map(Double::parseDouble);
        //Преобразование в URI выглядит немного иначе:
        ArrayList<String> Suri = new ArrayList<>();
                Suri.add("https://google.com");
                Suri.add("https://yandex.com");
        //Stream<URI> uri = Suri.stream().map(URI::new) - код в map(...) содержит checked-исключение URISyntaxException,которое придётся обернуть в try-catch
        Stream<URI> uri = Suri.stream().map(str->{try{return new URI(str);}
        catch (URISyntaxException shiet)
        {return null;}});
        // Stream <R> flatMap() - аналогично

        // boolean anyMatch(правило) - проверяет что среди данных потока наличие хотя бы одного, которое соответствует заданному правилу
        // boolean allMatch(правило) - все данные потока соответствуют правилу?
        // boolean noneMatch(правило) - никакие данные потока не соответствуют правилу?
        boolean anyInf = s.anyMatch(x-> x.isInfinite());
        boolean noneInf = s.noneMatch(x-> x.isInfinite());
        boolean filter = s.filter(x->x>0).noneMatch(x->x>1);

        //Optional<T> findFirst() - возвращает первый найденный эл-т, соответствующий правилу
        //Optional<T> findAny() - возвращает любой эл-т из потока, соответствующий правилу. Аналог верхнего, но для параллельно обрабатывающихся потоков
        //Optional<T> min(Comparator<T>) - ищет минимальный эл-т в потоке
        //Optional<T> max(Comparator<T>) - возвращает максимальный эл-т в потоке

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



        //                                                                        Служебные классы. Класс Optional
        //Цель класса - хранить в себе объект Т(ссылку на объект типа Т, которая может быть null);
        //Позволяет сравнивать через equals с другим объектом Optional, даже если они обе хранят ссылки на null
        // findFirst() и findAny() как раз возвращают не объекты типа Т, а его обёртку - объект типа Optional<T>. Это сделано, чтобы не сталкиваться с
        // ситуацией, когда метод не находит объект и возвращает null
        //
        //
        //
        //

    }
}






















