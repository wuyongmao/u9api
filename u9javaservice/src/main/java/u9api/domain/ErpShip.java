package u9api.domain;

import java.math.BigDecimal;
import java.util.List;

public class ErpShip {
	
	public String DocumentType ;  //��������    
    public String OrderByCode ;    //�ͻ�    
    
    public String CustBillCode ;    //����λ��
    public String TCCode ;    //�ȱ�       
    public String ACCode ;    //�ȱ�       
    public String WHCode ;  //�ֿ����    
    public String WHMan ;  //�ֹ�    
    public String SellerCode ;  //ҵ��Ա   
    public String ConfirmAccordingCode ;
    public String InvoiceAccordingCode ;
    public String ReceiveTermCode ;//�տ�����
    public int ConfirmModel ;
    public String TaxScheduleCode ;//˰���  
    public BigDecimal TaxRate ; //˰��
    public String SrcDocDocNo ; //��Դ����    
    public int SrcDocType ;    //��Դ����      
    public String SrcMeno ;  //��ע      
    public boolean IsTrueInv ;  //�������       
    public String SalesDocNo ; //���۵���    

    public List<ErpShipLine> ErpShipLines ;   //��������ϸ
    }

