private Node removeBeforeNode(Node refNode) {
      Node prevNode = refNode.prev;
      if (prevNode.prev == null) {
        refNode.prev = null;
        prevNode.next = null;
        this.head = refNode;
      } else {
        refNode.prev = prevNode.prev;
        prevNode.prev.next = refNode;

        prevNode.next = null;
        prevNode.prev = null;
      }
      this.size--;
      return prevNode;
    }

    public int removeBefore(Node refNode) {
      if (refNode.prev == null) {
        System.out.print("LocationIsInvalid: ");
        return -1;
      }
      return removeBeforeNode(refNode).data;
    }

    public int removeBefore(int idx) {
      Node node = getNodeAt(idx);
      return removeBefore(node);
    }