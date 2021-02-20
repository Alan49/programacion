package graphNStuff;
import java.util.LinkedList;
/**
 * Created by alan on 11/11/16.
 */
public class Node<T> {

    private T value;
    private LinkedList<Node<T>> adjList;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkedList<Node<T>> getAdjList() {
        return adjList;
    }

    public void setAdjList(LinkedList<Node<T>> adjList) {
        this.adjList = adjList;
    }

    public Node(T value){
        super();
        this.value = value;
        this.adjList = new LinkedList<Node<T>>();
    }

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }
}
