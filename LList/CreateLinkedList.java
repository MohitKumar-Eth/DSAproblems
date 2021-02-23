package LList;

class Node{
    int data;
    Node next;
    Node(int data, Node next_node){
        this.data = data;
        this.next = next_node;
    }
}

public class CreateLinkedList {

    static Node push(int data, Node head){
        return new Node(data, head);
    }

    static void printList(Node head){
        if(head == null) return;

        Node start = head;
        while(start != null){
            System.out.print(start.data + " -> ");
            start = start.next;
        }
        System.out.println("null");
    }


    static Node createLList(int[] keys){
        Node head = null;
      for(int i = keys.length-1; i >= 0; i--){
         head = push(keys[i], head);
      }
      return head;
    }

    static Node insertAtFront(int data, Node head){
        return push(data, head);
    }

    static Node insertAtEnd(int data, Node head){
        if(head == null){
                return new Node(data, null);
        }
        Node start = head;
        while(start.next != null){
            start = start.next;
        }
        start.next = new Node(data, null);
        return head;
    }

    static Node deleteAtFront(Node head){
        return head.next;
    }

    static Node deleteAtEnd(Node head){
        if(head == null){
            return head;
        }
        Node start = head;
        while(start.next.next != null){
            start = start.next;
        }
        start.next = null;
        return head;
    }

    static Node insertAtPosition(int i, int data, Node head){
        if(head == null && i > 1){
            System.out.println("position cannot be greater than elements");
            return head;
        }

        if(i == 1){
            Node newNode = new Node(data, head);
            return newNode;
        }

        Node start = head;
        int k = 1;
        while(k < i-1){
            start = start.next;
            k++;
        }
        start.next = new Node(data, start.next);
        return head;

    }
    static Node deleteAtPosition(int i, Node head){
        Node start = head;
        int k =1;
        while(k < i-1){
            start = start.next;
            k++;
        }
        start.next = start.next.next;
        return head;
    }

    static int getSIZE(Node head){
        if(head == null){
            return 0;
        }
        return getSIZE(head.next)+1;
    }

    static Node rorateListCW(int k, Node head ){
        int length = getSIZE(head);
        k = k%length;
        if(k == 0){
          return head;
        }
        int i = 1;
        Node start = head;
        while (i < length-k){
           start = start.next;
           i++;
        }
        Node temp = start.next;
        Node newHead = temp;
        start.next = null;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return newHead;
    }

    static Node rorateListACW(int k, Node head){
        int length = getSIZE(head);
        k = k%length;
        if(k == 0){
            return head;
        }
        int i = 1;
        Node start = head;
        while(i < k){
            start = start.next;
            i++;
        }
        Node newHead = start.next;
        Node temp = newHead;
        start.next = null;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return newHead;
    }

    static Node reverseRecursion(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node temp = reverseRecursion(head.next);
        head.next.next = head;
        head.next= null;
        
        return temp;
    }

    public static void main(String[] args){
        int[] a = {2,4,6,8,5,7};
        Node head = null;
        head = createLList(a);
        printList(head);

//        head = insertAtFront(1, head);
//        printList(head);
//
//        head = insertAtEnd(10, head);
//        printList(head);
//
//        int SIZE = getSIZE(head);
//        System.out.println("SIZE: " + SIZE);
//
//        head = deleteAtFront(head);
//        printList(head);
//
//        head = deleteAtEnd(head);
//        printList(head);
//
//        head = insertAtPosition(2, 33, head);
//        printList(head);
//
//        head = deleteAtPosition(4, head);
//        printList(head);

//        head = rorateListCW(6, head);
//        printList(head);

//        head = rorateListACW(0, head);
//        printList(head);

//        head = reverseRecursion(head);
//        printList(head);

    }
}
