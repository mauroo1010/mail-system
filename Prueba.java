

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Prueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Prueba
{
    private MailServer mailServ1;
    private MailServer mailServ2;
    private MailClient mailClie1;
    private MailClient mailClie2;

    /**
     * Default constructor for test class Prueba
     */
    public Prueba()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        mailServ1 = new MailServer();
        
        mailServ2 = new MailServer();
        mailClie1 = new MailClient(mailServ2, "pepe@gmail.com");
        mailClie2 = new MailClient(mailServ2, "maria@gmail.com");
        mailClie1.sendMailItem("maria@gmail.com", "hola Maria, aoy Pepe");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
