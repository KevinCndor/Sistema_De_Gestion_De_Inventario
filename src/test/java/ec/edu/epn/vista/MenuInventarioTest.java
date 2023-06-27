package ec.edu.epn.vista;

import ec.edu.epn.logica.Producto;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class MenuInventarioTest {
    @Test
    public void given_product_when_register_then_ok(){
        MenuInventario mnI = Mockito.mock(MenuInventario.class);

        Producto p1 = new Producto("0001","Papas Rufles Original", 0.60, "Frito Lay", 10);
        Mockito.when(mnI.validarRegistro(p1)).thenReturn(true);
        assertEquals(true,mnI.validarRegistro(p1));

        Producto p2 = new Producto("0002","Papas Rufles Original", 0.60, "Frito Lay", 12);
        Mockito.when(mnI.validarRegistro(p2)).thenReturn(false);
        assertEquals(false,mnI.validarRegistro(p2));
    }
}