package inquirymanagement.example.inquirymanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "status")
@Data
public class StatusEntity {
    /** ID */
    @Id
    @Column(name = "status_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer statusId;

    /** ステータス名 */
    @Column(name = "status_name")
    private String statusName;

    /** ステータスカラー */
    @Column(name = "status_color")
    private String statusColor;

    /** 削除フラグ */
    @Column(name = "delete_flag")
    private Integer deleteFlag;
}
