package dia9.ejercicio2;

import java.util.ArrayList;

public class ejercicio2 {
    // Ejercicio Nº 2 - Collections - (Extra/Opcional)

    public static void main(String[] args) {
        ArrayList<producto> inventario = new ArrayList<producto>();

        inventario.add(new producto(1, "Teléfono", "Samsung", "Smartphone", 300, 450, 20));
        inventario.add(new producto(2, "Laptop", "HP", "Portátil", 600, 900, 10));
        inventario.add(new producto(3, "Auriculares/Cascos", "Sony", "Accesorio", 40, 70, 50 ));
        inventario.add(new producto(4, "Cargador", "Apple", "Accesorio", 15, 25, 30 ));
        inventario.add(new producto(5, "Tablet", "Lenovo", "Tablet", 200, 300, 15 ));
        inventario.add(new producto(6, "Smartwatch", "Fitbit", "Werable", 80, 130, 12 ));
        inventario.add(new producto(7, "Altavoz Bluetooth", "JBL", "Accesorio", 50, 80, 25 ));
        inventario.add(new producto(8, "Monitor", "Dell", "Accesorio", 100, 150, 30  ));
        inventario.add(new producto(9, "Impresora", "Epson", "Accesorio", 70, 100, 18  ));
        inventario.add(new producto(10, "Router Wi-fi", "Linksys", "Accesorio", 25, 40, 22));

        //a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).
        //b) Guardar estos objetos creados en un ArrayList.
        //c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.
        //d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.
        //e) Borrar el producto que se encuentre en la posición 5 del ArrayList.
        //f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.
        //g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.

        Double maxPrecioVenta = Double.MIN_VALUE;
        producto productoMaxPrecioVenta = null;

        for (producto p: inventario){
            if (p.getPrecioVenta() > maxPrecioVenta){
                maxPrecioVenta = p.getPrecioVenta();
                productoMaxPrecioVenta = p;
            }
        }

        System.out.println("El producto " + productoMaxPrecioVenta.getNombre() + " es el producto más caro, con un precio de " + maxPrecioVenta + " euros.");

        Double minPrecioVenta = Double.MAX_VALUE;
        producto productoMinPrecioVenta = null;

        for (producto p: inventario){
            if (p.getPrecioVenta() > minPrecioVenta){
                minPrecioVenta = p.getPrecioVenta();
                productoMinPrecioVenta = p;
            }
        }

        System.out.println("El producto " + productoMinPrecioVenta.getNombre() + " es el producto más barato, con un precio de " + minPrecioVenta + " euros.");

        Double minPrecioCoste = Double.MAX_VALUE;
        producto productoMinPrecioCoste = null;

        for (producto p: inventario){
            if (p.getPrecioCoste() > minPrecioCoste){
                minPrecioCoste = p.getPrecioCoste();
                productoMinPrecioCoste = p;
            }
        }

        System.out.println("El producto " + productoMinPrecioCoste.getNombre() + " es el producto más barato, con un precio coste de " + minPrecioCoste + " euros.");

        if(inventario.size() > 5){
           producto productoEliminado = inventario.remove(5);
            System.out.println("Se eliminó el producto en la posición 5: " + productoEliminado.getNombre());

        }else{
            System.out.println("No existe ningún producto en la psoción 5.");
        }

        int maxStock = Integer.MIN_VALUE;
        producto productoMaxStock = null;

        for (producto p: inventario){
            if (p.getCantidadEnStock() > maxStock){
                maxStock = p.getCantidadEnStock();
                productoMaxStock = p;
            }
        }
        if (productoMaxStock != null){
            productoMaxStock.setCantidadEnStock(maxStock - 3);
            System.out.println("El producto con más stock es: " + productoMaxStock.getNombre());
            System.out.println("Nueva cantidad en stock: " + productoMaxStock.getCantidadEnStock());

        }else{
            System.out.println("No hay productos en el inventario.");
        }




    }

}
