import code.LinkedList;
import code.Node;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void initNode() {
        // Arrange
        final int expected = 5;
        Node aNode;
        aNode = new Node(expected);

        // Act
        final int actual = aNode.getData();

        // Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addNode() {
        // Arrange
        final int expected = 4;
        LinkedList list = new LinkedList();

        // Act
        list.addAtTheEnd(expected);
        final boolean actual = list.accessNode(expected);

        // Assert
        Assert.assertTrue(actual);
    }
}
