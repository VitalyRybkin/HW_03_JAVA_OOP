import java.util.List;

public class MyList implements ILink {

    private final List<Integer> myList;

    private int node = 0;

    public MyList(List<Integer> myList) {
        this.myList = myList;
    }

    public List<Integer> getMyList() {
        return myList;
    }

    public int getNode() {
        return node;
    }

    @Override
    public void nextNode() {
        this.node += 1;
    }

    @Override
    public void prevNode() {
        this.node -= 1;
    }

    @Override
    public void printNode(int node) {
        System.out.println(this.getMyList().get(node));
    }

    @Override
    public boolean hasNextNode(int node) {
        if (node + 1 < this.getMyList().size())
            return true;
        System.out.println("End of list!");
        return false;
    }

    @Override
    public boolean hasPrevNode(int node) {
        if (node - 1 > 0)
            return true;
        System.out.println("End of list!");
        return false;
    }
}
