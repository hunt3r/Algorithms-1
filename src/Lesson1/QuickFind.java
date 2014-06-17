package Lesson1;


/**
 * Created by hunter on 6/16/14.
 */
public class QuickFind {

    private int[] id;


    public static void main(String[] args) {

        QuickFind qf = new QuickFind(10);
        qf.union(0, 1);
        qf.union(1, 3);
        qf.union(5, 6);

        System.out.println(qf.connected(0,1));
        System.out.println(qf.connected(0,3));
        System.out.println(qf.connected(0,6));

    }

    public QuickFind(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public boolean connected(int p, int q)
    {
        return id[p] == id[q];
    }

    public void union(int p, int q)
    {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i< id.length; i++)
            if (id[i] == pid) id[i] = qid;
    }


}
