//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.07 at 11:50:04 PM ICT 
//


package com.buckwa.ws.chum.oxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lect" type="{http://regchumphon.kmitl.ac.th/registrar/service/}lectureTeacher" minOccurs="0"/>
 *         &lt;element name="prac" type="{http://regchumphon.kmitl.ac.th/registrar/service/}practiceTeacher" minOccurs="0"/>
 *         &lt;element name="unknown" type="{http://regchumphon.kmitl.ac.th/registrar/service/}unknownTeacher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lect",
    "prac",
    "unknown"
})
@XmlRootElement(name = "getTeacherofSubjectResponse")
public class GetTeacherofSubjectResponse {

    protected LectureTeacher lect;
    protected PracticeTeacher prac;
    protected UnknownTeacher unknown;

    /**
     * Gets the value of the lect property.
     * 
     * @return
     *     possible object is
     *     {@link LectureTeacher }
     *     
     */
    public LectureTeacher getLect() {
        return lect;
    }

    /**
     * Sets the value of the lect property.
     * 
     * @param value
     *     allowed object is
     *     {@link LectureTeacher }
     *     
     */
    public void setLect(LectureTeacher value) {
        this.lect = value;
    }

    /**
     * Gets the value of the prac property.
     * 
     * @return
     *     possible object is
     *     {@link PracticeTeacher }
     *     
     */
    public PracticeTeacher getPrac() {
        return prac;
    }

    /**
     * Sets the value of the prac property.
     * 
     * @param value
     *     allowed object is
     *     {@link PracticeTeacher }
     *     
     */
    public void setPrac(PracticeTeacher value) {
        this.prac = value;
    }

    /**
     * Gets the value of the unknown property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownTeacher }
     *     
     */
    public UnknownTeacher getUnknown() {
        return unknown;
    }

    /**
     * Sets the value of the unknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownTeacher }
     *     
     */
    public void setUnknown(UnknownTeacher value) {
        this.unknown = value;
    }

}
