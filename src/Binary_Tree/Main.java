package Binary_Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.prettyDisplay();

//        BST tree = new BST();
//        int[] nums ={5,2,7,1,4,6,9,8,3,10};
//        tree.populate(nums);
//
//        tree.display();

        AVL tree = new AVL();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
}
