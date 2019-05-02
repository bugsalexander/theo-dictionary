
// an implementation of DictionaryInterface
public class Dictionary implements DictionaryInterface {

    // just use null everywhere? seems really bad.

    // private Node class
    private class Node {
        private String key;
        private String value;

        Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // fields for the Dictionary
    private Node head;
    private int numItems;

    // default constructor. instantiates this Dictonary to be empty.
    Dictionary() {
        this.head = null;
        this.numItems = 0;
    }

    // returns if the Dictionary is empty
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String lookup(String key) {
        return null;
    }

    @Override
    public void insert(String key, String value) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public void makeEmpty() {

    }
}
