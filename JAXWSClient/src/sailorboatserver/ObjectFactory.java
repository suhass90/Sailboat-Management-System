
package sailorboatserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sailorboatserver package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateResponse_QNAME = new QName("http://sailorboatServer/", "updateResponse");
    private final static QName _FetchfromDatabase_QNAME = new QName("http://sailorboatServer/", "FetchfromDatabase");
    private final static QName _HelloWorldResponse_QNAME = new QName("http://sailorboatServer/", "helloWorldResponse");
    private final static QName _FetchfromDatabaseResponse_QNAME = new QName("http://sailorboatServer/", "FetchfromDatabaseResponse");
    private final static QName _Update_QNAME = new QName("http://sailorboatServer/", "update");
    private final static QName _HelloWorld_QNAME = new QName("http://sailorboatServer/", "helloWorld");
    private final static QName _Insert_QNAME = new QName("http://sailorboatServer/", "insert");
    private final static QName _InsertResponse_QNAME = new QName("http://sailorboatServer/", "insertResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sailorboatserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link FetchfromDatabaseResponse }
     * 
     */
    public FetchfromDatabaseResponse createFetchfromDatabaseResponse() {
        return new FetchfromDatabaseResponse();
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link FetchfromDatabase }
     * 
     */
    public FetchfromDatabase createFetchfromDatabase() {
        return new FetchfromDatabase();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link HelloWorld_Type }
     * 
     */
    public HelloWorld_Type createHelloWorld_Type() {
        return new HelloWorld_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sailorboatServer/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchfromDatabase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sailorboatServer/", name = "FetchfromDatabase")
    public JAXBElement<FetchfromDatabase> createFetchfromDatabase(FetchfromDatabase value) {
        return new JAXBElement<FetchfromDatabase>(_FetchfromDatabase_QNAME, FetchfromDatabase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sailorboatServer/", name = "helloWorldResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldResponse_QNAME, HelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchfromDatabaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sailorboatServer/", name = "FetchfromDatabaseResponse")
    public JAXBElement<FetchfromDatabaseResponse> createFetchfromDatabaseResponse(FetchfromDatabaseResponse value) {
        return new JAXBElement<FetchfromDatabaseResponse>(_FetchfromDatabaseResponse_QNAME, FetchfromDatabaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sailorboatServer/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorld_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sailorboatServer/", name = "helloWorld")
    public JAXBElement<HelloWorld_Type> createHelloWorld(HelloWorld_Type value) {
        return new JAXBElement<HelloWorld_Type>(_HelloWorld_QNAME, HelloWorld_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sailorboatServer/", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sailorboatServer/", name = "insertResponse")
    public JAXBElement<InsertResponse> createInsertResponse(InsertResponse value) {
        return new JAXBElement<InsertResponse>(_InsertResponse_QNAME, InsertResponse.class, null, value);
    }

}
