package inquirymanagement.example.inquirymanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "authority")
@Data
public class AuthorityEntity {
    /** ID */
    @Id
    @Column(name = "authority_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorityId;

    /** 権限名 */
    @Column(name = "authority_name")
    private String authorityName;

    /** 削除フラグ */
    @Column(name = "delete_flag")
    private Integer deleteFlag;
}
