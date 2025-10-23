/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.evaluado1;

/**
 *
 * @author sophi
 */
public class calculos {
    public static double calcularBonoFactura(Factura factura) {
        double bono = 0;

        int e = factura.getProductosElectricos();
        int a = factura.getProductosAutomotrices();
        int c = factura.getProductosConstruccion();
        double monto = factura.getMonto();

      
        if (e > 0 && a > 0 && c > 0) {
            bono = monto * 0.10;
        } else {
            if (e >= 3) {
                bono = bono + (monto * 0.04);
            } else {
                bono = bono + (monto * 0.02);
            }

           
            if (a > 4) {
                bono = bono + (monto * 0.04);
            } else {
                bono = bono + (monto * 0.02);
            }

            if (c > 0) {
                bono = bono + (monto * 0.08);
            }

          
            if (monto > 50000) {
                bono = bono + (monto * 0.05);
            }
        }

        return bono;
    }

   
    public static int calcularPuntos(factura factura) {
        int puntos = 0;

        int e = factura.getProductosElectricos();
        int a = factura.getProductosAutomotrices();
        int c = factura.getProductosConstruccion();
        double monto = factura.getMonto();

       
        if (e > 0 && a > 0 && c > 0) {
            puntos = puntos + 3;
        }

       
        if (e >= 1) {
            puntos = puntos + 1;
        }

        
        if (a >= 1) {
            puntos = puntos + 1;
        }

     
        if (c > 0) {
            puntos = puntos + 2;
        }

      
        if (monto > 50000) {
            puntos = puntos + 1;
        }

        return puntos;
    }

   
    public static double calcularBonoExtra(double totalVendido, int cantidadFacturas) {
        double bonoExtra = 0;

        if (cantidadFacturas > 3 || totalVendido > 300000) {
            bonoExtra = 20000;
        }

        return bonoExtra;
    }

    
    public static double CalculoPuntosExtra(double totalVendido) {
        double puntosExtra = totalVendido * 0.20;
        return puntosExtra;
    }
    
}
