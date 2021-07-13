private Node removeLastNode() {
      Node node = this.tail;
      if (this.size == 1)
        this.head = this.tail = null;
      else {
        Node prevNode = this.tail.prev;
        prevNode.next = null;
        node.prev = null;

        this.tail = prevNode;
      }

      this.size--;
      return node;
    }

    public int removeLast() {
      if (ListIsEmptyException())
        return -1;
      Node node = removeLastNode();
      return node.data;
    }
