package practicascloud.baselineservice.controller.dto;

import java.io.Serializable;

/**
 *
 * @author Oscar I. Obregon
 */
public class CalculoInversionDTORequest implements Serializable {

    private static final long serialVersionUID = -654654654654654L;

    private Double inversionInicial;
    private Double aportacionAnual;
    private Double incrementoAnual;
    // inverion anual
    private Integer anioInversion;
    private Double rendimiento;

    public CalculoInversionDTORequest() {
    }

    public CalculoInversionDTORequest(Double inversionInicial, Double aportacionAnual,
            Double incrementoAnual, Integer anioInversion, Double rendimiento) {
        this.inversionInicial = inversionInicial;
        this.aportacionAnual = aportacionAnual;
        this.incrementoAnual = incrementoAnual;
        this.anioInversion = anioInversion;
        this.rendimiento = rendimiento;
    }

    public Double getInversionInicial() {
        return inversionInicial;
    }

    public void setInversionInicial(Double inversionInicial) {
        this.inversionInicial = inversionInicial;
    }

    public Double getAportacionAnual() {
        return aportacionAnual;
    }

    public void setAportacionAnual(Double aportacionAnual) {
        this.aportacionAnual = aportacionAnual;
    }

    public Double getIncrementoAnual() {
        return incrementoAnual;
    }

    public void setIncrementoAnual(Double incrementoAnual) {
        this.incrementoAnual = incrementoAnual;
    }

    public Integer getAnioInversion() {
        return anioInversion;
    }

    public void setAnioInversion(Integer anioInversion) {
        this.anioInversion = anioInversion;
    }

    public Double getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Double rendimiento) {
        this.rendimiento = rendimiento;
    }


}
