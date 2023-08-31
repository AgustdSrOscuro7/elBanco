package co.edu.usbcali.elBanco.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
public class ProductoDTO {
    private String idProducto;
    private String nombreProduct;
    private String nombreFabricante;
    private Integer precio;
    private String descripcionProducto;
}
