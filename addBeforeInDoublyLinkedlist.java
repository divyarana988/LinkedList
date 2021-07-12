 public void addBefore(Node refNode, int data) {
      // complete this function.
      Node node = new Node(data);
      Node prevs = refNode.prev;
      
      if(prevs==null){
          node.next = refNode;
          refNode.prev = node;
          this.head = node;
      }else{
          prevs.next = node;
          node.prev = prevs;
          node.next = refNode;
          refNode.prev = node;
      }
      this.size++;
    }