package inquirymanagement.example.inquirymanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import inquirymanagement.example.inquirymanagement.entity.StatusEntity;

public interface StatusRepository extends JpaRepository<StatusEntity, Integer> {
  // 全件取得
  public List<StatusEntity> findByDeleteFlagIsFalse();
}
