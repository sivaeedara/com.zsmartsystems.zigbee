/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters;

import com.zsmartsystems.zigbee.CommandResult;
import com.zsmartsystems.zigbee.ZigBeeEndpoint;
import com.zsmartsystems.zigbee.ZigBeeNetworkManager;
import com.zsmartsystems.zigbee.zcl.ZclAttribute;
import com.zsmartsystems.zigbee.zcl.ZclCluster;
import com.zsmartsystems.zigbee.zcl.protocol.ZclClusterType;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/**
 * <b>Fan Control</b> cluster implementation (<i>Cluster ID 0x0202</i>).
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class ZclFanControlCluster extends ZclCluster {
    /**
     * The ZigBee Cluster Library Cluster ID
     */
    public static final int CLUSTER_ID = 0x0202;

    /**
     * The ZigBee Cluster Library Cluster Name
     */
    public static final String CLUSTER_NAME = "Fan Control";

    // Attribute constants
    /**
     */
    public static final int ATTR_FANMODE = 0x0000;
    /**
     */
    public static final int ATTR_FANMODESEQUENCE = 0x0001;

    // Attribute initialisation
    protected Map<Integer, ZclAttribute> initializeAttributes() {
        Map<Integer, ZclAttribute> attributeMap = new ConcurrentHashMap<Integer, ZclAttribute>(2);

        attributeMap.put(ATTR_FANMODE, new ZclAttribute(ZclClusterType.FAN_CONTROL, ATTR_FANMODE, "FanMode", ZclDataType.ENUMERATION_8_BIT, true, true, true, true));
        attributeMap.put(ATTR_FANMODESEQUENCE, new ZclAttribute(ZclClusterType.FAN_CONTROL, ATTR_FANMODESEQUENCE, "FanModeSequence", ZclDataType.ENUMERATION_8_BIT, true, true, true, false));

        return attributeMap;
    }

    /**
     * Default constructor to create a Fan Control cluster.
     *
     * @param zigbeeManager {@link ZigBeeNetworkManager}
     * @param zigbeeEndpoint the {@link ZigBeeEndpoint}
     */
    public ZclFanControlCluster(final ZigBeeNetworkManager zigbeeManager, final ZigBeeEndpoint zigbeeEndpoint) {
        super(zigbeeManager, zigbeeEndpoint, CLUSTER_ID, CLUSTER_NAME);
    }



    /**
     * Set the <i>FanMode</i> attribute [attribute ID <b>0</b>].
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param fanMode the {@link Integer} attribute value to be set
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> setFanMode(final Object value) {
        return write(attributes.get(ATTR_FANMODE), value);
    }

    /**
     * Get the <i>FanMode</i> attribute [attribute ID <b>0</b>].
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getFanModeAsync() {
        return read(attributes.get(ATTR_FANMODE));
    }


    /**
     * Synchronously get the <i>FanMode</i> attribute [attribute ID <b>0</b>].
     * <p>
     * This method can return cached data if the attribute has already been received.
     * The parameter <i>refreshPeriod</i> is used to control this. If the attribute has been received
     * within <i>refreshPeriod</i> milliseconds, then the method will immediately return the last value
     * received. If <i>refreshPeriod</i> is set to 0, then the attribute will always be updated.
     * <p>
     * This method will block until the response is received or a timeout occurs unless the current value is returned.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param refreshPeriod the maximum age of the data (in milliseconds) before an update is needed
     * @return the {@link Integer} attribute value, or null on error
     */
    public Integer getFanMode(final long refreshPeriod) {
        if(refreshPeriod > 0 && attributes.get(ATTR_FANMODE).getLastReportTime() != null) {
            long refreshTime = Calendar.getInstance().getTimeInMillis() - refreshPeriod;
            if(attributes.get(ATTR_FANMODE).getLastReportTime().getTimeInMillis() < refreshTime) {
                return (Integer) attributes.get(ATTR_FANMODE).getLastValue();
            }
        }

        return (Integer) readSync(attributes.get(ATTR_FANMODE));
    }


    /**
     * Set reporting for the <i>FanMode</i> attribute [attribute ID <b>0</b>].
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param minInterval {@link int} minimum reporting period
     * @param maxInterval {@link int} maximum reporting period
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> setFanModeReporting(final int minInterval, final int maxInterval) {
        return setReporting(attributes.get(ATTR_FANMODE), minInterval, maxInterval);
    }


    /**
     * Set the <i>FanModeSequence</i> attribute [attribute ID <b>1</b>].
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param fanModeSequence the {@link Integer} attribute value to be set
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> setFanModeSequence(final Object value) {
        return write(attributes.get(ATTR_FANMODESEQUENCE), value);
    }

    /**
     * Get the <i>FanModeSequence</i> attribute [attribute ID <b>1</b>].
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getFanModeSequenceAsync() {
        return read(attributes.get(ATTR_FANMODESEQUENCE));
    }


    /**
     * Synchronously get the <i>FanModeSequence</i> attribute [attribute ID <b>1</b>].
     * <p>
     * This method can return cached data if the attribute has already been received.
     * The parameter <i>refreshPeriod</i> is used to control this. If the attribute has been received
     * within <i>refreshPeriod</i> milliseconds, then the method will immediately return the last value
     * received. If <i>refreshPeriod</i> is set to 0, then the attribute will always be updated.
     * <p>
     * This method will block until the response is received or a timeout occurs unless the current value is returned.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param refreshPeriod the maximum age of the data (in milliseconds) before an update is needed
     * @return the {@link Integer} attribute value, or null on error
     */
    public Integer getFanModeSequence(final long refreshPeriod) {
        if(refreshPeriod > 0 && attributes.get(ATTR_FANMODESEQUENCE).getLastReportTime() != null) {
            long refreshTime = Calendar.getInstance().getTimeInMillis() - refreshPeriod;
            if(attributes.get(ATTR_FANMODESEQUENCE).getLastReportTime().getTimeInMillis() < refreshTime) {
                return (Integer) attributes.get(ATTR_FANMODESEQUENCE).getLastValue();
            }
        }

        return (Integer) readSync(attributes.get(ATTR_FANMODESEQUENCE));
    }
}
