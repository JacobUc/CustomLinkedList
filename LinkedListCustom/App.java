package LinkedListCustom;

public class App {
    
    public static void main(String[] args) throws Exception  {
        LinkList nuevaLista = new LinkList();

        nuevaLista.displayList();

        
        if(nuevaLista.isEmpty())
            System.out.println("\nLa lista esta vacia");
        
        //Insertamos 6 elementos
        nuevaLista.insertFirst(50);
        nuevaLista.insertFirst(60);
        nuevaLista.insertFirst(70);
        nuevaLista.insertFirst(80);
        nuevaLista.insertFirst(90);
        nuevaLista.insertFirst(100);

        //Eliminamos los dos primeros elementos (100)
        nuevaLista.deleteFirst();
        nuevaLista.deleteFirst();

        //Mostramos la lista
        nuevaLista.displayList();
        
    }
    
}
