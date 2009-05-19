//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.04.03 at 03:49:16 PM WEST 
//

package pt.com.gcs.conf.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;domain&quot;&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name=&quot;peer&quot; maxOccurs=&quot;unbounded&quot; minOccurs=&quot;0&quot;&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                           &lt;all&gt;
 *                             &lt;element name=&quot;name&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
 *                             &lt;element name=&quot;transport&quot;&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name=&quot;type&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
 *                                       &lt;element name=&quot;ip&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
 *                                       &lt;element name=&quot;port&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}int&quot;/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name=&quot;security-policies&quot; type=&quot;{}BrokerSecurityPolicy&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;authorization-providers&quot; minOccurs=&quot;0&quot;&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name=&quot;authorization-provider&quot; maxOccurs=&quot;unbounded&quot; minOccurs=&quot;0&quot;&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name=&quot;class&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
 *                             &lt;element name=&quot;provider-params&quot; minOccurs=&quot;0&quot;&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;any/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name=&quot;provider-name&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name=&quot;credential-validators&quot; minOccurs=&quot;0&quot;&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name=&quot;credential-validator&quot; maxOccurs=&quot;unbounded&quot; minOccurs=&quot;0&quot;&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name=&quot;class&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
 *                             &lt;element name=&quot;provider-params&quot; minOccurs=&quot;0&quot;&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;any/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name=&quot;provider-name&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "domain", "securityPolicies", "authorizationProviders", "credentialValidators" })
@XmlRootElement(name = "global-config")
public class GlobalConfig
{

	@XmlElement(required = true)
	protected GlobalConfig.Domain domain;
	@XmlElement(name = "security-policies")
	protected BrokerSecurityPolicy securityPolicies;
	@XmlElement(name = "authorization-providers")
	protected GlobalConfig.AuthorizationProviders authorizationProviders;
	@XmlElement(name = "credential-validators")
	protected GlobalConfig.CredentialValidators credentialValidators;

	/**
	 * Gets the value of the domain property.
	 * 
	 * @return possible object is {@link GlobalConfig.Domain }
	 * 
	 */
	public GlobalConfig.Domain getDomain()
	{
		return domain;
	}

	/**
	 * Sets the value of the domain property.
	 * 
	 * @param value
	 *            allowed object is {@link GlobalConfig.Domain }
	 * 
	 */
	public void setDomain(GlobalConfig.Domain value)
	{
		this.domain = value;
	}

	/**
	 * Gets the value of the securityPolicies property.
	 * 
	 * @return possible object is {@link BrokerSecurityPolicy }
	 * 
	 */
	public BrokerSecurityPolicy getSecurityPolicies()
	{
		return securityPolicies;
	}

	/**
	 * Sets the value of the securityPolicies property.
	 * 
	 * @param value
	 *            allowed object is {@link BrokerSecurityPolicy }
	 * 
	 */
	public void setSecurityPolicies(BrokerSecurityPolicy value)
	{
		this.securityPolicies = value;
	}

	/**
	 * Gets the value of the authorizationProviders property.
	 * 
	 * @return possible object is {@link GlobalConfig.AuthorizationProviders }
	 * 
	 */
	public GlobalConfig.AuthorizationProviders getAuthorizationProviders()
	{
		return authorizationProviders;
	}

	/**
	 * Sets the value of the authorizationProviders property.
	 * 
	 * @param value
	 *            allowed object is {@link GlobalConfig.AuthorizationProviders }
	 * 
	 */
	public void setAuthorizationProviders(GlobalConfig.AuthorizationProviders value)
	{
		this.authorizationProviders = value;
	}

	/**
	 * Gets the value of the credentialValidators property.
	 * 
	 * @return possible object is {@link GlobalConfig.CredentialValidators }
	 * 
	 */
	public GlobalConfig.CredentialValidators getCredentialValidators()
	{
		return credentialValidators;
	}

	/**
	 * Sets the value of the credentialValidators property.
	 * 
	 * @param value
	 *            allowed object is {@link GlobalConfig.CredentialValidators }
	 * 
	 */
	public void setCredentialValidators(GlobalConfig.CredentialValidators value)
	{
		this.credentialValidators = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
	 *       &lt;sequence&gt;
	 *         &lt;element name=&quot;authorization-provider&quot; maxOccurs=&quot;unbounded&quot; minOccurs=&quot;0&quot;&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
	 *                 &lt;sequence&gt;
	 *                   &lt;element name=&quot;class&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
	 *                   &lt;element name=&quot;provider-params&quot; minOccurs=&quot;0&quot;&gt;
	 *                     &lt;complexType&gt;
	 *                       &lt;complexContent&gt;
	 *                         &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
	 *                           &lt;sequence&gt;
	 *                             &lt;any/&gt;
	 *                           &lt;/sequence&gt;
	 *                         &lt;/restriction&gt;
	 *                       &lt;/complexContent&gt;
	 *                     &lt;/complexType&gt;
	 *                   &lt;/element&gt;
	 *                 &lt;/sequence&gt;
	 *                 &lt;attribute name=&quot;provider-name&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
	 *               &lt;/restriction&gt;
	 *             &lt;/complexContent&gt;
	 *           &lt;/complexType&gt;
	 *         &lt;/element&gt;
	 *       &lt;/sequence&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "authorizationProvider" })
	public static class AuthorizationProviders
	{

		@XmlElement(name = "authorization-provider")
		protected List<GlobalConfig.AuthorizationProviders.AuthorizationProvider> authorizationProvider;

		/**
		 * Gets the value of the authorizationProvider property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the authorizationProvider property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAuthorizationProvider().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link GlobalConfig.AuthorizationProviders.AuthorizationProvider }
		 * 
		 * 
		 */
		public List<GlobalConfig.AuthorizationProviders.AuthorizationProvider> getAuthorizationProvider()
		{
			if (authorizationProvider == null)
			{
				authorizationProvider = new ArrayList<GlobalConfig.AuthorizationProviders.AuthorizationProvider>();
			}
			return this.authorizationProvider;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType&gt;
		 *   &lt;complexContent&gt;
		 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
		 *       &lt;sequence&gt;
		 *         &lt;element name=&quot;class&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
		 *         &lt;element name=&quot;provider-params&quot; minOccurs=&quot;0&quot;&gt;
		 *           &lt;complexType&gt;
		 *             &lt;complexContent&gt;
		 *               &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
		 *                 &lt;sequence&gt;
		 *                   &lt;any/&gt;
		 *                 &lt;/sequence&gt;
		 *               &lt;/restriction&gt;
		 *             &lt;/complexContent&gt;
		 *           &lt;/complexType&gt;
		 *         &lt;/element&gt;
		 *       &lt;/sequence&gt;
		 *       &lt;attribute name=&quot;provider-name&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
		 *     &lt;/restriction&gt;
		 *   &lt;/complexContent&gt;
		 * &lt;/complexType&gt;
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "clazz", "providerParams" })
		public static class AuthorizationProvider
		{

			@XmlElement(name = "class", required = true)
			protected String clazz;
			@XmlElement(name = "provider-params")
			protected GlobalConfig.AuthorizationProviders.AuthorizationProvider.ProviderParams providerParams;
			@XmlAttribute(name = "provider-name", required = true)
			protected String providerName;

			/**
			 * Gets the value of the clazz property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getClazz()
			{
				return clazz;
			}

			/**
			 * Sets the value of the clazz property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setClazz(String value)
			{
				this.clazz = value;
			}

			/**
			 * Gets the value of the providerParams property.
			 * 
			 * @return possible object is
			 *         {@link GlobalConfig.AuthorizationProviders.AuthorizationProvider.ProviderParams }
			 * 
			 */
			public GlobalConfig.AuthorizationProviders.AuthorizationProvider.ProviderParams getProviderParams()
			{
				return providerParams;
			}

			/**
			 * Sets the value of the providerParams property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link GlobalConfig.AuthorizationProviders.AuthorizationProvider.ProviderParams }
			 * 
			 */
			public void setProviderParams(GlobalConfig.AuthorizationProviders.AuthorizationProvider.ProviderParams value)
			{
				this.providerParams = value;
			}

			/**
			 * Gets the value of the providerName property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getProviderName()
			{
				return providerName;
			}

			/**
			 * Sets the value of the providerName property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setProviderName(String value)
			{
				this.providerName = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType&gt;
			 *   &lt;complexContent&gt;
			 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
			 *       &lt;sequence&gt;
			 *         &lt;any/&gt;
			 *       &lt;/sequence&gt;
			 *     &lt;/restriction&gt;
			 *   &lt;/complexContent&gt;
			 * &lt;/complexType&gt;
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "any" })
			public static class ProviderParams
			{

				@XmlAnyElement(lax = true)
				protected List<Object> any;

				/**
				 * Gets the value of the any property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the any
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getAny().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link Element } {@link Object }
				 * 
				 * 
				 */
				public List<Object> getAny()
				{
					if (any == null)
					{
						any = new ArrayList<Object>();
					}
					return this.any;
				}

			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
	 *       &lt;sequence&gt;
	 *         &lt;element name=&quot;credential-validator&quot; maxOccurs=&quot;unbounded&quot; minOccurs=&quot;0&quot;&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
	 *                 &lt;sequence&gt;
	 *                   &lt;element name=&quot;class&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
	 *                   &lt;element name=&quot;provider-params&quot; minOccurs=&quot;0&quot;&gt;
	 *                     &lt;complexType&gt;
	 *                       &lt;complexContent&gt;
	 *                         &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
	 *                           &lt;sequence&gt;
	 *                             &lt;any/&gt;
	 *                           &lt;/sequence&gt;
	 *                         &lt;/restriction&gt;
	 *                       &lt;/complexContent&gt;
	 *                     &lt;/complexType&gt;
	 *                   &lt;/element&gt;
	 *                 &lt;/sequence&gt;
	 *                 &lt;attribute name=&quot;provider-name&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
	 *               &lt;/restriction&gt;
	 *             &lt;/complexContent&gt;
	 *           &lt;/complexType&gt;
	 *         &lt;/element&gt;
	 *       &lt;/sequence&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "credentialValidator" })
	public static class CredentialValidators
	{

		@XmlElement(name = "credential-validator")
		protected List<GlobalConfig.CredentialValidators.CredentialValidator> credentialValidator;

		/**
		 * Gets the value of the credentialValidator property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the credentialValidator property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getCredentialValidator().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link GlobalConfig.CredentialValidators.CredentialValidator }
		 * 
		 * 
		 */
		public List<GlobalConfig.CredentialValidators.CredentialValidator> getCredentialValidator()
		{
			if (credentialValidator == null)
			{
				credentialValidator = new ArrayList<GlobalConfig.CredentialValidators.CredentialValidator>();
			}
			return this.credentialValidator;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType&gt;
		 *   &lt;complexContent&gt;
		 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
		 *       &lt;sequence&gt;
		 *         &lt;element name=&quot;class&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
		 *         &lt;element name=&quot;provider-params&quot; minOccurs=&quot;0&quot;&gt;
		 *           &lt;complexType&gt;
		 *             &lt;complexContent&gt;
		 *               &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
		 *                 &lt;sequence&gt;
		 *                   &lt;any/&gt;
		 *                 &lt;/sequence&gt;
		 *               &lt;/restriction&gt;
		 *             &lt;/complexContent&gt;
		 *           &lt;/complexType&gt;
		 *         &lt;/element&gt;
		 *       &lt;/sequence&gt;
		 *       &lt;attribute name=&quot;provider-name&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
		 *     &lt;/restriction&gt;
		 *   &lt;/complexContent&gt;
		 * &lt;/complexType&gt;
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "clazz", "providerParams" })
		public static class CredentialValidator
		{

			@XmlElement(name = "class", required = true)
			protected String clazz;
			@XmlElement(name = "provider-params")
			protected GlobalConfig.CredentialValidators.CredentialValidator.ProviderParams providerParams;
			@XmlAttribute(name = "provider-name", required = true)
			protected String providerName;

			/**
			 * Gets the value of the clazz property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getClazz()
			{
				return clazz;
			}

			/**
			 * Sets the value of the clazz property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setClazz(String value)
			{
				this.clazz = value;
			}

			/**
			 * Gets the value of the providerParams property.
			 * 
			 * @return possible object is
			 *         {@link GlobalConfig.CredentialValidators.CredentialValidator.ProviderParams }
			 * 
			 */
			public GlobalConfig.CredentialValidators.CredentialValidator.ProviderParams getProviderParams()
			{
				return providerParams;
			}

			/**
			 * Sets the value of the providerParams property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link GlobalConfig.CredentialValidators.CredentialValidator.ProviderParams }
			 * 
			 */
			public void setProviderParams(GlobalConfig.CredentialValidators.CredentialValidator.ProviderParams value)
			{
				this.providerParams = value;
			}

			/**
			 * Gets the value of the providerName property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getProviderName()
			{
				return providerName;
			}

			/**
			 * Sets the value of the providerName property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setProviderName(String value)
			{
				this.providerName = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType&gt;
			 *   &lt;complexContent&gt;
			 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
			 *       &lt;sequence&gt;
			 *         &lt;any/&gt;
			 *       &lt;/sequence&gt;
			 *     &lt;/restriction&gt;
			 *   &lt;/complexContent&gt;
			 * &lt;/complexType&gt;
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "any" })
			public static class ProviderParams
			{

				@XmlAnyElement(lax = true)
				protected List<Object> any;

				/**
				 * Gets the value of the any property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the any
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getAny().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link Element } {@link Object }
				 * 
				 * 
				 */
				public List<Object> getAny()
				{
					if (any == null)
					{
						any = new ArrayList<Object>();
					}
					return this.any;
				}

			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
	 *       &lt;sequence&gt;
	 *         &lt;element name=&quot;peer&quot; maxOccurs=&quot;unbounded&quot; minOccurs=&quot;0&quot;&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
	 *                 &lt;all&gt;
	 *                   &lt;element name=&quot;name&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
	 *                   &lt;element name=&quot;transport&quot;&gt;
	 *                     &lt;complexType&gt;
	 *                       &lt;complexContent&gt;
	 *                         &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
	 *                           &lt;all&gt;
	 *                             &lt;element name=&quot;type&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
	 *                             &lt;element name=&quot;ip&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
	 *                             &lt;element name=&quot;port&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}int&quot;/&gt;
	 *                           &lt;/all&gt;
	 *                         &lt;/restriction&gt;
	 *                       &lt;/complexContent&gt;
	 *                     &lt;/complexType&gt;
	 *                   &lt;/element&gt;
	 *                 &lt;/all&gt;
	 *               &lt;/restriction&gt;
	 *             &lt;/complexContent&gt;
	 *           &lt;/complexType&gt;
	 *         &lt;/element&gt;
	 *       &lt;/sequence&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "peer" })
	public static class Domain
	{

		protected List<GlobalConfig.Domain.Peer> peer;

		/**
		 * Gets the value of the peer property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the peer property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPeer().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link GlobalConfig.Domain.Peer }
		 * 
		 * 
		 */
		public List<GlobalConfig.Domain.Peer> getPeer()
		{
			if (peer == null)
			{
				peer = new ArrayList<GlobalConfig.Domain.Peer>();
			}
			return this.peer;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType&gt;
		 *   &lt;complexContent&gt;
		 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
		 *       &lt;all&gt;
		 *         &lt;element name=&quot;name&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
		 *         &lt;element name=&quot;transport&quot;&gt;
		 *           &lt;complexType&gt;
		 *             &lt;complexContent&gt;
		 *               &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
		 *                 &lt;all&gt;
		 *                   &lt;element name=&quot;type&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
		 *                   &lt;element name=&quot;ip&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
		 *                   &lt;element name=&quot;port&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}int&quot;/&gt;
		 *                 &lt;/all&gt;
		 *               &lt;/restriction&gt;
		 *             &lt;/complexContent&gt;
		 *           &lt;/complexType&gt;
		 *         &lt;/element&gt;
		 *       &lt;/all&gt;
		 *     &lt;/restriction&gt;
		 *   &lt;/complexContent&gt;
		 * &lt;/complexType&gt;
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {

		})
		public static class Peer
		{

			@XmlElement(required = true)
			protected String name;
			@XmlElement(required = true)
			protected GlobalConfig.Domain.Peer.Transport transport;

			/**
			 * Gets the value of the name property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getName()
			{
				return name;
			}

			/**
			 * Sets the value of the name property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setName(String value)
			{
				this.name = value;
			}

			/**
			 * Gets the value of the transport property.
			 * 
			 * @return possible object is
			 *         {@link GlobalConfig.Domain.Peer.Transport }
			 * 
			 */
			public GlobalConfig.Domain.Peer.Transport getTransport()
			{
				return transport;
			}

			/**
			 * Sets the value of the transport property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link GlobalConfig.Domain.Peer.Transport }
			 * 
			 */
			public void setTransport(GlobalConfig.Domain.Peer.Transport value)
			{
				this.transport = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType&gt;
			 *   &lt;complexContent&gt;
			 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
			 *       &lt;all&gt;
			 *         &lt;element name=&quot;type&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
			 *         &lt;element name=&quot;ip&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;/&gt;
			 *         &lt;element name=&quot;port&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}int&quot;/&gt;
			 *       &lt;/all&gt;
			 *     &lt;/restriction&gt;
			 *   &lt;/complexContent&gt;
			 * &lt;/complexType&gt;
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = {

			})
			public static class Transport
			{

				@XmlElement(required = true)
				protected String type;
				@XmlElement(required = true)
				protected String ip;
				protected int port;

				/**
				 * Gets the value of the type property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getType()
				{
					return type;
				}

				/**
				 * Sets the value of the type property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setType(String value)
				{
					this.type = value;
				}

				/**
				 * Gets the value of the ip property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getIp()
				{
					return ip;
				}

				/**
				 * Sets the value of the ip property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setIp(String value)
				{
					this.ip = value;
				}

				/**
				 * Gets the value of the port property.
				 * 
				 */
				public int getPort()
				{
					return port;
				}

				/**
				 * Sets the value of the port property.
				 * 
				 */
				public void setPort(int value)
				{
					this.port = value;
				}

			}

		}

	}

}
