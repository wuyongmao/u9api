package u9api.vo;

import u9api.domain.ErpShipLine;

import java.util.List;

public class ErpShipVO extends BaseVO{
	public String DocumentType ;  //��������    
    public String OrderByCode ;    //�ͻ�    
    public String SellerCode ;  //ҵ��Ա   
    public String WHCode ;  //�ֿ����    
    
    public List<ErpShipLine> ErpShipLines ;   //��������ϸ
}
