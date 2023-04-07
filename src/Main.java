
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> linkedList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i ++){
            linkedList.add(random.nextInt(1, 100));
        }

        System.out.println(linkedList);

        MyList newList = new MyList(linkedList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - prev node, 2 - next node");

        while (true){
            System.out.print(">> ");
            int input = scanner.nextInt();
            if (input == 1) {
                if (newList.hasPrevNode(newList.getNode())) {
                    newList.prevNode();
                    System.out.print("Prev. node: ");
                    newList.printNode(newList.getNode());
                }
            }
            if (input == 2) {
                if (newList.hasNextNode(newList.getNode())) {
                    newList.nextNode();
                    System.out.print("Next node: ");
                    newList.printNode(newList.getNode());
                }
            }
        }

    }

}