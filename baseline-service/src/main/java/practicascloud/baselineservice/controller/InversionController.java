package practicascloud.baselineservice.controller;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practicascloud.baselineservice.controller.dto.CalculoInversionDTORequest;
import practicascloud.baselineservice.controller.dto.CalculoInversionDTOResponse;
import practicascloud.baselineservice.service.InversionService;

/**
 *
 * @author Oscar I. Obregon
 */
@RestController
@RequestMapping(value = "inversion")
public class InversionController {

    private static final Logger LOG = Logger.getLogger(InversionController.class.getName());

    @Autowired
    private InversionService inversionService;

    @PostMapping
    public ResponseEntity<CalculoInversionDTOResponse> calcularInversion(@RequestBody CalculoInversionDTORequest request) {
        try {
            return ResponseEntity.ok(inversionService.calcularInversion(request));
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }
    }
}
