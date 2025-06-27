package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        // creating scanner that we will use throughout the method
        Scanner scanner = new Scanner(System.in);
        int userInput;
        Tree tree;
        System.out.println("Welcome lets get started");
        //first loop to create tree and get program going loops until user presses one
        while(true){
            System.out.println("To start please 1 this will create the initial tree or press 7 to exit");
            userInput = scanner.nextInt();

            if(userInput == 1){
                tree = new Tree(new int[]{4,2,6,1,3,5,7});
                System.out.println("tree root" + tree.root.val);
                break;
            } else if(userInput == 7 ){
                return;
            }
        }
        System.out.println(" ====== Tree created successfully =======");
        //second loop for additional functionality once tree is created.
        while(true){
            System.out.println("Press 2 to add a node");
            System.out.println("Press 3 to delete a node");
            System.out.println("Press 4 to print nodes in order");
            System.out.println("press 5 to print nodes in preOrder");
            System.out.println("Press 6 to print nodes in postOrder");
            System.out.println("press 7 to exit");

            userInput = scanner.nextInt();
            if(userInput == 2){
                int inputValue = scanner.nextInt();
                tree.insert(inputValue);
            } else if(userInput == 4){
                tree.printInOrder(tree.root);
            }else if(userInput == 5){
                tree.printPreOrder(tree.root);
            }else if(userInput == 6){
                tree.printPostOrder(tree.root);
            }else if (userInput == 7){
                return;
            }

        }



    }
}
