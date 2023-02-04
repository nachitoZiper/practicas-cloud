package practicascloud.baselineservice.controller.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Oscar I. Obregon
 */
public class CalculoInversionDTOResponse implements Serializable {

    private static final long serialVersionUID = -654654654654654L;

    private Double montoFinal;
    private Double gananciaInversion;
    
    private String montoFinalF;
    private String gananciaInversionF;

    private List<CalculoInversionVO> resultados;

    public CalculoInversionDTOResponse() {
    }

    public Double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(Double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public Double getGananciaInversion() {
        return gananciaInversion;
    }

    public void setGananciaInversion(Double gananciaInversion) {
        this.gananciaInversion = gananciaInversion;
    }

    public List<CalculoInversionVO> getResultados() {
        return resultados;
    }

    public void setResultados(List<CalculoInversionVO> resultados) {
        this.resultados = resultados;
    }

    public String getMontoFinalF() {
        return montoFinalF;
    }

    public void setMontoFinalF(String montoFinalF) {
        this.montoFinalF = montoFinalF;
    }

    public String getGananciaInversionF() {
        return gananciaInversionF;
    }

    public void setGananciaInversionF(String gananciaInversionF) {
        this.gananciaInversionF = gananciaInversionF;
    }

    
    

}
