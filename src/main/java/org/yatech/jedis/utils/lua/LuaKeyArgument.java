package org.yatech.jedis.utils.lua;

/**
 * An argument placeholder for a key value
 *
 * Created by Yinon Avraham on 11/09/2015.
 */
public class LuaKeyArgument extends LuaArgument<String> {

    LuaKeyArgument(String name, String defaultKey) {
        super(name, defaultKey);
    }

    LuaKeyArgument(String name) {
        super(name);
    }

}
