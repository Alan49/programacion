package graphNStuff;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Queue;
import java.util.LinkedList;

/**
 * Created by alan on 11/11/16.
 */
public class Graph<T> {

    private ArrayList<Node<T>> nodeList;

    public void addNodeToGraph(Node<T> n){
        nodeList.add(n);
    }

    public Graph(int size){
        super();
        nodeList = new ArrayList<Node<T>>();
    }

    public void addEdge(Node<T> fromNode, Node<T> toNode){
        nodeList.get(nodeList.indexOf(fromNode)).getAdjList().add(toNode);
    }

    public void DFS(Node<T> start) {
        Set<Node<T>> visitedSet = new HashSet<Node<T>>();
        System.out.println("Starting DFS from -> " + start.toString());
        DFSUtil(start, visitedSet);
    }

    public void DFSUtil(Node<T> vertex, Set<Node<T>> visitedSet) {
        System.out.println("Visited: " + vertex.toString());
        visitedSet.add(vertex);
        for (Node<T> n : vertex.getAdjList()) {
            if (!visitedSet.contains(n)) {
                DFSUtil(n, visitedSet);
            }
        }
    }

    public void BFS(Node<T> start) {
        Set<Node<T>> visitedSet = new HashSet<Node<T>>();

        Queue<Node<T>> nodeQueue = new LinkedList<Node<T>>();

        nodeQueue.add(start); //start from here, ant take it's adj list
        while(!nodeQueue.isEmpty()) {
            visitedSet.add(nodeQueue.peek());
            //Save a reference to the list, because we will use it later
            LinkedList<Node<T>> adjListOfNode = nodeQueue.peek().getAdjList();

            //Show it and also poll it from the queue
            System.out.println("Visited: " + nodeQueue.poll());

            for (Node<T> n : adjListOfNode) {
                if (!visitedSet.contains(n) && !nodeQueue.contains(n)) {
                    nodeQueue.add(n);
                }
            }
        }



    }
}
