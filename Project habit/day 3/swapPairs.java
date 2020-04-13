public ListNode swapPairs(ListNode node) {
        if(node == null || node.next == null)
            return node;
        ListNode odd = node, even = node.next;
        ListNode en = null;
        while(odd != null && even != null) {
            if(en == null)
                node = even;
            en = even.next;
            even.next = odd;
            if(en == null || en.next == null) {
                odd.next = en;
                break;
            } else {
                odd.next = en.next;
            }
            odd = en;
            even = en.next;
        }
        return node;
    }