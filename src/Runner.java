import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Furniture - отсортировать по полю cost(Comparable)
 * Factory - отсортировать по полю country (Comparable)
 * Man - отсортировать по полю age, phone (Comporator)
 * Bag - отсортировать по полю color, weight (Comporator)
 */
public class Runner {
    public static void main(String[] args) {
        Furniture furniture1 = new Furniture("Name1", "Dub", 1500);
        Furniture furniture2 = new Furniture("Name2", "Klen", 350);
        Furniture furniture3 = new Furniture("Name3", "Bereza", 1000);
        Furniture furniture4 = new Furniture("Name4", "Elka", 780);
        Furniture furniture5 = new Furniture("Name5", "Sosna", 990);

        List<Furniture> furnitureList = new ArrayList<Furniture>();
        furnitureList.add(furniture1);
        furnitureList.add(furniture2);
        furnitureList.add(furniture3);
        furnitureList.add(furniture4);
        furnitureList.add(furniture5);

        Collections.sort(furnitureList);
        System.out.println(furnitureList);
        System.out.println("==============================================");
        System.out.println("==============================================");

        Factory factory1 = new Factory("Nam1", "gomel", "Sov", "Belarus");
        Factory factory2 = new Factory("Nam2", "Moskva", "Lenina", "Rossia");
        Factory factory3 = new Factory("Nam3", "Kiev", "Proletarskaya", "Ukraina");
        Factory factory4 = new Factory("Nam4", "Varshava", "Jvirki", "Polsha");
        Factory factory5 = new Factory("Nam5", "Vashington", "Braiton-Bich", "USA");

        List<Factory> factoryList = new ArrayList<Factory>();
        factoryList.add(factory1);
        factoryList.add(factory2);
        factoryList.add(factory3);
        factoryList.add(factory4);
        factoryList.add(factory5);

        Collections.sort(factoryList);
        System.out.println(factoryList);
        System.out.println("==============================================");
        System.out.println("==============================================");

        Man man1 = new Man("Alex", 45, 22334455, "qwer12");
        Man man2 = new Man("Maks", 20, 45789685, "fdsr45e");
        Man man3 = new Man("Andry", 60, 364584149, "tythgfh5464");
        Man man4 = new Man("Denis", 50, 456487781, "vbnvn4564");
        Man man5 = new Man("Vitalya", 10, 787455454, "popoio35retre");

        List<Man> manList = new ArrayList<Man>();
        manList.add(man1);
        manList.add(man2);
        manList.add(man3);
        manList.add(man4);
        manList.add(man5);

        Comparator<Man> comparator = new PhoneManComparator();
        Collections.sort(manList, comparator);
        System.out.println(manList);
        System.out.println("==============================================");
        System.out.println("==============================================");

        Bag bag1 = new Bag("Nam1s", "Red", 10);
        Bag bag2 = new Bag("Nam2s", "Yellow", 1);
        Bag bag3 = new Bag("Nam3s", "Green", 5);
        Bag bag4 = new Bag("Nam4s", "Black", 17);
        Bag bag5 = new Bag("Nam5s", "Pink", 4);

        List<Bag> bagList = new ArrayList<Bag>();
        bagList.add(bag1);
        bagList.add(bag2);
        bagList.add(bag3);
        bagList.add(bag4);
        bagList.add(bag5);
        Comparator<Bag> bagComparator = new WeightBagComparator();
        Collections.sort(bagList, bagComparator);
        System.out.println(bagList);
    }
}
