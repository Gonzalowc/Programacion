package dom;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ModificacionDOM {
    private Document doc;

    public ModificacionDOM() {
        doc = cargarDocument();
    }

    public Document cargarDocument(){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            return db.parse(new File("src/biblioteca.xml"));
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addLibro(){
        Scanner sc = new Scanner(System.in);
        Node root = doc.getDocumentElement();
        System.out.println("Introduce el TITULO del libro: ");
        Node titulo = doc.createElement("titulo");
        titulo.setTextContent(sc.nextLine());
        System.out.println("Introduce el AUTOR del libro: ");
        Node autor = doc.createElement("autor");
        autor.setTextContent(sc.nextLine());
        System.out.println("Introduce la EDITORIAL del libro: ");
        Node editorial = doc.createElement("editorial");
        editorial.setTextContent(sc.nextLine());
        System.out.println("Introduce la PAGINAS del libro: ");
        Node paginas = doc.createElement("paginas");
        paginas.setTextContent(Integer.toString(sc.nextInt()));
        Node libro = doc.createElement("libro");
        libro.appendChild(titulo);
        libro.appendChild(autor);
        libro.appendChild(editorial);
        libro.appendChild(paginas);
        root.appendChild(libro);
        System.out.println("Libro añadido correctamente");
    }
    public void addPaisAutor(){
        Scanner sc = new Scanner(System.in);
        Node root =  doc.getDocumentElement();
        NodeList autores = doc.getElementsByTagName("autor");
        for (int i = 0; i < autores.getLength(); i++) {
            Node pais = doc.createElement("pais");
            System.out.println("Introduce el pais del autor '"+autores.item(i).getTextContent()+"'");
            pais.setTextContent(sc.nextLine());
            autores.item(i).appendChild(pais);
            System.out.println(autores.item(i).getTextContent());
            guardarDOMFichero();
        }
    }

    public void guardarDOMFichero(){
        Node root = doc.getDocumentElement();
        DOMSource origen  = new DOMSource(root);
        StreamResult destino = new StreamResult(new File("src/ejercicio2.xml"));
        try{
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            transformer.transform(origen,destino);

        } catch (TransformerException e) {
            System.out.println(e.getMessage());
        }

    }
}
