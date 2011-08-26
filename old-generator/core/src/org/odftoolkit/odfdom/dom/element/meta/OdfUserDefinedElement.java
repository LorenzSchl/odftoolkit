/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.meta;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.meta.OdfValueType;


/**
 * ODF DOM Element implementation for element "<meta:user-defined>".
 */
public abstract class OdfUserDefinedElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.META, "user-defined" );

    public OdfUserDefinedElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aName, OdfValueType _aValueType)
    {
        setName( _aName );
        setValueType( _aValueType );
    }

    /**
     * Get value of attribute "meta:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.META, "name" ) );
    }

    /**
     * Set value of attribute "meta:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.META, "name" ), _aName );
    }

    /**
     * Get value of attribute "meta:value-type".
     */
    public OdfValueType getValueType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.META, "value-type" ) );
        return OdfValueType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "meta:value-type".
     */
    public void setValueType( OdfValueType _aValueType )
    {                    
        String aStringVal = OdfValueType.toString( _aValueType );
        setOdfAttribute( OdfName.get( OdfNamespace.META, "value-type" ), aStringVal );
    }

}
