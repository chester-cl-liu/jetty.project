//
//  ========================================================================
//  Copyright (c) 1995-2015 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//


package org.eclipse.jetty.server.session.x;

/**
 * NullSessionDataStore
 *
 *
 */
public class NullSessionDataStore extends AbstractSessionDataStore
{
    
    /** 
     * @see org.eclipse.jetty.server.session.x.SessionDataStore#load(java.lang.String)
     */
    @Override
    public SessionData load(SessionKey key) throws Exception
    {
        return null;
    }

    /** 
     * @see org.eclipse.jetty.server.session.x.SessionDataStore#newSessionData(java.lang.String, long, long, long, long)
     */
    @Override
    public SessionData newSessionData(String id, long created, long accessed, long lastAccessed, long maxInactiveMs)
    {
        return new SessionData(id, created, accessed, lastAccessed, maxInactiveMs);
    }

    /** 
     * @see org.eclipse.jetty.server.session.x.SessionDataStore#delete(java.lang.String)
     */
    @Override
    public boolean delete(SessionKey key) throws Exception
    {
       return true;
    }

    /** 
     * @see org.eclipse.jetty.server.session.x.AbstractSessionDataStore#doStore()
     */
    @Override
    public void doStore(SessionKey key, SessionData data) throws Exception
    {
        //noop
    }

    /** 
     * @see org.eclipse.jetty.server.session.x.SessionDataStore#scavenge()
     */
    @Override
    public void scavenge()
    {
       //noop
    }

}
