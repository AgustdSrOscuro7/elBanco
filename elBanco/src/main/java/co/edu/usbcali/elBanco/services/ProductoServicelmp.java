package co.edu.usbcali.elBanco.services;

import co.edu.usbcali.elBanco.dtos.ProductoDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductoServicelmp implements ProductoServices{
    @Override
    public List<ProductoDTO> obtenerProductos() {
        return Arrays.asList(
             ProductoDTO.builder()
                     .idProducto("1")
                     .nombreProduct("Samsung galaxy s23")
                     .precio(2500000)
                     .nombreFabricante("Samsung")
                     .descripcionProducto("telefono celular con tecnologia 5G")
                     .build(),
                ProductoDTO.builder()
                        .idProducto("2")
                        .nombreProduct("iphon 13")
                        .precio(4500000)
                        .nombreFabricante("Apple")
                        .descripcionProducto("telefono celular con tecnologia 5G")
                        .build()
        );
    }

    @Override
    public ProductoDTO registrarProducto(ProductoDTO productoDTO) throws Exception {

        if(productoDTO.getIdProducto() == null || productoDTO.getIdProducto().isEmpty()) {
            throw new Exception("El id producto no puede estar nulo");
        }

        if(productoDTO.getNombreProduct() == null || productoDTO.getNombreProduct().isEmpty()) {
            throw new Exception("El nombre producto no puede estar nulo");
        }

        if(productoDTO.getPrecio() == null) {
            throw new Exception("El precio no puede estar nulo");
        }

        if(productoDTO.getNombreFabricante() == null ||
                productoDTO.getNombreFabricante().isEmpty()) {
            throw new Exception("El nombre dabricante no puede estar nulo");
        }

        if(productoDTO.getDescripcionProducto() == null ||
                productoDTO.getDescripcionProducto().isEmpty()) {
            throw new Exception("La descripción del producto no puede estar nulo");
        }
        return productoDTO;
    }
}
