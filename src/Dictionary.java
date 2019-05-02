
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

        public String toString() {
            return "" + this.key + " " + this.value + "\n";
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

    // adds a key-value pair.
    public void insert(String key, String value) {
        // check to make sure we don't already have a given key.
        Node current = this.head;
        while (current != null) {
            if (current.key.equals(key)) {
                // TODO: throw new ALready Exists exception or whatever.
                return;
            }
            else {
                current = current.next;
            }
        }

        // adds the new thing at the front of the list, because order doesn't matter.
        Node toAdd = new Node(key, value);
        toAdd.next = this.head;
        this.head = toAdd;
        this.numItems += 1;
    }

    // deletes a key-value pair.
    public void delete(String key) {
        // if we contain the provided key, delete it.
        if (this.lookup(key) != null) {
            // check if the key is in the first node.
            if (this.head.key.equals(key)) {
                this.head = this.head.next;
                this.numItems -= 1;
            }
            // otherwise use current-previous to change pointers to skip current.
            else {
                Node previous = this.head;
                Node current = this.head.next;

                while (current != null) {
                    // if we find key, remove it, and return.
                    if (current.key.equals(key)) {
                        // point previous.next to current.next, skipping current
                        previous.next = current.next;
                        // decrement the size;
                        this.numItems -= 1;
                        return;

                    }
                    // else set current to next. and previous. continue searching.
                    else {
                        previous = current;
                        current = current.next;
                    }
                }
            }
        }
        // otherwise throw a new exception. (not found?)
        else {
            // TODO: throw a not-found exception.
            return;
        }
    }

    // resets this Dictionary to empty.
    public void makeEmpty() {
        this.head = null;
        this.numItems = 0;
    }

    // returns string output of the Dictionary's list of pairs
    public String toString() {
        String returnThis = "";
        // things are added to the front of the list.
        // we want output order to be oldest in front.
        Node current = this.head;
        while (current != null) {
            returnThis = current.toString() + returnThis;
            current = current.next;
        }

        return returnThis;
    }
}
