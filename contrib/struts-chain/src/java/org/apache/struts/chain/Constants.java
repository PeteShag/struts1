/*
 * $Header: /home/cvs/jakarta-struts/contrib/struts-chain/src/java/org/apache/struts/chain/Constants.java,v 1.1 2003/08/11 04:55:34 craigmcc Exp $
 * $Revision: 1.1 $
 * $Date: 2003/08/11 04:55:34 $
 *
 * ====================================================================
 *
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 2003 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "The Jakarta Project", "Struts", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.struts.chain;


/**
 * <p>Global constants for the Chain of Responsibility Library.</p>
 */
public final class Constants {


    // -------------------------------------------------- Context Attribute Keys


    /**
     * <p>The default context attribute under which the
     * <code>Action</code> for the current request
     * will be stored.</p>
     */
    public static final String ACTION_KEY = "action";


    /**
     * <p>The default context attribute under which the
     * <code>ActionConfig</code> for the current request
     * will be stored.</p>
     */
    public static final String ACTION_CONFIG_KEY = "actionConfig";


    /**
     * <p>The default context attribute under which the
     * <code>ActionForm</code> for the current request
     * will be stored.</p>
     */
    public static final String ACTION_FORM_KEY = "actionForm";


    /**
     * <p>The default context attribute under which the
     * <code>ActionServet</code> for the current application
     * will be stored.</p>
     */
    public static final String ACTION_SERVLET_KEY = "actionServlet";


    /**
     * <p>The default context attribute under which a
     * boolean flag indicating whether this request has been
     * cancelled will be stored.</p>
     */
    public static final String CANCEL_KEY = "cancel";


    /**
     * <p>The default context attribute under which the
     * <code>ForwardConfig</code> for the current request
     * will be stored.</p>
     */
    public static final String FORWARD_CONFIG_KEY = "forwardConfig";


    /**
     * <p>The default context attribute under which the
     * <code>Locale</code> for the current request will be stored.</p>
     */
    public static final String LOCALE_KEY = "locale";


    /**
     * <p>The default context attribute under which the
     * <code>MessageResources</code> for the current request
     * will be stored.</p>
     */
    public static final String MESSAGE_RESOURCES_KEY = "messageResources";


    /**
     * <p>The default context attribute under which the
     * <code>ModuleConfig</code> for the current request
     * will be stored.</p>
     */
    public static final String MODULE_CONFIG_KEY = "moduleConfig";


    // --------------------------------------------------------- Other Constants


    /**
     * <p>The base part of the context attribute under which a Map containing
     * the <code>Action</code> instances associated with this module are
     * stored.  This value must be suffixed with the module prefix in order
     * to create a unique key per module.</p>
     */
    public static final String ACTIONS_KEY = "actions";


    /**
     * <p>The request attribute under which the path information is stored for
     * processing during a RequestDispatcher.include() call.</p>
     */
    public static final String INCLUDE_PATH_INFO =
        "javax.servlet.include.path_info";


    /**
     * <p>The request attribute under which the servlet path is stored for
     * processing during a RequestDispatcher.include() call.</p>
     */
    public static final String INCLUDE_SERVLET_PATH =
        "javax.servlet.include.servlet_path";


}
