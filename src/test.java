import java.util.LinkedList;
import java.util.*;
 class test {

    private int V;
    private  LinkedList<Integer> adj[];

    test(int v){
        V=v;
        adj=new LinkedList[v];
        for (int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    void addEdge(int v,int w){
        adj[v].add(w);
    }
    void DFS(int s){
        boolean visited[]=new boolean[V];
        visited[s]=true;
        LinkedList<Integer> q=new LinkedList<>();
        q.add(s);

       while(q.size()!=0){
           s=q.poll();
           System.out.println(s+"");
           visited[s]=true;
           ListIterator<Integer>i = adj[s].listIterator();

           while(i.hasNext()){
               int n=i.next();
               if(!visited[n]) {
                   visited[n] = true;
                   q.add(n);
               }
           }


        }


    }



    public static void main(String args[])
    {
        test g =new test(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.DFS(2);


    }

}