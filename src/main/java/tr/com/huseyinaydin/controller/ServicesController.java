package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.huseyinaydin.dto.service.ResultServiceDto;
import tr.com.huseyinaydin.service.ServiceService;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@RequiredArgsConstructor
public class ServicesController {
    private final ServiceService serviceService;

    @GetMapping
    public ResponseEntity<List<ResultServiceDto>> serviceList() {
        List<ResultServiceDto> values = serviceService.getAllService();
        return ResponseEntity.ok(values);
    }
}
