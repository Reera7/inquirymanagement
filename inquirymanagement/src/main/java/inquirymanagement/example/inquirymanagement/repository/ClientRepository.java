package inquirymanagement.example.inquirymanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import inquirymanagement.example.inquirymanagement.entity.ClientEntity;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
  // 全件取得
  public List<ClientEntity> findByDeleteFlagIsFalse();
}
