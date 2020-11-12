package u9api.utils;

import u9api.domain.ContextParam;
import u9api.domain.ErpShip;
import u9api.domain.ErpShipLine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DomainUtils {
	public static ErpShip getDefultErpShipInstance2 () {
		ErpShip erpShip = new ErpShip();
		//��������
		erpShip.DocumentType="SM1";
		//�ͻ�
		erpShip.OrderByCode="C-0001";
		//�洢�ص�
		erpShip.WHCode="01";
		//ҵ��Ա
		erpShip.SellerCode="XS0004";
		erpShip.ErpShipLines=new ArrayList<ErpShipLine>();
		ErpShipLine line = new ErpShipLine();
		
		//����
		line.ItemCode="PEP0141";
		//����
		line.ItemQty=new BigDecimal(1);
		//�۸�
		line.ItemPrice=new BigDecimal(0);
		erpShip.ErpShipLines.add(line);
		return erpShip;
	}
	public static ContextParam getDefultContextParamInstance2 (){
		ContextParam contextParam=new ContextParam();
		contextParam.EnterpriseID = "04";// ��ǰ��ҵ���
		contextParam.OrgID = 1002011060282477L;// ��ǰ��֯ID
		contextParam. UserCode = "admin";// ��ǰ�û�����
		contextParam. CultureName = "zh-CN";// ����
		contextParam. Support_CultureNameList = "zh-CN";// ����
		contextParam. DefaultCultureName = "zh-CN";//����
		
		return contextParam;
	} 
	
	public static ErpShip getDefultErpShipInstance () {
		ErpShip erpShip = new ErpShip();
		erpShip.DocumentType="SM1";
		erpShip.OrderByCode="888885";
		erpShip.CustBillCode="888885";
		
		erpShip.TCCode="C001";
		erpShip.ACCode="C001";
		erpShip.WHCode="01";
		erpShip.ReceiveTermCode="0";
		erpShip.ConfirmAccordingCode="1";
		//erpShip.ConfirmModel=1;
		erpShip.SellerCode="shaoliping";
		erpShip.SrcDocType=0;
		erpShip.ErpShipLines=new ArrayList<ErpShipLine>();
		ErpShipLine line = new ErpShipLine();
		
		
//		line.ItemCode="AC080014";
		line.ItemCode="AC080014";
		line.ItemQty=new BigDecimal(1);
		line.ItemPrice=new BigDecimal(100);
		erpShip.ErpShipLines.add(line);
//		ErpShipLine line2 = new ErpShipLine();
//		line2.ItemCode="AA000001";
//		line2.ItemQty=new BigDecimal(2);
//		line2.ItemPrice=new BigDecimal(200);
//		erpShip.ErpShipLines.add(line2);
		
		
		return erpShip;
	}
	public static ContextParam getDefultContextParamInstance (){
		ContextParam contextParam=new ContextParam();
		contextParam.EnterpriseID = "001";// ��ǰ��ҵ���
		contextParam.OrgID = 1001603310110008L;// ��ǰ��֯ID
//		contextParam.UserID = 1001710190003440L;// ��ǰ�û�ID
		contextParam. UserCode = "dwc";// ��ǰ�û�����
		contextParam. CultureName = "zh-CN";// ��ǰ�û�����
		
		return contextParam;
	} 
	public static Map<Object, Object> getContextMap(ContextParam contextParam){
		Map<Object, Object> m1 = new HashMap<Object, Object>();
		
		m1.put("EnterpriseID", contextParam.EnterpriseID);
		m1.put("OrgID", contextParam.OrgID);
		m1.put("UserCode", contextParam.UserCode);
		m1.put("CultureName", contextParam.CultureName);
		m1.put("Support_CultureNameList", contextParam.Support_CultureNameList);
		m1.put("DefaultCultureName", contextParam.DefaultCultureName);
		
		return m1;
	}
}
