
package inquirymanagement.example.inquirymanagement.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import inquirymanagement.example.inquirymanagement.dto.InquiryDto;
import inquirymanagement.example.inquirymanagement.entity.InquiryEntity;
import inquirymanagement.example.inquirymanagement.repository.InquiryRepository;

@Service
public class InquiryService {

  @Autowired
  private final InquiryRepository inquiryRepository;

  public InquiryService(InquiryRepository inquiryRepository) {
    this.inquiryRepository = inquiryRepository;
  }

  // 取得
  public List<InquiryDto> getInquiryList() {
    List<InquiryEntity> inquiryEntityList = inquiryRepository.findByDeleteFlagIsFalse();
    List<InquiryDto> inquiryList = new ArrayList<>();

    for (InquiryEntity inquiryEntity : inquiryEntityList) {
      InquiryDto inquiryDto = new InquiryDto();
      inquiryDto.setInquiryId(inquiryEntity.getInquiryId());
      inquiryDto.setStatusName(inquiryEntity.getStatusEntity().getStatusName());
      inquiryDto.setClientName(inquiryEntity.getClientEntity().getClientName());
      inquiryDto.setInquiryPerson(inquiryEntity.getInquiryPerson());
      inquiryDto.setInquiryContent(inquiryEntity.getInquiryContent());
      inquiryDto.setManagerName(inquiryEntity.getManagerUserEntity().getUserName());
      inquiryDto.setAcceptAt(inquiryEntity.getAcceptAt());
      inquiryList.add(inquiryDto);
    }
    return inquiryList;
  }

  public void registerInquiry(InquiryDto inquiryDto) {
    InquiryEntity inquiryEntity = new InquiryEntity();
    inquiryEntity.setClientId(inquiryDto.getClientId());
    inquiryEntity.setManagerId(inquiryDto.getManagerId());
    inquiryEntity.setInquiryPerson(inquiryDto.getInquiryPerson());
    inquiryEntity.setInquiryContent(inquiryDto.getInquiryContent());
    inquiryEntity.setSupportContent(inquiryDto.getSupportContent());
    inquiryEntity.setStatusId(inquiryDto.getStatusId());
    inquiryEntity.setAcceptAt(inquiryDto.getAcceptAt());
    inquiryEntity.setRegisterUserId(inquiryDto.getManagerId());
    inquiryEntity.setDeleteFlag(0);
    inquiryRepository.save(inquiryEntity);
  }

  // e
  public InquiryEntity getInquiry(Integer inquiryId) {
    return inquiryRepository.getReferenceById(inquiryId);
  }
}
