package ec.edu.epn.logica;

import static org.junit.Assert.*;

public class SesionTest {
    public void given_the_credentials_when_login_then_ok(){
        Sesion s = new Sesion();
        assertEquals("admin",s.validarSesion("admin","admin123"));
    }
}