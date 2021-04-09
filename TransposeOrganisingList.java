/**
 * Name:Lefa
 * Student Number: 14222460
 */

public class TransposeOrganisingList extends OrganisingList {

    ////// Implement the function below this line //////

    /**
     * Retrieve the node with the specified key and swap the
     * accessed node with its predecessor, then recalculate all data fields.
     * @return The node with its data value before it has been moved,
     * otherwise 'null' if the key does not exist.
     */
    @Override
    public ListNode searchNode(Integer key) {

	//Your code goes here
        if(!contains(key)){
            return null;
        }
        if(root.key==key){//if its by the front already or is single node
            ListNode placeholder=root;
            placeholder=new ListNode(root.key, root.data);
            calculateData();
            return placeholder;
        }
        else{
            ListNode placeholder;
            ListNode trans= root;
            ListNode prev=trans;
            ListNode prev2=prev;
            while(trans.key!=key){
                prev2=prev;
                prev=trans;
                trans=trans.next;
            }
            if(prev2!=prev){
                //placeholder=trans;
                placeholder=new ListNode(trans.key, trans.data);
                prev.next=trans.next;
                prev2.next=trans;
                trans.next=prev;
                //calculateData();
                //return placeholder
            }
            else{
                //placeholder=trans;
                placeholder=new ListNode(trans.key, trans.data);
                prev.next=trans.next;
                trans.next=prev;
                root=trans;
                //calculateData();


            }


            calculateData();
            return placeholder;


        }

    }


}