import java.util.*;
import java.util.LinkedList;

class GraphB
{
    private int V;
    private LinkedList<Integer> adj[];

    GraphB(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();

        }
    }
    void addEdge(int v,int w){
        adj[v].add(w);
    }

    void Breadth(int s){
        boolean visited[]=new boolean[V];
        visited[s]=true;
        LinkedList<Integer> queue = new LinkedList<Integer>();

        queue.add(s);
        while(queue.size()!=0){
            s=queue.poll();
            System.out.println(s+" ");
            Iterator<Integer> i = adj[s].listIterator();

            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }

    }




    public static void main(String args[])
    {
        GraphB g = new GraphB(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.Breadth(2);
    }
}

