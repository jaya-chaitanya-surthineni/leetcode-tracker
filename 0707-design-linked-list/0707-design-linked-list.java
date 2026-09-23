// class MyLinkedList {
//     class Node{
//         int data;
//         Node next;
//         Node prev;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//             this.prev=null;
//         }}
//         Node head;
//         Node tail;
//         int size;
    

//     public MyLinkedList() {
//         head=null;
//         tail=null;
//         size=0;
//     }
    
//     public int get(int index) {
//         if(index<0 || index>=size)return -1;
//         Node temp=head;
//         for(int i=0;i<index;i++){
//             temp=temp.next;
//         }
//         return temp.data;
//     }
    
//     public void addAtHead(int val) {
//         Node nw=new Node(val);
//         if(head==null){
//             head=tail=nw;
//         }
//         else{
//             nw.next=head;
//             head.prev=nw;
//             head=nw;
//         }
//         size++;

//     }
    
//     public void addAtTail(int val) {
//          Node nw=new Node(val);
//         if(tail==null){
//             head=tail=nw;
//         }
//         else{
//             tail.next=nw;
//             nw.prev=tail;
//             tail=nw;
//         }
//         size++;
//     }
    
//     public void addAtIndex(int index, int val) {
//         Node nw = new Node(val);
//         if(index<0 || index>size)return;
//         if(index==0){
//            addAtHead(val);
//            return;
//         }
//         else if(index==size){
//             addAtTail(val);
//             return;
//         }
//         Node temp=head;
//         for(int i=0;i<index;i++){
//             temp=temp.next;
//         }
//         temp.next=nw;
//         nw.prev=temp;
    
//     nw.prev=temp.next;
//     nw.next=temp;
//     temp.prev.next=nw;
//     temp.prev=nw;
//     size++;
//     }
//     public void deleteAtIndex(int index) {
//         if(index<0 || index>=size)return;
//         if(index==0){
//             head=head.next;
//             if(head!=null){
//                 head.prev=null;
//             }
//         }
//         else{
//           tail=null;
//           size--;
//           return;  
//         }
        
//         if(index==size-1){
//             tail.prev=tail;
//             tail.next=null;
//             size--;
//             return;
//         }
//         Node temp=head;
//         for(int i=0;i<index;i++){
//             temp=temp.next;
//         }
//         temp.prev.next=temp.next;
//         temp.next.prev=temp.prev;
//         size--;
//     }
// }

// /**
//  * Your MyLinkedList object will be instantiated and called as such:
//  * MyLinkedList obj = new MyLinkedList();
//  * int param_1 = obj.get(index);
//  * obj.addAtHead(val);
//  * obj.addAtTail(val);
//  * obj.addAtIndex(index,val);
//  * obj.deleteAtIndex(index);
//  */
class MyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public void addAtHead(int val) {
        Node nw = new Node(val);

        if (head == null) {
            head = tail = nw;
        } else {
            nw.next = head;
            head.prev = nw;
            head = nw;
        }

        size++;
    }

    public void addAtTail(int val) {
        Node nw = new Node(val);

        if (tail == null) {
            head = tail = nw;
        } else {
            tail.next = nw;
            nw.prev = tail;
            tail = nw;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size)
            return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        Node nw = new Node(val);

        nw.prev = temp.prev;
        nw.next = temp;

        temp.prev.next = nw;
        temp.prev = nw;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size)
            return;

        if (index == 0) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }

            size--;
            return;
        }


        if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;

            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }
}