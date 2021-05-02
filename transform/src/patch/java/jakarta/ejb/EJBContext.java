package jakarta.ejb;

import java.util.*;
import java.security.Principal;
import jakarta.transaction.UserTransaction;

public interface EJBContext {
    EJBHome getEJBHome() throws IllegalStateException;

    EJBLocalHome getEJBLocalHome() throws IllegalStateException;

    Principal getCallerPrincipal() throws IllegalStateException;

    boolean isCallerInRole(String roleName) throws IllegalStateException;

    UserTransaction getUserTransaction() throws IllegalStateException;

    void setRollbackOnly() throws IllegalStateException;

    boolean getRollbackOnly() throws IllegalStateException;

    TimerService getTimerService() throws IllegalStateException;

    Object lookup(String name) throws IllegalArgumentException;

    Map<String, Object> getContextData();
}
