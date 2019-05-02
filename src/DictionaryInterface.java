
// a key-value lookup table.
public interface DictionaryInterface {
    public boolean isEmpty();
    public int size();
    public String lookup(String key);
    public void insert(String key, String value);
    public void delete(String key);
    public void makeEmpty();
    public String toString();
}