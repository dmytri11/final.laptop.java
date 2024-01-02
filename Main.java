import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Set<laptop> laptops = new HashSet<>();
        laptop Laptop1 = new laptop();
        Laptop1.RAM = 16;
        Laptop1.DC = 512;
        Laptop1.system = "win";
        Laptop1.color = "Blue" ;

        laptop Laptop2 = new laptop();
        Laptop2.RAM = 8;
        Laptop2.DC = 512;
        Laptop2.system = "mac";
        Laptop2.color = "Silver" ;

        laptop Laptop3 = new laptop();
        Laptop3.RAM = 8;
        Laptop3.DC = 128;
        Laptop3.system = "lin";
        Laptop3.color = "Black" ;

        laptop Laptop4 = new laptop();
        Laptop4.RAM = 16;
        Laptop4.DC = 512;
        Laptop4.system = "mac";
        Laptop4.color = "White" ;

        laptop Laptop5 = new laptop();
        Laptop5.RAM = 32;
        Laptop5.DC = 1024;
        Laptop5.system = "win";
        Laptop5.color = "Red" ;

      
        laptops.add(Laptop1);
        laptops.add(Laptop2);
        laptops.add(Laptop3);
        laptops.add(Laptop4);
        laptops.add(Laptop5);
        
        
    }
        static void printSet(Set<laptop> laptops){
        for (laptop Laptop: laptops){
            System.out.println(Laptop);
        }
    }
//--------------------------------------------------------------------------------------------------------------------//

    // Метод для выбора критериев фильтрации
    static Set<laptop> numOfPaRAM(Set<laptop> laptops, int ans) {
        Set<laptop> kriterii = new HashSet<>();
        kriterii=laptops;
        Scanner scanner = new Scanner(System.in);

        //Выводим список предлагаемых операций
//        textChoice();

        while (ans != 0) {
            textChoice();
            ans = scanner.nextInt();

           if (ans == 1) {
                String s1 = "Введите минамальный размер RAM из выпадающего списка";
                List<Integer> spisok1 = new LinkedList<>();
                for (laptop Laptop : laptops) {
                    if (!spisok1.contains(Laptop.RAM)) {
                        spisok1.add(Laptop.RAM);
                    }
                }
                System.out.println(s1 + "\n" +spisok1);
                System.out.println(s1);

                Integer ans1 = Integer.valueOf(scanner.next());

                kriterii.removeIf(riter -> riter.RAM<=ans1);

                printSet(kriterii);
            
            }

             if (ans == 2) {
                String s2 = "Введите минамальный объём DC из выпадающего списка";
                List<Integer> spisok2 = new LinkedList<>();
                for (laptop Laptop : laptops) {
                    if (!spisok2.contains(Laptop.DC)) {
                        spisok2.add(Laptop.DC);
                    }
                }
                System.out.println(s2 + "\n" +spisok2);
                System.out.println(s2);

                Integer ans2 = Integer.valueOf(scanner.next());

                kriterii.removeIf(riter -> riter.DC<=ans2);

                printSet(kriterii);
            }

            if (ans == 3) {
                String s3 = "Введите наименование продукта из выпадающего списка";
                List<String> spisok3 = new LinkedList<>();

                for (laptop Laptop : laptops) {
                    if (!spisok3.contains(Laptop.system)) {
                        spisok3.add(Laptop.system);
                    }
                }
                System.out.println(s3 + "\n" + spisok3);


                String ans3 = scanner.next();

                kriterii.removeIf(riter -> !riter.system.equals(ans3));

                printSet(kriterii);
            }

            if (ans == 4) {
                String s4 = "Введите наименование фирмы из выпадающего списка";
                List<String> spisok4 = new LinkedList<>();

                //можно ли как то оптимизировать код for?
                for (laptop Laptop : laptops) {
                    if (!spisok4.contains(Laptop.color)) {
                        spisok4.add(Laptop.color);
                    }
                }

                System.out.println(spisok4+"\n"+s4);

                String ans4 = scanner.next();

                kriterii.removeIf(riter -> !riter.color.equals(ans4));



                printSet(kriterii);
            }

        }
        return kriterii;
    }


    //Код необходимо дописывать вручную, если добавятся критерии фильтрации / измениться порядок.

    static void textChoice ( ) {
        String text = new String("Введите число для выбора критерия фильтрации:\n" +
                "1 - RAM: \n" +
                "2 - DC: \n" +
                "3 - system: \n" +
                "4 - color: \n" +
                "0 - завершить ввод критериев для фильтрации и показать результаты");
        System.out.println(text);
    }

}