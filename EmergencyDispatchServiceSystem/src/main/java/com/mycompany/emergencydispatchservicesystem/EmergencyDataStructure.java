
package com.mycompany.emergencydispatchservicesystem;

public class EmergencyDataStructure<T> {

    // Node represents one item in the linked list
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // First node of the linked list
    private Node<T> head;

    // Number of items
    private int size;

    // Constructor
    public EmergencyDataStructure() {
        head = null;
        size = 0;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Add a new item at the end
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    // Get the number of items
    public int getSize() {
        return size;
    }

    // Display all items
    public void display() {
        Node<T> current = head;

        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    
    // Search for an item using a specific Incident ID
    public T search(String incidentId) {
        Node<T> current = head;

        while (current != null) {

            if (current.data.toString().contains(incidentId)) {
                return current.data;
            }

            current = current.next;
        }

        return null;
    }
    
    // Delete an emergency report using its Incident ID
    public boolean delete(String incidentId) {

        if (head == null) {
            return false;
        }

        // If the first node contains the Incident ID
        if (head.data.toString().contains(incidentId)) {
            head = head.next;
            size--;
            return true;
        }

        Node<T> current = head;

        while (current.next != null) {

            if (current.next.data.toString().contains(incidentId)) {
                current.next = current.next.next;
                size--;
                return true;
            }

            current = current.next;
        }

        return false;
    }
    
    // Add a new item at the beginning of the linked list
    public void addFirst(T data) {

        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        head = newNode;

        size++;
    }
    
    // Update an existing item using its Incident ID
    public boolean update(String incidentId, T newData) {

        Node<T> current = head;

        while (current != null) {

            if (current.data.toString().contains(incidentId)) {
                current.data = newData;
                return true;
            }

            current = current.next;
        }

        return false;
    }
    
    // Insert an item at a specific position
    public boolean addAtPosition(int position, T data) {

        if (position < 0 || position > size) {
            return false;
        }

        if (position == 0) {
            addFirst(data);
            return true;
        }

        Node<T> newNode = new Node<>(data);
        Node<T> current = head;

        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        size++;
        return true;
    }
    
    // Remove the first item in the linked list
    public boolean removeFirst() {

        if (head == null) {
            return false;
        }

        head = head.next;
        size--;

        return true;
    }
    // Remove the last item in the linked list
public boolean removeLast() {
    if (head == null) {
        return false;
    }

    if (head.next == null) {
        head = null;
        size--;
        return true;
    }

    Node<T> current = head;

    while (current.next.next != null) {
        current = current.next;
    }

    current.next = null;
    size--;
    return true;
}
// View the first item without removing it
public T peekFirst() {
    if (head == null) {
        return null;
    }

    return head.data;
}
// Check if an Incident ID exists in the linked list
public boolean contains(String incidentId) {
    Node<T> current = head;

    while (current != null) {
        if (current.data.toString().contains(incidentId)) {
            return true;
        }

        current = current.next;
    }

    return false;
}
// Remove all items from the linked list
public void clear() {
    head = null;
    size = 0;
}




}


