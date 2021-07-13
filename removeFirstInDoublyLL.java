   private Node removeFirstNode() {
      Node node = this.head;
      if (this.size == 1)
        this.head = this.tail = null;
      else {
        Node nextNode = this.head.next;
        nextNode.prev = null;
        node.next = null;

        this.head = nextNode;
      }

      this.size--;
      return node;
    }

    public int removeFirst() {
      if (ListIsEmptyException())
        return -1;
      Node node = removeFirstNode();
      return node.data;
    }