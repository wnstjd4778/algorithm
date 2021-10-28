import java.io.*;
import java.util.*;

public class Main {

    static class Node{
        char data;
        Node left, right;
        Node(char data) {
            this.data = data;
        }
    }

    static class Tree {
        Node root;

        public void Add(char data, char leftData, char rightData) {
            if (root == null) {
                if (data != '.') {
                    root = new Node(data);
                }
                if (leftData != '.') {
                    root.left = new Node(leftData);
                }
                if (rightData != '.') {
                    root.right = new Node(rightData);
                }
            } else {
                Search(root, data, leftData, rightData);
            }
        }

        static void Search(Node root, char data, char leftData, char rightData) {
            if (root == null) {
                return;
            } else if (root.data == data) {
                if (leftData != '.') {
                    root.left = new Node(leftData);
                }
                if (rightData != '.') {
                    root.right = new Node(rightData);
                }
            } else {
                Search(root.left, data, leftData, rightData);
                Search(root.right, data, leftData, rightData);
            }
        }

        static void PreOrder(Node root) {
            System.out.print(root.data);
            if (root.left != null) {
                PreOrder(root.left);
            }
            if (root.right != null) {
                PreOrder(root.right);
            }
        }

        static void InOrder(Node root) {
            if (root.left != null) {
                InOrder(root.left);
            }
            System.out.print(root.data);
            if (root.right != null) {
                InOrder(root.right);
            }
        }

        static void PostOrder(Node root) {
            if (root.left != null) {
                PostOrder(root.left);
            }
            if (root.right != null) {
                PostOrder(root.right);
            }
            System.out.print(root.data);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Tree tree = new Tree();
        for(int i = 0; i < n; i++) {
            tree.Add(sc.next().charAt(0), sc.next().charAt(0), sc.next().charAt(0));
        }

        tree.PreOrder(tree.root);
        System.out.println();
        tree.InOrder(tree.root);
        System.out.println();
        tree.PostOrder(tree.root);
    }
}
