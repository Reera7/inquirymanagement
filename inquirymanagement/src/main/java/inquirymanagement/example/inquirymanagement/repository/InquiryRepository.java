package inquirymanagement.example.inquirymanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import inquirymanagement.example.inquirymanagement.entity.InquiryEntity;

public interface InquiryRepository extends JpaRepository<InquiryEntity, Integer> {
    // 全件取得
    public List<InquiryEntity> findByDeleteFlagIsFalse();
}
