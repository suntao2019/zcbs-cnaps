//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 10:07:19 AM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.BatchCustomersContractManageRequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchCustomersContractManageInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchCustomersContractManageInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QryOrOprTp" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.392.001.01}QueryOrOperationTypeCode1"/>
 *         &lt;element name="CtrctAgrmtTp" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.392.001.01}ContractAgreementTypeCode1" minOccurs="0"/>
 *         &lt;element name="NbOfAgrmt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.392.001.01}Max8NumericText"/>
 *         &lt;element name="AgrmtDtls" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.392.001.01}AgreementDetails1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchCustomersContractManageInformation1", propOrder = {
    "qryOrOprTp",
    "ctrctAgrmtTp",
    "nbOfAgrmt",
    "agrmtDtls"
})
public class BatchCustomersContractManageInformation1 {

    @XmlElement(name = "QryOrOprTp", required = true)
    protected QueryOrOperationTypeCode1 qryOrOprTp;
    @XmlElement(name = "CtrctAgrmtTp")
    protected ContractAgreementTypeCode1 ctrctAgrmtTp;
    @XmlElement(name = "NbOfAgrmt", required = true)
    protected String nbOfAgrmt;
    @XmlElement(name = "AgrmtDtls", required = true)
    protected List<AgreementDetails1> agrmtDtls;

    /**
     * Gets the value of the qryOrOprTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOrOperationTypeCode1 }
     *     
     */
    public QueryOrOperationTypeCode1 getQryOrOprTp() {
        return qryOrOprTp;
    }

    /**
     * Sets the value of the qryOrOprTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOrOperationTypeCode1 }
     *     
     */
    public void setQryOrOprTp(QueryOrOperationTypeCode1 value) {
        this.qryOrOprTp = value;
    }

    /**
     * Gets the value of the ctrctAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link ContractAgreementTypeCode1 }
     *     
     */
    public ContractAgreementTypeCode1 getCtrctAgrmtTp() {
        return ctrctAgrmtTp;
    }

    /**
     * Sets the value of the ctrctAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractAgreementTypeCode1 }
     *     
     */
    public void setCtrctAgrmtTp(ContractAgreementTypeCode1 value) {
        this.ctrctAgrmtTp = value;
    }

    /**
     * Gets the value of the nbOfAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfAgrmt() {
        return nbOfAgrmt;
    }

    /**
     * Sets the value of the nbOfAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfAgrmt(String value) {
        this.nbOfAgrmt = value;
    }

    /**
     * Gets the value of the agrmtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agrmtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgrmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementDetails1 }
     * 
     * 
     */
    public List<AgreementDetails1> getAgrmtDtls() {
        if (agrmtDtls == null) {
            agrmtDtls = new ArrayList<AgreementDetails1>();
        }
        return this.agrmtDtls;
    }

}