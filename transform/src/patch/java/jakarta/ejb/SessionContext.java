
package jakarta.ejb;

public interface SessionContext extends EJBContext {
    EJBLocalObject getEJBLocalObject() throws IllegalStateException;

    EJBObject getEJBObject() throws IllegalStateException;

    <T> T getBusinessObject(Class<T> businessInterface) throws IllegalStateException;

    Class getInvokedBusinessInterface() throws IllegalStateException;

    boolean wasCancelCalled() throws IllegalStateException;

}
