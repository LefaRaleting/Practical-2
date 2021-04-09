/**
 * Name:Lefa Raleting
 * Student Number:14222460
 */

public class MoveToFrontOrganisingList extends OrganisingList {

    ////// Implement the function below this line //////

    /**
     * Retrieve the node with the specified key and move the accessed node
     * to the front, then recalculate all data fields.
     * @return The node with its data value before it has been moved to the front,
     * otherwise 'null' if the key does not exist.
     */
    @Override
    public ListNode searchNode(Integer key) {

        //Your code goes here
        if(!contains(key)){//doesnt contain
            return null;
        }
        if(root.key==key){//if its by the front already or is single node
            ListNode placeholder;
            placeholder=new ListNode(root.key, root.data);
            calculateData();
            return placeholder;
        }
        else{
            ListNode placeholder;
            ListNode trans= root;
            ListNode prev=trans;
            while(trans.key!=key){
                prev=trans;
                trans=trans.next;
            }
            placeholder=new ListNode(trans.key, trans.data);
            prev.next=trans.next;
            trans.next=root;
            root=trans;
            calculateData();


            return placeholder;


        }



    }


}