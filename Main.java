import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<laptop> laptops = new HashSet<>();
        laptop laptop1 = new laptop();
        laptop1.RAM = 16;
        laptop1.DC = 512;
        laptop1.system = "win";
        laptop1.color = "Blue" ;

        laptop laptop2 = new laptop();
        laptop2.RAM = 8;
        laptop2.DC = 512;
        laptop2.system = "mac";
        laptop2.color = "Silver" ;

        laptop laptop3 = new laptop();
        laptop3.RAM = 8;
        laptop3.DC = 128;
        laptop3.system = "lin";
        laptop3.color = "Black" ;

        laptop laptop4 = new laptop();
        laptop4.RAM = 16;
        laptop4.DC = 512;
        laptop4.system = "mac";
        laptop4.color = "White" ;

        laptop laptop5 = new laptop();
        laptop5.RAM = 32;
        laptop5.DC = 1024;
        laptop5.system = "win";
        laptop5.color = "Red" ;
    
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        printSet(laptops);
    }
        static void printSet(Set<laptop> laptops){
        for (laptop laptop: laptops){
            System.out.println(laptop);
        }
    }

}