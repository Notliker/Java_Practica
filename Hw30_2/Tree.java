package Hw30_2;
import java.util.Stack;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void insert(int value) {
        Node n = new Node();
        n.setValue(value);
        if (root == null) {
            root = n;
        }
        else {
            Node temp = root;
            Node parent;
            while (true) {
                parent = temp;
                if(value == temp.getValue()) {
                }
                else  if (value < temp.getValue()) {
                    temp = temp.getLeft();
                    if (temp == null){
                        parent.setLeft(n);
                        return;
                    }
                }
                else {
                    temp = temp.getRight();
                    if (temp == null) {
                        parent.setRight(n);
                        return;
                    }
                }
            }
        }
    }

    public void deleteNode(int value) {
        Node temp = root;
        Node parent = root;
        boolean isLeft = true;
        while (temp.getValue() != value) {
            parent = temp;
            if (value < temp.getValue()) {
                isLeft = true;
                temp = temp.getLeft();
            }
            else {
                isLeft = false;
                temp = temp.getRight();
            }
        }

        if (temp.getLeft() == null && temp.getRight() == null) {
            if (temp == root)
                root = null;
            else if (isLeft)
                parent.setLeft(null);
            else
                parent.setRight(null);
        }
        else if (temp.getRight() == null) {
            if (temp == root)
                root = temp.getLeft();
            else if (isLeft)
                parent.setLeft(temp.getLeft());
            else
                parent.setRight(temp.getLeft());
        }
        else if (temp.getLeft() == null) {
            if (temp == root)
                root = temp.getRight();
            else if (isLeft)
                parent.setLeft(temp.getRight());
            else
                parent.setRight(temp.getRight());
        }
        else {
            Node heir = receiveRight(temp);
            Node hL = temp.getLeft();
            heir.setLeft(hL);
            if (temp == root)
                root = heir;
            else if (isLeft)
                parent.setLeft(heir);
            else
                parent.setRight(heir);
        }
    }

    private Node receiveRight(Node node) {
        Node parent = node;
        Node heir = node;
        Node temp = node.getRight();
        while (temp != null)
        {
            parent = heir;
            heir = temp;
            temp = temp.getLeft();
        }
        if (heir != node.getRight())
        {
            parent.setLeft(heir.getRight());
            heir.setRight(node.getRight());
        }
        return heir;
    }
    public void clear() {
        int val = root.getValue();
        Node temp = root;
        while(temp.getLeft() != null) {
            int vLeft = temp.getLeft().getValue();
            deleteNode(vLeft);
        }
        while(temp.getRight() != null) {
            int vRight = temp.getRight().getValue();
            deleteNode(vRight);
        }
        deleteNode(val);
        System.out.println("Tree clear");
    }
    public void printTree() {
        Stack general = new Stack();
        general.push(root);
        int t = 32;
        boolean isRowEmpty = false;
        while (isRowEmpty == false) {
            Stack local = new Stack();
            isRowEmpty = true;

            for (int j = 0; j < t; j++)
                System.out.print(" ");
            while (general.isEmpty() == false) {
                Node temp = (Node) general.pop();
                if (temp != null) {
                    System.out.print(temp.getValue());
                    local.push(temp.getLeft());
                    local.push(temp.getRight());
                    if (temp.getLeft() != null || temp.getRight() != null)
                        isRowEmpty = false;
                }
                else {
                    System.out.print(" ");
                    local.push(null);
                    local.push(null);
                }
                for (int j = 0; j < t * 2 - 1; j++)
                    System.out.print(" ");
            }
            System.out.println();
            t = t / 2;
            while (local.isEmpty() == false)
                general.push(local.pop());
        }
    }
}