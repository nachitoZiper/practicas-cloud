package practicascloud.baselineservice.controller.dto;

import java.io.Serializable;

/**
 *
 * @author Oscar I. Obregon
 */
public class CalculoInversionVO implements Serializable {

    private static final long serialVersionUID = -654654654654654L;

    private Integer anio;
    private Double saldoInicial;
    private Double aportacion;
    private Double rendimiento;
    private Double saldoFinal;
    
    
    private String anioF;
    private String saldoInicialF;
    private String aportacionF;
    private String rendimientoF;
    private String saldoFinalF;
    

    public CalculoInversionVO() {
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Double getAportacion() {
        return aportacion;
    }

    public void setAportacion(Double aportacion) {
        this.aportacion = aportacion;
    }

    public Double getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Double rendimiento) {
        this.rendimiento = rendimiento;
    }

    public Double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(Double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public String getAnioF() {
        return anioF;
    }

    public void setAnioF(String anioF) {
        this.anioF = anioF;
    }

    public String getSaldoInicialF() {
        return saldoInicialF;
    }

    public void setSaldoInicialF(String saldoInicialF) {
        this.saldoInicialF = saldoInicialF;
    }

    public String getAportacionF() {
        return aportacionF;
    }

    public void setAportacionF(String aportacionF) {
        this.aportacionF = aportacionF;
    }

    public String getRendimientoF() {
        return rendimientoF;
    }

    public void setRendimientoF(String rendimientoF) {
        this.rendimientoF = rendimientoF;
    }

    public String getSaldoFinalF() {
        return saldoFinalF;
    }

    public void setSaldoFinalF(String saldoFinalF) {
        this.saldoFinalF = saldoFinalF;
    }

    
}
