/*
  Copyright 2012 - 2013 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.pac4j.core.context;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * This implementation uses the J2E request.
 * 
 * @author Jerome Leleu
 * @since 1.4.0
 */
public class J2ERequestContext extends BaseResponseContext {
    
    private final HttpServletRequest request;
    
    public J2ERequestContext(final HttpServletRequest request) {
        this.request = request;
    }
    
    /**
     * Return a request parameter.
     * 
     * @param name
     * @return the request parameter
     */
    public String getRequestParameter(final String name) {
        return this.request.getParameter(name);
    }
    
    /**
     * Return all request parameters.
     * 
     * @return all request parameters
     */
    @SuppressWarnings("unchecked")
    public Map<String, String[]> getRequestParameters() {
        return this.request.getParameterMap();
    }
    
    /**
     * Return a request header.
     * 
     * @param name
     * @return the request header
     */
    public String getRequestHeader(final String name) {
        return this.request.getHeader(name);
    }
    
    /**
     * Save an attribute in session.
     * 
     * @param name
     * @param value
     */
    public void setSessionAttribute(final String name, final Object value) {
        this.request.getSession().setAttribute(name, value);
    }
    
    /**
     * Get an attribute from session.
     * 
     * @param name
     * @return the session attribute
     */
    public Object getSessionAttribute(final String name) {
        return this.request.getSession().getAttribute(name);
    }
    
    /**
     * Return the request method : GET, POST...
     * 
     * @return the request method
     */
    public String getRequestMethod() {
        return this.request.getMethod();
    }
    
    /**
     * Return the HTTP request.
     * 
     * @return the HTTP request
     */
    public HttpServletRequest getRequest() {
        return this.request;
    }
}
