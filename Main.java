public class Main {
    public static void main(String[] args) {
        Textbook bio2015 = new Textbook("Biology", 49.75, 2);       // test case 1
        Textbook bio2019 = new Textbook("Biology", 39.75, 3);       // test case 2
        System.out.println(bio2019.getEdition());       // test case 3
        System.out.println(bio2019.getBookInfo());      // test case 4
        System.out.println(bio2019.canSubstituteFor(bio2015));      // test case 5
        System.out.println(bio2015.canSubstituteFor(bio2019));      // test case 6
        Textbook math = new Textbook("Calculus", 45.25, 1);     // test case 7
        System.out.println(bio2015.canSubstituteFor(math));     // test case 8
    }
}
