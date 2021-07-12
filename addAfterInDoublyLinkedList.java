public void addAfter(Node refNode, int data) {
      // complete this function
      Node node = new Node(data);
      Node nbr = refNode.next;
      
      if(nbr==null){
          refNode.next = node;
          node.prev = refNode;
          this.tail = node;
      }else{
          refNode.next = node;
          node.prev = refNode;
          nbr.prev = node;
          node.next = nbr;
      }
      this.size++;
    }