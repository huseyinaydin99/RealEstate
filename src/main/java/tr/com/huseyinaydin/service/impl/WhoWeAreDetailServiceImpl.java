package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.whowearedetail.ResultWhoWeAreDetailDto;
import tr.com.huseyinaydin.repository.WhoWeAreDetailRepository;
import tr.com.huseyinaydin.service.WhoWeAreDetailService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WhoWeAreDetailServiceImpl implements WhoWeAreDetailService {

    private final WhoWeAreDetailRepository whoWeAreDetailRepository;

    @Override
    public List<ResultWhoWeAreDetailDto> getAllWhoWeAreDetail() {
        return whoWeAreDetailRepository.getAllWhoWeAreDetail();
    }
}
