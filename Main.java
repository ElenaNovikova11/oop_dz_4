public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<>(10, "Hello");
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

        Pair<Integer, String> pair2 = new Pair<>(null, null);
        System.out.println("Updated first element: " + pair2.setFirst(20));
        System.out.println("Updated second element: " + pair2.setSecond("World"));

    }
}