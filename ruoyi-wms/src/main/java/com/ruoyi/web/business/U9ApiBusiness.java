package com.ruoyi.web.business;

import icreateshipsv.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType;
import icreateshipsv.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType;
import icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf_pl.ObjectState;
import icreateshipsv.org.tempuri.CreateShipSVStub;
import icreateshipsv.org.ufida.*;
import icreateshipsv.org.ufida.entitydata.ObjectFactory;
import icreateshipsv.org.ufida.entitydata.*;
import u9api.domain.ContextParam;
import u9api.domain.ErpShip;
import u9api.domain.ErpShipLine;
import u9api.utils.DateUtil;
import u9api.utils.DomainUtils;

import javax.xml.ws.Holder;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Map.Entry;

public class U9ApiBusiness {
    public static String CreateShipSVStub()  throws Exception {
        icreateshipsv.org.tempuri.CreateShipSVStub shipSVStub = new CreateShipSVStub();
        UFIDAU9ISVSMICreateShipSV sv = shipSVStub.getBasicHttpBindingUFIDAU9ISVSMICreateShipSV();
        ContextParam contextParam = DomainUtils.getDefultContextParamInstance2();
        Object context = createContext(contextParam);
        ArrayOfUFIDAU9ISVSMShipDTOForIndustryChainData shipDTOs = createShipDTOs(
                DomainUtils.getDefultErpShipInstance2());
        Holder<icreateshipsv.org.ufida.entitydata.ArrayOfUFIDAU9ISVSMDocKeyDTOData> doResult = new Holder<icreateshipsv.org.ufida.entitydata.ArrayOfUFIDAU9ISVSMDocKeyDTOData>();
        Holder<icreateshipsv.exceptions.ubf.ufsoft.ArrayOfMessageBase> outMessages = new Holder<icreateshipsv.exceptions.ubf.ufsoft.ArrayOfMessageBase>();

        System.out.println("Invoke start ...");
        sv._do(context, shipDTOs, false, doResult, outMessages);
        System.out.println("Invoke end ...");

        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < doResult.value.getUFIDAU9ISVSMDocKeyDTOData().size(); i++) {
            String msg ="创建成功!出货单单号:"
                    + doResult.value.getUFIDAU9ISVSMDocKeyDTOData().get(i).getMDocNO().getValue();
            stringBuilder.append(msg).append("\r\n");
            System.out.println(msg);
        }
        return stringBuilder.toString();
    }

    public static ArrayOfUFIDAU9ISVSMShipDTOForIndustryChainData createShipDTOs(ErpShip erpShip) {

        ObjectFactory objectFactory = new ObjectFactory();
        ArrayOfUFIDAU9ISVSMShipDTOForIndustryChainData shipDTOs = objectFactory
                .createArrayOfUFIDAU9ISVSMShipDTOForIndustryChainData();
        UFIDAU9ISVSMShipDTOForIndustryChainData header = objectFactory.createUFIDAU9ISVSMShipDTOForIndustryChainData();
        header.setSysState(ObjectState.INSERTED);
        UFIDAU9CBOPubControllerCommonArchiveDataDTOData d1 = objectFactory
                .createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
        d1.setMCode(objectFactory.createUFIDAU9BaseApplicationApplicationDataMCode(erpShip.DocumentType));
        d1.setSysState(ObjectState.INSERTED);
        header.setMDocumentType(objectFactory.createUFIDAU9ISVSMShipDTOForIndustryChainDataMDocumentType(d1));

        UFIDAU9CBOPubControllerCommonArchiveDataDTOData d2 = objectFactory
                .createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
        d2.setMCode(objectFactory.createUFIDAU9BaseApplicationApplicationDataMCode(erpShip.OrderByCode));
        header.setMOrderBy(objectFactory.createUFIDAU9ISVSMShipDTOForIndustryChainDataMOrderBy(d2));

        header.setMBusinessDate(DateUtil.getXMLGregorianCalendar2());

        UFIDAU9CBOPubControllerCommonArchiveDataDTOData d3 = objectFactory
                .createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
        d3.setMCode(objectFactory.createUFIDAU9BaseApplicationApplicationDataMCode(erpShip.TCCode));
        header.setMTC(objectFactory.createUFIDAU9ISVSMShipDTOForIndustryChainDataMTC(d3));

        UFIDAU9CBOPubControllerCommonArchiveDataDTOData d4 = objectFactory
                .createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
        d4.setMCode(objectFactory.createUFIDAU9BaseApplicationApplicationDataMCode(erpShip.ACCode));
        header.setMAC(objectFactory.createUFIDAU9ISVSMShipDTOForIndustryChainDataMAC(d4));

        header.setMShipConfirmDate(DateUtil.getXMLGregorianCalendar2());

        UFIDAU9CBOPubControllerCommonArchiveDataDTOData d5 = objectFactory
                .createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
        d5.setMCode(objectFactory.createUFIDAU9BaseApplicationApplicationDataMCode(erpShip.WHCode));
        header.setMWhSite(objectFactory.createUFIDAU9ISVSMShipDTOForIndustryChainDataMWhSite(d5));

        UFIDAU9CBOPubControllerCommonArchiveDataDTOData d8 = objectFactory
                .createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
        d8.setMCode(objectFactory.createUFIDAU9BaseApplicationApplicationDataMCode(erpShip.ConfirmAccordingCode));
        header.setMConfirmAccording(objectFactory.createUFIDAU9ISVSMShipDTOForIndustryChainDataMConfirmAccording(d8));

        header.setMSrcDocType(erpShip.SrcDocType);
        header.setMConfirmMode(erpShip.ConfirmModel);

        header.setMDemandCode(-1);

        UFIDAU9CBOPubControllerCommonArchiveDataDTOData d6 = objectFactory
                .createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
        d6.setMCode(objectFactory.createUFIDAU9BaseApplicationApplicationDataMCode(erpShip.SellerCode));
        header.setMSeller(objectFactory.createUFIDAU9ISVSMShipDTOForIndustryChainDataMSeller(d6));

        UFIDAU9CBOPubControllerCommonArchiveDataDTOData d7 = objectFactory
                .createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
        d7.setMCode(objectFactory.createUFIDAU9BaseApplicationApplicationDataMCode(erpShip.CustBillCode));
        header.setMBillToSite(objectFactory.createUFIDAU9ISVSMShipDTOForIndustryChainDataMBillToSite(d7));

        header.setMPayerSite(header.getMBillToSite());

        ArrayOfUFIDAU9ISVSMShipLineDTOForIndustryChainData shipLineArray = objectFactory
                .createArrayOfUFIDAU9ISVSMShipLineDTOForIndustryChainData();

        int RowNo = 0, RowStep = 10;
        for (ErpShipLine erpShipLine : erpShip.ErpShipLines) {
            UFIDAU9ISVSMShipLineDTOForIndustryChainData linedto = objectFactory
                    .createUFIDAU9ISVSMShipLineDTOForIndustryChainData();
            linedto.setSysState(ObjectState.INSERTED);
            RowNo += RowStep;
            linedto.setMDocLineNo(RowNo);

            UFIDAU9CBOSCMItemItemInfoData d11 = objectFactory.createUFIDAU9CBOSCMItemItemInfoData();
            d11.setMItemCode(objectFactory.createUFIDAU9CBOSCMItemItemInfoDataMItemCode(erpShipLine.ItemCode));
            d11.setSysState(ObjectState.INSERTED);
            linedto.setMItemInfo(objectFactory.createUFIDAU9ISVSMShipLineDTOForIndustryChainDataMItemInfo(d11));

            linedto.setMShipQtyTUAmount(erpShipLine.ItemQty);
            if (erpShipLine.ItemPrice.compareTo(BigDecimal.ZERO) <= 0) {
                linedto.setMDonationType(0); // 免费类型
            } else {
                linedto.setMDonationType(-1);
            }

            linedto.setMWH(header.getMWhSite());

            UFIDAU9CBOPubControllerCommonArchiveDataDTOData d12 = objectFactory
                    .createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
            d12.setMCode(objectFactory.createUFIDAU9BaseApplicationApplicationDataMCode(erpShip.WHMan));
            d12.setSysState(ObjectState.INSERTED);
            linedto.setMWhMan(objectFactory.createUFIDAU9ISVSMShipDTOForIndustryChainDataMBillToSite(d12));

            linedto.setMOrderPrice(erpShipLine.ItemPrice);
            linedto.setMOrderPriceTC(erpShipLine.ItemPrice);
            linedto.setMFinallyPrice(erpShipLine.ItemPrice);
            linedto.setMFinallyPriceTC(erpShipLine.ItemPrice);

            linedto.setMShipTogetherFlag(-1); // KIT
            linedto.setMDemandCode(-1); // 需求分类
            linedto.setMStorageType(1); // 存储类型

            // 立账位置
            linedto.setMShipToSite(header.getMBillToSite());
            linedto.setMBillToSite(header.getMBillToSite());
            linedto.setMCreditObj(header.getMBillToSite());

            linedto.setMConfirmAccording(header.getMConfirmAccording());
            linedto.setMConfirmMode(header.getMConfirmMode());
            linedto.setMInvoiceAccording(header.getMInvoiceAccording());

            shipLineArray.getUFIDAU9ISVSMShipLineDTOForIndustryChainData().add(linedto);
        }
        header.setMShipLines(objectFactory.createUFIDAU9ISVSMShipDTOForIndustryChainDataMShipLines(shipLineArray));

        shipDTOs.getUFIDAU9ISVSMShipDTOForIndustryChainData().add(header);
        return shipDTOs;
    }

    // 创建上下文环境
    private static Object createContext(ContextParam contextParam) {
        icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory contextfactory = new icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory();
        icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ThreadContext tc = contextfactory.createThreadContext();

        icreateshipsv.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory arrayFactory = new icreateshipsv.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory();
        ArrayOfKeyValueOfanyTypeanyType contextarray = arrayFactory.createArrayOfKeyValueOfanyTypeanyType();

        Map<Object, Object> map = DomainUtils.getContextMap(contextParam);
        for (Entry<Object, Object> item : map.entrySet()) {
            KeyValueOfanyTypeanyType kv = new KeyValueOfanyTypeanyType();
            kv.setKey(item.getKey());
            kv.setValue(item.getValue());//
            contextarray.getKeyValueOfanyTypeanyType().add(kv);
        }
        tc.setNameValueHas(contextarray);
        return tc;
    }

}
