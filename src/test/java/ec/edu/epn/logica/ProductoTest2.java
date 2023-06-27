package ec.edu.epn.logica;

import ec.edu.epn.vista.MenuInventario;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ProductoTest2 {
    @Test
    public void given_same_product_when_register_then_error(){
        Producto p = Mockito.mock(Producto.class);

        Producto p1 = new Producto("0001","Papas Rufles Original", 0.60, "Frito Lay", 10);
        Producto p2 = new Producto("0002","Papas Rufles Original", 0.60, "Frito Lay", 20);

        p.registrarProducto(p1);

        Mockito.when(p.evitarDuplicados(p2)).thenReturn(true);
        assertEquals(true,p.evitarDuplicados(p2));
    }
}