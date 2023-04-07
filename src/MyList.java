import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {

    public List<Node> myList = new ArrayList<>();

    public int currentNode = 0;

    public void AddNode(Node node) {
        this.myList.add(node);
    }

    public List<Node> getMyList() {
        return myList;
    }


    public void prevElem() {
        Node node = this.getMyList().get(currentNode);
        node.prevNode(this);
    }

    public void nextElem() {
        Node node = this.getMyList().get(currentNode);
        node.nextNode(this);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.getMyList().toArray());
    }


}
