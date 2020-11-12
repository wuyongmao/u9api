
package icreateshipsv.org.ufida.entitydata;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import icreateshipsv.businessentity.business.ubf.ufsoft.EntityKey;
import icreateshipsv.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import icreateshipsv.data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.ISV.SM.ShipLineDTOForIndustryChainData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.SM.ShipLineDTOForIndustryChainData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="IncomeConfirmTermKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IncomeConfirmTermKey_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Signer" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Signer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUom2Associate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUom2Associate_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_accountOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apportionMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apportionMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apportionPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apportionPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_associatedParentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_associatedParentKey" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_balanceRoute" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_balanceRouteDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_balanceRouteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bomID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bomOwner" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cAAmountOfProItem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cADate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cAPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cAPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cAPriceFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cAPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyNoTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyNoTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyNoTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cCMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canInvoiceMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canInvoiceQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_changeFieldList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_chargeBasis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountTotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountTotalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountTotalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_configResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmAccording" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmTerm" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_container" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractOwnedOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractVer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costBaseUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costRatetoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditObj" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cusSignInQtyInvAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cusSignInQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cusSignInQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cusSignInQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyIUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyOfProItem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dealMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deleteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_demandCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_donationReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_donationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fAS" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fillQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fillQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fillQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_finallyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_finallyPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_futureCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_futureCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_futureCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_goodsManagementType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_handleDept" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_incomeConfirmRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_innerSupersedeEnum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invBaseUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invMainUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invRatetoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invoiceAccording" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAllowReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAssociatedChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCloseSO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCreatedInflow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isFinishSignIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInnerShipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isItemVersionChangable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMakeOutInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyLot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyOperateOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyPU" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyShipperOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyTBUToPBU" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyTCToACExRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyTU" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNoSOShipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPossessCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPrjUnChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRefill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isZeroCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemBarCodes" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ItemBarCodeDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_kitItemInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_kitItemManufacturer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_kitLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lCMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.PropertyTypes.LotInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotInvalidationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_manufacturer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_notLcMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItem" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemBaseUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemRatetoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalManufacturer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_parentShipLineID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_parentShipLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payerSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_perProcessQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_piece" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preMaturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precisionACCC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precisionTCAC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceBaseUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceRatetoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_procedureNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processItem" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processMFC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processRateToSub" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processSubUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_project" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_quantityType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recBillLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recBillLineNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivableTerm" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveBillKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyIUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyOfProItem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reserveQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sODate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOKitLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sONo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOOwnedOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOSubLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOSubLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOTDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOVer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleCostAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleDept" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleOrFYTask" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleRtnMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_seiban" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_seibanAlterable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_seller" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ship" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.SM.ShipDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipAddresss" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipAddressDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipContacts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipContactDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipFees" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipFeeDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineBalanceRoutes" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipLineBalanceRouteDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineCosts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipLineCostDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineDiscounts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipLineDiscountDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineLocations" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipLineLocationDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipQtyCostAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipQtyInvAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipTaxs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipTaxDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipTogetherFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipmentRule" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipperOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shippingQtyIU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInQtyOfProItem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyNoTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyNoTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyNoTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocOwnedOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocSubLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocSubLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocTransType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocVer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcKitLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcSysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stageWH" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stickBrandCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stickBrandItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stickBrandItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_storageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_storeArk" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_subItemCostRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_systemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_systemPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tCToACExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tUCUConvRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tUInvConvRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tUPUConvRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_task" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxFreeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxSchedule" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalDiscountTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRefillQtyIUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeBaseUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeRatetoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeUom2" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeUom2ToTRadeUom2Associate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_transMode" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_vMI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_volume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_volumeUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wH" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_weightUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_whMan" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.SM.ShipLineDTOForIndustryChainData", propOrder = {
    "incomeConfirmTermKey",
    "incomeConfirmTermKeySKey",
    "multiSigner",
    "signer",
    "tradeUom2Associate",
    "tradeUom2AssociateSKey",
    "mac",
    "marBillKey",
    "marBillLineKey",
    "marBillLineNo",
    "marBillNo",
    "marMoney",
    "marMoneyFC",
    "marMoneyTC",
    "marQtyPriceAmount",
    "marQtyTBUAmount",
    "marQtyTUAmount",
    "mAccountOrg",
    "mApportionMoney",
    "mApportionMoneyTC",
    "mApportionPrice",
    "mApportionPriceTC",
    "mAssociatedParentID",
    "mAssociatedParentKey",
    "mBalanceRoute",
    "mBalanceRouteDesc",
    "mBalanceRouteName",
    "mBillSetCode",
    "mBillToSite",
    "mBomID",
    "mBomOwner",
    "mcaAmountOfProItem",
    "mcaDate",
    "mcaPriceAC",
    "mcaPriceAmount",
    "mcaPriceFC",
    "mcaPriceTC",
    "mcatuAmount",
    "mcaTotalMoneyAC",
    "mcaTotalMoneyFC",
    "mcaTotalMoneyNoTaxAC",
    "mcaTotalMoneyNoTaxFC",
    "mcaTotalMoneyNoTaxTC",
    "mcaTotalMoneyTC",
    "mccMoney",
    "mCanInvoiceMoneyAC",
    "mCanInvoiceQtyPU",
    "mChangeFieldList",
    "mChannel",
    "mChargeBasis",
    "mCheckAccountBillLineNo",
    "mCheckAccountBillNo",
    "mCheckAccountTotalTax",
    "mCheckAccountTotalTaxFC",
    "mCheckAccountTotalTaxTC",
    "mCheckAccounter",
    "mConfigResult",
    "mConfirmAccording",
    "mConfirmMode",
    "mConfirmTerm",
    "mContainer",
    "mContractDate",
    "mContractKey",
    "mContractLineKey",
    "mContractLineNo",
    "mContractNo",
    "mContractOwnedOrg",
    "mContractVer",
    "mCostBaseUom",
    "mCostRatetoBase",
    "mCostUom",
    "mCreatedBy",
    "mCreatedOn",
    "mCreditObj",
    "mCusSignInQtyInvAmount",
    "mCusSignInQtyPriceAmount",
    "mCusSignInQtyTBUAmount",
    "mCusSignInQtyTUAmount",
    "mCustomerItemCode",
    "mCustomerItemName",
    "mDamageQtyIUAmount",
    "mDamageQtyOfProItem",
    "mDamageQtyPriceAmount",
    "mDamageQtyTBUAmount",
    "mDamageQtyTUAmount",
    "mDealMode",
    "mDeleteFlag",
    "mDemandCode",
    "mDescFlexField",
    "mDocLineNo",
    "mDonationReason",
    "mDonationType",
    "mfas",
    "mFillQtyPriceAmount",
    "mFillQtyTBUAmount",
    "mFillQtyTUAmount",
    "mFinallyPrice",
    "mFinallyPriceTC",
    "mFutureCostAC",
    "mFutureCostFC",
    "mFutureCostTC",
    "mGoodsManagementType",
    "mHandleDept",
    "mid",
    "mIncomeConfirmRule",
    "mInnerSupersedeEnum",
    "mInvBaseUom",
    "mInvMainUOM",
    "mInvRatetoBase",
    "mInvUom",
    "mInvoiceAccording",
    "mIsAllowReturn",
    "mIsAssociatedChild",
    "mIsCloseSO",
    "mIsCreatedInflow",
    "mIsFinishSignIn",
    "mIsInnerShipment",
    "mIsItemVersionChangable",
    "mIsMakeOutInvoice",
    "mIsModifyLot",
    "mIsModifyOperateOrg",
    "mIsModifyPU",
    "mIsModifyShipperOrg",
    "mIsModifyTBUToPBU",
    "mIsModifyTCToACExRate",
    "mIsModifyTU",
    "mIsNoSOShipment",
    "mIsPP",
    "mIsPossessCredit",
    "mIsPriceIncludeTax",
    "mIsPrjUnChangeable",
    "mIsRP",
    "mIsRefill",
    "mIsZeroCost",
    "mItemBarCodes",
    "mItemInfo",
    "mKitItemInfo",
    "mKitItemManufacturer",
    "mKitLineNo",
    "mlcMoney",
    "mLotInfo",
    "mLotInvalidationDate",
    "mManufacturer",
    "mMaturityDate",
    "mModifiedBy",
    "mModifiedOn",
    "mNetAccount",
    "mNotLcMoney",
    "mOrderPrice",
    "mOrderPriceTC",
    "mOriginalItem",
    "mOriginalItemAmount",
    "mOriginalItemBaseUom",
    "mOriginalItemRatetoBase",
    "mOriginalItemUom",
    "mOriginalManufacturer",
    "mParentShipLineID",
    "mParentShipLineNo",
    "mPayer",
    "mPayerSite",
    "mPerProcessQty",
    "mPiece",
    "mPlanQtyTBUAmount",
    "mPlanQtyTUAmount",
    "mPreMaturityDate",
    "mPrecisionACCC",
    "mPrecisionTCAC",
    "mPriceBaseUom",
    "mPriceList",
    "mPriceListCode",
    "mPriceListName",
    "mPriceRatetoBase",
    "mPriceSource",
    "mPriceUom",
    "mProcedureNO",
    "mProcessItem",
    "mProcessMFC",
    "mProcessQty",
    "mProcessRateToSub",
    "mProcessSubUom",
    "mProcessUOM",
    "mProject",
    "mQtyPriceAmount",
    "mQuantityType",
    "mRcvQryTime",
    "mRcvQty",
    "mRecBillLineKey",
    "mRecBillLineNO",
    "mReceivableTerm",
    "mReceiveBillKey",
    "mReceiveBillNo",
    "mRejectQtyIUAmount",
    "mRejectQtyOfProItem",
    "mRejectQtyPriceAmount",
    "mRejectQtyTBUAmount",
    "mRejectQtyTU",
    "mRejectReason",
    "mReserveQty",
    "msoDate",
    "msoKey",
    "msoKitLineNo",
    "msoLineKey",
    "msoLineNo",
    "msoNo",
    "msoOwnedOrg",
    "msoSubLineKey",
    "msoSubLineNo",
    "msotDocType",
    "msoVer",
    "mSaleCostAC",
    "mSaleCostAmount",
    "mSaleCostFC",
    "mSaleCostTC",
    "mSaleDept",
    "mSaleOrFYTask",
    "mSaleRtnMoney",
    "mSeiban",
    "mSeibanAlterable",
    "mSeller",
    "mShip",
    "mShipAddresss",
    "mShipContacts",
    "mShipFees",
    "mShipLineBalanceRoutes",
    "mShipLineCosts",
    "mShipLineDiscounts",
    "mShipLineLocations",
    "mShipLineMemo",
    "mShipQtyCostAmount",
    "mShipQtyInvAmount",
    "mShipQtyTBUAmount",
    "mShipQtyTUAmount",
    "mShipTaxs",
    "mShipToSite",
    "mShipTogetherFlag",
    "mShipmentRule",
    "mShipperOrg",
    "mShippingQtyIU",
    "mSignInDate",
    "mSignInQtyOfProItem",
    "mSignInTotalMoneyAC",
    "mSignInTotalMoneyFC",
    "mSignInTotalMoneyNoTax",
    "mSignInTotalMoneyNoTaxFC",
    "mSignInTotalMoneyNoTaxTC",
    "mSignInTotalMoneyTC",
    "mSignInTotalTax",
    "mSignInTotalTaxFC",
    "mSignInTotalTaxTC",
    "mSrcDocDate",
    "mSrcDocKey",
    "mSrcDocLineKey",
    "mSrcDocLineNo",
    "mSrcDocNo",
    "mSrcDocOwnedOrg",
    "mSrcDocPriceTC",
    "mSrcDocSubLineKey",
    "mSrcDocSubLineNo",
    "mSrcDocTransType",
    "mSrcDocType",
    "mSrcDocVer",
    "mSrcKitLineNo",
    "mSrcSysVersion",
    "mStageWH",
    "mStickBrandCustomer",
    "mStickBrandItemCode",
    "mStickBrandItemName",
    "mStorageType",
    "mStoreArk",
    "mSubItemCostRate",
    "mSupplier",
    "mSysVersion",
    "mSystemPrice",
    "mSystemPriceTC",
    "mtcToACExchRate",
    "mtucuConvRatio",
    "mtuInvConvRatio",
    "mtupuConvRatio",
    "mTask",
    "mTaxFreeNo",
    "mTaxRate",
    "mTaxSchedule",
    "mTotalDiscount",
    "mTotalDiscountTC",
    "mTotalFee",
    "mTotalFeeTC",
    "mTotalMoney",
    "mTotalMoneyFC",
    "mTotalMoneyTC",
    "mTotalNetMoney",
    "mTotalNetMoneyFC",
    "mTotalNetMoneyTC",
    "mTotalRefillQtyIUAmount",
    "mTotalTax",
    "mTotalTaxFC",
    "mTotalTaxTC",
    "mTradeBaseUom",
    "mTradeRatetoBase",
    "mTradeUom",
    "mTradeUom2",
    "mTradeUom2ToTRadeUom2Associate",
    "mTransMode",
    "mvmi",
    "mVolume",
    "mVolumeUom",
    "mwh",
    "mWeight",
    "mWeightUom",
    "mWhMan"
})
public class UFIDAU9ISVSMShipLineDTOForIndustryChainData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "IncomeConfirmTermKey")
    protected Long incomeConfirmTermKey;
    @XmlElementRef(name = "IncomeConfirmTermKey_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> incomeConfirmTermKeySKey;
    @XmlElementRef(name = "Multi_Signer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiSigner;
    @XmlElementRef(name = "Signer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signer;
    @XmlElement(name = "TradeUom2Associate")
    protected Long tradeUom2Associate;
    @XmlElementRef(name = "TradeUom2Associate_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradeUom2AssociateSKey;
    @XmlElementRef(name = "m_aC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mac;
    @XmlElement(name = "m_aRBillKey")
    protected Long marBillKey;
    @XmlElement(name = "m_aRBillLineKey")
    protected Long marBillLineKey;
    @XmlElement(name = "m_aRBillLineNo")
    protected Integer marBillLineNo;
    @XmlElementRef(name = "m_aRBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marBillNo;
    @XmlElement(name = "m_aRMoney")
    protected BigDecimal marMoney;
    @XmlElement(name = "m_aRMoneyFC")
    protected BigDecimal marMoneyFC;
    @XmlElement(name = "m_aRMoneyTC")
    protected BigDecimal marMoneyTC;
    @XmlElement(name = "m_aRQtyPriceAmount")
    protected BigDecimal marQtyPriceAmount;
    @XmlElement(name = "m_aRQtyTBUAmount")
    protected BigDecimal marQtyTBUAmount;
    @XmlElement(name = "m_aRQtyTUAmount")
    protected BigDecimal marQtyTUAmount;
    @XmlElementRef(name = "m_accountOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mAccountOrg;
    @XmlElement(name = "m_apportionMoney")
    protected BigDecimal mApportionMoney;
    @XmlElement(name = "m_apportionMoneyTC")
    protected BigDecimal mApportionMoneyTC;
    @XmlElement(name = "m_apportionPrice")
    protected BigDecimal mApportionPrice;
    @XmlElement(name = "m_apportionPriceTC")
    protected BigDecimal mApportionPriceTC;
    @XmlElement(name = "m_associatedParentID")
    protected Long mAssociatedParentID;
    @XmlElementRef(name = "m_associatedParentKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mAssociatedParentKey;
    @XmlElementRef(name = "m_balanceRoute", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mBalanceRoute;
    @XmlElementRef(name = "m_balanceRouteDesc", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBalanceRouteDesc;
    @XmlElementRef(name = "m_balanceRouteName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBalanceRouteName;
    @XmlElementRef(name = "m_billSetCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBillSetCode;
    @XmlElementRef(name = "m_billToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mBillToSite;
    @XmlElement(name = "m_bomID")
    protected Long mBomID;
    @XmlElementRef(name = "m_bomOwner", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mBomOwner;
    @XmlElement(name = "m_cAAmountOfProItem")
    protected BigDecimal mcaAmountOfProItem;
    @XmlElement(name = "m_cADate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mcaDate;
    @XmlElement(name = "m_cAPriceAC")
    protected BigDecimal mcaPriceAC;
    @XmlElement(name = "m_cAPriceAmount")
    protected BigDecimal mcaPriceAmount;
    @XmlElement(name = "m_cAPriceFC")
    protected BigDecimal mcaPriceFC;
    @XmlElement(name = "m_cAPriceTC")
    protected BigDecimal mcaPriceTC;
    @XmlElement(name = "m_cATUAmount")
    protected BigDecimal mcatuAmount;
    @XmlElement(name = "m_cATotalMoneyAC")
    protected BigDecimal mcaTotalMoneyAC;
    @XmlElement(name = "m_cATotalMoneyFC")
    protected BigDecimal mcaTotalMoneyFC;
    @XmlElement(name = "m_cATotalMoneyNoTaxAC")
    protected BigDecimal mcaTotalMoneyNoTaxAC;
    @XmlElement(name = "m_cATotalMoneyNoTaxFC")
    protected BigDecimal mcaTotalMoneyNoTaxFC;
    @XmlElement(name = "m_cATotalMoneyNoTaxTC")
    protected BigDecimal mcaTotalMoneyNoTaxTC;
    @XmlElement(name = "m_cATotalMoneyTC")
    protected BigDecimal mcaTotalMoneyTC;
    @XmlElement(name = "m_cCMoney")
    protected BigDecimal mccMoney;
    @XmlElement(name = "m_canInvoiceMoneyAC")
    protected BigDecimal mCanInvoiceMoneyAC;
    @XmlElement(name = "m_canInvoiceQtyPU")
    protected BigDecimal mCanInvoiceQtyPU;
    @XmlElementRef(name = "m_changeFieldList", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> mChangeFieldList;
    @XmlElementRef(name = "m_channel", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mChannel;
    @XmlElement(name = "m_chargeBasis")
    protected Integer mChargeBasis;
    @XmlElement(name = "m_checkAccountBillLineNo")
    protected Integer mCheckAccountBillLineNo;
    @XmlElementRef(name = "m_checkAccountBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCheckAccountBillNo;
    @XmlElement(name = "m_checkAccountTotalTax")
    protected BigDecimal mCheckAccountTotalTax;
    @XmlElement(name = "m_checkAccountTotalTaxFC")
    protected BigDecimal mCheckAccountTotalTaxFC;
    @XmlElement(name = "m_checkAccountTotalTaxTC")
    protected BigDecimal mCheckAccountTotalTaxTC;
    @XmlElementRef(name = "m_checkAccounter", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCheckAccounter;
    @XmlElement(name = "m_configResult")
    protected Long mConfigResult;
    @XmlElementRef(name = "m_confirmAccording", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mConfirmAccording;
    @XmlElement(name = "m_confirmMode")
    protected Integer mConfirmMode;
    @XmlElementRef(name = "m_confirmTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mConfirmTerm;
    @XmlElementRef(name = "m_container", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContainer;
    @XmlElement(name = "m_contractDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mContractDate;
    @XmlElement(name = "m_contractKey")
    protected Long mContractKey;
    @XmlElement(name = "m_contractLineKey")
    protected Long mContractLineKey;
    @XmlElement(name = "m_contractLineNo")
    protected Integer mContractLineNo;
    @XmlElementRef(name = "m_contractNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContractNo;
    @XmlElementRef(name = "m_contractOwnedOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mContractOwnedOrg;
    @XmlElement(name = "m_contractVer")
    protected Integer mContractVer;
    @XmlElementRef(name = "m_costBaseUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mCostBaseUom;
    @XmlElement(name = "m_costRatetoBase")
    protected BigDecimal mCostRatetoBase;
    @XmlElementRef(name = "m_costUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mCostUom;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_creditObj", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mCreditObj;
    @XmlElement(name = "m_cusSignInQtyInvAmount")
    protected BigDecimal mCusSignInQtyInvAmount;
    @XmlElement(name = "m_cusSignInQtyPriceAmount")
    protected BigDecimal mCusSignInQtyPriceAmount;
    @XmlElement(name = "m_cusSignInQtyTBUAmount")
    protected BigDecimal mCusSignInQtyTBUAmount;
    @XmlElement(name = "m_cusSignInQtyTUAmount")
    protected BigDecimal mCusSignInQtyTUAmount;
    @XmlElementRef(name = "m_customerItemCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCustomerItemCode;
    @XmlElementRef(name = "m_customerItemName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCustomerItemName;
    @XmlElement(name = "m_damageQtyIUAmount")
    protected BigDecimal mDamageQtyIUAmount;
    @XmlElement(name = "m_damageQtyOfProItem")
    protected BigDecimal mDamageQtyOfProItem;
    @XmlElement(name = "m_damageQtyPriceAmount")
    protected BigDecimal mDamageQtyPriceAmount;
    @XmlElement(name = "m_damageQtyTBUAmount")
    protected BigDecimal mDamageQtyTBUAmount;
    @XmlElement(name = "m_damageQtyTUAmount")
    protected BigDecimal mDamageQtyTUAmount;
    @XmlElement(name = "m_dealMode")
    protected Integer mDealMode;
    @XmlElement(name = "m_deleteFlag")
    protected Boolean mDeleteFlag;
    @XmlElement(name = "m_demandCode")
    protected Integer mDemandCode;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElement(name = "m_docLineNo")
    protected Integer mDocLineNo;
    @XmlElement(name = "m_donationReason")
    protected Integer mDonationReason;
    @XmlElement(name = "m_donationType")
    protected Integer mDonationType;
    @XmlElementRef(name = "m_fAS", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mfas;
    @XmlElement(name = "m_fillQtyPriceAmount")
    protected BigDecimal mFillQtyPriceAmount;
    @XmlElement(name = "m_fillQtyTBUAmount")
    protected BigDecimal mFillQtyTBUAmount;
    @XmlElement(name = "m_fillQtyTUAmount")
    protected BigDecimal mFillQtyTUAmount;
    @XmlElement(name = "m_finallyPrice")
    protected BigDecimal mFinallyPrice;
    @XmlElement(name = "m_finallyPriceTC")
    protected BigDecimal mFinallyPriceTC;
    @XmlElement(name = "m_futureCostAC")
    protected BigDecimal mFutureCostAC;
    @XmlElement(name = "m_futureCostFC")
    protected BigDecimal mFutureCostFC;
    @XmlElement(name = "m_futureCostTC")
    protected BigDecimal mFutureCostTC;
    @XmlElement(name = "m_goodsManagementType")
    protected Integer mGoodsManagementType;
    @XmlElementRef(name = "m_handleDept", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mHandleDept;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_incomeConfirmRule")
    protected Integer mIncomeConfirmRule;
    @XmlElement(name = "m_innerSupersedeEnum")
    protected Integer mInnerSupersedeEnum;
    @XmlElementRef(name = "m_invBaseUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mInvBaseUom;
    @XmlElementRef(name = "m_invMainUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mInvMainUOM;
    @XmlElement(name = "m_invRatetoBase")
    protected BigDecimal mInvRatetoBase;
    @XmlElementRef(name = "m_invUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mInvUom;
    @XmlElementRef(name = "m_invoiceAccording", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mInvoiceAccording;
    @XmlElement(name = "m_isAllowReturn")
    protected Boolean mIsAllowReturn;
    @XmlElement(name = "m_isAssociatedChild")
    protected Boolean mIsAssociatedChild;
    @XmlElement(name = "m_isCloseSO")
    protected Boolean mIsCloseSO;
    @XmlElement(name = "m_isCreatedInflow")
    protected Boolean mIsCreatedInflow;
    @XmlElement(name = "m_isFinishSignIn")
    protected Boolean mIsFinishSignIn;
    @XmlElement(name = "m_isInnerShipment")
    protected Boolean mIsInnerShipment;
    @XmlElement(name = "m_isItemVersionChangable")
    protected Boolean mIsItemVersionChangable;
    @XmlElement(name = "m_isMakeOutInvoice")
    protected Boolean mIsMakeOutInvoice;
    @XmlElement(name = "m_isModifyLot")
    protected Boolean mIsModifyLot;
    @XmlElement(name = "m_isModifyOperateOrg")
    protected Boolean mIsModifyOperateOrg;
    @XmlElement(name = "m_isModifyPU")
    protected Boolean mIsModifyPU;
    @XmlElement(name = "m_isModifyShipperOrg")
    protected Boolean mIsModifyShipperOrg;
    @XmlElement(name = "m_isModifyTBUToPBU")
    protected Boolean mIsModifyTBUToPBU;
    @XmlElement(name = "m_isModifyTCToACExRate")
    protected Boolean mIsModifyTCToACExRate;
    @XmlElement(name = "m_isModifyTU")
    protected Boolean mIsModifyTU;
    @XmlElement(name = "m_isNoSOShipment")
    protected Boolean mIsNoSOShipment;
    @XmlElement(name = "m_isPP")
    protected Boolean mIsPP;
    @XmlElement(name = "m_isPossessCredit")
    protected Boolean mIsPossessCredit;
    @XmlElement(name = "m_isPriceIncludeTax")
    protected Boolean mIsPriceIncludeTax;
    @XmlElement(name = "m_isPrjUnChangeable")
    protected Boolean mIsPrjUnChangeable;
    @XmlElement(name = "m_isRP")
    protected Boolean mIsRP;
    @XmlElement(name = "m_isRefill")
    protected Boolean mIsRefill;
    @XmlElement(name = "m_isZeroCost")
    protected Boolean mIsZeroCost;
    @XmlElementRef(name = "m_itemBarCodes", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMItemBarCodeDTOData> mItemBarCodes;
    @XmlElementRef(name = "m_itemInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mItemInfo;
    @XmlElementRef(name = "m_kitItemInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mKitItemInfo;
    @XmlElementRef(name = "m_kitItemManufacturer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mKitItemManufacturer;
    @XmlElementRef(name = "m_kitLineNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mKitLineNo;
    @XmlElement(name = "m_lCMoney")
    protected BigDecimal mlcMoney;
    @XmlElementRef(name = "m_lotInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMPropertyTypesLotInfoData> mLotInfo;
    @XmlElement(name = "m_lotInvalidationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mLotInvalidationDate;
    @XmlElementRef(name = "m_manufacturer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mManufacturer;
    @XmlElement(name = "m_maturityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mMaturityDate;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_netAccount")
    protected Boolean mNetAccount;
    @XmlElement(name = "m_notLcMoney")
    protected BigDecimal mNotLcMoney;
    @XmlElement(name = "m_orderPrice")
    protected BigDecimal mOrderPrice;
    @XmlElement(name = "m_orderPriceTC")
    protected BigDecimal mOrderPriceTC;
    @XmlElementRef(name = "m_originalItem", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mOriginalItem;
    @XmlElement(name = "m_originalItemAmount")
    protected BigDecimal mOriginalItemAmount;
    @XmlElementRef(name = "m_originalItemBaseUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mOriginalItemBaseUom;
    @XmlElement(name = "m_originalItemRatetoBase")
    protected BigDecimal mOriginalItemRatetoBase;
    @XmlElementRef(name = "m_originalItemUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mOriginalItemUom;
    @XmlElementRef(name = "m_originalManufacturer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mOriginalManufacturer;
    @XmlElement(name = "m_parentShipLineID")
    protected Long mParentShipLineID;
    @XmlElement(name = "m_parentShipLineNo")
    protected Integer mParentShipLineNo;
    @XmlElementRef(name = "m_payer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPayer;
    @XmlElementRef(name = "m_payerSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPayerSite;
    @XmlElement(name = "m_perProcessQty")
    protected BigDecimal mPerProcessQty;
    @XmlElement(name = "m_piece")
    protected BigDecimal mPiece;
    @XmlElement(name = "m_planQtyTBUAmount")
    protected BigDecimal mPlanQtyTBUAmount;
    @XmlElement(name = "m_planQtyTUAmount")
    protected BigDecimal mPlanQtyTUAmount;
    @XmlElement(name = "m_preMaturityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mPreMaturityDate;
    @XmlElement(name = "m_precisionACCC")
    protected Integer mPrecisionACCC;
    @XmlElement(name = "m_precisionTCAC")
    protected Integer mPrecisionTCAC;
    @XmlElementRef(name = "m_priceBaseUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPriceBaseUom;
    @XmlElement(name = "m_priceList")
    protected Long mPriceList;
    @XmlElementRef(name = "m_priceListCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListCode;
    @XmlElementRef(name = "m_priceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListName;
    @XmlElement(name = "m_priceRatetoBase")
    protected BigDecimal mPriceRatetoBase;
    @XmlElement(name = "m_priceSource")
    protected Integer mPriceSource;
    @XmlElementRef(name = "m_priceUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPriceUom;
    @XmlElementRef(name = "m_procedureNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mProcedureNO;
    @XmlElementRef(name = "m_processItem", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mProcessItem;
    @XmlElementRef(name = "m_processMFC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mProcessMFC;
    @XmlElement(name = "m_processQty")
    protected BigDecimal mProcessQty;
    @XmlElement(name = "m_processRateToSub")
    protected BigDecimal mProcessRateToSub;
    @XmlElementRef(name = "m_processSubUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mProcessSubUom;
    @XmlElementRef(name = "m_processUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mProcessUOM;
    @XmlElementRef(name = "m_project", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mProject;
    @XmlElement(name = "m_qtyPriceAmount")
    protected BigDecimal mQtyPriceAmount;
    @XmlElement(name = "m_quantityType")
    protected Integer mQuantityType;
    @XmlElement(name = "m_rcvQryTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mRcvQryTime;
    @XmlElement(name = "m_rcvQty")
    protected BigDecimal mRcvQty;
    @XmlElement(name = "m_recBillLineKey")
    protected Long mRecBillLineKey;
    @XmlElement(name = "m_recBillLineNO")
    protected Integer mRecBillLineNO;
    @XmlElementRef(name = "m_receivableTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mReceivableTerm;
    @XmlElement(name = "m_receiveBillKey")
    protected Long mReceiveBillKey;
    @XmlElementRef(name = "m_receiveBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReceiveBillNo;
    @XmlElement(name = "m_rejectQtyIUAmount")
    protected BigDecimal mRejectQtyIUAmount;
    @XmlElement(name = "m_rejectQtyOfProItem")
    protected BigDecimal mRejectQtyOfProItem;
    @XmlElement(name = "m_rejectQtyPriceAmount")
    protected BigDecimal mRejectQtyPriceAmount;
    @XmlElement(name = "m_rejectQtyTBUAmount")
    protected BigDecimal mRejectQtyTBUAmount;
    @XmlElement(name = "m_rejectQtyTU")
    protected BigDecimal mRejectQtyTU;
    @XmlElement(name = "m_rejectReason")
    protected Integer mRejectReason;
    @XmlElement(name = "m_reserveQty")
    protected BigDecimal mReserveQty;
    @XmlElement(name = "m_sODate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msoDate;
    @XmlElement(name = "m_sOKey")
    protected Long msoKey;
    @XmlElementRef(name = "m_sOKitLineNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msoKitLineNo;
    @XmlElement(name = "m_sOLineKey")
    protected Long msoLineKey;
    @XmlElement(name = "m_sOLineNo")
    protected Integer msoLineNo;
    @XmlElementRef(name = "m_sONo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msoNo;
    @XmlElementRef(name = "m_sOOwnedOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> msoOwnedOrg;
    @XmlElement(name = "m_sOSubLineKey")
    protected Long msoSubLineKey;
    @XmlElement(name = "m_sOSubLineNo")
    protected Integer msoSubLineNo;
    @XmlElement(name = "m_sOTDocType")
    protected Long msotDocType;
    @XmlElement(name = "m_sOVer")
    protected Integer msoVer;
    @XmlElement(name = "m_saleCostAC")
    protected BigDecimal mSaleCostAC;
    @XmlElement(name = "m_saleCostAmount")
    protected BigDecimal mSaleCostAmount;
    @XmlElement(name = "m_saleCostFC")
    protected BigDecimal mSaleCostFC;
    @XmlElement(name = "m_saleCostTC")
    protected BigDecimal mSaleCostTC;
    @XmlElementRef(name = "m_saleDept", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSaleDept;
    @XmlElement(name = "m_saleOrFYTask")
    protected Long mSaleOrFYTask;
    @XmlElement(name = "m_saleRtnMoney")
    protected BigDecimal mSaleRtnMoney;
    @XmlElementRef(name = "m_seiban", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSeiban;
    @XmlElement(name = "m_seibanAlterable")
    protected Integer mSeibanAlterable;
    @XmlElementRef(name = "m_seller", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSeller;
    @XmlElementRef(name = "m_ship", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVSMShipDTOForIndustryChainData> mShip;
    @XmlElementRef(name = "m_shipAddresss", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipAddressDTOForIndustryChainData> mShipAddresss;
    @XmlElementRef(name = "m_shipContacts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipContactDTOForIndustryChainData> mShipContacts;
    @XmlElementRef(name = "m_shipFees", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipFeeDTOForIndustryChainData> mShipFees;
    @XmlElementRef(name = "m_shipLineBalanceRoutes", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipLineBalanceRouteDTOForIndustryChainData> mShipLineBalanceRoutes;
    @XmlElementRef(name = "m_shipLineCosts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipLineCostDTOForIndustryChainData> mShipLineCosts;
    @XmlElementRef(name = "m_shipLineDiscounts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipLineDiscountDTOForIndustryChainData> mShipLineDiscounts;
    @XmlElementRef(name = "m_shipLineLocations", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipLineLocationDTOForIndustryChainData> mShipLineLocations;
    @XmlElementRef(name = "m_shipLineMemo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShipLineMemo;
    @XmlElement(name = "m_shipQtyCostAmount")
    protected BigDecimal mShipQtyCostAmount;
    @XmlElement(name = "m_shipQtyInvAmount")
    protected BigDecimal mShipQtyInvAmount;
    @XmlElement(name = "m_shipQtyTBUAmount")
    protected BigDecimal mShipQtyTBUAmount;
    @XmlElement(name = "m_shipQtyTUAmount")
    protected BigDecimal mShipQtyTUAmount;
    @XmlElementRef(name = "m_shipTaxs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipTaxDTOForIndustryChainData> mShipTaxs;
    @XmlElementRef(name = "m_shipToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mShipToSite;
    @XmlElement(name = "m_shipTogetherFlag")
    protected Integer mShipTogetherFlag;
    @XmlElementRef(name = "m_shipmentRule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mShipmentRule;
    @XmlElementRef(name = "m_shipperOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mShipperOrg;
    @XmlElement(name = "m_shippingQtyIU")
    protected BigDecimal mShippingQtyIU;
    @XmlElement(name = "m_signInDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mSignInDate;
    @XmlElement(name = "m_signInQtyOfProItem")
    protected BigDecimal mSignInQtyOfProItem;
    @XmlElement(name = "m_signInTotalMoneyAC")
    protected BigDecimal mSignInTotalMoneyAC;
    @XmlElement(name = "m_signInTotalMoneyFC")
    protected BigDecimal mSignInTotalMoneyFC;
    @XmlElement(name = "m_signInTotalMoneyNoTax")
    protected BigDecimal mSignInTotalMoneyNoTax;
    @XmlElement(name = "m_signInTotalMoneyNoTaxFC")
    protected BigDecimal mSignInTotalMoneyNoTaxFC;
    @XmlElement(name = "m_signInTotalMoneyNoTaxTC")
    protected BigDecimal mSignInTotalMoneyNoTaxTC;
    @XmlElement(name = "m_signInTotalMoneyTC")
    protected BigDecimal mSignInTotalMoneyTC;
    @XmlElement(name = "m_signInTotalTax")
    protected BigDecimal mSignInTotalTax;
    @XmlElement(name = "m_signInTotalTaxFC")
    protected BigDecimal mSignInTotalTaxFC;
    @XmlElement(name = "m_signInTotalTaxTC")
    protected BigDecimal mSignInTotalTaxTC;
    @XmlElement(name = "m_srcDocDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mSrcDocDate;
    @XmlElement(name = "m_srcDocKey")
    protected Long mSrcDocKey;
    @XmlElement(name = "m_srcDocLineKey")
    protected Long mSrcDocLineKey;
    @XmlElement(name = "m_srcDocLineNo")
    protected Integer mSrcDocLineNo;
    @XmlElementRef(name = "m_srcDocNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSrcDocNo;
    @XmlElementRef(name = "m_srcDocOwnedOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSrcDocOwnedOrg;
    @XmlElement(name = "m_srcDocPriceTC")
    protected BigDecimal mSrcDocPriceTC;
    @XmlElement(name = "m_srcDocSubLineKey")
    protected Long mSrcDocSubLineKey;
    @XmlElement(name = "m_srcDocSubLineNo")
    protected Integer mSrcDocSubLineNo;
    @XmlElement(name = "m_srcDocTransType")
    protected Long mSrcDocTransType;
    @XmlElement(name = "m_srcDocType")
    protected Integer mSrcDocType;
    @XmlElement(name = "m_srcDocVer")
    protected Integer mSrcDocVer;
    @XmlElementRef(name = "m_srcKitLineNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSrcKitLineNo;
    @XmlElement(name = "m_srcSysVersion")
    protected Long mSrcSysVersion;
    @XmlElementRef(name = "m_stageWH", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mStageWH;
    @XmlElementRef(name = "m_stickBrandCustomer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStickBrandCustomer;
    @XmlElementRef(name = "m_stickBrandItemCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStickBrandItemCode;
    @XmlElementRef(name = "m_stickBrandItemName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStickBrandItemName;
    @XmlElement(name = "m_storageType")
    protected Integer mStorageType;
    @XmlElement(name = "m_storeArk")
    protected BigDecimal mStoreArk;
    @XmlElement(name = "m_subItemCostRate")
    protected BigDecimal mSubItemCostRate;
    @XmlElementRef(name = "m_supplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSupplier;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_systemPrice")
    protected BigDecimal mSystemPrice;
    @XmlElement(name = "m_systemPriceTC")
    protected BigDecimal mSystemPriceTC;
    @XmlElement(name = "m_tCToACExchRate")
    protected BigDecimal mtcToACExchRate;
    @XmlElement(name = "m_tUCUConvRatio")
    protected BigDecimal mtucuConvRatio;
    @XmlElement(name = "m_tUInvConvRatio")
    protected BigDecimal mtuInvConvRatio;
    @XmlElement(name = "m_tUPUConvRatio")
    protected BigDecimal mtupuConvRatio;
    @XmlElementRef(name = "m_task", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mTask;
    @XmlElementRef(name = "m_taxFreeNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mTaxFreeNo;
    @XmlElement(name = "m_taxRate")
    protected BigDecimal mTaxRate;
    @XmlElementRef(name = "m_taxSchedule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mTaxSchedule;
    @XmlElement(name = "m_totalDiscount")
    protected BigDecimal mTotalDiscount;
    @XmlElement(name = "m_totalDiscountTC")
    protected BigDecimal mTotalDiscountTC;
    @XmlElement(name = "m_totalFee")
    protected BigDecimal mTotalFee;
    @XmlElement(name = "m_totalFeeTC")
    protected BigDecimal mTotalFeeTC;
    @XmlElement(name = "m_totalMoney")
    protected BigDecimal mTotalMoney;
    @XmlElement(name = "m_totalMoneyFC")
    protected BigDecimal mTotalMoneyFC;
    @XmlElement(name = "m_totalMoneyTC")
    protected BigDecimal mTotalMoneyTC;
    @XmlElement(name = "m_totalNetMoney")
    protected BigDecimal mTotalNetMoney;
    @XmlElement(name = "m_totalNetMoneyFC")
    protected BigDecimal mTotalNetMoneyFC;
    @XmlElement(name = "m_totalNetMoneyTC")
    protected BigDecimal mTotalNetMoneyTC;
    @XmlElement(name = "m_totalRefillQtyIUAmount")
    protected BigDecimal mTotalRefillQtyIUAmount;
    @XmlElement(name = "m_totalTax")
    protected BigDecimal mTotalTax;
    @XmlElement(name = "m_totalTaxFC")
    protected BigDecimal mTotalTaxFC;
    @XmlElement(name = "m_totalTaxTC")
    protected BigDecimal mTotalTaxTC;
    @XmlElementRef(name = "m_tradeBaseUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mTradeBaseUom;
    @XmlElement(name = "m_tradeRatetoBase")
    protected BigDecimal mTradeRatetoBase;
    @XmlElementRef(name = "m_tradeUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mTradeUom;
    @XmlElementRef(name = "m_tradeUom2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mTradeUom2;
    @XmlElement(name = "m_tradeUom2ToTRadeUom2Associate")
    protected BigDecimal mTradeUom2ToTRadeUom2Associate;
    @XmlElementRef(name = "m_transMode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mTransMode;
    @XmlElement(name = "m_vMI")
    protected Boolean mvmi;
    @XmlElement(name = "m_volume")
    protected BigDecimal mVolume;
    @XmlElementRef(name = "m_volumeUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mVolumeUom;
    @XmlElementRef(name = "m_wH", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mwh;
    @XmlElement(name = "m_weight")
    protected BigDecimal mWeight;
    @XmlElementRef(name = "m_weightUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mWeightUom;
    @XmlElementRef(name = "m_whMan", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mWhMan;

    /**
     * ��ȡincomeConfirmTermKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncomeConfirmTermKey() {
        return incomeConfirmTermKey;
    }

    /**
     * ����incomeConfirmTermKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncomeConfirmTermKey(Long value) {
        this.incomeConfirmTermKey = value;
    }

    /**
     * ��ȡincomeConfirmTermKeySKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getIncomeConfirmTermKeySKey() {
        return incomeConfirmTermKeySKey;
    }

    /**
     * ����incomeConfirmTermKeySKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setIncomeConfirmTermKeySKey(JAXBElement<EntityKey> value) {
        this.incomeConfirmTermKeySKey = value;
    }

    /**
     * ��ȡmultiSigner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiSigner() {
        return multiSigner;
    }

    /**
     * ����multiSigner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiSigner(JAXBElement<MultiLangDataDict> value) {
        this.multiSigner = value;
    }

    /**
     * ��ȡsigner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSigner() {
        return signer;
    }

    /**
     * ����signer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSigner(JAXBElement<String> value) {
        this.signer = value;
    }

    /**
     * ��ȡtradeUom2Associate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradeUom2Associate() {
        return tradeUom2Associate;
    }

    /**
     * ����tradeUom2Associate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradeUom2Associate(Long value) {
        this.tradeUom2Associate = value;
    }

    /**
     * ��ȡtradeUom2AssociateSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradeUom2AssociateSKey() {
        return tradeUom2AssociateSKey;
    }

    /**
     * ����tradeUom2AssociateSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradeUom2AssociateSKey(JAXBElement<EntityKey> value) {
        this.tradeUom2AssociateSKey = value;
    }

    /**
     * ��ȡmac���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMAC() {
        return mac;
    }

    /**
     * ����mac���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMAC(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mac = value;
    }

    /**
     * ��ȡmarBillKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMARBillKey() {
        return marBillKey;
    }

    /**
     * ����marBillKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMARBillKey(Long value) {
        this.marBillKey = value;
    }

    /**
     * ��ȡmarBillLineKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMARBillLineKey() {
        return marBillLineKey;
    }

    /**
     * ����marBillLineKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMARBillLineKey(Long value) {
        this.marBillLineKey = value;
    }

    /**
     * ��ȡmarBillLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMARBillLineNo() {
        return marBillLineNo;
    }

    /**
     * ����marBillLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMARBillLineNo(Integer value) {
        this.marBillLineNo = value;
    }

    /**
     * ��ȡmarBillNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMARBillNo() {
        return marBillNo;
    }

    /**
     * ����marBillNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMARBillNo(JAXBElement<String> value) {
        this.marBillNo = value;
    }

    /**
     * ��ȡmarMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARMoney() {
        return marMoney;
    }

    /**
     * ����marMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARMoney(BigDecimal value) {
        this.marMoney = value;
    }

    /**
     * ��ȡmarMoneyFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARMoneyFC() {
        return marMoneyFC;
    }

    /**
     * ����marMoneyFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARMoneyFC(BigDecimal value) {
        this.marMoneyFC = value;
    }

    /**
     * ��ȡmarMoneyTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARMoneyTC() {
        return marMoneyTC;
    }

    /**
     * ����marMoneyTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARMoneyTC(BigDecimal value) {
        this.marMoneyTC = value;
    }

    /**
     * ��ȡmarQtyPriceAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARQtyPriceAmount() {
        return marQtyPriceAmount;
    }

    /**
     * ����marQtyPriceAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARQtyPriceAmount(BigDecimal value) {
        this.marQtyPriceAmount = value;
    }

    /**
     * ��ȡmarQtyTBUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARQtyTBUAmount() {
        return marQtyTBUAmount;
    }

    /**
     * ����marQtyTBUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARQtyTBUAmount(BigDecimal value) {
        this.marQtyTBUAmount = value;
    }

    /**
     * ��ȡmarQtyTUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARQtyTUAmount() {
        return marQtyTUAmount;
    }

    /**
     * ����marQtyTUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARQtyTUAmount(BigDecimal value) {
        this.marQtyTUAmount = value;
    }

    /**
     * ��ȡmAccountOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMAccountOrg() {
        return mAccountOrg;
    }

    /**
     * ����mAccountOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMAccountOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mAccountOrg = value;
    }

    /**
     * ��ȡmApportionMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApportionMoney() {
        return mApportionMoney;
    }

    /**
     * ����mApportionMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApportionMoney(BigDecimal value) {
        this.mApportionMoney = value;
    }

    /**
     * ��ȡmApportionMoneyTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApportionMoneyTC() {
        return mApportionMoneyTC;
    }

    /**
     * ����mApportionMoneyTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApportionMoneyTC(BigDecimal value) {
        this.mApportionMoneyTC = value;
    }

    /**
     * ��ȡmApportionPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApportionPrice() {
        return mApportionPrice;
    }

    /**
     * ����mApportionPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApportionPrice(BigDecimal value) {
        this.mApportionPrice = value;
    }

    /**
     * ��ȡmApportionPriceTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApportionPriceTC() {
        return mApportionPriceTC;
    }

    /**
     * ����mApportionPriceTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApportionPriceTC(BigDecimal value) {
        this.mApportionPriceTC = value;
    }

    /**
     * ��ȡmAssociatedParentID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAssociatedParentID() {
        return mAssociatedParentID;
    }

    /**
     * ����mAssociatedParentID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAssociatedParentID(Long value) {
        this.mAssociatedParentID = value;
    }

    /**
     * ��ȡmAssociatedParentKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemMasterData> getMAssociatedParentKey() {
        return mAssociatedParentKey;
    }

    /**
     * ����mAssociatedParentKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public void setMAssociatedParentKey(JAXBElement<UFIDAU9CBOSCMItemItemMasterData> value) {
        this.mAssociatedParentKey = value;
    }

    /**
     * ��ȡmBalanceRoute���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMBalanceRoute() {
        return mBalanceRoute;
    }

    /**
     * ����mBalanceRoute���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMBalanceRoute(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mBalanceRoute = value;
    }

    /**
     * ��ȡmBalanceRouteDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBalanceRouteDesc() {
        return mBalanceRouteDesc;
    }

    /**
     * ����mBalanceRouteDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBalanceRouteDesc(JAXBElement<String> value) {
        this.mBalanceRouteDesc = value;
    }

    /**
     * ��ȡmBalanceRouteName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBalanceRouteName() {
        return mBalanceRouteName;
    }

    /**
     * ����mBalanceRouteName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBalanceRouteName(JAXBElement<String> value) {
        this.mBalanceRouteName = value;
    }

    /**
     * ��ȡmBillSetCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBillSetCode() {
        return mBillSetCode;
    }

    /**
     * ����mBillSetCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBillSetCode(JAXBElement<String> value) {
        this.mBillSetCode = value;
    }

    /**
     * ��ȡmBillToSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMBillToSite() {
        return mBillToSite;
    }

    /**
     * ����mBillToSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMBillToSite(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mBillToSite = value;
    }

    /**
     * ��ȡmBomID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMBomID() {
        return mBomID;
    }

    /**
     * ����mBomID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMBomID(Long value) {
        this.mBomID = value;
    }

    /**
     * ��ȡmBomOwner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMBomOwner() {
        return mBomOwner;
    }

    /**
     * ����mBomOwner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMBomOwner(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mBomOwner = value;
    }

    /**
     * ��ȡmcaAmountOfProItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCAAmountOfProItem() {
        return mcaAmountOfProItem;
    }

    /**
     * ����mcaAmountOfProItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCAAmountOfProItem(BigDecimal value) {
        this.mcaAmountOfProItem = value;
    }

    /**
     * ��ȡmcaDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCADate() {
        return mcaDate;
    }

    /**
     * ����mcaDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCADate(XMLGregorianCalendar value) {
        this.mcaDate = value;
    }

    /**
     * ��ȡmcaPriceAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCAPriceAC() {
        return mcaPriceAC;
    }

    /**
     * ����mcaPriceAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCAPriceAC(BigDecimal value) {
        this.mcaPriceAC = value;
    }

    /**
     * ��ȡmcaPriceAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCAPriceAmount() {
        return mcaPriceAmount;
    }

    /**
     * ����mcaPriceAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCAPriceAmount(BigDecimal value) {
        this.mcaPriceAmount = value;
    }

    /**
     * ��ȡmcaPriceFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCAPriceFC() {
        return mcaPriceFC;
    }

    /**
     * ����mcaPriceFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCAPriceFC(BigDecimal value) {
        this.mcaPriceFC = value;
    }

    /**
     * ��ȡmcaPriceTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCAPriceTC() {
        return mcaPriceTC;
    }

    /**
     * ����mcaPriceTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCAPriceTC(BigDecimal value) {
        this.mcaPriceTC = value;
    }

    /**
     * ��ȡmcatuAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATUAmount() {
        return mcatuAmount;
    }

    /**
     * ����mcatuAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATUAmount(BigDecimal value) {
        this.mcatuAmount = value;
    }

    /**
     * ��ȡmcaTotalMoneyAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyAC() {
        return mcaTotalMoneyAC;
    }

    /**
     * ����mcaTotalMoneyAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyAC(BigDecimal value) {
        this.mcaTotalMoneyAC = value;
    }

    /**
     * ��ȡmcaTotalMoneyFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyFC() {
        return mcaTotalMoneyFC;
    }

    /**
     * ����mcaTotalMoneyFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyFC(BigDecimal value) {
        this.mcaTotalMoneyFC = value;
    }

    /**
     * ��ȡmcaTotalMoneyNoTaxAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyNoTaxAC() {
        return mcaTotalMoneyNoTaxAC;
    }

    /**
     * ����mcaTotalMoneyNoTaxAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyNoTaxAC(BigDecimal value) {
        this.mcaTotalMoneyNoTaxAC = value;
    }

    /**
     * ��ȡmcaTotalMoneyNoTaxFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyNoTaxFC() {
        return mcaTotalMoneyNoTaxFC;
    }

    /**
     * ����mcaTotalMoneyNoTaxFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyNoTaxFC(BigDecimal value) {
        this.mcaTotalMoneyNoTaxFC = value;
    }

    /**
     * ��ȡmcaTotalMoneyNoTaxTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyNoTaxTC() {
        return mcaTotalMoneyNoTaxTC;
    }

    /**
     * ����mcaTotalMoneyNoTaxTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyNoTaxTC(BigDecimal value) {
        this.mcaTotalMoneyNoTaxTC = value;
    }

    /**
     * ��ȡmcaTotalMoneyTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyTC() {
        return mcaTotalMoneyTC;
    }

    /**
     * ����mcaTotalMoneyTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyTC(BigDecimal value) {
        this.mcaTotalMoneyTC = value;
    }

    /**
     * ��ȡmccMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCCMoney() {
        return mccMoney;
    }

    /**
     * ����mccMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCCMoney(BigDecimal value) {
        this.mccMoney = value;
    }

    /**
     * ��ȡmCanInvoiceMoneyAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCanInvoiceMoneyAC() {
        return mCanInvoiceMoneyAC;
    }

    /**
     * ����mCanInvoiceMoneyAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCanInvoiceMoneyAC(BigDecimal value) {
        this.mCanInvoiceMoneyAC = value;
    }

    /**
     * ��ȡmCanInvoiceQtyPU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCanInvoiceQtyPU() {
        return mCanInvoiceQtyPU;
    }

    /**
     * ����mCanInvoiceQtyPU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCanInvoiceQtyPU(BigDecimal value) {
        this.mCanInvoiceQtyPU = value;
    }

    /**
     * ��ȡmChangeFieldList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMChangeFieldList() {
        return mChangeFieldList;
    }

    /**
     * ����mChangeFieldList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMChangeFieldList(JAXBElement<ArrayOfstring> value) {
        this.mChangeFieldList = value;
    }

    /**
     * ��ȡmChannel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMChannel() {
        return mChannel;
    }

    /**
     * ����mChannel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMChannel(JAXBElement<String> value) {
        this.mChannel = value;
    }

    /**
     * ��ȡmChargeBasis���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMChargeBasis() {
        return mChargeBasis;
    }

    /**
     * ����mChargeBasis���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMChargeBasis(Integer value) {
        this.mChargeBasis = value;
    }

    /**
     * ��ȡmCheckAccountBillLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCheckAccountBillLineNo() {
        return mCheckAccountBillLineNo;
    }

    /**
     * ����mCheckAccountBillLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCheckAccountBillLineNo(Integer value) {
        this.mCheckAccountBillLineNo = value;
    }

    /**
     * ��ȡmCheckAccountBillNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCheckAccountBillNo() {
        return mCheckAccountBillNo;
    }

    /**
     * ����mCheckAccountBillNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCheckAccountBillNo(JAXBElement<String> value) {
        this.mCheckAccountBillNo = value;
    }

    /**
     * ��ȡmCheckAccountTotalTax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCheckAccountTotalTax() {
        return mCheckAccountTotalTax;
    }

    /**
     * ����mCheckAccountTotalTax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCheckAccountTotalTax(BigDecimal value) {
        this.mCheckAccountTotalTax = value;
    }

    /**
     * ��ȡmCheckAccountTotalTaxFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCheckAccountTotalTaxFC() {
        return mCheckAccountTotalTaxFC;
    }

    /**
     * ����mCheckAccountTotalTaxFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCheckAccountTotalTaxFC(BigDecimal value) {
        this.mCheckAccountTotalTaxFC = value;
    }

    /**
     * ��ȡmCheckAccountTotalTaxTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCheckAccountTotalTaxTC() {
        return mCheckAccountTotalTaxTC;
    }

    /**
     * ����mCheckAccountTotalTaxTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCheckAccountTotalTaxTC(BigDecimal value) {
        this.mCheckAccountTotalTaxTC = value;
    }

    /**
     * ��ȡmCheckAccounter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCheckAccounter() {
        return mCheckAccounter;
    }

    /**
     * ����mCheckAccounter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCheckAccounter(JAXBElement<String> value) {
        this.mCheckAccounter = value;
    }

    /**
     * ��ȡmConfigResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMConfigResult() {
        return mConfigResult;
    }

    /**
     * ����mConfigResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMConfigResult(Long value) {
        this.mConfigResult = value;
    }

    /**
     * ��ȡmConfirmAccording���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMConfirmAccording() {
        return mConfirmAccording;
    }

    /**
     * ����mConfirmAccording���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMConfirmAccording(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mConfirmAccording = value;
    }

    /**
     * ��ȡmConfirmMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMConfirmMode() {
        return mConfirmMode;
    }

    /**
     * ����mConfirmMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMConfirmMode(Integer value) {
        this.mConfirmMode = value;
    }

    /**
     * ��ȡmConfirmTerm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMConfirmTerm() {
        return mConfirmTerm;
    }

    /**
     * ����mConfirmTerm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMConfirmTerm(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mConfirmTerm = value;
    }

    /**
     * ��ȡmContainer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMContainer() {
        return mContainer;
    }

    /**
     * ����mContainer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMContainer(JAXBElement<String> value) {
        this.mContainer = value;
    }

    /**
     * ��ȡmContractDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMContractDate() {
        return mContractDate;
    }

    /**
     * ����mContractDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMContractDate(XMLGregorianCalendar value) {
        this.mContractDate = value;
    }

    /**
     * ��ȡmContractKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMContractKey() {
        return mContractKey;
    }

    /**
     * ����mContractKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMContractKey(Long value) {
        this.mContractKey = value;
    }

    /**
     * ��ȡmContractLineKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMContractLineKey() {
        return mContractLineKey;
    }

    /**
     * ����mContractLineKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMContractLineKey(Long value) {
        this.mContractLineKey = value;
    }

    /**
     * ��ȡmContractLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMContractLineNo() {
        return mContractLineNo;
    }

    /**
     * ����mContractLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMContractLineNo(Integer value) {
        this.mContractLineNo = value;
    }

    /**
     * ��ȡmContractNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMContractNo() {
        return mContractNo;
    }

    /**
     * ����mContractNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMContractNo(JAXBElement<String> value) {
        this.mContractNo = value;
    }

    /**
     * ��ȡmContractOwnedOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMContractOwnedOrg() {
        return mContractOwnedOrg;
    }

    /**
     * ����mContractOwnedOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMContractOwnedOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mContractOwnedOrg = value;
    }

    /**
     * ��ȡmContractVer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMContractVer() {
        return mContractVer;
    }

    /**
     * ����mContractVer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMContractVer(Integer value) {
        this.mContractVer = value;
    }

    /**
     * ��ȡmCostBaseUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCostBaseUom() {
        return mCostBaseUom;
    }

    /**
     * ����mCostBaseUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCostBaseUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mCostBaseUom = value;
    }

    /**
     * ��ȡmCostRatetoBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCostRatetoBase() {
        return mCostRatetoBase;
    }

    /**
     * ����mCostRatetoBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCostRatetoBase(BigDecimal value) {
        this.mCostRatetoBase = value;
    }

    /**
     * ��ȡmCostUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCostUom() {
        return mCostUom;
    }

    /**
     * ����mCostUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCostUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mCostUom = value;
    }

    /**
     * ��ȡmCreatedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreatedBy() {
        return mCreatedBy;
    }

    /**
     * ����mCreatedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreatedBy(JAXBElement<String> value) {
        this.mCreatedBy = value;
    }

    /**
     * ��ȡmCreatedOn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCreatedOn() {
        return mCreatedOn;
    }

    /**
     * ����mCreatedOn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCreatedOn(XMLGregorianCalendar value) {
        this.mCreatedOn = value;
    }

    /**
     * ��ȡmCreditObj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCreditObj() {
        return mCreditObj;
    }

    /**
     * ����mCreditObj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCreditObj(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mCreditObj = value;
    }

    /**
     * ��ȡmCusSignInQtyInvAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCusSignInQtyInvAmount() {
        return mCusSignInQtyInvAmount;
    }

    /**
     * ����mCusSignInQtyInvAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCusSignInQtyInvAmount(BigDecimal value) {
        this.mCusSignInQtyInvAmount = value;
    }

    /**
     * ��ȡmCusSignInQtyPriceAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCusSignInQtyPriceAmount() {
        return mCusSignInQtyPriceAmount;
    }

    /**
     * ����mCusSignInQtyPriceAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCusSignInQtyPriceAmount(BigDecimal value) {
        this.mCusSignInQtyPriceAmount = value;
    }

    /**
     * ��ȡmCusSignInQtyTBUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCusSignInQtyTBUAmount() {
        return mCusSignInQtyTBUAmount;
    }

    /**
     * ����mCusSignInQtyTBUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCusSignInQtyTBUAmount(BigDecimal value) {
        this.mCusSignInQtyTBUAmount = value;
    }

    /**
     * ��ȡmCusSignInQtyTUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCusSignInQtyTUAmount() {
        return mCusSignInQtyTUAmount;
    }

    /**
     * ����mCusSignInQtyTUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCusSignInQtyTUAmount(BigDecimal value) {
        this.mCusSignInQtyTUAmount = value;
    }

    /**
     * ��ȡmCustomerItemCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCustomerItemCode() {
        return mCustomerItemCode;
    }

    /**
     * ����mCustomerItemCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCustomerItemCode(JAXBElement<String> value) {
        this.mCustomerItemCode = value;
    }

    /**
     * ��ȡmCustomerItemName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCustomerItemName() {
        return mCustomerItemName;
    }

    /**
     * ����mCustomerItemName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCustomerItemName(JAXBElement<String> value) {
        this.mCustomerItemName = value;
    }

    /**
     * ��ȡmDamageQtyIUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyIUAmount() {
        return mDamageQtyIUAmount;
    }

    /**
     * ����mDamageQtyIUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyIUAmount(BigDecimal value) {
        this.mDamageQtyIUAmount = value;
    }

    /**
     * ��ȡmDamageQtyOfProItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyOfProItem() {
        return mDamageQtyOfProItem;
    }

    /**
     * ����mDamageQtyOfProItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyOfProItem(BigDecimal value) {
        this.mDamageQtyOfProItem = value;
    }

    /**
     * ��ȡmDamageQtyPriceAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyPriceAmount() {
        return mDamageQtyPriceAmount;
    }

    /**
     * ����mDamageQtyPriceAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyPriceAmount(BigDecimal value) {
        this.mDamageQtyPriceAmount = value;
    }

    /**
     * ��ȡmDamageQtyTBUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyTBUAmount() {
        return mDamageQtyTBUAmount;
    }

    /**
     * ����mDamageQtyTBUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyTBUAmount(BigDecimal value) {
        this.mDamageQtyTBUAmount = value;
    }

    /**
     * ��ȡmDamageQtyTUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyTUAmount() {
        return mDamageQtyTUAmount;
    }

    /**
     * ����mDamageQtyTUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyTUAmount(BigDecimal value) {
        this.mDamageQtyTUAmount = value;
    }

    /**
     * ��ȡmDealMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDealMode() {
        return mDealMode;
    }

    /**
     * ����mDealMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDealMode(Integer value) {
        this.mDealMode = value;
    }

    /**
     * ��ȡmDeleteFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMDeleteFlag() {
        return mDeleteFlag;
    }

    /**
     * ����mDeleteFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMDeleteFlag(Boolean value) {
        this.mDeleteFlag = value;
    }

    /**
     * ��ȡmDemandCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDemandCode() {
        return mDemandCode;
    }

    /**
     * ����mDemandCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDemandCode(Integer value) {
        this.mDemandCode = value;
    }

    /**
     * ��ȡmDescFlexField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> getMDescFlexField() {
        return mDescFlexField;
    }

    /**
     * ����mDescFlexField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public void setMDescFlexField(JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> value) {
        this.mDescFlexField = value;
    }

    /**
     * ��ȡmDocLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDocLineNo() {
        return mDocLineNo;
    }

    /**
     * ����mDocLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDocLineNo(Integer value) {
        this.mDocLineNo = value;
    }

    /**
     * ��ȡmDonationReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDonationReason() {
        return mDonationReason;
    }

    /**
     * ����mDonationReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDonationReason(Integer value) {
        this.mDonationReason = value;
    }

    /**
     * ��ȡmDonationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDonationType() {
        return mDonationType;
    }

    /**
     * ����mDonationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDonationType(Integer value) {
        this.mDonationType = value;
    }

    /**
     * ��ȡmfas���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMFAS() {
        return mfas;
    }

    /**
     * ����mfas���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMFAS(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mfas = value;
    }

    /**
     * ��ȡmFillQtyPriceAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFillQtyPriceAmount() {
        return mFillQtyPriceAmount;
    }

    /**
     * ����mFillQtyPriceAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFillQtyPriceAmount(BigDecimal value) {
        this.mFillQtyPriceAmount = value;
    }

    /**
     * ��ȡmFillQtyTBUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFillQtyTBUAmount() {
        return mFillQtyTBUAmount;
    }

    /**
     * ����mFillQtyTBUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFillQtyTBUAmount(BigDecimal value) {
        this.mFillQtyTBUAmount = value;
    }

    /**
     * ��ȡmFillQtyTUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFillQtyTUAmount() {
        return mFillQtyTUAmount;
    }

    /**
     * ����mFillQtyTUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFillQtyTUAmount(BigDecimal value) {
        this.mFillQtyTUAmount = value;
    }

    /**
     * ��ȡmFinallyPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFinallyPrice() {
        return mFinallyPrice;
    }

    /**
     * ����mFinallyPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFinallyPrice(BigDecimal value) {
        this.mFinallyPrice = value;
    }

    /**
     * ��ȡmFinallyPriceTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFinallyPriceTC() {
        return mFinallyPriceTC;
    }

    /**
     * ����mFinallyPriceTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFinallyPriceTC(BigDecimal value) {
        this.mFinallyPriceTC = value;
    }

    /**
     * ��ȡmFutureCostAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFutureCostAC() {
        return mFutureCostAC;
    }

    /**
     * ����mFutureCostAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFutureCostAC(BigDecimal value) {
        this.mFutureCostAC = value;
    }

    /**
     * ��ȡmFutureCostFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFutureCostFC() {
        return mFutureCostFC;
    }

    /**
     * ����mFutureCostFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFutureCostFC(BigDecimal value) {
        this.mFutureCostFC = value;
    }

    /**
     * ��ȡmFutureCostTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFutureCostTC() {
        return mFutureCostTC;
    }

    /**
     * ����mFutureCostTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFutureCostTC(BigDecimal value) {
        this.mFutureCostTC = value;
    }

    /**
     * ��ȡmGoodsManagementType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMGoodsManagementType() {
        return mGoodsManagementType;
    }

    /**
     * ����mGoodsManagementType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMGoodsManagementType(Integer value) {
        this.mGoodsManagementType = value;
    }

    /**
     * ��ȡmHandleDept���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMHandleDept() {
        return mHandleDept;
    }

    /**
     * ����mHandleDept���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMHandleDept(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mHandleDept = value;
    }

    /**
     * ��ȡmid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMID() {
        return mid;
    }

    /**
     * ����mid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMID(Long value) {
        this.mid = value;
    }

    /**
     * ��ȡmIncomeConfirmRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMIncomeConfirmRule() {
        return mIncomeConfirmRule;
    }

    /**
     * ����mIncomeConfirmRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMIncomeConfirmRule(Integer value) {
        this.mIncomeConfirmRule = value;
    }

    /**
     * ��ȡmInnerSupersedeEnum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInnerSupersedeEnum() {
        return mInnerSupersedeEnum;
    }

    /**
     * ����mInnerSupersedeEnum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInnerSupersedeEnum(Integer value) {
        this.mInnerSupersedeEnum = value;
    }

    /**
     * ��ȡmInvBaseUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMInvBaseUom() {
        return mInvBaseUom;
    }

    /**
     * ����mInvBaseUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMInvBaseUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mInvBaseUom = value;
    }

    /**
     * ��ȡmInvMainUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMInvMainUOM() {
        return mInvMainUOM;
    }

    /**
     * ����mInvMainUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMInvMainUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mInvMainUOM = value;
    }

    /**
     * ��ȡmInvRatetoBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMInvRatetoBase() {
        return mInvRatetoBase;
    }

    /**
     * ����mInvRatetoBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMInvRatetoBase(BigDecimal value) {
        this.mInvRatetoBase = value;
    }

    /**
     * ��ȡmInvUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMInvUom() {
        return mInvUom;
    }

    /**
     * ����mInvUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMInvUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mInvUom = value;
    }

    /**
     * ��ȡmInvoiceAccording���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMInvoiceAccording() {
        return mInvoiceAccording;
    }

    /**
     * ����mInvoiceAccording���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMInvoiceAccording(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mInvoiceAccording = value;
    }

    /**
     * ��ȡmIsAllowReturn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAllowReturn() {
        return mIsAllowReturn;
    }

    /**
     * ����mIsAllowReturn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAllowReturn(Boolean value) {
        this.mIsAllowReturn = value;
    }

    /**
     * ��ȡmIsAssociatedChild���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAssociatedChild() {
        return mIsAssociatedChild;
    }

    /**
     * ����mIsAssociatedChild���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAssociatedChild(Boolean value) {
        this.mIsAssociatedChild = value;
    }

    /**
     * ��ȡmIsCloseSO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCloseSO() {
        return mIsCloseSO;
    }

    /**
     * ����mIsCloseSO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCloseSO(Boolean value) {
        this.mIsCloseSO = value;
    }

    /**
     * ��ȡmIsCreatedInflow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCreatedInflow() {
        return mIsCreatedInflow;
    }

    /**
     * ����mIsCreatedInflow���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCreatedInflow(Boolean value) {
        this.mIsCreatedInflow = value;
    }

    /**
     * ��ȡmIsFinishSignIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsFinishSignIn() {
        return mIsFinishSignIn;
    }

    /**
     * ����mIsFinishSignIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsFinishSignIn(Boolean value) {
        this.mIsFinishSignIn = value;
    }

    /**
     * ��ȡmIsInnerShipment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInnerShipment() {
        return mIsInnerShipment;
    }

    /**
     * ����mIsInnerShipment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInnerShipment(Boolean value) {
        this.mIsInnerShipment = value;
    }

    /**
     * ��ȡmIsItemVersionChangable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsItemVersionChangable() {
        return mIsItemVersionChangable;
    }

    /**
     * ����mIsItemVersionChangable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsItemVersionChangable(Boolean value) {
        this.mIsItemVersionChangable = value;
    }

    /**
     * ��ȡmIsMakeOutInvoice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMakeOutInvoice() {
        return mIsMakeOutInvoice;
    }

    /**
     * ����mIsMakeOutInvoice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMakeOutInvoice(Boolean value) {
        this.mIsMakeOutInvoice = value;
    }

    /**
     * ��ȡmIsModifyLot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyLot() {
        return mIsModifyLot;
    }

    /**
     * ����mIsModifyLot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyLot(Boolean value) {
        this.mIsModifyLot = value;
    }

    /**
     * ��ȡmIsModifyOperateOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyOperateOrg() {
        return mIsModifyOperateOrg;
    }

    /**
     * ����mIsModifyOperateOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyOperateOrg(Boolean value) {
        this.mIsModifyOperateOrg = value;
    }

    /**
     * ��ȡmIsModifyPU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyPU() {
        return mIsModifyPU;
    }

    /**
     * ����mIsModifyPU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyPU(Boolean value) {
        this.mIsModifyPU = value;
    }

    /**
     * ��ȡmIsModifyShipperOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyShipperOrg() {
        return mIsModifyShipperOrg;
    }

    /**
     * ����mIsModifyShipperOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyShipperOrg(Boolean value) {
        this.mIsModifyShipperOrg = value;
    }

    /**
     * ��ȡmIsModifyTBUToPBU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyTBUToPBU() {
        return mIsModifyTBUToPBU;
    }

    /**
     * ����mIsModifyTBUToPBU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyTBUToPBU(Boolean value) {
        this.mIsModifyTBUToPBU = value;
    }

    /**
     * ��ȡmIsModifyTCToACExRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyTCToACExRate() {
        return mIsModifyTCToACExRate;
    }

    /**
     * ����mIsModifyTCToACExRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyTCToACExRate(Boolean value) {
        this.mIsModifyTCToACExRate = value;
    }

    /**
     * ��ȡmIsModifyTU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyTU() {
        return mIsModifyTU;
    }

    /**
     * ����mIsModifyTU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyTU(Boolean value) {
        this.mIsModifyTU = value;
    }

    /**
     * ��ȡmIsNoSOShipment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNoSOShipment() {
        return mIsNoSOShipment;
    }

    /**
     * ����mIsNoSOShipment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNoSOShipment(Boolean value) {
        this.mIsNoSOShipment = value;
    }

    /**
     * ��ȡmIsPP���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPP() {
        return mIsPP;
    }

    /**
     * ����mIsPP���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPP(Boolean value) {
        this.mIsPP = value;
    }

    /**
     * ��ȡmIsPossessCredit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPossessCredit() {
        return mIsPossessCredit;
    }

    /**
     * ����mIsPossessCredit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPossessCredit(Boolean value) {
        this.mIsPossessCredit = value;
    }

    /**
     * ��ȡmIsPriceIncludeTax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPriceIncludeTax() {
        return mIsPriceIncludeTax;
    }

    /**
     * ����mIsPriceIncludeTax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPriceIncludeTax(Boolean value) {
        this.mIsPriceIncludeTax = value;
    }

    /**
     * ��ȡmIsPrjUnChangeable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPrjUnChangeable() {
        return mIsPrjUnChangeable;
    }

    /**
     * ����mIsPrjUnChangeable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPrjUnChangeable(Boolean value) {
        this.mIsPrjUnChangeable = value;
    }

    /**
     * ��ȡmIsRP���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRP() {
        return mIsRP;
    }

    /**
     * ����mIsRP���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRP(Boolean value) {
        this.mIsRP = value;
    }

    /**
     * ��ȡmIsRefill���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRefill() {
        return mIsRefill;
    }

    /**
     * ����mIsRefill���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRefill(Boolean value) {
        this.mIsRefill = value;
    }

    /**
     * ��ȡmIsZeroCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsZeroCost() {
        return mIsZeroCost;
    }

    /**
     * ����mIsZeroCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsZeroCost(Boolean value) {
        this.mIsZeroCost = value;
    }

    /**
     * ��ȡmItemBarCodes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMItemBarCodeDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMItemBarCodeDTOData> getMItemBarCodes() {
        return mItemBarCodes;
    }

    /**
     * ����mItemBarCodes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMItemBarCodeDTOData }{@code >}
     *     
     */
    public void setMItemBarCodes(JAXBElement<ArrayOfUFIDAU9ISVSMItemBarCodeDTOData> value) {
        this.mItemBarCodes = value;
    }

    /**
     * ��ȡmItemInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMItemInfo() {
        return mItemInfo;
    }

    /**
     * ����mItemInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMItemInfo(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mItemInfo = value;
    }

    /**
     * ��ȡmKitItemInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMKitItemInfo() {
        return mKitItemInfo;
    }

    /**
     * ����mKitItemInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMKitItemInfo(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mKitItemInfo = value;
    }

    /**
     * ��ȡmKitItemManufacturer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMKitItemManufacturer() {
        return mKitItemManufacturer;
    }

    /**
     * ����mKitItemManufacturer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMKitItemManufacturer(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mKitItemManufacturer = value;
    }

    /**
     * ��ȡmKitLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMKitLineNo() {
        return mKitLineNo;
    }

    /**
     * ����mKitLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMKitLineNo(JAXBElement<String> value) {
        this.mKitLineNo = value;
    }

    /**
     * ��ȡmlcMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLCMoney() {
        return mlcMoney;
    }

    /**
     * ����mlcMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLCMoney(BigDecimal value) {
        this.mlcMoney = value;
    }

    /**
     * ��ȡmLotInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesLotInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMPropertyTypesLotInfoData> getMLotInfo() {
        return mLotInfo;
    }

    /**
     * ����mLotInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesLotInfoData }{@code >}
     *     
     */
    public void setMLotInfo(JAXBElement<UFIDAU9CBOSCMPropertyTypesLotInfoData> value) {
        this.mLotInfo = value;
    }

    /**
     * ��ȡmLotInvalidationDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMLotInvalidationDate() {
        return mLotInvalidationDate;
    }

    /**
     * ����mLotInvalidationDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMLotInvalidationDate(XMLGregorianCalendar value) {
        this.mLotInvalidationDate = value;
    }

    /**
     * ��ȡmManufacturer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMManufacturer() {
        return mManufacturer;
    }

    /**
     * ����mManufacturer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMManufacturer(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mManufacturer = value;
    }

    /**
     * ��ȡmMaturityDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMMaturityDate() {
        return mMaturityDate;
    }

    /**
     * ����mMaturityDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMMaturityDate(XMLGregorianCalendar value) {
        this.mMaturityDate = value;
    }

    /**
     * ��ȡmModifiedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMModifiedBy() {
        return mModifiedBy;
    }

    /**
     * ����mModifiedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMModifiedBy(JAXBElement<String> value) {
        this.mModifiedBy = value;
    }

    /**
     * ��ȡmModifiedOn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMModifiedOn() {
        return mModifiedOn;
    }

    /**
     * ����mModifiedOn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMModifiedOn(XMLGregorianCalendar value) {
        this.mModifiedOn = value;
    }

    /**
     * ��ȡmNetAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMNetAccount() {
        return mNetAccount;
    }

    /**
     * ����mNetAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMNetAccount(Boolean value) {
        this.mNetAccount = value;
    }

    /**
     * ��ȡmNotLcMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNotLcMoney() {
        return mNotLcMoney;
    }

    /**
     * ����mNotLcMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNotLcMoney(BigDecimal value) {
        this.mNotLcMoney = value;
    }

    /**
     * ��ȡmOrderPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOrderPrice() {
        return mOrderPrice;
    }

    /**
     * ����mOrderPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOrderPrice(BigDecimal value) {
        this.mOrderPrice = value;
    }

    /**
     * ��ȡmOrderPriceTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOrderPriceTC() {
        return mOrderPriceTC;
    }

    /**
     * ����mOrderPriceTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOrderPriceTC(BigDecimal value) {
        this.mOrderPriceTC = value;
    }

    /**
     * ��ȡmOriginalItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMOriginalItem() {
        return mOriginalItem;
    }

    /**
     * ����mOriginalItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMOriginalItem(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mOriginalItem = value;
    }

    /**
     * ��ȡmOriginalItemAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOriginalItemAmount() {
        return mOriginalItemAmount;
    }

    /**
     * ����mOriginalItemAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOriginalItemAmount(BigDecimal value) {
        this.mOriginalItemAmount = value;
    }

    /**
     * ��ȡmOriginalItemBaseUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMOriginalItemBaseUom() {
        return mOriginalItemBaseUom;
    }

    /**
     * ����mOriginalItemBaseUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMOriginalItemBaseUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mOriginalItemBaseUom = value;
    }

    /**
     * ��ȡmOriginalItemRatetoBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOriginalItemRatetoBase() {
        return mOriginalItemRatetoBase;
    }

    /**
     * ����mOriginalItemRatetoBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOriginalItemRatetoBase(BigDecimal value) {
        this.mOriginalItemRatetoBase = value;
    }

    /**
     * ��ȡmOriginalItemUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMOriginalItemUom() {
        return mOriginalItemUom;
    }

    /**
     * ����mOriginalItemUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMOriginalItemUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mOriginalItemUom = value;
    }

    /**
     * ��ȡmOriginalManufacturer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMOriginalManufacturer() {
        return mOriginalManufacturer;
    }

    /**
     * ����mOriginalManufacturer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMOriginalManufacturer(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mOriginalManufacturer = value;
    }

    /**
     * ��ȡmParentShipLineID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMParentShipLineID() {
        return mParentShipLineID;
    }

    /**
     * ����mParentShipLineID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMParentShipLineID(Long value) {
        this.mParentShipLineID = value;
    }

    /**
     * ��ȡmParentShipLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMParentShipLineNo() {
        return mParentShipLineNo;
    }

    /**
     * ����mParentShipLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMParentShipLineNo(Integer value) {
        this.mParentShipLineNo = value;
    }

    /**
     * ��ȡmPayer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPayer() {
        return mPayer;
    }

    /**
     * ����mPayer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPayer(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mPayer = value;
    }

    /**
     * ��ȡmPayerSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPayerSite() {
        return mPayerSite;
    }

    /**
     * ����mPayerSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPayerSite(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mPayerSite = value;
    }

    /**
     * ��ȡmPerProcessQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPerProcessQty() {
        return mPerProcessQty;
    }

    /**
     * ����mPerProcessQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPerProcessQty(BigDecimal value) {
        this.mPerProcessQty = value;
    }

    /**
     * ��ȡmPiece���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPiece() {
        return mPiece;
    }

    /**
     * ����mPiece���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPiece(BigDecimal value) {
        this.mPiece = value;
    }

    /**
     * ��ȡmPlanQtyTBUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanQtyTBUAmount() {
        return mPlanQtyTBUAmount;
    }

    /**
     * ����mPlanQtyTBUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanQtyTBUAmount(BigDecimal value) {
        this.mPlanQtyTBUAmount = value;
    }

    /**
     * ��ȡmPlanQtyTUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanQtyTUAmount() {
        return mPlanQtyTUAmount;
    }

    /**
     * ����mPlanQtyTUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanQtyTUAmount(BigDecimal value) {
        this.mPlanQtyTUAmount = value;
    }

    /**
     * ��ȡmPreMaturityDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMPreMaturityDate() {
        return mPreMaturityDate;
    }

    /**
     * ����mPreMaturityDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMPreMaturityDate(XMLGregorianCalendar value) {
        this.mPreMaturityDate = value;
    }

    /**
     * ��ȡmPrecisionACCC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrecisionACCC() {
        return mPrecisionACCC;
    }

    /**
     * ����mPrecisionACCC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrecisionACCC(Integer value) {
        this.mPrecisionACCC = value;
    }

    /**
     * ��ȡmPrecisionTCAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrecisionTCAC() {
        return mPrecisionTCAC;
    }

    /**
     * ����mPrecisionTCAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrecisionTCAC(Integer value) {
        this.mPrecisionTCAC = value;
    }

    /**
     * ��ȡmPriceBaseUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPriceBaseUom() {
        return mPriceBaseUom;
    }

    /**
     * ����mPriceBaseUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPriceBaseUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mPriceBaseUom = value;
    }

    /**
     * ��ȡmPriceList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPriceList() {
        return mPriceList;
    }

    /**
     * ����mPriceList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPriceList(Long value) {
        this.mPriceList = value;
    }

    /**
     * ��ȡmPriceListCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPriceListCode() {
        return mPriceListCode;
    }

    /**
     * ����mPriceListCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPriceListCode(JAXBElement<String> value) {
        this.mPriceListCode = value;
    }

    /**
     * ��ȡmPriceListName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPriceListName() {
        return mPriceListName;
    }

    /**
     * ����mPriceListName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPriceListName(JAXBElement<String> value) {
        this.mPriceListName = value;
    }

    /**
     * ��ȡmPriceRatetoBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPriceRatetoBase() {
        return mPriceRatetoBase;
    }

    /**
     * ����mPriceRatetoBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPriceRatetoBase(BigDecimal value) {
        this.mPriceRatetoBase = value;
    }

    /**
     * ��ȡmPriceSource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPriceSource() {
        return mPriceSource;
    }

    /**
     * ����mPriceSource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPriceSource(Integer value) {
        this.mPriceSource = value;
    }

    /**
     * ��ȡmPriceUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPriceUom() {
        return mPriceUom;
    }

    /**
     * ����mPriceUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPriceUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mPriceUom = value;
    }

    /**
     * ��ȡmProcedureNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMProcedureNO() {
        return mProcedureNO;
    }

    /**
     * ����mProcedureNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMProcedureNO(JAXBElement<String> value) {
        this.mProcedureNO = value;
    }

    /**
     * ��ȡmProcessItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMProcessItem() {
        return mProcessItem;
    }

    /**
     * ����mProcessItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMProcessItem(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mProcessItem = value;
    }

    /**
     * ��ȡmProcessMFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMProcessMFC() {
        return mProcessMFC;
    }

    /**
     * ����mProcessMFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMProcessMFC(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mProcessMFC = value;
    }

    /**
     * ��ȡmProcessQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessQty() {
        return mProcessQty;
    }

    /**
     * ����mProcessQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessQty(BigDecimal value) {
        this.mProcessQty = value;
    }

    /**
     * ��ȡmProcessRateToSub���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessRateToSub() {
        return mProcessRateToSub;
    }

    /**
     * ����mProcessRateToSub���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessRateToSub(BigDecimal value) {
        this.mProcessRateToSub = value;
    }

    /**
     * ��ȡmProcessSubUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMProcessSubUom() {
        return mProcessSubUom;
    }

    /**
     * ����mProcessSubUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMProcessSubUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mProcessSubUom = value;
    }

    /**
     * ��ȡmProcessUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMProcessUOM() {
        return mProcessUOM;
    }

    /**
     * ����mProcessUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMProcessUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mProcessUOM = value;
    }

    /**
     * ��ȡmProject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMProject() {
        return mProject;
    }

    /**
     * ����mProject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMProject(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mProject = value;
    }

    /**
     * ��ȡmQtyPriceAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQtyPriceAmount() {
        return mQtyPriceAmount;
    }

    /**
     * ����mQtyPriceAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQtyPriceAmount(BigDecimal value) {
        this.mQtyPriceAmount = value;
    }

    /**
     * ��ȡmQuantityType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQuantityType() {
        return mQuantityType;
    }

    /**
     * ����mQuantityType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQuantityType(Integer value) {
        this.mQuantityType = value;
    }

    /**
     * ��ȡmRcvQryTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMRcvQryTime() {
        return mRcvQryTime;
    }

    /**
     * ����mRcvQryTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMRcvQryTime(XMLGregorianCalendar value) {
        this.mRcvQryTime = value;
    }

    /**
     * ��ȡmRcvQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRcvQty() {
        return mRcvQty;
    }

    /**
     * ����mRcvQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRcvQty(BigDecimal value) {
        this.mRcvQty = value;
    }

    /**
     * ��ȡmRecBillLineKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMRecBillLineKey() {
        return mRecBillLineKey;
    }

    /**
     * ����mRecBillLineKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMRecBillLineKey(Long value) {
        this.mRecBillLineKey = value;
    }

    /**
     * ��ȡmRecBillLineNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRecBillLineNO() {
        return mRecBillLineNO;
    }

    /**
     * ����mRecBillLineNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRecBillLineNO(Integer value) {
        this.mRecBillLineNO = value;
    }

    /**
     * ��ȡmReceivableTerm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMReceivableTerm() {
        return mReceivableTerm;
    }

    /**
     * ����mReceivableTerm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMReceivableTerm(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mReceivableTerm = value;
    }

    /**
     * ��ȡmReceiveBillKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMReceiveBillKey() {
        return mReceiveBillKey;
    }

    /**
     * ����mReceiveBillKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMReceiveBillKey(Long value) {
        this.mReceiveBillKey = value;
    }

    /**
     * ��ȡmReceiveBillNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMReceiveBillNo() {
        return mReceiveBillNo;
    }

    /**
     * ����mReceiveBillNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMReceiveBillNo(JAXBElement<String> value) {
        this.mReceiveBillNo = value;
    }

    /**
     * ��ȡmRejectQtyIUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyIUAmount() {
        return mRejectQtyIUAmount;
    }

    /**
     * ����mRejectQtyIUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyIUAmount(BigDecimal value) {
        this.mRejectQtyIUAmount = value;
    }

    /**
     * ��ȡmRejectQtyOfProItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyOfProItem() {
        return mRejectQtyOfProItem;
    }

    /**
     * ����mRejectQtyOfProItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyOfProItem(BigDecimal value) {
        this.mRejectQtyOfProItem = value;
    }

    /**
     * ��ȡmRejectQtyPriceAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyPriceAmount() {
        return mRejectQtyPriceAmount;
    }

    /**
     * ����mRejectQtyPriceAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyPriceAmount(BigDecimal value) {
        this.mRejectQtyPriceAmount = value;
    }

    /**
     * ��ȡmRejectQtyTBUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyTBUAmount() {
        return mRejectQtyTBUAmount;
    }

    /**
     * ����mRejectQtyTBUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyTBUAmount(BigDecimal value) {
        this.mRejectQtyTBUAmount = value;
    }

    /**
     * ��ȡmRejectQtyTU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyTU() {
        return mRejectQtyTU;
    }

    /**
     * ����mRejectQtyTU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyTU(BigDecimal value) {
        this.mRejectQtyTU = value;
    }

    /**
     * ��ȡmRejectReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRejectReason() {
        return mRejectReason;
    }

    /**
     * ����mRejectReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRejectReason(Integer value) {
        this.mRejectReason = value;
    }

    /**
     * ��ȡmReserveQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReserveQty() {
        return mReserveQty;
    }

    /**
     * ����mReserveQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReserveQty(BigDecimal value) {
        this.mReserveQty = value;
    }

    /**
     * ��ȡmsoDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSODate() {
        return msoDate;
    }

    /**
     * ����msoDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSODate(XMLGregorianCalendar value) {
        this.msoDate = value;
    }

    /**
     * ��ȡmsoKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSOKey() {
        return msoKey;
    }

    /**
     * ����msoKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSOKey(Long value) {
        this.msoKey = value;
    }

    /**
     * ��ȡmsoKitLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSOKitLineNo() {
        return msoKitLineNo;
    }

    /**
     * ����msoKitLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSOKitLineNo(JAXBElement<String> value) {
        this.msoKitLineNo = value;
    }

    /**
     * ��ȡmsoLineKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSOLineKey() {
        return msoLineKey;
    }

    /**
     * ����msoLineKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSOLineKey(Long value) {
        this.msoLineKey = value;
    }

    /**
     * ��ȡmsoLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSOLineNo() {
        return msoLineNo;
    }

    /**
     * ����msoLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSOLineNo(Integer value) {
        this.msoLineNo = value;
    }

    /**
     * ��ȡmsoNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSONo() {
        return msoNo;
    }

    /**
     * ����msoNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSONo(JAXBElement<String> value) {
        this.msoNo = value;
    }

    /**
     * ��ȡmsoOwnedOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSOOwnedOrg() {
        return msoOwnedOrg;
    }

    /**
     * ����msoOwnedOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSOOwnedOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.msoOwnedOrg = value;
    }

    /**
     * ��ȡmsoSubLineKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSOSubLineKey() {
        return msoSubLineKey;
    }

    /**
     * ����msoSubLineKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSOSubLineKey(Long value) {
        this.msoSubLineKey = value;
    }

    /**
     * ��ȡmsoSubLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSOSubLineNo() {
        return msoSubLineNo;
    }

    /**
     * ����msoSubLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSOSubLineNo(Integer value) {
        this.msoSubLineNo = value;
    }

    /**
     * ��ȡmsotDocType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSOTDocType() {
        return msotDocType;
    }

    /**
     * ����msotDocType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSOTDocType(Long value) {
        this.msotDocType = value;
    }

    /**
     * ��ȡmsoVer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSOVer() {
        return msoVer;
    }

    /**
     * ����msoVer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSOVer(Integer value) {
        this.msoVer = value;
    }

    /**
     * ��ȡmSaleCostAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleCostAC() {
        return mSaleCostAC;
    }

    /**
     * ����mSaleCostAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleCostAC(BigDecimal value) {
        this.mSaleCostAC = value;
    }

    /**
     * ��ȡmSaleCostAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleCostAmount() {
        return mSaleCostAmount;
    }

    /**
     * ����mSaleCostAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleCostAmount(BigDecimal value) {
        this.mSaleCostAmount = value;
    }

    /**
     * ��ȡmSaleCostFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleCostFC() {
        return mSaleCostFC;
    }

    /**
     * ����mSaleCostFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleCostFC(BigDecimal value) {
        this.mSaleCostFC = value;
    }

    /**
     * ��ȡmSaleCostTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleCostTC() {
        return mSaleCostTC;
    }

    /**
     * ����mSaleCostTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleCostTC(BigDecimal value) {
        this.mSaleCostTC = value;
    }

    /**
     * ��ȡmSaleDept���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSaleDept() {
        return mSaleDept;
    }

    /**
     * ����mSaleDept���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSaleDept(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSaleDept = value;
    }

    /**
     * ��ȡmSaleOrFYTask���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSaleOrFYTask() {
        return mSaleOrFYTask;
    }

    /**
     * ����mSaleOrFYTask���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSaleOrFYTask(Long value) {
        this.mSaleOrFYTask = value;
    }

    /**
     * ��ȡmSaleRtnMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleRtnMoney() {
        return mSaleRtnMoney;
    }

    /**
     * ����mSaleRtnMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleRtnMoney(BigDecimal value) {
        this.mSaleRtnMoney = value;
    }

    /**
     * ��ȡmSeiban���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSeiban() {
        return mSeiban;
    }

    /**
     * ����mSeiban���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSeiban(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSeiban = value;
    }

    /**
     * ��ȡmSeibanAlterable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSeibanAlterable() {
        return mSeibanAlterable;
    }

    /**
     * ����mSeibanAlterable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSeibanAlterable(Integer value) {
        this.mSeibanAlterable = value;
    }

    /**
     * ��ȡmSeller���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSeller() {
        return mSeller;
    }

    /**
     * ����mSeller���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSeller(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSeller = value;
    }

    /**
     * ��ȡmShip���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVSMShipDTOForIndustryChainData> getMShip() {
        return mShip;
    }

    /**
     * ����mShip���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShip(JAXBElement<UFIDAU9ISVSMShipDTOForIndustryChainData> value) {
        this.mShip = value;
    }

    /**
     * ��ȡmShipAddresss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipAddressDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipAddressDTOForIndustryChainData> getMShipAddresss() {
        return mShipAddresss;
    }

    /**
     * ����mShipAddresss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipAddressDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipAddresss(JAXBElement<ArrayOfUFIDAU9ISVSMShipAddressDTOForIndustryChainData> value) {
        this.mShipAddresss = value;
    }

    /**
     * ��ȡmShipContacts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipContactDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipContactDTOForIndustryChainData> getMShipContacts() {
        return mShipContacts;
    }

    /**
     * ����mShipContacts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipContactDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipContacts(JAXBElement<ArrayOfUFIDAU9ISVSMShipContactDTOForIndustryChainData> value) {
        this.mShipContacts = value;
    }

    /**
     * ��ȡmShipFees���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipFeeDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipFeeDTOForIndustryChainData> getMShipFees() {
        return mShipFees;
    }

    /**
     * ����mShipFees���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipFeeDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipFees(JAXBElement<ArrayOfUFIDAU9ISVSMShipFeeDTOForIndustryChainData> value) {
        this.mShipFees = value;
    }

    /**
     * ��ȡmShipLineBalanceRoutes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipLineBalanceRouteDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipLineBalanceRouteDTOForIndustryChainData> getMShipLineBalanceRoutes() {
        return mShipLineBalanceRoutes;
    }

    /**
     * ����mShipLineBalanceRoutes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipLineBalanceRouteDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipLineBalanceRoutes(JAXBElement<ArrayOfUFIDAU9ISVSMShipLineBalanceRouteDTOForIndustryChainData> value) {
        this.mShipLineBalanceRoutes = value;
    }

    /**
     * ��ȡmShipLineCosts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipLineCostDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipLineCostDTOForIndustryChainData> getMShipLineCosts() {
        return mShipLineCosts;
    }

    /**
     * ����mShipLineCosts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipLineCostDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipLineCosts(JAXBElement<ArrayOfUFIDAU9ISVSMShipLineCostDTOForIndustryChainData> value) {
        this.mShipLineCosts = value;
    }

    /**
     * ��ȡmShipLineDiscounts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipLineDiscountDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipLineDiscountDTOForIndustryChainData> getMShipLineDiscounts() {
        return mShipLineDiscounts;
    }

    /**
     * ����mShipLineDiscounts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipLineDiscountDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipLineDiscounts(JAXBElement<ArrayOfUFIDAU9ISVSMShipLineDiscountDTOForIndustryChainData> value) {
        this.mShipLineDiscounts = value;
    }

    /**
     * ��ȡmShipLineLocations���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipLineLocationDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipLineLocationDTOForIndustryChainData> getMShipLineLocations() {
        return mShipLineLocations;
    }

    /**
     * ����mShipLineLocations���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipLineLocationDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipLineLocations(JAXBElement<ArrayOfUFIDAU9ISVSMShipLineLocationDTOForIndustryChainData> value) {
        this.mShipLineLocations = value;
    }

    /**
     * ��ȡmShipLineMemo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShipLineMemo() {
        return mShipLineMemo;
    }

    /**
     * ����mShipLineMemo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShipLineMemo(JAXBElement<String> value) {
        this.mShipLineMemo = value;
    }

    /**
     * ��ȡmShipQtyCostAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShipQtyCostAmount() {
        return mShipQtyCostAmount;
    }

    /**
     * ����mShipQtyCostAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShipQtyCostAmount(BigDecimal value) {
        this.mShipQtyCostAmount = value;
    }

    /**
     * ��ȡmShipQtyInvAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShipQtyInvAmount() {
        return mShipQtyInvAmount;
    }

    /**
     * ����mShipQtyInvAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShipQtyInvAmount(BigDecimal value) {
        this.mShipQtyInvAmount = value;
    }

    /**
     * ��ȡmShipQtyTBUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShipQtyTBUAmount() {
        return mShipQtyTBUAmount;
    }

    /**
     * ����mShipQtyTBUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShipQtyTBUAmount(BigDecimal value) {
        this.mShipQtyTBUAmount = value;
    }

    /**
     * ��ȡmShipQtyTUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShipQtyTUAmount() {
        return mShipQtyTUAmount;
    }

    /**
     * ����mShipQtyTUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShipQtyTUAmount(BigDecimal value) {
        this.mShipQtyTUAmount = value;
    }

    /**
     * ��ȡmShipTaxs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipTaxDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipTaxDTOForIndustryChainData> getMShipTaxs() {
        return mShipTaxs;
    }

    /**
     * ����mShipTaxs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipTaxDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipTaxs(JAXBElement<ArrayOfUFIDAU9ISVSMShipTaxDTOForIndustryChainData> value) {
        this.mShipTaxs = value;
    }

    /**
     * ��ȡmShipToSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMShipToSite() {
        return mShipToSite;
    }

    /**
     * ����mShipToSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMShipToSite(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mShipToSite = value;
    }

    /**
     * ��ȡmShipTogetherFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMShipTogetherFlag() {
        return mShipTogetherFlag;
    }

    /**
     * ����mShipTogetherFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMShipTogetherFlag(Integer value) {
        this.mShipTogetherFlag = value;
    }

    /**
     * ��ȡmShipmentRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMShipmentRule() {
        return mShipmentRule;
    }

    /**
     * ����mShipmentRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMShipmentRule(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mShipmentRule = value;
    }

    /**
     * ��ȡmShipperOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMShipperOrg() {
        return mShipperOrg;
    }

    /**
     * ����mShipperOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMShipperOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mShipperOrg = value;
    }

    /**
     * ��ȡmShippingQtyIU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShippingQtyIU() {
        return mShippingQtyIU;
    }

    /**
     * ����mShippingQtyIU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShippingQtyIU(BigDecimal value) {
        this.mShippingQtyIU = value;
    }

    /**
     * ��ȡmSignInDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSignInDate() {
        return mSignInDate;
    }

    /**
     * ����mSignInDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSignInDate(XMLGregorianCalendar value) {
        this.mSignInDate = value;
    }

    /**
     * ��ȡmSignInQtyOfProItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInQtyOfProItem() {
        return mSignInQtyOfProItem;
    }

    /**
     * ����mSignInQtyOfProItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInQtyOfProItem(BigDecimal value) {
        this.mSignInQtyOfProItem = value;
    }

    /**
     * ��ȡmSignInTotalMoneyAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyAC() {
        return mSignInTotalMoneyAC;
    }

    /**
     * ����mSignInTotalMoneyAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyAC(BigDecimal value) {
        this.mSignInTotalMoneyAC = value;
    }

    /**
     * ��ȡmSignInTotalMoneyFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyFC() {
        return mSignInTotalMoneyFC;
    }

    /**
     * ����mSignInTotalMoneyFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyFC(BigDecimal value) {
        this.mSignInTotalMoneyFC = value;
    }

    /**
     * ��ȡmSignInTotalMoneyNoTax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyNoTax() {
        return mSignInTotalMoneyNoTax;
    }

    /**
     * ����mSignInTotalMoneyNoTax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyNoTax(BigDecimal value) {
        this.mSignInTotalMoneyNoTax = value;
    }

    /**
     * ��ȡmSignInTotalMoneyNoTaxFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyNoTaxFC() {
        return mSignInTotalMoneyNoTaxFC;
    }

    /**
     * ����mSignInTotalMoneyNoTaxFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyNoTaxFC(BigDecimal value) {
        this.mSignInTotalMoneyNoTaxFC = value;
    }

    /**
     * ��ȡmSignInTotalMoneyNoTaxTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyNoTaxTC() {
        return mSignInTotalMoneyNoTaxTC;
    }

    /**
     * ����mSignInTotalMoneyNoTaxTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyNoTaxTC(BigDecimal value) {
        this.mSignInTotalMoneyNoTaxTC = value;
    }

    /**
     * ��ȡmSignInTotalMoneyTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyTC() {
        return mSignInTotalMoneyTC;
    }

    /**
     * ����mSignInTotalMoneyTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyTC(BigDecimal value) {
        this.mSignInTotalMoneyTC = value;
    }

    /**
     * ��ȡmSignInTotalTax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalTax() {
        return mSignInTotalTax;
    }

    /**
     * ����mSignInTotalTax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalTax(BigDecimal value) {
        this.mSignInTotalTax = value;
    }

    /**
     * ��ȡmSignInTotalTaxFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalTaxFC() {
        return mSignInTotalTaxFC;
    }

    /**
     * ����mSignInTotalTaxFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalTaxFC(BigDecimal value) {
        this.mSignInTotalTaxFC = value;
    }

    /**
     * ��ȡmSignInTotalTaxTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalTaxTC() {
        return mSignInTotalTaxTC;
    }

    /**
     * ����mSignInTotalTaxTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalTaxTC(BigDecimal value) {
        this.mSignInTotalTaxTC = value;
    }

    /**
     * ��ȡmSrcDocDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSrcDocDate() {
        return mSrcDocDate;
    }

    /**
     * ����mSrcDocDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSrcDocDate(XMLGregorianCalendar value) {
        this.mSrcDocDate = value;
    }

    /**
     * ��ȡmSrcDocKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcDocKey() {
        return mSrcDocKey;
    }

    /**
     * ����mSrcDocKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcDocKey(Long value) {
        this.mSrcDocKey = value;
    }

    /**
     * ��ȡmSrcDocLineKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcDocLineKey() {
        return mSrcDocLineKey;
    }

    /**
     * ����mSrcDocLineKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcDocLineKey(Long value) {
        this.mSrcDocLineKey = value;
    }

    /**
     * ��ȡmSrcDocLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocLineNo() {
        return mSrcDocLineNo;
    }

    /**
     * ����mSrcDocLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocLineNo(Integer value) {
        this.mSrcDocLineNo = value;
    }

    /**
     * ��ȡmSrcDocNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSrcDocNo() {
        return mSrcDocNo;
    }

    /**
     * ����mSrcDocNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSrcDocNo(JAXBElement<String> value) {
        this.mSrcDocNo = value;
    }

    /**
     * ��ȡmSrcDocOwnedOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSrcDocOwnedOrg() {
        return mSrcDocOwnedOrg;
    }

    /**
     * ����mSrcDocOwnedOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSrcDocOwnedOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSrcDocOwnedOrg = value;
    }

    /**
     * ��ȡmSrcDocPriceTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSrcDocPriceTC() {
        return mSrcDocPriceTC;
    }

    /**
     * ����mSrcDocPriceTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSrcDocPriceTC(BigDecimal value) {
        this.mSrcDocPriceTC = value;
    }

    /**
     * ��ȡmSrcDocSubLineKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcDocSubLineKey() {
        return mSrcDocSubLineKey;
    }

    /**
     * ����mSrcDocSubLineKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcDocSubLineKey(Long value) {
        this.mSrcDocSubLineKey = value;
    }

    /**
     * ��ȡmSrcDocSubLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocSubLineNo() {
        return mSrcDocSubLineNo;
    }

    /**
     * ����mSrcDocSubLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocSubLineNo(Integer value) {
        this.mSrcDocSubLineNo = value;
    }

    /**
     * ��ȡmSrcDocTransType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcDocTransType() {
        return mSrcDocTransType;
    }

    /**
     * ����mSrcDocTransType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcDocTransType(Long value) {
        this.mSrcDocTransType = value;
    }

    /**
     * ��ȡmSrcDocType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocType() {
        return mSrcDocType;
    }

    /**
     * ����mSrcDocType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocType(Integer value) {
        this.mSrcDocType = value;
    }

    /**
     * ��ȡmSrcDocVer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocVer() {
        return mSrcDocVer;
    }

    /**
     * ����mSrcDocVer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocVer(Integer value) {
        this.mSrcDocVer = value;
    }

    /**
     * ��ȡmSrcKitLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSrcKitLineNo() {
        return mSrcKitLineNo;
    }

    /**
     * ����mSrcKitLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSrcKitLineNo(JAXBElement<String> value) {
        this.mSrcKitLineNo = value;
    }

    /**
     * ��ȡmSrcSysVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcSysVersion() {
        return mSrcSysVersion;
    }

    /**
     * ����mSrcSysVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcSysVersion(Long value) {
        this.mSrcSysVersion = value;
    }

    /**
     * ��ȡmStageWH���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMStageWH() {
        return mStageWH;
    }

    /**
     * ����mStageWH���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMStageWH(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mStageWH = value;
    }

    /**
     * ��ȡmStickBrandCustomer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMStickBrandCustomer() {
        return mStickBrandCustomer;
    }

    /**
     * ����mStickBrandCustomer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMStickBrandCustomer(JAXBElement<String> value) {
        this.mStickBrandCustomer = value;
    }

    /**
     * ��ȡmStickBrandItemCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMStickBrandItemCode() {
        return mStickBrandItemCode;
    }

    /**
     * ����mStickBrandItemCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMStickBrandItemCode(JAXBElement<String> value) {
        this.mStickBrandItemCode = value;
    }

    /**
     * ��ȡmStickBrandItemName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMStickBrandItemName() {
        return mStickBrandItemName;
    }

    /**
     * ����mStickBrandItemName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMStickBrandItemName(JAXBElement<String> value) {
        this.mStickBrandItemName = value;
    }

    /**
     * ��ȡmStorageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStorageType() {
        return mStorageType;
    }

    /**
     * ����mStorageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStorageType(Integer value) {
        this.mStorageType = value;
    }

    /**
     * ��ȡmStoreArk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStoreArk() {
        return mStoreArk;
    }

    /**
     * ����mStoreArk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStoreArk(BigDecimal value) {
        this.mStoreArk = value;
    }

    /**
     * ��ȡmSubItemCostRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSubItemCostRate() {
        return mSubItemCostRate;
    }

    /**
     * ����mSubItemCostRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSubItemCostRate(BigDecimal value) {
        this.mSubItemCostRate = value;
    }

    /**
     * ��ȡmSupplier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSupplier() {
        return mSupplier;
    }

    /**
     * ����mSupplier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSupplier(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSupplier = value;
    }

    /**
     * ��ȡmSysVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSysVersion() {
        return mSysVersion;
    }

    /**
     * ����mSysVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSysVersion(Long value) {
        this.mSysVersion = value;
    }

    /**
     * ��ȡmSystemPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSystemPrice() {
        return mSystemPrice;
    }

    /**
     * ����mSystemPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSystemPrice(BigDecimal value) {
        this.mSystemPrice = value;
    }

    /**
     * ��ȡmSystemPriceTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSystemPriceTC() {
        return mSystemPriceTC;
    }

    /**
     * ����mSystemPriceTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSystemPriceTC(BigDecimal value) {
        this.mSystemPriceTC = value;
    }

    /**
     * ��ȡmtcToACExchRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTCToACExchRate() {
        return mtcToACExchRate;
    }

    /**
     * ����mtcToACExchRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTCToACExchRate(BigDecimal value) {
        this.mtcToACExchRate = value;
    }

    /**
     * ��ȡmtucuConvRatio���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTUCUConvRatio() {
        return mtucuConvRatio;
    }

    /**
     * ����mtucuConvRatio���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTUCUConvRatio(BigDecimal value) {
        this.mtucuConvRatio = value;
    }

    /**
     * ��ȡmtuInvConvRatio���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTUInvConvRatio() {
        return mtuInvConvRatio;
    }

    /**
     * ����mtuInvConvRatio���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTUInvConvRatio(BigDecimal value) {
        this.mtuInvConvRatio = value;
    }

    /**
     * ��ȡmtupuConvRatio���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTUPUConvRatio() {
        return mtupuConvRatio;
    }

    /**
     * ����mtupuConvRatio���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTUPUConvRatio(BigDecimal value) {
        this.mtupuConvRatio = value;
    }

    /**
     * ��ȡmTask���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMTask() {
        return mTask;
    }

    /**
     * ����mTask���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMTask(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mTask = value;
    }

    /**
     * ��ȡmTaxFreeNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTaxFreeNo() {
        return mTaxFreeNo;
    }

    /**
     * ����mTaxFreeNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTaxFreeNo(JAXBElement<String> value) {
        this.mTaxFreeNo = value;
    }

    /**
     * ��ȡmTaxRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxRate() {
        return mTaxRate;
    }

    /**
     * ����mTaxRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxRate(BigDecimal value) {
        this.mTaxRate = value;
    }

    /**
     * ��ȡmTaxSchedule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMTaxSchedule() {
        return mTaxSchedule;
    }

    /**
     * ����mTaxSchedule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMTaxSchedule(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mTaxSchedule = value;
    }

    /**
     * ��ȡmTotalDiscount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalDiscount() {
        return mTotalDiscount;
    }

    /**
     * ����mTotalDiscount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalDiscount(BigDecimal value) {
        this.mTotalDiscount = value;
    }

    /**
     * ��ȡmTotalDiscountTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalDiscountTC() {
        return mTotalDiscountTC;
    }

    /**
     * ����mTotalDiscountTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalDiscountTC(BigDecimal value) {
        this.mTotalDiscountTC = value;
    }

    /**
     * ��ȡmTotalFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalFee() {
        return mTotalFee;
    }

    /**
     * ����mTotalFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalFee(BigDecimal value) {
        this.mTotalFee = value;
    }

    /**
     * ��ȡmTotalFeeTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalFeeTC() {
        return mTotalFeeTC;
    }

    /**
     * ����mTotalFeeTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalFeeTC(BigDecimal value) {
        this.mTotalFeeTC = value;
    }

    /**
     * ��ȡmTotalMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMoney() {
        return mTotalMoney;
    }

    /**
     * ����mTotalMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMoney(BigDecimal value) {
        this.mTotalMoney = value;
    }

    /**
     * ��ȡmTotalMoneyFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMoneyFC() {
        return mTotalMoneyFC;
    }

    /**
     * ����mTotalMoneyFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMoneyFC(BigDecimal value) {
        this.mTotalMoneyFC = value;
    }

    /**
     * ��ȡmTotalMoneyTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMoneyTC() {
        return mTotalMoneyTC;
    }

    /**
     * ����mTotalMoneyTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMoneyTC(BigDecimal value) {
        this.mTotalMoneyTC = value;
    }

    /**
     * ��ȡmTotalNetMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetMoney() {
        return mTotalNetMoney;
    }

    /**
     * ����mTotalNetMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetMoney(BigDecimal value) {
        this.mTotalNetMoney = value;
    }

    /**
     * ��ȡmTotalNetMoneyFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetMoneyFC() {
        return mTotalNetMoneyFC;
    }

    /**
     * ����mTotalNetMoneyFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetMoneyFC(BigDecimal value) {
        this.mTotalNetMoneyFC = value;
    }

    /**
     * ��ȡmTotalNetMoneyTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetMoneyTC() {
        return mTotalNetMoneyTC;
    }

    /**
     * ����mTotalNetMoneyTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetMoneyTC(BigDecimal value) {
        this.mTotalNetMoneyTC = value;
    }

    /**
     * ��ȡmTotalRefillQtyIUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRefillQtyIUAmount() {
        return mTotalRefillQtyIUAmount;
    }

    /**
     * ����mTotalRefillQtyIUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRefillQtyIUAmount(BigDecimal value) {
        this.mTotalRefillQtyIUAmount = value;
    }

    /**
     * ��ȡmTotalTax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalTax() {
        return mTotalTax;
    }

    /**
     * ����mTotalTax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalTax(BigDecimal value) {
        this.mTotalTax = value;
    }

    /**
     * ��ȡmTotalTaxFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalTaxFC() {
        return mTotalTaxFC;
    }

    /**
     * ����mTotalTaxFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalTaxFC(BigDecimal value) {
        this.mTotalTaxFC = value;
    }

    /**
     * ��ȡmTotalTaxTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalTaxTC() {
        return mTotalTaxTC;
    }

    /**
     * ����mTotalTaxTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalTaxTC(BigDecimal value) {
        this.mTotalTaxTC = value;
    }

    /**
     * ��ȡmTradeBaseUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMTradeBaseUom() {
        return mTradeBaseUom;
    }

    /**
     * ����mTradeBaseUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMTradeBaseUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mTradeBaseUom = value;
    }

    /**
     * ��ȡmTradeRatetoBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTradeRatetoBase() {
        return mTradeRatetoBase;
    }

    /**
     * ����mTradeRatetoBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTradeRatetoBase(BigDecimal value) {
        this.mTradeRatetoBase = value;
    }

    /**
     * ��ȡmTradeUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMTradeUom() {
        return mTradeUom;
    }

    /**
     * ����mTradeUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMTradeUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mTradeUom = value;
    }

    /**
     * ��ȡmTradeUom2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMTradeUom2() {
        return mTradeUom2;
    }

    /**
     * ����mTradeUom2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMTradeUom2(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mTradeUom2 = value;
    }

    /**
     * ��ȡmTradeUom2ToTRadeUom2Associate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTradeUom2ToTRadeUom2Associate() {
        return mTradeUom2ToTRadeUom2Associate;
    }

    /**
     * ����mTradeUom2ToTRadeUom2Associate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTradeUom2ToTRadeUom2Associate(BigDecimal value) {
        this.mTradeUom2ToTRadeUom2Associate = value;
    }

    /**
     * ��ȡmTransMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMTransMode() {
        return mTransMode;
    }

    /**
     * ����mTransMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMTransMode(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mTransMode = value;
    }

    /**
     * ��ȡmvmi���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMVMI() {
        return mvmi;
    }

    /**
     * ����mvmi���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMVMI(Boolean value) {
        this.mvmi = value;
    }

    /**
     * ��ȡmVolume���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMVolume() {
        return mVolume;
    }

    /**
     * ����mVolume���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMVolume(BigDecimal value) {
        this.mVolume = value;
    }

    /**
     * ��ȡmVolumeUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMVolumeUom() {
        return mVolumeUom;
    }

    /**
     * ����mVolumeUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMVolumeUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mVolumeUom = value;
    }

    /**
     * ��ȡmwh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMWH() {
        return mwh;
    }

    /**
     * ����mwh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMWH(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mwh = value;
    }

    /**
     * ��ȡmWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMWeight() {
        return mWeight;
    }

    /**
     * ����mWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMWeight(BigDecimal value) {
        this.mWeight = value;
    }

    /**
     * ��ȡmWeightUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMWeightUom() {
        return mWeightUom;
    }

    /**
     * ����mWeightUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMWeightUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mWeightUom = value;
    }

    /**
     * ��ȡmWhMan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMWhMan() {
        return mWhMan;
    }

    /**
     * ����mWhMan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMWhMan(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mWhMan = value;
    }

}
