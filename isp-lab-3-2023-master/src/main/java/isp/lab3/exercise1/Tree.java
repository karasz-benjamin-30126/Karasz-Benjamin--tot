package isp.lab3.exercise1;

public class Tree {
    public int height;

    public Tree()
    {
        this.height=15;
    }

    public void grow(int meters)
    {
        if(meters>1)
        {
            this.height+= meters;
        }
    }

    public String toString()
    {
        return "The tree has the height of: "+this.height+ " meters.";
    }


    public static void main(String[] args)
    {
        Tree tree= new Tree();
        tree.grow(3);
        System.out.println(tree.toString());
    }
}
