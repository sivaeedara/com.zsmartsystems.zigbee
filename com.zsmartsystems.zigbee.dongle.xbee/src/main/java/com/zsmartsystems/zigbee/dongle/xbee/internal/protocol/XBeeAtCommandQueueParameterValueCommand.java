/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.xbee.internal.protocol;


/**
 * Class to implement the XBee command <b>AT Command - Queue Parameter Value</b>.
 * <p>
 * This frame allows you to query or set device parameters.
			In contrast to the AT Command
 * (0x08) frame, this frame queues new
			parameter values and does not apply them until you
 * issue either: n
			The AT Command (0x08) frame (for API type) n The AC command
 * When
			querying parameter values, the 0x09 frame behaves identically to the
			0x08
 * frame. The device returns register queries immediately and not
			does not queue them. The
 * response for this command is also an AT
			Command Response frame (0x88).
		
 * <p>
 * This class provides methods for processing XBee API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class XBeeAtCommandQueueParameterValueCommand extends XBeeFrame implements XBeeCommand {
    /**
     * The frame Id
				
     */
    private Integer frameId;

    /**
     * Command name: two ASCII characters that identify the AT
					command.
				
     */
    private String atCommand;

    /**
     * If present, indicates the requested parameter value to
					set the given register. If no
     * characters are present, it queries
					the register.
				
     */
    private int[] parameterValue;

    /**
     * The frame Id
				
     *
     * @param frameId the frameId to set as {@link Integer}
     */
    public void setFrameId(Integer frameId) {
        this.frameId = frameId;
    }

    /**
     * Command name: two ASCII characters that identify the AT
					command.
				
     *
     * @param atCommand the atCommand to set as {@link String}
     */
    public void setAtCommand(String atCommand) {
        this.atCommand = atCommand;
    }

    /**
     * If present, indicates the requested parameter value to
					set the given register. If no
     * characters are present, it queries
					the register.
				
     *
     * @param parameterValue the parameterValue to set as {@link int[]}
     */
    public void setParameterValue(int[] parameterValue) {
        this.parameterValue = parameterValue;
    }

    @Override
    public int[] serialize() {
        // Serialize the command fields
        serializeCommand(0x09);
        serializeInt8(frameId);
        serializeAtCommand(atCommand);
        serializeData(parameterValue);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(399);
        // First present the command parameters...
        // Then the responses later if they are available
        builder.append("XBeeAtCommandQueueParameterValueCommand [frameId=");
        builder.append(frameId);
        builder.append(", atCommand=");
        builder.append(atCommand);
        builder.append(", parameterValue=");
        if (parameterValue == null) {
            builder.append("null");
        } else {
            for (int cnt = 0; cnt < parameterValue.length; cnt++) {
                if (cnt > 0) {
                    builder.append(' ');
                }
                builder.append(String.format("%02X", parameterValue[cnt]));
            }
        }
        builder.append(']');
        return builder.toString();
    }
}
