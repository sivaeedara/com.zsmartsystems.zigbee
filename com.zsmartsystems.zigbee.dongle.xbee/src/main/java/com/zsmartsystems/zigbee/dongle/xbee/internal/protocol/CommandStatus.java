/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.xbee.internal.protocol;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to implement the XBee Enumeration <b>CommandStatus</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public enum CommandStatus {
    /**
     * Default unknown value
     */
    UNKNOWN(-1),

    /**
     * [0]
     */
    OK(0x0000),

    /**
     * [1]
     */
    ERROR(0x0001),

    /**
     * [2]
     */
    INVALID_COMMAND(0x0002),

    /**
     * [3]
     */
    INVALID_PARAMETER(0x0003),

    /**
     * [4]
     */
    TX_FAILURE(0x0004);

    /**
     * A mapping between the integer code and its corresponding type to
     * facilitate lookup by code.
     */
    private static Map<Integer, CommandStatus> codeMapping;

    private int key;

    private CommandStatus(int key) {
        this.key = key;
    }

    private static void initMapping() {
        codeMapping = new HashMap<Integer, CommandStatus>();
        for (CommandStatus s : values()) {
            codeMapping.put(s.key, s);
        }
    }

    /**
     * Lookup function based on the type code. Returns null if the code does not exist.
     *
     * @param commandStatus
     *            the code to lookup
     * @return enumeration value.
     */
    public static CommandStatus getCommandStatus(int commandStatus) {
        if (codeMapping == null) {
            initMapping();
        }

        if (codeMapping.get(commandStatus) == null) {
            return UNKNOWN;
        }

        return codeMapping.get(commandStatus);
    }

    /**
     * Returns the XBee protocol defined value for this enum
     *
     * @return the XBee enumeration key
     */
    public int getKey() {
        return key;
    }
}
