import org.junit.Test;

public class LinkedListTest {

    @Test
    public void test(){
        MyLinkedList list = new MyLinkedList();
        list.add(15);
        list.add(16);
        list.add(10);
        list.traverse();
        System.out.println(list.find(10));
        System.out.println(list.find(15));
        System.out.println(list.find(16));
        System.out.println(list.find(20));
        System.out.println(list.find(1));

        list.delete(16);
        System.out.println("deleting 16: " + list.find(16));
        list.traverse();
        list.delete(15);
        list.traverse();
        list.delete(10);
        list.traverse();
        System.out.println("done");
    }
}
