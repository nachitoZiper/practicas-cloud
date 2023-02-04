package practicascloud.baselineservice.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;
import practicascloud.baselineservice.controller.dto.CalculoInversionDTORequest;
import practicascloud.baselineservice.controller.dto.CalculoInversionDTOResponse;
import practicascloud.baselineservice.controller.dto.CalculoInversionVO;
import practicascloud.baselineservice.service.InversionService;

/**
 *
 * @author Oscar I. Obregon
 */
@Service
public class InversionServiceImpl implements InversionService {

    private static final long serialVersionUID = -654654654654654L;

    private static final Logger LOG = Logger.getLogger(InversionServiceImpl.class.getName());

    /**
     * @see
     * practicascloud.baselineservice.service.InversionService#calcularInversion(practicascloud.baselineservice.controller.dto.CalculoInversionDTORequest)
     */
    @Override
    public CalculoInversionDTOResponse calcularInversion(CalculoInversionDTORequest request) {
        CalculoInversionDTOResponse response = new CalculoInversionDTOResponse();
        List<CalculoInversionVO> list = new ArrayList<>();
        try {
            
        for (int i = 0; i < request.getAnioInversion(); i++) {
            CalculoInversionVO item = new CalculoInversionVO();
            if (i == 0) {
                // primer año 
                item.setAnio(i + 1);
                item.setSaldoInicial(request.getInversionInicial());
                item.setAportacion(request.getAportacionAnual());
                item.setRendimiento(Double.valueOf(Math.ceil((item.getSaldoInicial() + item.getAportacion()) * (request.getRendimiento() / 100))));
                item.setSaldoFinal(Double.valueOf(Math.ceil(item.getSaldoInicial() + item.getAportacion() + item.getRendimiento())));

            } else {
                // segundo año en adelante
                CalculoInversionVO itemAnterior = list.get(i - 1);
                item.setAnio(i + 1);
                item.setSaldoInicial(itemAnterior.getSaldoFinal());
                item.setAportacion(Double.valueOf(Math.ceil((itemAnterior.getAportacion() * (1 + (request.getIncrementoAnual() / 100))))));
                item.setRendimiento(Double.valueOf(Math.ceil((item.getSaldoInicial() + item.getAportacion()) * (request.getRendimiento() / 100))));
                item.setSaldoFinal(Double.valueOf(Math.ceil(item.getSaldoInicial() + item.getAportacion() + item.getRendimiento())));

            }
            item.setAnioF(String.format("%,.0f", item.getAnio().doubleValue()));
            item.setSaldoInicialF(String.format("%,.2f", item.getSaldoInicial()));
            item.setAportacionF(String.format("%,.2f", item.getAportacion()));
            item.setRendimientoF(String.format("%,.2f", item.getRendimiento()));
            item.setSaldoFinalF(String.format("%,.2f", item.getSaldoFinal()));

            list.add(item);
        }
        response.setResultados(list);
        response.setMontoFinal(response.getResultados().get(response.getResultados().size() -1).getSaldoFinal());
        response.setGananciaInversion(response.getMontoFinal() - request.getInversionInicial()
                - (response.getResultados().stream().mapToDouble(item -> item.getAportacion()).sum()));
        
            response.setMontoFinalF(String.format("%,.2f", response.getMontoFinal()));
            response.setGananciaInversionF(String.format("%,.2f", response.getGananciaInversion()));
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;

    }

}
