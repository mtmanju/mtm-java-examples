package com.mtm.demo.xml;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class contains the custom XML utility actions.
 *
 * @author ManjunathMT
 */
@Slf4j
public class XmlUtils {

    private static final String TRANSFORMER_OP_PROPERTY = "{http://xml.apache.org/xslt}indent-amount";
    private static final String DTD_TO_DISALLOW_EXTERNAL_DOCTYPE = "http://apache.org/xml/features/disallow-doctype-decl";

    private XmlUtils() {
    }

    /**
     * @param requestXML
     * @param xslFile
     * @return transformed XML string
     */
    public static String getTransformedXML(String requestXML, InputStream xslFile) throws Exception {
        String transformedXML = StringUtils.EMPTY;
        try {
            StringReader reader = new StringReader(requestXML);
            StringWriter writer = new StringWriter();
            Transformer transformer = XmlUtils.getTransformerFactoryInstance()
                    .newTransformer(new StreamSource(xslFile));

            transformer.transform(new StreamSource(reader), new StreamResult(writer));
            transformedXML = writer.toString();
        } catch (Exception e) {
            log.error("Exception occured while transforming the XML {}", e);
            throw new Exception("Exception occured while transforming the XML", e);
        }
        return transformedXML;
    }

    /**
     * This method used to change a particular value at XML element.
     *
     * @param xmlStr
     * @param xPath
     * @param value
     * @return changed xml string
     * @throws Exception
     */
    public static String changeValueAtXPATH(String xmlStr, String xPath, String value) throws Exception {
        StreamResult result;
        try {
            // Convert String to Document
            Document doc = convertStringToDocument(xmlStr);

            // Locate the node(s)
            XPath xPathVar = XPathFactory.newInstance().newXPath();
            NodeList nodes = (NodeList) xPathVar.evaluate(xPath, doc, XPathConstants.NODESET);

            // make the change
            for (int idx = 0; idx < nodes.getLength(); idx++) {
                nodes.item(idx).setTextContent(value);
            }

            DOMSource domSource = new DOMSource(doc);
            Transformer transformer = XmlUtils.getTransformerFactoryInstance().newTransformer();

            result = new StreamResult(new StringWriter());
            transformer.transform(domSource, result);
        } catch (Exception e) {
            log.error("Exception occured while changing the value at XPath", xPath, e);
            throw new Exception("Exception occured while getting Text content from xPath", e);
        }
        return result.getWriter().toString();

    }

    public static NodeList getNodeList(String xmlStr, String xPath) throws Exception {
        NodeList nodes = null;
        try {
            // Convert String to Document
            Document doc = convertStringToDocument(xmlStr);

            // Locate the node(s)
            XPath xPathVar = XPathFactory.newInstance().newXPath();
            nodes = (NodeList) xPathVar.evaluate(xPath, doc, XPathConstants.NODESET);
        } catch (Exception e) {
            log.error("Exception occured while getting Text content from XPath", xPath, e);
            throw new Exception("Exception occured while getting Text content from xPath", e);
        }
        return nodes;
    }

    public static NodeList getNodeList(Document doc, String xPath) throws Exception {
        NodeList nodes = null;
        try {
            // Locate the node(s)
            XPath xPathVar = XPathFactory.newInstance().newXPath();
            nodes = (NodeList) xPathVar.evaluate(xPath, doc, XPathConstants.NODESET);
        } catch (Exception e) {
            log.error("Exception occured while getting Text content from XPath", xPath, e);
            throw new Exception("Exception occured while getting Text content from xPath", e);
        }
        return nodes;
    }

    /**
     * This method changes the xml string to Document.
     *
     * @param xmlStr
     * @return Document
     * @throws Exception
     */
    public static Document convertStringToDocument(String xmlStr) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder;
        try {
            factory.setFeature(DTD_TO_DISALLOW_EXTERNAL_DOCTYPE, true);
            builder = factory.newDocumentBuilder();
            return builder.parse(new InputSource(new StringReader(xmlStr)));
        } catch (Exception e) {
            log.error("Exception occured while converting xml string to document", e);
            throw new Exception("Exception occured while converting xml string to document", e);
        }
    }

    public static String getXMLElement(String xmlString, String xpathExpression) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            factory.setFeature(DTD_TO_DISALLOW_EXTERNAL_DOCTYPE, true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            XPath xPath = XPathFactory.newInstance().newXPath();
            Node result = (Node) xPath.evaluate(xpathExpression, doc, XPathConstants.NODE);
            return nodeToString(result);
        } catch (Exception e) {
            log.error("Exception occured while getting the xml element", e);
            throw new Exception("Exception occured while getting the xml element", e);
        }
    }

    public static Node getNode(String xmlString, String xpathExpression) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Node result;
        try {
            factory.setFeature(DTD_TO_DISALLOW_EXTERNAL_DOCTYPE, true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            XPath xPath = XPathFactory.newInstance().newXPath();
            result = (Node) xPath.evaluate(xpathExpression, doc, XPathConstants.NODE);
        } catch (Exception e) {
            log.error("Exception occured while getting the xml node", e);
            throw new Exception("Exception occured while getting the xml node", e);
        }
        return result;
    }

    public static String getValueAtXPath(String xmlString, String xpathExpression) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        String value = null;
        try {
            factory.setFeature(DTD_TO_DISALLOW_EXTERNAL_DOCTYPE, true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document xmlDocument = builder.parse(new InputSource(new StringReader(xmlString)));
            XPath xPath = XPathFactory.newInstance().newXPath();
            value = xPath.compile(xpathExpression).evaluate(xmlDocument);
        } catch (Exception e) {
            log.error("Exception occured while getting value at xpath {}", e);
            throw new Exception("Exception occured while getting value at xpath: " + xpathExpression, e);
        }
        return value;
    }

    public static String nodeToString(Node node) throws Exception {
        StringWriter buf = new StringWriter();
        Transformer xform;
        try {
            xform = XmlUtils.getTransformerFactoryInstance().newTransformer();
            xform.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            xform.transform(new DOMSource(node), new StreamResult(buf));
        } catch (TransformerException e) {
            log.error("Exception occured while converting node to string {}", e);
            throw new Exception("Exception occured while converting node to string", e);
        }
        return (buf.toString());
    }

    public static Transformer getTransformerInstance() throws Exception {
        Transformer transformer = null;
        try {
            transformer = XmlUtils.getTransformerFactoryInstance().newTransformer();

            transformer.setOutputProperty(TRANSFORMER_OP_PROPERTY, "2");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        } catch (TransformerConfigurationException e) {
            throw new Exception("Exception occured while getting the TransformerInsatnce", e);
        }
        return transformer;
    }

    public static TransformerFactory getTransformerFactoryInstance() throws Exception {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        try {
            tFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        } catch (TransformerConfigurationException e) {
            throw new Exception("Exception occured while getting the TransformerFactoryInsatnce", e);
        }
        return tFactory;
    }

    public static void transformXml(Source source, StreamResult destination) throws Exception {
        try {
            XmlUtils.getTransformerInstance().transform(source, destination);
        } catch (Exception e) {
            throw new Exception("Exception occurred while transforming xml", e);
        }
    }

    public static URL getWsdlUrl(String wsdlValue) throws Exception {
        try {
            return new URL(wsdlValue);
        } catch (MalformedURLException e) {
            throw new Exception("Exception occurred while forming URL ", e);
        }
    }

}
