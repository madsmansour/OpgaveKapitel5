public class Arrays {

    public static void main(String[] args) {

        // index af ints
        int marks[] = {72, 85, 93, 29, 85};


        // definerer variablen sum

        int sum = 0;

        // laver et for loop, hvor der er lavet en variabel counter som i starten = 0
        // og counter skal være mindre end marks.length som er 5, da der er 5 tal i index.
        // efterfølgende skal counter stige med en
        for (int counter = 0; counter < marks.length; counter++) {
            System.out.println(marks[counter]);
            sum = sum + marks[counter];
        }
        System.out.println("The sum is " + sum);

        //for each
        for (int nummer : marks) {
            System.out.println("For each " + nummer);
        }
    }
}
