//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.05.01 às 01:59:17 PM BRT
//


package com.jdev.webservice.moviesws.generate;

import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java de anonymous complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceStatus" type="{http://www.abstract.com/movies-ws}serviceStatus"/&gt;
 *         &lt;element name="movieType" type="{http://www.abstract.com/movies-ws}movieType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "serviceStatus",
        "movieType"
})
@XmlRootElement(name = "getMovieByIdResponse")
public class GetMovieByIdResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
    @XmlElement(required = true)
    protected MovieType movieType;

    /**
     * Obtém o valor da propriedade serviceStatus.
     *
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *
     */
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Define o valor da propriedade serviceStatus.
     *
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *
     */
    public void setServiceStatus(ServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Obtém o valor da propriedade movieType.
     *
     * @return
     *     possible object is
     *     {@link MovieType }
     *
     */
    public MovieType getMovieType() {
        return movieType;
    }

    /**
     * Define o valor da propriedade movieType.
     *
     * @param value
     *     allowed object is
     *     {@link MovieType }
     *
     */
    public void setMovieType(MovieType value) {
        this.movieType = value;
    }

}
