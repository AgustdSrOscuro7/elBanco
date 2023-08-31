package co.edu.usbcali.elBanco.controllers;

import co.edu.usbcali.elBanco.dtos.MensajeDTO;
import co.edu.usbcali.elBanco.dtos.ProductoDTO;
import co.edu.usbcali.elBanco.services.ProductoServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")

public class ProductoController {

    public ProductoController(ProductoServices productoServices) {
        this.productoServices = productoServices;
    }

    private ProductoServices productoServices;

    @GetMapping("/obtenerProductos")
    public ResponseEntity<List<ProductoDTO>> obtenerProductos() {
        return new ResponseEntity<>(productoServices.obtenerProductos(), HttpStatus.OK);
    }

    @PostMapping(path = "/registrarProducto",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity registrarProducto(@RequestBody ProductoDTO productoDTO) {
        try {
            return new ResponseEntity(productoServices.registrarProducto(productoDTO), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(MensajeDTO.builder().mensajes(e.getMessage()).build(), HttpStatus.BAD_REQUEST);
        }
    }


}
