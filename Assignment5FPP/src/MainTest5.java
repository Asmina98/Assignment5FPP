public class MainTest5 {
    public static void main(String[] args) {
        Computer brand1 = new Computer("Dell", "intelCorei5", 8, 2.5);
        Computer brand2 = new Computer("HP", "AMD Ryzen 7", 12, 2.8);

        System.out.println(brand1.equals(brand2));
        System.out.println(brand1.hashCode());
        System.out.println(brand2.hashCode());

        System.out.println("*".repeat(50));

        System.out.println(brand1.equals(brand2));
        System.out.println(brand1.hashCode());
        System.out.println(brand2.hashCode());
    }
}
