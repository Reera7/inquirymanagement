package inquirymanagement.example.inquirymanagement.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class InquiryDto {
    /** ID */
    private Integer inquiryId;

    /** 顧客ID */
    private Integer clientId;

    /** 顧客名 */
    private String clientName;

    /** 担当者ID */
    private Integer ManagerId;

    /** 担当者 */
    private String managerName;

    /** 問い合わせ者 */
    private String inquiryPerson;

    /** 問い合わせ内容 */
    private String inquiryContent;

    /** 対応内容 */
    private String supportContent;

    /** ステータスID */
    private Integer statusId;

    /** ステータス */
    private String statusName;

    /** 受付日時 */
    private LocalDate acceptAt;

    /** 完了日時 */
    private LocalDate completeAt;
}
