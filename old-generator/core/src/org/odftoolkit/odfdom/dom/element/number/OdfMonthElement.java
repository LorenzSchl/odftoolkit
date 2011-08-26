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

package org.odftoolkit.odfdom.dom.element.number;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.number.OdfStyleType;


/**
 * ODF DOM Element implementation for element "<number:month>".
 */
public abstract class OdfMonthElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.NUMBER, "month" );

    public OdfMonthElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "number:textual".
     */
    public Boolean getTextual()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "textual" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:textual".
     */
    public void setTextual( Boolean _aTextual )
    {                    
        String aStringVal = OdfBoolean.toString( _aTextual );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "textual" ), aStringVal );
    }

    /**
     * Get value of attribute "number:possessive-form".
     */
    public Boolean getPossessiveForm()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "possessive-form" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:possessive-form".
     */
    public void setPossessiveForm( Boolean _aPossessiveForm )
    {                    
        String aStringVal = OdfBoolean.toString( _aPossessiveForm );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "possessive-form" ), aStringVal );
    }

    /**
     * Get value of attribute "number:style".
     */
    public OdfStyleType getStyle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "style" ) );
        return OdfStyleType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:style".
     */
    public void setStyle( OdfStyleType _aStyle )
    {                    
        String aStringVal = OdfStyleType.toString( _aStyle );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "style" ), aStringVal );
    }

    /**
     * Get value of attribute "number:calendar".
     */
    public String getCalendar()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "calendar" ) );
    }

    /**
     * Set value of attribute "number:calendar".
     */
    public void setCalendar( String _aCalendar )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "calendar" ), _aCalendar );
    }

}
