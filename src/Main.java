
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyList newList = new MyList();

        newList.AddNode(new Node(5));
        newList.AddNode(new Node(7));
        newList.AddNode(new Node(51));
        newList.AddNode(new Node(25));
        newList.AddNode(new Node(53));
        newList.AddNode(new Node(54));

        System.out.println(newList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - prev node, 2 - next node");

        while (true){
            System.out.print(">> ");
            int input = scanner.nextInt();
            if (input == 1) newList.prevElem();
            if (input == 2) newList.nextElem();
        }
    }
}