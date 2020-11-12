package u9api.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
@Data
public class ErpShipLineVO {
	@NotBlank(message = "手机号不能为空")
	public String ItemCode; // 料号
	public BigDecimal ItemQty; // 数量
	public BigDecimal ItemPrice; // 单价
}
