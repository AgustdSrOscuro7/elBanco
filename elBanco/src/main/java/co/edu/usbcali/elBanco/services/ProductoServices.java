package co.edu.usbcali.elBanco.services;

import co.edu.usbcali.elBanco.dtos.ProductoDTO;

import java.util.List;

public interface ProductoServices {
    List<ProductoDTO> obtenerProductos();
    ProductoDTO registrarProducto(ProductoDTO productoDTO) throws Exception;

}
