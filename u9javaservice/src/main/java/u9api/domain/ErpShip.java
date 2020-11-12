package u9api.domain;

import java.math.BigDecimal;
import java.util.List;

public class ErpShip {
	
	public String DocumentType ;  //单据类型    
    public String OrderByCode ;    //客户    
    
    public String CustBillCode ;    //立账位置
    public String TCCode ;    //比别       
    public String ACCode ;    //比别       
    public String WHCode ;  //仓库编码    
    public String WHMan ;  //仓管    
    public String SellerCode ;  //业务员   
    public String ConfirmAccordingCode ;
    public String InvoiceAccordingCode ;
    public String ReceiveTermCode ;//收款条件
    public int ConfirmModel ;
    public String TaxScheduleCode ;//税组合  
    public BigDecimal TaxRate ; //税率
    public String SrcDocDocNo ; //来源单号    
    public int SrcDocType ;    //来源类型      
    public String SrcMeno ;  //备注      
    public boolean IsTrueInv ;  //真正入库       
    public String SalesDocNo ; //销售单号    

    public List<ErpShipLine> ErpShipLines ;   //出货单明细
    }

