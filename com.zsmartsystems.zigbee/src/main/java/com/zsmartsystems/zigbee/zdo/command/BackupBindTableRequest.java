/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zdo.command;

import com.zsmartsystems.zigbee.zdo.ZdoRequest;
import javax.annotation.Generated;

/**
 * Backup Bind Table Request value object class.
 * <p>
 * The Backup_Bind_Table_req is generated from a local primary binding table
 * cache and sent to the remote backup binding table cache device to request backup
 * storage of its entire binding table. The destination addressing mode for this
 * request is unicast.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */

@Generated(value = "com.zsmartsystems.zigbee.autocode.ZclProtocolCodeGenerator", date = "2018-03-12T23:36:29Z")
public class BackupBindTableRequest extends ZdoRequest {
    /**
     * Default constructor.
     */
    public BackupBindTableRequest() {
        clusterId = 0x0027;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(25);
        builder.append("BackupBindTableRequest [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
