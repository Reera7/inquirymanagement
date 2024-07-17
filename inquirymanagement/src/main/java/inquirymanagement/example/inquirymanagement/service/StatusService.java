package inquirymanagement.example.inquirymanagement.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import inquirymanagement.example.inquirymanagement.dto.StatusDto;
import inquirymanagement.example.inquirymanagement.entity.StatusEntity;
import inquirymanagement.example.inquirymanagement.repository.StatusRepository;

@Service
public class StatusService {
  private final StatusRepository statusRepository;

  public StatusService(StatusRepository statusRepository) {
    this.statusRepository = statusRepository;
  }

  // 顧客名取得
  public List<StatusDto> getStatusList() {
    List<StatusEntity> statusEntityList = statusRepository.findByDeleteFlagIsFalse();
    List<StatusDto> statusList = new ArrayList<>();

    for (StatusEntity statusEntity : statusEntityList) {
      StatusDto status = new StatusDto();
      status.setStatusId(statusEntity.getStatusId());
      status.setStatusName(statusEntity.getStatusName());
      statusList.add(status);
    }
    return statusList;
  }
}
