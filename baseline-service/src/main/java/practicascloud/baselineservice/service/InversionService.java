package practicascloud.baselineservice.service;

import java.io.Serializable;
import java.util.List;
import practicascloud.baselineservice.controller.dto.CalculoInversionDTORequest;
import practicascloud.baselineservice.controller.dto.CalculoInversionDTOResponse;

/**
 *
 * @author Oscar I. Obregon
 */
public interface InversionService extends Serializable {

    /**
     * Genera el Calculo de Inversion
     *
     * @param request
     * @return
     */
    public CalculoInversionDTOResponse calcularInversion(CalculoInversionDTORequest request);

}
