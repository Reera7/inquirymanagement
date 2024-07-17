package inquirymanagement.example.inquirymanagement.dto;

import lombok.Data;

@Data
public class StatusDto {
    /** ID */
    private Integer statusId;

    /** ステータス名 */
    private String statusName;

    /** ステータスカラー */
    private String statusColor;
}
