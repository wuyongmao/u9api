package u9api.domain;

import java.math.BigDecimal;

public class ErpShipLine
{
    public ErpShipLine() { }
    public String ItemCode ;     //�Ϻ�   
    public BigDecimal ItemQty ;    //���� 
    public BigDecimal ItemPrice ;       //����  
    public boolean IsFree ;    //�Ƿ����   
    public String SrcDocNo ;     //��Դ����       
    public String SrcLineNo ; //��Դ�к�      
    public String AccountNo ;  //��������

    public ErpShipLine(String itemCode, BigDecimal itemQty,  BigDecimal itemPrice, Boolean isFree, String srcDocNo, String srcLineNo, String accountNo)
    {
        ItemCode = itemCode;    //�Ϻ�   
        ItemQty = itemQty;  //����    
        ItemPrice = itemPrice;  //����    
        IsFree = isFree;  //�Ƿ����     
        SrcDocNo = srcDocNo;    //��Դ����       
        SrcLineNo = srcLineNo; //��Դ�к�      
        AccountNo = accountNo;//��������
    }
}
