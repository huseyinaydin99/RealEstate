package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.huseyinaydin.dto.whowearedetail.ResultWhoWeAreDetailDto;
import tr.com.huseyinaydin.service.WhoWeAreDetailService;

import java.util.List;

@RestController
@RequestMapping("/api/whowearedetails")
@RequiredArgsConstructor
public class WhoWeAreDetailsController {
    private final WhoWeAreDetailService whoWeAreDetailService;

    @GetMapping
    public ResponseEntity<List<ResultWhoWeAreDetailDto>> whoWeAreDetailList() {
        List<ResultWhoWeAreDetailDto> values = whoWeAreDetailService.getAllWhoWeAreDetail();
        return ResponseEntity.ok(values);
    }
}
