private void addFirstNode(Node node) {
      if (this.size == 0)
        this.head = this.tail = node;
      else {
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
      }
      this.size++;
    }

    public void addFirst(int val) {
      Node node = new Node(val);
      addFirstNode(node);
    }