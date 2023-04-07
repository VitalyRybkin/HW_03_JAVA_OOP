public class Node implements ILink{

    private final int node;

    public Node(int node) {
        this.node = node;
    }

    @Override
    public void nextNode(MyList myList) {
        if (this.hasNextNode(myList)) {
            myList.currentNode += 1;
            System.out.print("Next node: ");
            System.out.println(myList.getMyList().get(myList.currentNode));
        }
        else System.out.println("Nothing else this way!");
    }

    @Override
    public void prevNode(MyList myList) {
        if (this.hasPrevNode(myList)) {
            myList.currentNode -= 1;
            System.out.print("Prev. node: ");
            System.out.println(myList.getMyList().get(myList.currentNode));
        }
        else System.out.println("Nothing else this way!");
    }

    @Override
    public boolean hasNextNode(MyList myList) {
        return myList.currentNode + 1 < myList.getMyList().size();
    }

    @Override
    public boolean hasPrevNode(MyList myList) {
        return myList.currentNode > 0;
    }

    @Override
    public String toString() {
        return String.valueOf(node);
    }
}
