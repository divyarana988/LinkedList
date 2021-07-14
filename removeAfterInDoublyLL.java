public int removeAfter(Node refNode) {
      // complete your Code
      
      if(refNode.next==null){
          System.out.println("LocationIsInvalid: ");
          return -1;
      }
      else{
         Node fwd = refNode.next;
         if(fwd.next==null){
             refNode.next = null;
             fwd.prev = null;
             tail = refNode;
         }else{
             refNode.next = fwd.next;
             fwd.next.prev = refNode;
             fwd.next = null;
             fwd.prev = null;
         }
         size--;
         return fwd.data;
      }
      
    }