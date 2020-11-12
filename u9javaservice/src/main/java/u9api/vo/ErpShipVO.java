package u9api.vo;

import u9api.domain.ErpShipLine;

import java.util.List;

public class ErpShipVO extends BaseVO{
	public String DocumentType ;  //单据类型    
    public String OrderByCode ;    //客户    
    public String SellerCode ;  //业务员   
    public String WHCode ;  //仓库编码    
    
    public List<ErpShipLine> ErpShipLines ;   //出货单明细
}
