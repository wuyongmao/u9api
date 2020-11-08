
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.Base.SOB.SetofBooksVersionData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.Base.SOB.SetofBooksVersionData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.Base.SOB.SetofBooksVersionData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.SOB.SetofBooksVersionData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.Base.SOB.SetofBooksVersionData", propOrder = {
    "ufidau9BaseSOBSetofBooksVersionData"
})
public class ArrayOfUFIDAU9BaseSOBSetofBooksVersionData {

    @XmlElement(name = "UFIDA.U9.Base.SOB.SetofBooksVersionData", nillable = true)
    protected List<UFIDAU9BaseSOBSetofBooksVersionData> ufidau9BaseSOBSetofBooksVersionData;

    /**
     * Gets the value of the ufidau9BaseSOBSetofBooksVersionData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9BaseSOBSetofBooksVersionData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9BaseSOBSetofBooksVersionData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9BaseSOBSetofBooksVersionData }
     * 
     * 
     */
    public List<UFIDAU9BaseSOBSetofBooksVersionData> getUFIDAU9BaseSOBSetofBooksVersionData() {
        if (ufidau9BaseSOBSetofBooksVersionData == null) {
            ufidau9BaseSOBSetofBooksVersionData = new ArrayList<UFIDAU9BaseSOBSetofBooksVersionData>();
        }
        return this.ufidau9BaseSOBSetofBooksVersionData;
    }

}
