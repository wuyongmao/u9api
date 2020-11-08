package com.ruoyi.web.business;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType;
import exceptions.ubf.ufsoft.ArrayOfMessageBase;
import org.datacontract.schemas._2004._07.ufsoft_ubf_pl.ObjectState;
import org.ufida.entitydata.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

public class U9ApiBusiness {
    public  void a() {

        // 创建当前上下文（相当于验证信息，这部分需灵活配置）
        String IDForCompany = "001";// 当前企业编号
        Long IDForOrganization = new Long("1001603310110008");// 当前组织ID
        Long IDForUsers = new Long("1001710190003440");// 当前用户ID
        String UserCode = "dwc";// 当前用户编码
        // 创建上下文环境
        Object context = createContext(IDForCompany, IDForOrganization, IDForUsers, UserCode);
        org.tempuri.CreateRCVSRVStub createRcvsvclient;
        createRcvsvclient = new org.tempuri.CreateRCVSRVStub();
        org.ufida.UFIDAU9ISVRCVICreateRCVSRV createsv = createRcvsvclient
                .getBasicHttpBindingUFIDAU9ISVRCVICreateRCVSRV();

        // 给头、明细赋值
        org.ufida.entitydata.ArrayOfUFIDAU9ISVRCVDTOOBAReceivementDTOData rCVList = createRCVList();

        // doResult就是返回结果。
        Holder<org.ufida.entitydata.ArrayOfUFIDAU9PMRcvReceivementData> doResult = new Holder<ArrayOfUFIDAU9PMRcvReceivementData>();
        Holder<exceptions.ubf.ufsoft.ArrayOfMessageBase> outMessages = new Holder<ArrayOfMessageBase>();
        try {
            System.out.println("Invoke start ...");
            // 将入库单内容传入ERP（入和返的值，均作为此方法的参数）。
            // context验证信息，rCVList入的值，doResult方法返回值，
            createsv._do(context, rCVList, doResult, outMessages);
            System.out.println("Invoke end ...");
        } catch (Exception ex) {
            System.out.println("Error..");
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass().toString());
            System.out.println(ex.getStackTrace().toString());

        }

    }

    // 创建上下文环境
    private static Object createContext(String entid, long orgid, long userid, String usercode) {
        org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory contextfactory = new org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory();
        org.datacontract.schemas._2004._07.ufsoft_ubf_util.ThreadContext tc =
                contextfactory.createThreadContext();

        com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory arrayFactory = new com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory();
        com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType contextarray =
                arrayFactory.createArrayOfKeyValueOfanyTypeanyType();

        ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv1 = new KeyValueOfanyTypeanyType();
        kv1.setKey("EnterpriseID");
        kv1.setValue(entid);// 填具体的企业编号
        contextarray.getKeyValueOfanyTypeanyType().add(kv1);
        KeyValueOfanyTypeanyType kv2 = new KeyValueOfanyTypeanyType();
        kv2.setKey("OrgID");
        kv2.setValue(orgid);// 填具体的组织ID
        contextarray.getKeyValueOfanyTypeanyType().add(kv2);
        KeyValueOfanyTypeanyType kv3 = new KeyValueOfanyTypeanyType();
        kv3.setKey("UserID");
        kv3.setValue(userid);//// 填具体的用户ID
        contextarray.getKeyValueOfanyTypeanyType().add(kv3);
        KeyValueOfanyTypeanyType kv4 = new KeyValueOfanyTypeanyType();
        kv4.setKey("UserCode");
        kv4.setValue(usercode);// 填具体的用户编码
        contextarray.getKeyValueOfanyTypeanyType().add(kv4);
        KeyValueOfanyTypeanyType kv5 = new KeyValueOfanyTypeanyType();
        kv5.setKey("CultureName");
        kv5.setValue("zh-CN");// 当前语种

        contextarray.getKeyValueOfanyTypeanyType().add(kv5);

        tc.setNameValueHas(contextarray);
        return tc;
    }

    private  org.ufida.entitydata.ArrayOfUFIDAU9ISVRCVDTOOBAReceivementDTOData createRCVList() {
       ObjectFactory dataFactory = new ObjectFactory();
        // 创建DTO集合，也就是参数要求的对象。
        org.ufida.entitydata.ArrayOfUFIDAU9ISVRCVDTOOBAReceivementDTOData rcvDToArray = dataFactory
                .createArrayOfUFIDAU9ISVRCVDTOOBAReceivementDTOData();
        // DTO集合中的每个对象，都需要这样创建出来。
        org.ufida.entitydata.UFIDAU9ISVRCVDTOOBAReceivementDTOData headerData = dataFactory.createUFIDAU9ISVRCVDTOOBAReceivementDTOData();// 表头赋值
        headerData.setSysState(ObjectState.INSERTED);// “新建”标记符

        // XMLGregorianCalendar timeValue = new GregorianCalendar();
        GregorianCalendar gcal = new GregorianCalendar();
        XMLGregorianCalendar timeValue;
        try {
            timeValue = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
            timeValue.setYear(2019);
            timeValue.setMonth(10);
            timeValue.setDay(4);
            timeValue.setHour(10);
            timeValue.setMinute(35);
            timeValue.setSecond(30);
            System.out.println(timeValue.toString());
            headerData.setMBusinessDate(timeValue); // 日期

        } catch (DatatypeConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // 单据类型
        UFIDAU9PMDTOsBESimp4UIDTOData docType = dataFactory.createUFIDAU9PMDTOsBESimp4UIDTOData();
        docType.setMCode(dataFactory.createUFIDAU9PMDTOsBESimp4UIDTODataMCode("RCV01"));
        docType.setSysState(ObjectState.INSERTED);
        headerData.setMRcvDocType(dataFactory.createUFIDAU9ISVRCVDTOOBAReceivementDTODataMRcvDocType(docType));
        // 供应商
        UFIDAU9CBOSCMSupplierSupplierMISCInfoData sElement = dataFactory
                .createUFIDAU9CBOSCMSupplierSupplierMISCInfoData();
        sElement.setMCode(dataFactory.createUFIDAU9PMDTOsBESimp4UIDTODataMCode("XMJSWLKJ01"));
        headerData.setMSupplier(dataFactory.createUFIDAU9PMRcvReceivementDataMSupplier(sElement));

        // 对明细进行赋值
        UFIDAU9ISVRCVDTOOBARcvLineDTOData detailsData = dataFactory.createUFIDAU9ISVRCVDTOOBARcvLineDTOData();
        detailsData.setSysState(ObjectState.INSERTED);
        detailsData.setMDocLineNo(10);// 行号
        // 料品
        UFIDAU9CBOSCMItemItemInfoData ItemInfoData = dataFactory.createUFIDAU9CBOSCMItemItemInfoData();
        ItemInfoData.setMItemCode(dataFactory.createUFIDAU9CBOSCMItemItemInfoDataMItemCode("AA000001"));
        ItemInfoData.setSysState(ObjectState.INSERTED);
        detailsData.setMItemInfo(dataFactory.createUFIDAU9ISVRCVDTOOBARcvLineDTODataMItemInfo(ItemInfoData));// 料品
        // 最终价
        BigDecimal finallyPrice = new BigDecimal("3200");
        detailsData.setMFinallyPriceTC(finallyPrice);
        detailsData.setMPlanQtyTU(new BigDecimal("1"));
        detailsData.setMArriveQtyTU(new BigDecimal("1"));

        // 将明细的值放入头中
        ArrayOfUFIDAU9ISVRCVDTOOBARcvLineDTOData m_m_detail = dataFactory
                .createArrayOfUFIDAU9ISVRCVDTOOBARcvLineDTOData();
        m_m_detail.getUFIDAU9ISVRCVDTOOBARcvLineDTOData().add(detailsData);
        headerData.setMRcvLines(dataFactory.createUFIDAU9ISVRCVDTOOBAReceivementDTODataMRcvLines(m_m_detail));

        // 注意：任何参数的类型只要不是最简单类型，都应该通过Factory来创建。
        // 一般这个类型在哪个包中，Facotry也会在同样的包中有一个ObjectFacotry的类型
        rcvDToArray.getUFIDAU9ISVRCVDTOOBAReceivementDTOData().add(headerData);
        return rcvDToArray;
    }

}
