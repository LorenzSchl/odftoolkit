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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import javax.xml.datatype.XMLGregorianCalendar;
import org.odftoolkit.odfdom.dom.type.OdfDate;
import javax.xml.datatype.Duration;
import org.odftoolkit.odfdom.dom.type.OdfDuration;


/**
 * ODF DOM Element implementation for element "<text:time>".
 */
public abstract class OdfTimeElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "time" );

    public OdfTimeElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "text:fixed".
     */
    public Boolean getFixed()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "fixed" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:fixed".
     */
    public void setFixed( Boolean _aFixed )
    {                    
        String aStringVal = OdfBoolean.toString( _aFixed );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "fixed" ), aStringVal );
    }

    /**
     * Get value of attribute "style:data-style-name".
     */
    public String getDataStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "data-style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:data-style-name".
     */
    public void setDataStyleName( String _aDataStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aDataStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "data-style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "text:time-value".
     */
    public XMLGregorianCalendar getTimeValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "time-value" ) );
        return OdfDate.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:time-value".
     */
    public void setTimeValue( XMLGregorianCalendar _aTimeValue )
    {                    
        String aStringVal = OdfDate.toString( _aTimeValue );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "time-value" ), aStringVal );
    }

    /**
     * Get value of attribute "text:time-adjust".
     */
    public Duration getTimeAdjust()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "time-adjust" ) );
        return OdfDuration.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:time-adjust".
     */
    public void setTimeAdjust( Duration _aTimeAdjust )
    {                    
        String aStringVal = OdfDuration.toString( _aTimeAdjust );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "time-adjust" ), aStringVal );
    }

}
