//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.27 at 02:35:47 PM WET 
//


package pt.com.gcs.conf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Policies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Policies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policy" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="acl">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="condition" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Condition" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="action" use="required" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Authorization" />
 *                                     &lt;attribute name="destination-type" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;list itemType="{http://softwarelivre.sapo.pt/broker/securityPolicies}DestinationType" />
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="destination" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="privilege" use="required" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Privilege" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="policy-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="inherits" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Policies", propOrder = {
    "policy"
})
public class Policies {

    @XmlElement(namespace = "http://softwarelivre.sapo.pt/broker/securityPolicies", required = true)
    protected List<Policies.Policy> policy;

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Policies.Policy }
     * 
     * 
     */
    public List<Policies.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<Policies.Policy>();
        }
        return this.policy;
    }


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
     *         &lt;element name="acl">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="condition" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Condition" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="action" use="required" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Authorization" />
     *                           &lt;attribute name="destination-type" use="required">
     *                             &lt;simpleType>
     *                               &lt;list itemType="{http://softwarelivre.sapo.pt/broker/securityPolicies}DestinationType" />
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="destination" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="privilege" use="required" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Privilege" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="policy-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="inherits" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acl"
    })
    public static class Policy {

        @XmlElement(namespace = "http://softwarelivre.sapo.pt/broker/securityPolicies", required = true)
        protected Policies.Policy.Acl acl;
        @XmlAttribute(name = "policy-name", required = true)
        protected String policyName;
        @XmlAttribute
        protected String inherits;

        /**
         * Gets the value of the acl property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.Acl }
         *     
         */
        public Policies.Policy.Acl getAcl() {
            return acl;
        }

        /**
         * Sets the value of the acl property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.Acl }
         *     
         */
        public void setAcl(Policies.Policy.Acl value) {
            this.acl = value;
        }

        /**
         * Gets the value of the policyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyName() {
            return policyName;
        }

        /**
         * Sets the value of the policyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyName(String value) {
            this.policyName = value;
        }

        /**
         * Gets the value of the inherits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInherits() {
            return inherits;
        }

        /**
         * Sets the value of the inherits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInherits(String value) {
            this.inherits = value;
        }


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
         *         &lt;element name="entry" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="condition" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Condition" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="action" use="required" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Authorization" />
         *                 &lt;attribute name="destination-type" use="required">
         *                   &lt;simpleType>
         *                     &lt;list itemType="{http://softwarelivre.sapo.pt/broker/securityPolicies}DestinationType" />
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="destination" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="privilege" use="required" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Privilege" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "entry"
        })
        public static class Acl {

            @XmlElement(namespace = "http://softwarelivre.sapo.pt/broker/securityPolicies", required = true)
            protected List<Policies.Policy.Acl.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Policies.Policy.Acl.Entry }
             * 
             * 
             */
            public List<Policies.Policy.Acl.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<Policies.Policy.Acl.Entry>();
                }
                return this.entry;
            }


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
             *         &lt;element name="condition" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Condition" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *       &lt;attribute name="action" use="required" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Authorization" />
             *       &lt;attribute name="destination-type" use="required">
             *         &lt;simpleType>
             *           &lt;list itemType="{http://softwarelivre.sapo.pt/broker/securityPolicies}DestinationType" />
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="destination" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="privilege" use="required" type="{http://softwarelivre.sapo.pt/broker/securityPolicies}Privilege" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "condition"
            })
            public static class Entry {

                @XmlElement(namespace = "http://softwarelivre.sapo.pt/broker/securityPolicies", required = true)
                protected List<Condition> condition;
                @XmlAttribute(required = true)
                protected Authorization action;
                @XmlAttribute(name = "destination-type", required = true)
                protected List<DestinationType> destinationType;
                @XmlAttribute(required = true)
                protected String destination;
                @XmlAttribute(required = true)
                protected Privilege privilege;

                /**
                 * Gets the value of the condition property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the condition property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCondition().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Condition }
                 * 
                 * 
                 */
                public List<Condition> getCondition() {
                    if (condition == null) {
                        condition = new ArrayList<Condition>();
                    }
                    return this.condition;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Authorization }
                 *     
                 */
                public Authorization getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Authorization }
                 *     
                 */
                public void setAction(Authorization value) {
                    this.action = value;
                }

                /**
                 * Gets the value of the destinationType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the destinationType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDestinationType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DestinationType }
                 * 
                 * 
                 */
                public List<DestinationType> getDestinationType() {
                    if (destinationType == null) {
                        destinationType = new ArrayList<DestinationType>();
                    }
                    return this.destinationType;
                }

                /**
                 * Gets the value of the destination property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestination() {
                    return destination;
                }

                /**
                 * Sets the value of the destination property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestination(String value) {
                    this.destination = value;
                }

                /**
                 * Gets the value of the privilege property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Privilege }
                 *     
                 */
                public Privilege getPrivilege() {
                    return privilege;
                }

                /**
                 * Sets the value of the privilege property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Privilege }
                 *     
                 */
                public void setPrivilege(Privilege value) {
                    this.privilege = value;
                }

            }

        }

    }

}
