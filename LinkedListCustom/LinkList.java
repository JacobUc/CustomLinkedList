package LinkedListCustom;

class LinkList {
    private Link first;
    
    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first==null);
    }

    public void insertFirst(double dd) { 
        Link newLink = new Link(dd);
        newLink.next = first; 
        first = newLink;
    }

    public Link deleteFirst() throws Exception {

        if(isEmpty()){
            throw new Exception("La lista esta vacia, no se puede hacer esta operacion");
        }

        Link temp=null; 
        if(!isEmpty()){
            temp = first;
            first = first.next;
        }
        return temp; 
    }

    public void displayList() {

        if(isEmpty()){
            System.out.println("\nLa lista esta vacia, ningun elemento para mostrar");
        }else{
            System.out.print("List (first--> ");
            Link current = first;
            while(current != null) {
                current.displayLink(); 
                current = current.next; 
            }
            System.out.println("<--last)");
        }
        
    }

}
