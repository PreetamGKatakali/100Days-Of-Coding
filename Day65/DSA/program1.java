import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * sort the two different linked list 
 */
public class program1 {
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(70);

        Node head=LL.head;

        LL.head=null;

        LL.addlast(80);
        LL.addlast(40);
        LL.addlast(60);

        Node head1=LL.head;

        LL.head=null;

        List<Integer> list=new ArrayList<>();

        while(head!=null && head1!=null){
            list.add(head.data);
            list.add(head1.data);
            head=head.next;
            head1=head1.next;
        }

        Collections.sort(list);

        for(Integer i : list){
            LL.addlast(i);
        }

        LL.display();
    }

   
}
