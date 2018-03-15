/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.internal.ezsp.command;

import com.zsmartsystems.zigbee.dongle.ember.internal.ezsp.EzspFrameRequest;
import com.zsmartsystems.zigbee.dongle.ember.internal.ezsp.serializer.EzspSerializer;
import com.zsmartsystems.zigbee.dongle.ember.internal.ezsp.structure.EmberGpAddress;

/**
 * Class to implement the Ember EZSP command <b>gpProxyTableLookup</b>.
 * <p>
 * Finds the index of the passed address in the gp table.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspGpProxyTableLookupRequest extends EzspFrameRequest {
    public static int FRAME_ID = 0xC0;

    /**
     * The address to search for
     * <p>
     * EZSP type is <i>EmberGpAddress</i> - Java type is {@link EmberGpAddress}
     */
    private EmberGpAddress addr;

    /**
     * Serialiser used to seialise to binary line data
     */
    private EzspSerializer serializer;

    /**
     * Request constructor
     */
    public EzspGpProxyTableLookupRequest() {
        frameId = FRAME_ID;
        serializer = new EzspSerializer();
    }

    /**
     * The address to search for
     * <p>
     * EZSP type is <i>EmberGpAddress</i> - Java type is {@link EmberGpAddress}
     *
     * @return the current addr as {@link EmberGpAddress}
     */
    public EmberGpAddress getAddr() {
        return addr;
    }

    /**
     * The address to search for
     *
     * @param addr the addr to set as {@link EmberGpAddress}
     */
    public void setAddr(EmberGpAddress addr) {
        this.addr = addr;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(serializer);

        // Serialize the fields
        serializer.serializeEmberGpAddress(addr);
        return serializer.getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(57);
        builder.append("EzspGpProxyTableLookupRequest [addr=");
        builder.append(addr);
        builder.append(']');
        return builder.toString();
    }
}
