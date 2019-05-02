
// an implementation of DictionaryInterface
public class Dictionary implements DictionaryInterface {

    // just use null everywhere? seems really bad.

    // private Node class
    private class Node {
        private String key;
        private String value;
        Node next;

        Node(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
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
        return this.numItems == 0;
    }

    // returns the size of the Dictionary
    public int size() {
        return this.numItems;
    }

    // grabs the corresponding value of a given key
    public String lookup(String key) {
        // if we are empty, return null
        if (this.head == null) {
            return null;
        }
        // otherwise, search for stuff
        else {
            // searching for the key.
            Node current = this.head;
            while (current != null) {
                // if we find key, return the value
                if (current.key.equals(key)) {
                    return current.value;
                }
                // otherwise, check the next node.
                else {
                    current = current.next;
                }
            }
            // key not found, so return null.
            return null;
        }
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
