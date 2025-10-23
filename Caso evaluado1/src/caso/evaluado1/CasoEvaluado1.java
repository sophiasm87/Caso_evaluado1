/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.evaluado1;

import javax.swing.JOptionPane;

/**
 *
 * @author sophi
 */
public class CasoEvaluado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Digite el nombre del agente de ventas:");
        String apellidos = JOptionPane.showInputDialog("Digite los apellidos del agente:");
        String cedula = JOptionPane.showInputDialog("Digite la cédula del agente:");
        String codigo = JOptionPane.showInputDialog("Digite el código del agente:");
        String sucursal = JOptionPane.showInputDialog("Digite la sucursal a la que pertenece:");
        String empresa = JOptionPane.showInputDialog("Digite el nombre de la empresa:");

        int tieneVehiculo = JOptionPane.showConfirmDialog(null, "¿El agente tiene vehículo propio?", "Vehículo", JOptionPane.YES_NO_OPTION);
        boolean vehiculo = (tieneVehiculo == JOptionPane.YES_OPTION);
        
        
        Vendedor vendedor = new Vendedor(nombre, apellidos, cedula, codigo, sucursal, empresa, tieneVehiculo);
        double totalVendido = 0;
        double totalComisiones = 0;
        int totalPuntos = 0;
        int cantidadFacturas = 0;

    do {
        JOptionPane.showMessageDialog(null, "Registro de factura #" + (cantidadFacturas + 1));

        String nomCliente = JOptionPane.showInputDialog("Nombre del cliente:");
        String ceduCliente = JOptionPane.showInputDialog("Cédula del cliente:");
        String codigoFactura = JOptionPane.showInputDialog("Código de la factura:");
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Monto de la factura (₡):"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de la factura (1-12):"));
        
        while (mes < 1) {
                JOptionPane.showMessageDialog(null, "El mes no puede ser menor que 1.");
                mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevamente el mes (1-12):"));
            }

            if (mes > 12) {
                JOptionPane.showMessageDialog(null, "El mes no puede ser mayor que 12.");
                mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevamente el mes (1-12):"));
            }
  
        int productosElectricos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos eléctricos:"));
        int productosAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos automotrices:"));
        int productosConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos de construcción:"));
        String estado = JOptionPane.showInputDialog("Estado de la factura (Pagada / Pendiente / Anulada):");

      
        Factura factura = new Factura(nombreCliente, cedulaCliente, codigoFactura, monto,
                mes, productosElectricos, productosAutomotrices, productosConstruccion, estado);

        totalVendido = totalVendido + factura.getMonto();
        totalComisiones = totalComisiones + factura.calcularBonoFactura();
        totalPuntos = totalPuntos + Calculo.calcularPuntos(factura);
        cantidadFacturas = cantidadFacturas + 1;

       
        int continuar = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra factura?", "Continuar", JOptionPane.YES_NO_OPTION);

        if (continuar == JOptionPane.NO_OPTION) {

            
            double bonoExtra = Calculo.calcularBonoExtra(totalVendido, cantidadFacturas);
            double puntosExtra = Calculo.CalculoPuntosExtra(totalVendido);
            double totalFinal = totalComisiones + bonoExtra;

           
            String resultado = "Resultado"
                    + "Nombre: " + agente.getNombre() + " " + vendedor.getApellidos() 
                    + "Cédula: " + agente.getCedula() 
                    + "Código: " + agente.getCodigo() 
                    + "Sucursal: " + agente.getSucursal() 
                    + "Empresa: " + agente.getEmpresa()
                    + "Tiene vehículo propio: " + (agente.isTieneCarro() ? "Sí" : "No") 
                    + "Facturas registradas: " + cantidadFacturas 
                    + "Total vendido: " + totalVendido 
                    + "Total comisiones: " + totalComisiones 
                    + "Bono extra: " + bonoExtra
                    + "Total final con bono: " + totalFinal  
                    + "Puntos obtenidos: " + totalPuntos 
                    + "Puntos extra (20%): " + puntosExtra;

            JOptionPane.showMessageDialog(null, resultado, "RESULTADO FINAL", JOptionPane.INFORMATION_MESSAGE);
             while (JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra factura?", "Continuar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        }

    }


    }
    
}
