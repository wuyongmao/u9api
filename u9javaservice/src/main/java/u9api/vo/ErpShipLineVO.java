package u9api.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
@Data
public class ErpShipLineVO {
	@NotBlank(message = "�ֻ��Ų���Ϊ��")
	public String ItemCode; // �Ϻ�
	public BigDecimal ItemQty; // ����
	public BigDecimal ItemPrice; // ����
}
