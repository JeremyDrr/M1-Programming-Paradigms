public class NodeGeneric<T extends Comparable<T>> {
    T val;
    NodeGeneric<T> left, right;

    public NodeGeneric(T key) {
        val = key;
        left = null;
        right = null;
    }
}