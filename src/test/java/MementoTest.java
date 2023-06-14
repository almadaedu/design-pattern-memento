import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class MementoTest {
    @Test
    void testMementoPattern() {
        // Criação do editor e histórico
        Editor editor = new Editor("Texto inicial");
        History history = new History();

        // Salva o estado inicial
        history.push(editor.createMemento());

        // Faz uma alteração
        editor.setContent("Texto modificado");

        // Verifica a alteração
        assertEquals("Texto modificado", editor.getContent());

        // Salva o estado após a alteração
        history.push(editor.createMemento());

        // Faz mais uma alteração
        editor.setContent("Outro texto modificado");

        // Verifica a nova alteração
        assertEquals("Outro texto modificado", editor.getContent());

        // Restaura o estado anterior
        editor.restoreMemento(history.pop());

        // Verifica se o estado foi restaurado corretamente
        assertEquals("Texto modificado", editor.getContent());

        // Restaura o estado inicial
        editor.restoreMemento(history.pop());

        // Verifica se o estado inicial foi restaurado corretamente
        assertEquals("Texto inicial", editor.getContent());
    }
}