package LinkedList.DoubleLinkedList;


// Assignment 4
/**
 * Implement an application that support undo/redo functionality. Use a linked list to maintain a sequence of states.\
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
    public T undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev; // fixed line
            return currentState.state;
        }
        System.out.println("There is no previous state!");
        return null;
    }

    // Perform an operation
    public void addState(T newState) {
        Node newNode = new Node(newState);
        if (currentState != null) {
            currentState.next = newNode;
            newNode.prev = currentState; // Bring new node back to the current
        } else {
            head = newNode; // Node becomes the head
        }
    currentState = newNode;
    }

    //Redo Operation
    public T redo() {
        if ( currentState != null && currentState.next != null) {
            currentState = currentState.next; // moves one state
            return currentState.state;
        }
        System.out.println("There is no next state!");
        return null;


    }

    // Displays of the methods
    public static void main(String[] args) {
        UndoRedoManager<String> manager = new UndoRedoManager<>();

        // Add states - need 5
        manager.addState("1");
        manager.addState("2");
        manager.addState("3");
        manager.addState("4");
        manager.addState("5");

        // Print out Undo and Redo
        String prev = manager.undo();
        System.out.println(" Undo: " + prev);
        String current = manager.redo();
        System.out.println(" Redo: " + current);

    }
}
