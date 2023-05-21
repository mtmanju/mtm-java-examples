package com.mtm.examples.ex;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;

/**
 * Demonstrates how to enable connection pooling. Use debug option to observe connection usage.
 * <p>
 * usage: java -Dcom.sun.jndi.ldap.connect.pool.debug=fine UsePool
 */
class ConnectionPoolExample {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        // Set up environment for creating initial context
        Hashtable env = new Hashtable(11);
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, "ldap://localhost:389/o=SomeUrl");

        // Enable connection pooling
        env.put("com.sun.jndi.ldap.connect.pool", "true");

        try {
            // Create one initial context (Get connection from pool)
            DirContext ctx = new InitialDirContext(env);

            System.out.println(ctx.getAttributes("ou=NewHires"));

            // do something useful with ctx

            // Close the context when we're done
            ctx.close(); // Return connection to pool

            // Create another initial context (Get connection from pool)
            DirContext ctx2 = new InitialDirContext(env);

            System.out.println(ctx2.getAttributes("ou=People"));

            // do something useful with ctx2

            // Close the context when we're done
            ctx2.close(); // Return connection to pool

        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}