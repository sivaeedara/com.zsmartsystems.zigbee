/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.telegesis.internal.protocol;


/**
 * Class to implement the Telegesis command <b>send Unicast</b>.
 * <p>
 * Send A Raw Binary ZCL/ZDO Unicast
 * <p>
 * This class provides methods for processing Telegesis AT API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class TelegesisSendUnicastCommand extends TelegesisFrame implements TelegesisCommand {
    /**
     * Command field
     */
    private Integer address;

    /**
     * Command field
     */
    private Integer sourceEp;

    /**
     * Command field
     */
    private Integer destEp;

    /**
     * Command field
     */
    private Integer profileId;

    /**
     * Command field
     */
    private Integer clusterId;

    /**
     * Command field
     */
    private int[] messageData;

    /**
     * SEQ response field
     */
    private Integer messageId;

    /**
     *
     * @param address the address to set as {@link Integer}
     */
    public void setAddress(Integer address) {
        this.address = address;
    }

    /**
     *
     * @param sourceEp the sourceEp to set as {@link Integer}
     */
    public void setSourceEp(Integer sourceEp) {
        this.sourceEp = sourceEp;
    }

    /**
     *
     * @param destEp the destEp to set as {@link Integer}
     */
    public void setDestEp(Integer destEp) {
        this.destEp = destEp;
    }

    /**
     *
     * @param profileId the profileId to set as {@link Integer}
     */
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    /**
     *
     * @param clusterId the clusterId to set as {@link Integer}
     */
    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    /**
     *
     * @param messageData the messageData to set as {@link int[]}
     */
    public void setMessageData(int[] messageData) {
        this.messageData = messageData;
    }

    /**
     *
     * @return the messageId as {@link Integer}
     */
    public Integer getMessageId() {
        return messageId;
    }

    @Override
    public int[] serialize() {
        // Serialize the command fields
        serializeCommand("AT+SENDUCASTB");
        serializeDelimiter();
        serializeInt8(messageData.length);
        serializeDelimiter();
        serializeInt16(address);
        serializeDelimiter();
        serializeInt8(sourceEp);
        serializeDelimiter();
        serializeInt8(destEp);
        serializeDelimiter();
        serializeInt16(profileId);
        serializeDelimiter();
        serializeInt16(clusterId);
        serializeDelimiter('\r');
        serializeData(messageData);

        return getPayload();
    }

    @Override
    public boolean deserialize(int[] data) {
        // Handle standard status responses (ie. OK / ERROR)
        if (handleIncomingStatus(data)) {
            return true;
        }

        initialiseDeserializer(data);

        // Deserialize the fields for the "SEQ" response
        if (testPrompt(data, "SEQ:")) {
            setDeserializer(4);

            // Deserialize field "message ID"
            messageId = deserializeInt8();
            return false;
        }

        return false;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(837);
        // First present the command parameters...
        // Then the responses later if they are available
        builder.append("TelegesisSendUnicastCommand [address=");
        builder.append(address);
        builder.append(", sourceEp=");
        builder.append(sourceEp);
        builder.append(", destEp=");
        builder.append(destEp);
        builder.append(", profileId=");
        builder.append(profileId);
        builder.append(", clusterId=");
        builder.append(clusterId);
        builder.append(", messageData=");
        if (messageData == null) {
            builder.append("null");
        } else {
            for (int cnt = 0; cnt < messageData.length; cnt++) {
                if (cnt > 0) {
                    builder.append(' ');
                }
                builder.append(String.format("%02X", messageData[cnt]));
            }
        }
        builder.append(", messageId=");
        builder.append(messageId);
        if (status != null) {
            builder.append(", status=");
            builder.append(status);
        }
        builder.append(']');
        return builder.toString();
    }
}
