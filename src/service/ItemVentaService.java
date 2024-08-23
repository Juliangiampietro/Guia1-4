package service;
import model.ItemVenta;

public class ItemVentaService {
    public Double preciototal(ItemVenta precio, ItemVenta cant){
        Double total = precio.getPrecio()*cant.getCantidad();
        precio.setPrecioTotal(total);
        return total;
    }
    public void showBook (ItemVenta itemVenta){
        System.out.println("Item : -ID: " + itemVenta.getId() + " -: Descripcion: " + itemVenta.getDescripcion()  + " -Cantidad: " + itemVenta.getCantidad() + " -Precio Unitario: " + itemVenta.getPrecio()+ " -Precio Total: " + itemVenta.getPrecioTotal());
    }


}
