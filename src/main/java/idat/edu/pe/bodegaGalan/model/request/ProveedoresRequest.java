package idat.edu.pe.bodegaGalan.model.request;

import lombok.Data;

@Data
public class ProveedoresRequest {
    private Integer cod_proveedor;
    private String nombre;
    private String direccion;
    private String telefono;
}
