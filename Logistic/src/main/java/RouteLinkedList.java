class RouteLinkedList<T extends Checkpoint> {
    private Node <T> head;

    public void addCheckpoint(T checkpoint){
        Node <T> newNode = new Node<>(checkpoint);
        if(head == null){
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public boolean removeCheckpoint(String checkpointId){
        if(head == null) return false;

        if(head.data.checkpointId.equals(checkpointId)){
            head = head.next;
            return true;
        }

        Node<T> temp = head;
        while (temp.next != null){
            if(temp.next.data.checkpointId.equals(checkpointId)){
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public T findCheckpoint(String checkpointId) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.checkpointId.equals(checkpointId)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }
    public double computeTotalDistance() {
        double total = 0;
        Node<T> temp = head;

        while (temp != null) {
            total += temp.data.distanceFromLast;
            temp = temp.next;
        }
        return total;
    }
    public double computeTotalPenalty() {
        double total = 0;
        Node<T> temp = head;

        while (temp != null) {
            total += temp.data.Penalty();
            temp = temp.next;
        }
        return total;
    }
    public boolean isConsistent() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.getType().equals("Delivery")) {
                hasDelivery = true;
            }
            if (temp.data.getType().equals("Fuel")) {
                hasFuel = true;
            }
            temp = temp.next;
        }

        return hasDelivery && hasFuel;
    }
    public void printRoute() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(
                    temp.data.getType() + " -> " + temp.data.locationName
            );
            temp = temp.next;
        }
    }
}
