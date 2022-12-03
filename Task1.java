import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
	public static void main(String[] args) {
              System.out.println("Задание 1");

		ArrayList <Integer> number=new ArrayList <Integer>();

              number.add(13);
              number.add(44);
              number.add(9);
              number.add(48);
              number.add(11);

              System.out.println("Список до изменений:");
              System.out.println(number);

              number.removeIf(num -> num%2==0);

              System.out.println("Список после изменений:");
              System.out.println(number);

              Task2();

	}


       public static void Task2() {
              System.out.println("Задание 2");

              int sum = 0;
              int count = 0;

              ArrayList<Integer> list = new ArrayList<>();
              list.add(12);
              list.add(21);
              list.add(111);

              System.out.println("Список:");
              System.out.println(list);

              System.out.println("Максимальное число:");
              System.out.println(Collections.max(list));
              System.out.println("Минимальное число:");
              System.out.println(Collections.min(list));

              for (int i = 0; i < list.size(); i++) {
                     sum = sum + list.get(i);
                     count ++;
              }

              int answer = sum / count;

              System.out.println("Среднее: " + answer);
       
       }
}
