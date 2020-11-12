
package icreateshipsv.org.ufida.entitydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf_pl.ObjectState;


/**
 * &lt;p&gt;UFSoft.UBF.Business.DataTransObjectBase complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="sysState" type="{http://schemas.datacontract.org/2004/07/UFSoft.UBF.PL.Engine}ObjectState" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute ref="{http://schemas.microsoft.com/2003/10/Serialization/}Id"/&amp;gt;
 *       &amp;lt;attribute ref="{http://schemas.microsoft.com/2003/10/Serialization/}Ref"/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFSoft.UBF.Business.DataTransObjectBase", propOrder = {
    "sysState"
})
@XmlSeeAlso({
    UFIDAU9ISVSMShipDTOForIndustryChainData.class,
    UFIDAU9CBOPubControllerCommonArchiveDataDTOData.class,
    UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData.class,
    UFIDAU9ISVSMSOBPeriodSRVDTOForIndustryChainData.class,
    UFIDAU9ISVSMShipAchievementDTOForIndustryChainData.class,
    UFIDAU9ISVSMShipFeeDTOForIndustryChainData.class,
    UFIDAU9ISVSMShipFeeDetailLineDTOForIndustryChainData.class,
    UFIDAU9ISVSMShipLineDTOForIndustryChainData.class,
    UFIDAU9CBOSCMItemItemMasterData.class,
    UFIDAU9BasePropertyTypesEffectiveData.class,
    UFIDAU9CBOSCMItemEntranceInfoData.class,
    UFIDAU9BaseUOMUOMData.class,
    UFIDAU9BasePropertyTypesRoundData.class,
    UFIDAU9CBOSCMItemItemStatusData.class,
    UFIDAU9BaseOrganizationOrganizationData.class,
    UFIDAU9BaseOrganizationOrgContactData.class,
    UFIDAU9BaseLocationLocationData.class,
    UFIDAU9BaseLocationCountryData.class,
    UFIDAU9BaseLocationProvinceData.class,
    UFIDAU9BaseLocationCityData.class,
    UFIDAU9BaseLocationCountyData.class,
    UFIDAU9BaseLocationAvailablePostalCodeData.class,
    UFIDAU9BaseWorkCalendarWorkCalendarData.class,
    UFIDAU9BaseWorkCalendarWorkDayRuleData.class,
    UFIDAU9BaseWorkCalendarShiftRuleData.class,
    UFIDAU9BaseWorkCalendarShiftDefData.class,
    UFIDAU9BaseWorkCalendarShiftPeriodData.class,
    UFIDAU9BaseFormatDateFormatData.class,
    UFIDAU9BaseFormatTimeFormatData.class,
    UFIDAU9BaseFormatNumberFormatData.class,
    UFIDAU9BaseContactContactData.class,
    UFIDAU9BaseContactAddressData.class,
    UFIDAU9BaseContactBeepPagerData.class,
    UFIDAU9BaseContactPhoneData.class,
    UFIDAU9BaseContactFaxData.class,
    UFIDAU9BaseContactMobilData.class,
    UFIDAU9BaseContactEmailData.class,
    UFIDAU9BaseContactURLData.class,
    UFIDAU9BaseContactIMData.class,
    UFIDAU9BaseContactNameData.class,
    UFIDAU9BaseFormatCurrencyFormatData.class,
    UFIDAU9BaseLanguageLanguageData.class,
    UFIDAU9BaseLanguageLanguageRegionData.class,
    UFIDAU9BaseTimeZoneBETimeZoneData.class,
    UFIDAU9BaseCurrencyCurrencyData.class,
    UFIDAU9CBOSCMItemItemFreeDefData.class,
    UFIDAU9CBOSCMItemItemFreeValueDefData.class,
    UFIDAU9CBOSCMFreeItemFreeItemValueDefData.class,
    UFIDAU9CBOSCMFreeItemFreeItemDefData.class,
    UFIDAU9CBOSCMItemItemConvertRatioOverClassData.class,
    UFIDAU9BaseFlexFieldKeyFlexFieldKeyFlexFieldStruData.class,
    UFIDAU9BaseFlexFieldKeyFlexFieldFlexFieldFlowData.class,
    UFIDAU9BaseFlexFieldKeyFlexFieldKeyFlexSegmentData.class,
    UFIDAU9BaseFlexFieldKeyFlexFieldDynamicValueSetRuleData.class,
    UFIDAU9BaseFlexFieldValueSetValueSetDefData.class,
    UFIDAUBFMDBusinessTypeData.class,
    UFIDAUBFMDBusinessAttributeData.class,
    UFIDAUBFMDBusinessComponentData.class,
    UFIDAUBFMDBusinessExtEnumTypeData.class,
    UFIDAUBFMDBusinessExtEnumValueData.class,
    UFIDAU9BaseFlexFieldKeyFlexFieldQualifierData.class,
    UFIDAU9BaseFlexFieldKeyFlexFieldKeyFlexFieldDefData.class,
    UFIDAU9BaseApplicationApplicationData.class,
    UFIDAU9BaseFlexFieldKeyFlexFieldCrossValidateRuleData.class,
    UFIDAU9BaseFlexFieldKeyFlexFieldCrossValidateRuleLineData.class,
    UFIDAU9CBOSCMItemItemConvertRatioInClassData.class,
    UFIDAU9CBOSCMItemItemMasterVersionData.class,
    UFIDAU9CBOSCMItemItemMRPInfoData.class,
    UFIDAU9CBOHROperatorOperatorsData.class,
    UFIDAU9CBOHROperatorOperatorLineData.class,
    UFIDAU9CBOHRDepartmentDepartmentData.class,
    UFIDAU9CBOSCMWarehouseWarehouseData.class,
    UFIDAU9CBOSCMWarehouseWhStorageTypeData.class,
    UFIDAU9CBOSCMBinBinData.class,
    UFIDAU9BaseHoldReleaseHoldReasonData.class,
    UFIDAU9BaseHoldReleaseHoldReasonUserRelationData.class,
    UFIDAU9BaseUserRoleUserData.class,
    UFIDAU9BaseUserRoleUserGroupData.class,
    UFIDAU9BaseAppPortalAppPortalData.class,
    UFIDAU9BaseHoldReleaseReleaseReasonData.class,
    UFIDAU9BaseHoldReleaseReleaseReasonUserRelationData.class,
    UFIDAU9CBOSCMSupplierSupplierData.class,
    UFIDAU9CBOSCMSupplierSupplierSiteData.class,
    UFIDAU9CBOSCMSupplierSupplierBankAccountData.class,
    UFIDAU9CBOSCMSupplierSupplierAccountCurrencyData.class,
    UFIDAU9CBOSCMSupplierSupplierCategoryData.class,
    UFIDAU9CBOSCMCustomerCustomerData.class,
    UFIDAU9CBOSCMCustomerCustomerBankAccountData.class,
    UFIDAU9CBOSCMCustomerCustomerAccountCurrencyData.class,
    UFIDAU9CBOSCMCustomerCustomerCategoryData.class,
    UFIDAU9BaseLocationTerritoryData.class,
    UFIDAU9CBOSCMRcvByRcvByData.class,
    UFIDAU9CBOSCMTransportModeTransportModeData.class,
    UFIDAU9CBOFIRecPayTermPayTermData.class,
    UFIDAU9CBOFIRecPayTermPayDiscountRuleData.class,
    UFIDAU9CBOFIRecPayTermPayPaymentMethodData.class,
    UFIDAU9CBOFISettlementMethodSettlementMethodData.class,
    UFIDAU9CBOFITaxTaxScheduleData.class,
    UFIDAU9CBOFITaxTaxScheduleTaxData.class,
    UFIDAU9CBOFITaxTaxData.class,
    UFIDAU9CBOSCMSupplierSupplierContactData.class,
    UFIDAU9CBOFIRecPayTermRecTermData.class,
    UFIDAU9CBOFIRecPayTermRecPaymentMethodData.class,
    UFIDAU9CBOFIRecPayTermRecDiscountRuleData.class,
    UFIDAU9CBOSCMShipmentByShipmentByData.class,
    UFIDAU9CBOSCMRMAReturnTermData.class,
    UFIDAU9CBOSCMRMAReturnTermDetailData.class,
    UFIDAU9CBOSCMItemItemInfoData.class,
    UFIDAU9CBOFIBankAccountBankData.class,
    UFIDAU9CBOFIBankAccountBankCategoryData.class,
    UFIDAU9CBOFIUBankCodeUBankCodeData.class,
    UFIDAU9CBOFIUBankAreaUBankAreaData.class,
    UFIDAU9CBOFIUOpenAccountBEUOpenAccountData.class,
    UFIDAU9CBOFIConfirmTermAPAccrueTermData.class,
    UFIDAU9CBOFIConfirmTermAPInstalmentTermData.class,
    UFIDAU9CBOPropertyTypesDateFirmTypeData.class,
    UFSoftUBFExportServicePrintReferenceBEPrintTemplateData.class,
    UFIDAU9CBOSCMCustomerCustomerSiteData.class,
    UFIDAU9CBOSCMCustomerCustomerContactData.class,
    UFIDAU9CBOFIConfirmTermARAccrueTermData.class,
    UFIDAU9CBOFIConfirmTermARInstalmentTermData.class,
    UFIDAU9CBOFIConfirmTermInstalmentRecTermData.class,
    UFIDAU9CBOFICFPRecMoneyPolicyBERecMoneyPolicyHeadData.class,
    UFIDAU9CBOFICFPRecMoneyPolicyBERecMoneyPolicyLineData.class,
    UFIDAU9CBOSCMItemItemSaleInfoData.class,
    UFIDAU9CBOSCMATPATPRuleData.class,
    UFIDAU9CBOTimeBucketTimeBucketData.class,
    UFIDAU9CBOTimeBucketTimeBucketDetailData.class,
    UFIDAU9CBOSCMItemItemPurchaseInfoData.class,
    UFIDAU9CBOTradePathTradePathData.class,
    UFIDAU9CBOTradePathTradePathLineData.class,
    UFIDAU9CBOSCMItemItemInspectionInfoData.class,
    UFIDAU9CBOStatPeriodStatRuleData.class,
    UFIDAU9CBOStatPeriodStatPeriodData.class,
    UFIDAU9CBOSCMItemItemMFGInfoData.class,
    UFIDAU9CBOSCMItemItemInvInfoData.class,
    UFIDAU9CBOBarCodeBarCodeData.class,
    UFIDAU9CBOBarCodeBarCodeStructureData.class,
    UFIDAU9CBOBarCodeBarCodeSegmentData.class,
    UFIDAU9BaseSequenceSequenceDefData.class,
    UFIDAU9BaseSequenceSequenceSegmentData.class,
    UFIDAU9CBOSCMLotLotParamData.class,
    UFIDAU9CBOSCMLotLotCodingParameterData.class,
    UFIDAU9CBOSCMLotLotCodingRuleData.class,
    UFIDAU9CBOSCMLotLotCodingRecordData.class,
    UFIDAU9CBOSCMSnSnParameterData.class,
    UFIDAU9CBOSCMSnSnCodingParameterData.class,
    UFIDAU9CBOSCMSnSnCodingRuleData.class,
    UFIDAU9CBOSCMSnSnCodingRecordData.class,
    UFIDAU9CBOSCMPackagePackageSchemaData.class,
    UFIDAU9CBOSCMPackageItemAttributeData.class,
    UFIDAU9CBOSCMPackagePackSchemaData.class,
    UFIDAU9CBOSCMPackagePackCodingRuleData.class,
    UFIDAU9CBOSCMItemItemCategoryData.class,
    UFIDAU9CBOSCMItemItemKeyFlexSegmenData.class,
    UFIDAU9CBOSCMItemItemCategoryTypeData.class,
    UFIDAU9CBOSCMCustomsCustomsData.class,
    UFIDAU9CBOSCMCustomsDrawbackData.class,
    UFIDAU9BaseFlexFieldDescFlexFieldDescFlexFieldDefData.class,
    UFIDAU9BaseFlexFieldDescFlexFieldDescFlexContextData.class,
    UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentData.class,
    UFIDAU9BaseFlexFieldDescFlexFieldDescSegDataSourceData.class,
    UFIDAU9BaseFlexFieldDescFlexFieldDescSegDataSourceParaData.class,
    UFIDAU9BaseFlexFieldDescFlexFieldGlobalDescFlexSegmentData.class,
    UFIDAU9CBOSCMItemItemTradeMarkData.class,
    UFIDAU9CBOSCMPropertyTypesSrcDocInfoData.class,
    UFIDAU9BasePropertyTypesBizEntityKeyData.class,
    UFIDAU9CBOSCMItemMFGWasteInfoData.class,
    UFIDAU9ISVSMItemBarCodeDTOData.class,
    UFIDAU9ISVSMShipLineLocationDTOForIndustryChainData.class,
    UFIDAU9CBOSCMPropertyTypesLotInfoData.class,
    UFIDAU9ISVSMShipAddressDTOForIndustryChainData.class,
    UFIDAU9SMPropertyTypesAddressLineData.class,
    UFIDAU9ISVSMShipContactDTOForIndustryChainData.class,
    UFIDAU9CBOSCMPropertyTypesLinkManInfoData.class,
    UFIDAU9ISVSMShipTaxDTOForIndustryChainData.class,
    UFIDAU9ISVSMShipLineBalanceRouteDTOForIndustryChainData.class,
    UFIDAU9ISVSMShipLineCostDTOForIndustryChainData.class,
    UFIDAU9ISVSMShipLineDiscountDTOForIndustryChainData.class,
    UFIDAU9ISVSMDocKeyDTOData.class,
    UFIDAU9BCCalcDataCreateBarCodeUsedInDTOData.class
})
public class UFSoftUBFBusinessDataTransObjectBase {

    @XmlSchemaType(name = "string")
    protected ObjectState sysState;
    @XmlAttribute(name = "Id", namespace = "http://schemas.microsoft.com/2003/10/Serialization/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "Ref", namespace = "http://schemas.microsoft.com/2003/10/Serialization/")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ref;

    /**
     * 获取sysState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ObjectState }
     *     
     */
    public ObjectState getSysState() {
        return sysState;
    }

    /**
     * 设置sysState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectState }
     *     
     */
    public void setSysState(ObjectState value) {
        this.sysState = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取ref属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRef() {
        return ref;
    }

    /**
     * 设置ref属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRef(Object value) {
        this.ref = value;
    }

}
