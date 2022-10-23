import aluno.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos () {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class, () -> new  Email(""));

        assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));

    }

    @Test
    void deveriaCriarEmailComEnderecosValidos () {

        String endereco = "fulano@outlook.com";
        Email email = new Email(endereco);
        assertEquals(endereco, email.getEndereco());

    }
}
