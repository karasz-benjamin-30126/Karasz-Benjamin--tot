package isp.lab3;

import isp.lab3.exercise1.Tree;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {
    @Test
    public void testGrow1()
    {
        Tree test_tree= new Tree();
        test_tree.grow(3);
        assertEquals(18, test_tree.height);
    }
    @Test
    public void testGrow2()
    {
        Tree test_tree= new Tree();
        test_tree.grow(0);
        assertEquals(15, test_tree.height);
    }
    @Test
    public void testToString()
    {
        Tree test_tree = new Tree();
        assertEquals("The tree has the height of: 15 meters.", test_tree.toString());
    }
}
