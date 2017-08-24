/*
TASK:
    A Node class is provided for you. A Node object has an integer data field, data, and a Node instance pointer, next,
    pointing to another node (i.e.: the next node in a list).
    A removeDuplicates function is declared in your editor, which takes a pointer to the head node of a linked list as a
    parameter. Complete removeDuplicates so that it deletes any duplicate nodes from the list and returns the head of the updated list.

 */
package marzgra.hackerrank._30daysofcode.Day24;

import java.util.Scanner;

public class Day24 {
    private static Node removeDuplicates(Node head) {
        if (head == null) return null;
        Node temp = head;
        while (temp.next != null) {
            if (temp.data != temp.next.data) temp = temp.next;
            else {
                temp.next = temp.next.next;
            }
        }

        return head;
    }

    private static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null) head = p;
        else if (head.next == null) head.next = p;
        else {
            Node start = head;
            while (start.next != null) start = start.next;
            start.next = p;
        }
        return head;
    }

    private static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);
    }
}