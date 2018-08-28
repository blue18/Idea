import code.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void addNode() {
        // Arrange
        final int expected = 4;
        LinkedList list = new LinkedList();

        // Act
        list.addAtTheEnd(expected);

        // Assert
        Assert.assertTrue(list.accessNode(expected));
    }
}
