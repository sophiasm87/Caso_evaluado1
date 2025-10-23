/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.evaluado1;

/**
 *
 * @author sophi
 */
public class factura {
    
    private String nomCliente;
    private String cedCliente;
    private String codigoFactura;
    private double monto;
    private int mes;
    private int produElectricos;
    private int produAutomotrices;
    private int produConstruccion;
    private String estadoFactura;

    public Factura(String nomCliente, String cedCliente, String codigoFactura, double monto,
                   int mes, int produElectricos, int prodAutomotrices, int produConstruccion,
                   String estadoFactura) {
        this.nomCliente = nomCliente;
        this.cedCliente = cedCliente;
        this.codigoFactura = codigoFactura;
        this.monto = monto;
        this.mes = mes;
        this.produElectricos = produElectricos;
        this.produAutomotrices= produAutomotrices;
        this.produConstruccion = produConstruccion;
        this.estadoFactura = estadoFactura;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getCedCliente() {
        return cedCliente;
    }

    public void setCedCliente(String cedCliente) {
        this.cedCliente = cedCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getProduElectricos() {
        return produElectricos;
    }

    public void setProduElectricos(int produElectricos) {
        this.produElectricos = produElectricos;
    }

    public int getProduAutomotrices() {
        return produAutomotrices;
    }

    public void setProduAutomotrices(int produAutomotrices) {
        this.produAutomotrices = produAutomotrices;
    }

    public int getProduConstruccion() {
        return produConstruccion;
    }

    public void setProduConstruccion(int produConstruccion) {
        this.produConstruccion = produConstruccion;
    }

    public String getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(String estadoFactura) {
        this.estadoFactura = estadoFactura;
    }
}

  
    
    

