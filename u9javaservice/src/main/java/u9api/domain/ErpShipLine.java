package u9api.domain;

import java.math.BigDecimal;

public class ErpShipLine
{
    public ErpShipLine() { }
    public String ItemCode ;     //料号   
    public BigDecimal ItemQty ;    //数量 
    public BigDecimal ItemPrice ;       //单价  
    public boolean IsFree ;    //是否免费   
    public String SrcDocNo ;     //来源单号       
    public String SrcLineNo ; //来源行号      
    public String AccountNo ;  //核销单号

    public ErpShipLine(String itemCode, BigDecimal itemQty,  BigDecimal itemPrice, Boolean isFree, String srcDocNo, String srcLineNo, String accountNo)
    {
        ItemCode = itemCode;    //料号   
        ItemQty = itemQty;  //数量    
        ItemPrice = itemPrice;  //单价    
        IsFree = isFree;  //是否免费     
        SrcDocNo = srcDocNo;    //来源单号       
        SrcLineNo = srcLineNo; //来源行号      
        AccountNo = accountNo;//核销单号
    }
}
