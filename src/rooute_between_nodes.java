import sun.awt.image.ImageWatched;

import java.util.*;
import java.util.LinkedList;

class route{
    private int V;
    private LinkedList<Integer> adj[];
    route(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }
        void addEdge(int v,int w){
        adj[v].add(w);
    }
    boolean  rn(int n1,int n2) {
       boolean visited[]= new boolean[V];
       visited[n1]=true;
       LinkedList<Integer>q=new LinkedList<>();
       q.add(n1);
       while(q.size()!=0){
           n1=q.poll();
           ListIterator<Integer>i=  adj[n1].listIterator();
           while(i.hasNext()){
               int n=i.next();
               if(n==n2){
                   return true;
               }
               if(!visited[n]){
                   visited[n]=true;
                   q.add(n);
               }
           }
       }
       return false;

    }

    public static void main(String[] arg){
        route g=new route(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        if(g.rn(3,1))
            System.out.println("reachable");

        else
            System.out.println("unreachable");

        if(g.rn(1,3))
            System.out.println("reachable");

        else
            System.out.println("unreachable");

    }



}