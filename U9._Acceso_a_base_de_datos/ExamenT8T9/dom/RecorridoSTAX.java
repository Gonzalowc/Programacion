package dom;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class RecorridoSTAX {

    public void librosConMenosPaginas(){
        try{
            XMLInputFactory stax = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = stax.createXMLEventReader(new FileInputStream("src/biblioteca.xml"));
            String titulo="";
            String autor="";
            String editorial="";
            int paginas =-1;
            Libro libroMenorPag =new Libro("","","",0);
            while (xmlReader.hasNext()){
                XMLEvent evento = xmlReader.nextEvent();
                if(evento.isStartElement()){
                    switch (evento.asStartElement().getName().getLocalPart()){
                        case "titulo":
                            XMLEvent texto = xmlReader.nextEvent();
                            if(texto.isCharacters()){
                                titulo=texto.asCharacters().getData();
                            }
                            break;
                        case "autor":
                            XMLEvent autorText = xmlReader.nextEvent();
                            if(autorText.isCharacters()){
                                autor=autorText.asCharacters().getData();
                            }
                            break;
                        case "editorial":
                            XMLEvent editorialText = xmlReader.nextEvent();
                            if(editorialText.isCharacters()){
                                editorial=editorialText.asCharacters().getData();
                            }
                            break;
                        case "paginas":
                            XMLEvent paginasText = xmlReader.nextEvent();
                            if(paginasText.isCharacters()){
                                if(paginas==-1){
                                    paginas=Integer.parseInt(paginasText.asCharacters().getData());
                                    libroMenorPag = new Libro(titulo,autor,editorial,paginas);
                                }else{
                                    paginas=Integer.parseInt(paginasText.asCharacters().getData());
                                    if(paginas < libroMenorPag.getPaginas()){
                                        libroMenorPag = new Libro(titulo,autor,editorial,paginas);
                                    }
                                }

                            }
                            break;
                    }
                }
            }
            System.out.println("Libro con menos Páginas: ");
            System.out.println(libroMenorPag);

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }

    public void numeroLibrosAutor(String nombre){
        try{
            int cantidad=0;
            XMLInputFactory stax = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = stax.createXMLEventReader(new FileInputStream("src/biblioteca.xml"));
            while (xmlReader.hasNext()) {
                XMLEvent evento = xmlReader.nextEvent();
                if(evento.isStartElement()){
                    if(evento.asStartElement().getName().getLocalPart().equals("autor")){
                        XMLEvent texto = xmlReader.nextEvent();
                        if(texto.isCharacters()){
                            if(texto.asCharacters().getData().equalsIgnoreCase(nombre)){
                                cantidad++;
                            }
                        }
                    }


                }


            }
            System.out.println("El autor '"+nombre+"' tiene "+cantidad+" libros");
        }catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }

    }

}
