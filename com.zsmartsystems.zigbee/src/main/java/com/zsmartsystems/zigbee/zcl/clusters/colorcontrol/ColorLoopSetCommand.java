/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.colorcontrol;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;

/**
 * Color Loop Set Command value object class.
 * <p>
 * Cluster: <b>Color control</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Color control cluster.
 * <p>
 * This cluster provides an interface for changing the color of a light. Color is
 * specified according to the Commission Internationale de l'Éclairage (CIE)
 * specification CIE 1931 Color Space, [B4]. Color control is carried out in terms of
 * x,y values, as defined by this specification.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZclProtocolCodeGenerator", date = "2018-03-12T23:36:29Z")
public class ColorLoopSetCommand extends ZclCommand {
    /**
     * Update Flags command message field.
     */
    private Integer updateFlags;

    /**
     * Action command message field.
     */
    private Integer action;

    /**
     * Direction command message field.
     */
    private Integer direction;

    /**
     * Transition time command message field.
     */
    private Integer transitionTime;

    /**
     * Start Hue command message field.
     */
    private Integer startHue;

    /**
     * Default constructor.
     */
    public ColorLoopSetCommand() {
        genericCommand = false;
        clusterId = 768;
        commandId = 67;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    /**
     * Gets Update Flags.
     *
     * @return the Update Flags
     */
    public Integer getUpdateFlags() {
        return updateFlags;
    }

    /**
     * Sets Update Flags.
     *
     * @param updateFlags the Update Flags
     */
    public void setUpdateFlags(final Integer updateFlags) {
        this.updateFlags = updateFlags;
    }

    /**
     * Gets Action.
     *
     * @return the Action
     */
    public Integer getAction() {
        return action;
    }

    /**
     * Sets Action.
     *
     * @param action the Action
     */
    public void setAction(final Integer action) {
        this.action = action;
    }

    /**
     * Gets Direction.
     *
     * @return the Direction
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * Sets Direction.
     *
     * @param direction the Direction
     */
    public void setDirection(final Integer direction) {
        this.direction = direction;
    }

    /**
     * Gets Transition time.
     *
     * @return the Transition time
     */
    public Integer getTransitionTime() {
        return transitionTime;
    }

    /**
     * Sets Transition time.
     *
     * @param transitionTime the Transition time
     */
    public void setTransitionTime(final Integer transitionTime) {
        this.transitionTime = transitionTime;
    }

    /**
     * Gets Start Hue.
     *
     * @return the Start Hue
     */
    public Integer getStartHue() {
        return startHue;
    }

    /**
     * Sets Start Hue.
     *
     * @param startHue the Start Hue
     */
    public void setStartHue(final Integer startHue) {
        this.startHue = startHue;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(updateFlags, ZclDataType.BITMAP_8_BIT);
        serializer.serialize(action, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(direction, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(transitionTime, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(startHue, ZclDataType.UNSIGNED_16_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        updateFlags = (Integer) deserializer.deserialize(ZclDataType.BITMAP_8_BIT);
        action = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        direction = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        transitionTime = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        startHue = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(170);
        builder.append("ColorLoopSetCommand [");
        builder.append(super.toString());
        builder.append(", updateFlags=");
        builder.append(updateFlags);
        builder.append(", action=");
        builder.append(action);
        builder.append(", direction=");
        builder.append(direction);
        builder.append(", transitionTime=");
        builder.append(transitionTime);
        builder.append(", startHue=");
        builder.append(startHue);
        builder.append(']');
        return builder.toString();
    }

}
