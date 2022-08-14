public class Main {
    public static void main(String[] args) {
        Author VictorHugo = new Author("Victor Hugo");
        Book LM = new Book("Les Miserables", 1862, VictorHugo);
        Book LM2 = new Book("Les Miserables", 1862, VictorHugo);
        System.out.println(LM);
        System.out.println(LM.equals(LM2));
    }
}