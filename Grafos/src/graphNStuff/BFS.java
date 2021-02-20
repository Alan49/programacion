package graphNStuff;

/**
 * Created by alan on 11/11/16.
 */
public class BFS {

    public static void main(String[] args) {

        Graph<String> g = new Graph<String>(4); // the graph will have 4 nodes

        Node<String> node0 = new Node<String>("A");
        Node<String> node1 = new Node<String>("B");
        Node<String> node2 = new Node<String>("C");
        Node<String> node3 = new Node<String>("D");

        g.addNodeToGraph(node0);
        g.addNodeToGraph(node1);
        g.addNodeToGraph(node2);
        g.addNodeToGraph(node3);

        g.addEdge(node0, node1);
        g.addEdge(node0, node2);
        g.addEdge(node1, node3);
        g.addEdge(node2, node0);
        g.addEdge(node2, node3);


        g.BFS(node0);
    }
}