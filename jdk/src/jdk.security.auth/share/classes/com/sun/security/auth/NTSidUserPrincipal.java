/*
 * Copyright (c) 1999, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.security.auth;

/**
 * This class extends {@code NTSid}
 * and represents a Windows NT user's SID.
 *
 * <p> Principals such as this {@code NTSidUserPrincipal}
 * may be associated with a particular {@code Subject}
 * to augment that {@code Subject} with an additional
 * identity.  Refer to the {@code Subject} class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a {@code Subject}.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
public class NTSidUserPrincipal extends NTSid {

    private static final long serialVersionUID = -5573239889517749525L;

    /**
     * Create an {@code NTSidUserPrincipal} with a Windows NT SID.
     *
     * @param name a string version of the Windows NT SID for this user.
     *
     * @exception NullPointerException if the {@code name}
     *                  is {@code null}.
     */
    public NTSidUserPrincipal(String name) {
        super(name);
    }

    /**
     * Return a string representation of this {@code NTSidUserPrincipal}.
     *
     * @return a string representation of this {@code NTSidUserPrincipal}.
     */
    public String toString() {
        java.text.MessageFormat form = new java.text.MessageFormat
                (sun.security.util.ResourcesMgr.getString
                        ("NTSidUserPrincipal.name",
                        "sun.security.util.AuthResources"));
        Object[] source = {getName()};
        return form.format(source);
    }

    /**
     * Compares the specified Object with this {@code NTSidUserPrincipal}
     * for equality.  Returns true if the given object is also a
     * {@code NTSidUserPrincipal} and the two NTSidUserPrincipals
     * have the same SID.
     *
     * @param o Object to be compared for equality with this
     *          {@code NTSidUserPrincipal}.
     *
     * @return true if the specified Object is equal to this
     *          {@code NTSidUserPrincipal}.
     */
    public boolean equals(Object o) {
            if (o == null)
                return false;

        if (this == o)
            return true;

        if (!(o instanceof NTSidUserPrincipal))
            return false;

        return super.equals(o);
    }
}
