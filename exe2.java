package HomeWork_5;
/*Пусть дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся имена 
с количеством повторений. Отсортировать по убыванию популярности Имени. */
import java.util.HashMap;
import java.util.Map;

public class exe2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        getEn(map, "Иван Иванов");
        getEn(map, "Светлана Петрова");
        getEn(map, "Кристина Белова");
        getEn(map, "Анна Мусина");
        getEn(map, "Анна Крутова");
        getEn(map, "Иван Юрин");
        getEn(map, "Петр Лыков");
        getEn(map, "Павел Чернов");
        getEn(map, "Петр Чернышов");
        getEn(map, "Мария Федорова");
        getEn(map, "Марина Светлова");
        getEn(map, "Мария Савина");
        getEn(map, "Мария Рыкова");
        getEn(map, "Марина Лугова");
        getEn(map, "Анна Владимирова");
        getEn(map, "Иван Мечников");
        getEn(map, "Петр Петин");
        getEn(map, "Иван Ежов");
        sortEn(map);
}

    public static Map<String, Integer> getEn(Map<String, Integer> map, String name) {
        String value = name.split(" ")[0];
        if(map.containsKey(value)){
            int count = map.get(value);
            map.put(value, count + 1);
        } else {
            map.put(value, 1);
        }
        return map;
    }

    public static Map<String, Integer> sortEn(Map<String, Integer> map) {
        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
        return map;
    }
}