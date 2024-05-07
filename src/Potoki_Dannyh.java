import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Potoki_Dannyh {

    public static void main(String[] args) throws IOException {


    FileInputStream input = new FileInputStream("c:\\readme.txt");
    InputStreamReader reader = new InputStreamReader(input);
    BufferedReader buff = new BufferedReader(reader);
    String text = buff.readLine();
    }
    //Важно отметить, что в первых нескольких строках кода мы просто конструируем цепочку из Stream-объектов,
    // но реальные данные по этой цепочке потоков еще не передаются.
    //И только когда мы вызовем метод buff.readLine(), произойдет следующее:

    //Объект BufferedReader вызовет метод read() у объекта InputStreamReader
    //Объект InputStreamReader вызовет метод read() у объекта FileInputStream
    //Объект FileInputStream начнет читать данные из файла
    //Т.е. никакого движения данных по цепочке потоков нет, пока мы не начали вызывать методы типа read() или readLine().
    // Само конструирование цепочки потоков данные по ним не гоняет. Потоки сами данные не хранят, а только читают из других.

    //                                          ИНТЕРФЕЙС Stream
    public static void second(String[] args) {
        //Расширенная поддержка потоков реализована с помощью интерфейса Stream<T> "T" - тип-параметр данных в потоке
        // Другими словами поток полностью независим от типа передаваемых данных

        //Для получения объекта-потока у коллекции нужно у неё вызвать метод stream():
        //Stream<Тип> имя = коллекция.stream();
        //Коллекция - источник данных потока, объект типа Stream<Тип> - инструмент по получению данных из коллекции именно в виде потока данных
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        Stream<String> stream = list.stream();

        //Можно получить поток не только у коллекции, но и у массива. Для этого нужно воспользоваться методом Arrays.stream():
        Integer[] array = {1, 2, 3};
        Stream<Integer> stream2 = Arrays.stream(array);
        //Stream<Тип> имя = Arrays.stream(массив);
        //При этом массив будет считаться источником данных для потока имя.

        //После создания объекта Stream<Тип> никакого движения данных не происходит.
        // Мы просто получили объект-поток для того, чтобы начать строить цепочку из потоков-данных.

    }








}
