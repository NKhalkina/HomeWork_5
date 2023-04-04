package HomeWork_5;
/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь 
несколько телефонов.
 Добавить функции 1) Добавление номера*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class exe1 {
        public static void main(String[] args) {
            Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
    
            System.out.println("Welcome!\n"+
            "Add contact - 1. All contacts - 2.");
    
            while(true) {
            Scanner scanner = new Scanner(System.in);
            String znak = scanner.nextLine();
            
            switch (znak) {
                case  ("1"):
                    System.out.print(("Name: "));
                    String name = scanner.nextLine();
    
                    System.out.print(("Phones: "));
                    Integer number = scanner.nextInt();
    
                    add(map, name, number);
    
                    System.out.print(("Сontact saved.\n"));
                    System.out.print("Add contact - 1. All contacts - 2.\n");
                    break;
    
                case  ("2"):
                    show(map);
                    System.out.print("Add contact - 1. All contacts - 2.\n");
                    break;
    
                default:
                    System.out.print("Add contact - 1. All contacts - 2.\n");
                    break;
                }
        }
        }
    
        public static void add(Map<String, ArrayList<Integer>> map, String name, Integer number) {
            if (map.containsKey(name)) {
                map.get(name).add(number);
            } else {
                map.put(name, getList(name, number));   
            }
     
        }
    
        public static void show(Map<String, ArrayList<Integer>> map) {
            for (Map.Entry<String, ArrayList<Integer>> item : map.entrySet()){
                System.out.printf("Name: %s  Number: %s \n", item.getKey(), item.getValue());
            }   
        }

        public static ArrayList<Integer> getList(String name, Integer number) {
            List<Integer> result = new ArrayList<>();
            result.add(number);
            return (ArrayList<Integer>) result;
        }
}
