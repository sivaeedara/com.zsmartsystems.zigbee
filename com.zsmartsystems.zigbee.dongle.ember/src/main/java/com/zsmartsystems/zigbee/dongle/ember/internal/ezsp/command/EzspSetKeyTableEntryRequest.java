/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.internal.ezsp.command;

import com.zsmartsystems.zigbee.IeeeAddress;
import com.zsmartsystems.zigbee.dongle.ember.internal.ezsp.EzspFrameRequest;
import com.zsmartsystems.zigbee.dongle.ember.internal.ezsp.serializer.EzspSerializer;
import com.zsmartsystems.zigbee.dongle.ember.internal.ezsp.structure.EmberKeyData;

/**
 * Class to implement the Ember EZSP command <b>setKeyTableEntry</b>.
 * <p>
 * Sets the key table entry at the specified index.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspSetKeyTableEntryRequest extends EzspFrameRequest {
    public static int FRAME_ID = 0x72;

    /**
     * The index of the entry in the table to set.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     */
    private int index;

    /**
     * The address of the partner device that shares the key
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     */
    private IeeeAddress address;

    /**
     * This indicates whether the key is a Link or a Master Key
     * <p>
     * EZSP type is <i>bool</i> - Java type is {@link boolean}
     */
    private boolean linkKey;

    /**
     * The actual key data associated with the table entry.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     */
    private EmberKeyData keyStruct;

    /**
     * Serialiser used to seialise to binary line data
     */
    private EzspSerializer serializer;

    /**
     * Request constructor
     */
    public EzspSetKeyTableEntryRequest() {
        frameId = FRAME_ID;
        serializer = new EzspSerializer();
    }

    /**
     * The index of the entry in the table to set.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     *
     * @return the current index as {@link int}
     */
    public int getIndex() {
        return index;
    }

    /**
     * The index of the entry in the table to set.
     *
     * @param index the index to set as {@link int}
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * The address of the partner device that shares the key
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     *
     * @return the current address as {@link IeeeAddress}
     */
    public IeeeAddress getAddress() {
        return address;
    }

    /**
     * The address of the partner device that shares the key
     *
     * @param address the address to set as {@link IeeeAddress}
     */
    public void setAddress(IeeeAddress address) {
        this.address = address;
    }

    /**
     * This indicates whether the key is a Link or a Master Key
     * <p>
     * EZSP type is <i>bool</i> - Java type is {@link boolean}
     *
     * @return the current linkKey as {@link boolean}
     */
    public boolean getLinkKey() {
        return linkKey;
    }

    /**
     * This indicates whether the key is a Link or a Master Key
     *
     * @param linkKey the linkKey to set as {@link boolean}
     */
    public void setLinkKey(boolean linkKey) {
        this.linkKey = linkKey;
    }

    /**
     * The actual key data associated with the table entry.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     *
     * @return the current keyStruct as {@link EmberKeyData}
     */
    public EmberKeyData getKeyStruct() {
        return keyStruct;
    }

    /**
     * The actual key data associated with the table entry.
     *
     * @param keyStruct the keyStruct to set as {@link EmberKeyData}
     */
    public void setKeyStruct(EmberKeyData keyStruct) {
        this.keyStruct = keyStruct;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(serializer);

        // Serialize the fields
        serializer.serializeUInt8(index);
        serializer.serializeEmberEui64(address);
        serializer.serializeBool(linkKey);
        serializer.serializeEmberKeyData(keyStruct);
        return serializer.getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(130);
        builder.append("EzspSetKeyTableEntryRequest [index=");
        builder.append(index);
        builder.append(", address=");
        builder.append(address);
        builder.append(", linkKey=");
        builder.append(linkKey);
        builder.append(", keyStruct=");
        builder.append(keyStruct);
        builder.append(']');
        return builder.toString();
    }
}
