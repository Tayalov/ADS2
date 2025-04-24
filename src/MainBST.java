public class MainBST {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        bst.put(50, "A");
        bst.put(30, "B");
        bst.put(70, "C");
        bst.put(20, "D");
        bst.put(40, "E");
        bst.put(60, "F");
        bst.put(80, "G");

        System.out.println("Get 40: " + bst.get(40));

        bst.delete(30);

        System.out.print("Keys in BST after delete: ");
        for (Integer key : bst.iterator()) {
            System.out.print(key + " ");
        }
        System.out.println();
    }
}
