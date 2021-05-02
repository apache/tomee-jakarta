package jakarta.enterprise.util;

import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;


final class SecurityActions {

    private SecurityActions() {

    }

    static void setAccessible(Method method) {
        if (System.getSecurityManager() != null) {
            AccessController.doPrivileged(
                    (PrivilegedAction<?>) () -> {
                        method.setAccessible(true);
                        return null;
                    }
            );
        } else {
            method.setAccessible(true);
        }
    }


    static Method[] getDeclaredMethods(Class<?> clazz) {
        if (System.getSecurityManager() != null) {
            return AccessController.doPrivileged(
                    (PrivilegedAction<Method[]>) () -> clazz.getDeclaredMethods()
            );
        } else {
            return clazz.getDeclaredMethods();
        }
    }
}
