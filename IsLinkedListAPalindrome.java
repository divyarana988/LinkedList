public boolean IsPalindrome(){
    left = head;
    boolean res = IsPalindromeHelper(head);
    return res;
}

private boolean IsPalindromeHelper(Node node){
    if(node == null){
        return true;
    }

    boolean res = IsPalindromeHelper(node.next);
    Node right = node;

    if(res==false){
        return false;
    }else{
        if(left.data == right.data){
            left = left.next;
            return true;
        }else{
            return false;
        }
    }
}