package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.service.CreateServiceDto;
import tr.com.huseyinaydin.dto.service.ResultServiceDto;
import tr.com.huseyinaydin.service.ServiceService;

import java.util.List;

@RestController
@RequestMapping("api/services")
@RequiredArgsConstructor
public class ServicesController {
    private final ServiceService serviceService;

    @GetMapping
    public ResponseEntity<List<ResultServiceDto>> serviceList() {
        return ResponseEntity.ok(serviceService.getAllService());
    }

    @PostMapping
    public ResponseEntity<String> createService(@RequestBody CreateServiceDto createServiceDto) {
        serviceService.createService(createServiceDto);
        return ResponseEntity.ok("Hizmet başarılı bir şekilde eklendi.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteService(@PathVariable int id) {
        serviceService.deleteService(id);
        return ResponseEntity.ok("Hizmet başarılı bir şekilde silindi.");
    }
}
