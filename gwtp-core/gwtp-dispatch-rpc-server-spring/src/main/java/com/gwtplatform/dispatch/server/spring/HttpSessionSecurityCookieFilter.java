/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.dispatch.server.spring;

import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.gwtplatform.dispatch.server.AbstractHttpSessionSecurityCookieFilter;

/**
 * @deprecated Please use {@link com.gwtplatform.dispatch.rpc.server.spring.HttpSessionSecurityCookieFilter}.
 */
@Deprecated
public class HttpSessionSecurityCookieFilter extends AbstractHttpSessionSecurityCookieFilter {

    public HttpSessionSecurityCookieFilter(String securityCookieName) {
        super(securityCookieName);
    }

    @Override
    protected HttpSession getSession() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
    }
}
