package Lesson1;


import Lesson1.Find;

/**
 * Created by hunter on 6/16/14.
 */
public class QuickUnion extends Find {

    int id[];

    public static void main(String[] args) {

        QuickFind qf = new QuickFind(10);
        qf.union(0, 1);
        qf.union(1, 3);
        qf.union(5, 6);

        System.out.println(qf.connected(0,1));
        System.out.println(qf.connected(0,3));
        System.out.println(qf.connected(0,6));

        qf.union(3, 6);
        System.out.println(qf.connected(0,6));

    }

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    private int root(int i)
    {
        while (i  != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }

    public void union(int p, int q)
    {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }



}
