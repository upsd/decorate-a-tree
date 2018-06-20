import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratingTreeTests {

    @Test
    public void canCreateSimpleTree() {
        SimpleTree myTree = new SimpleTree();

        assertEquals("I am a tree", myTree.tellMe());
    }

    @Test
    public void canDecorateSimpleTree() {
        SimpleTree myTree = new SimpleTree();
        OakTree oaky = new OakTree(myTree);

        assertEquals("I am a tree and I am made out of Oak", oaky.tellMe());
    }
}