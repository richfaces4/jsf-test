/*
 * $Id$
 *
 * License Agreement.
 *
 * Rich Faces - Natural Ajax for Java Server Faces (JSF)
 *
 * Copyright (C) 2007 Exadel, Inc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */
package org.jboss.test.faces.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for representation of the mocked JSF environment and its features.
 * 
 * @author asmirnov@exadel.com
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface Environment {

    /**
     * The feature of the mocked JSF environment
     * 
     * @author asmirnov
     */
    public enum Feature {

        FACTORIES,

        FACES_CONTEXT,

        EXTERNAL_CONTEXT,

        EL_CONTEXT,

        SERVLET_REQUEST,

        APPLICATION,

        RENDER_KIT,

        RESPONSE_WRITER
    }

    /**
     * Return the list of features of given mocked JSF environment
     * 
     * @return the list of features of given mocked JSF environment
     */
    public Feature[] value() default {};

}
