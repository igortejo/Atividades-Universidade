import adt.linkedList.batch.BatchLinkedListImpl;
import util.GenericException;

public class TestBatchLinkedList {

    public static void main(String[] args) {
        BatchLinkedListImpl<Integer> list = new BatchLinkedListImpl<>();

        // Imprime a lista antes das inser��es
        System.out.println("Lista antes das inser��es: " + list.toStringFromHead());

        try {
            // Insere elementos em batch na posi��o 2
            Integer[] elementos = {10, 20, 30};
            list.inserirEmBatch(2, elementos);
        } catch (GenericException e) {
            System.out.println("Erro ao inserir em batch: " + e.getMessage());
        }

        // Imprime a lista ap�s as inser��es
        System.out.println("Lista ap�s as inser��es: " + list.toStringFromHead());
    }
}