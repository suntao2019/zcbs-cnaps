//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 10:07:29 AM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.BatchCustomersContractManageResponse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatusCode1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatusCode1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AS00"/>
 *     &lt;enumeration value="AS01"/>
 *     &lt;enumeration value="AS02"/>
 *     &lt;enumeration value="AS03"/>
 *     &lt;enumeration value="AS04"/>
 *     &lt;enumeration value="AS05"/>
 *     &lt;enumeration value="AS06"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountStatusCode1")
@XmlEnum
public enum AccountStatusCode1 {

    @XmlEnumValue("AS00")
    AS_00("AS00"),
    @XmlEnumValue("AS01")
    AS_01("AS01"),
    @XmlEnumValue("AS02")
    AS_02("AS02"),
    @XmlEnumValue("AS03")
    AS_03("AS03"),
    @XmlEnumValue("AS04")
    AS_04("AS04"),
    @XmlEnumValue("AS05")
    AS_05("AS05"),
    @XmlEnumValue("AS06")
    AS_06("AS06");
    private final String value;

    AccountStatusCode1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountStatusCode1 fromValue(String v) {
        for (AccountStatusCode1 c: AccountStatusCode1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}