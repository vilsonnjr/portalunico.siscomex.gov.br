//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:12:02 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


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
 *         &lt;choice&gt;
 *           &lt;element name="cnpj" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/&gt;
 *           &lt;element name="cpf" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/&gt;
 *           &lt;element name="nomeEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="viaTransporte" type="{http://www.pucomex.serpro.gov.br/cct}ViaTransporte" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="baldeacaoOuTransbordo" type="{http://www.pucomex.serpro.gov.br/cct}SimNao" minOccurs="0"/&gt;
 *           &lt;element name="transitoSimplificado" type="{http://www.pucomex.serpro.gov.br/cct}TransitoSimplificadoEntrega" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
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
    "cnpj",
    "cpf",
    "nomeEstrangeiro",
    "viaTransporte",
    "baldeacaoOuTransbordo",
    "transitoSimplificado"
})
@XmlRootElement(name = "recebedor")
@Builder(builderMethodName = "recebedorBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Recebedor {

    protected String cnpj;
    protected String cpf;
    protected String nomeEstrangeiro;
    protected String viaTransporte;
    protected String baldeacaoOuTransbordo;
    protected TransitoSimplificadoEntrega transitoSimplificado;

}
