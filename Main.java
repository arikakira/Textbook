public class Main {
    public static void main(String[] args) {
        Textbook bio2015 = new Textbook("Biology", 49.75, 2);       // test case 1
        Textbook bio2019 = new Textbook("Biology", 39.75, 3);       // test case 2
        System.out.println(bio2019.getEdition());       // test case 3
        
    }
}
