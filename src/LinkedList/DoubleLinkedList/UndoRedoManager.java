package LinkedList.DoubleLinkedList;


// Assignment 4
/**
 * Implememt an application that support undo/redo functionality. Use a linked list to maintain a sequence of states.\
 * Each state change is stored as a node in the list, allowing for easy navigation
 * 1<>2<>3<>4<>5
 */

// Note: State Change is stored as Node

public class UndoRedoManager<T> {
    private class Node {
        private T state; // Note: T stands for type
        private Node prev;
        private Node next;

        // Constructor for the state
        private Node(T state) {
            this.state = state;
        }

    }

    private Node currentState; // Track what node in list
    private Node head;

    // Undo operation
    // Check at method isn't working
    public T undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.next;
            return currentState.state;
        }
        System.out.println("There is no previous state!");
        return null;
    }

    // Perform an operation
    public void addState(T newState) {
        //implement me

    }

    //Redo Operation
    public T redo() {
        //implement me


    }

    public static void main(String[] args) {

    }
}
