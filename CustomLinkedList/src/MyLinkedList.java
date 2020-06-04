public class MyLinkedList {

    // head              tail
    //  |                 |
    //Node --> node --> node
    //each  node contains important data
    //add node
    //delete node
    //find node
    Node head;
    Node tail;
    int size = 0;

    public void add(int data)
    {
        // scenario 1: Empty Linked list
        // scenario 2: Non empty linked list (Node 15)->(Node 16)

        Node node = new Node(data);

        if (tail == null)
        {
            head = node;
            tail = node;
        }
        else {
            tail.nextNode = node;
            tail = node;
        }
        size++;

    }


    public Node delete(int data)
    {
        // scenario 1: empty linked list
        // scenario 2: non-empty linked list
        // scenario 3: delete element at tail
        // scenario 4: delete element at head
        // scenario 5: delete element at the middle
        // deleted (find node(10))[node(15) -> node(16) -> node(10)]

        Node nodeToReturn = null;

        if (size == 0 )
            return null;

        if (size == 1)
        {
            nodeToReturn = head;
            head = null;
            tail = null;
            size--;
            return nodeToReturn;
        }

        Node nodeBeforeNodeToDelete = findNodeBefore(data);

        // case where we need to delete the head
        if (nodeBeforeNodeToDelete.data == 0)
        {
            head = head.nextNode;
            size--;
        }
        else if (nodeBeforeNodeToDelete != null)
        {
            if (tail.data == data)
            {
                nodeBeforeNodeToDelete.nextNode = null;
                tail = nodeBeforeNodeToDelete;
            }
            else{
                nodeBeforeNodeToDelete.nextNode = nodeBeforeNodeToDelete.nextNode.nextNode;
            }
            size--;
        }
        return null;
    }

    /**
     * if this method return an empty node, it means that the element we want to delete
     * is at the head of the linked list and return null if there's no match.
     * Return populated node if matched
     * @param data
     * @return
     */
    public Node findNodeBefore(int data)
    {
        // scenario 1: empty linked list
        // scenario 2: non-empty linked list

        if (head.data == data)
        {
            return new Node();
        }

        Node node = head;

        while (node.nextNode != null)
        {
            if (node.nextNode.data == data)
                return node;
            node = node.nextNode;

        }
        return null;
    }

    public Node find (int data)
    {
        // scenario 1: empty linked list
        // scenario 2: non-empty linked list
        if (head == null)
        {
            return null;
        }

        if (head.data == data)
        {
            return head;
        }

        Node node = head;

        while (node.nextNode != null)
        {
            node = node.nextNode;
            if(node.data == data)
            {
                return node;
            }

        }

        return null;
    }

    public void traverse(){
        if (head != null)
        {
            Node node = head;
            System.out.println(node);
            while (node != null)
            {
                node = node.nextNode;
                System.out.println(node);
            }
        }
    }
}
