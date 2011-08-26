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


/**
 * ODF DOM Element implementation for element "<number:number>".
 */
public abstract class OdfNumberElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.NUMBER, "number" );

    public OdfNumberElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "number:decimal-replacement".
     */
    public String getDecimalReplacement()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "decimal-replacement" ) );
    }

    /**
     * Set value of attribute "number:decimal-replacement".
     */
    public void setDecimalReplacement( String _aDecimalReplacement )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "decimal-replacement" ), _aDecimalReplacement );
    }

    /**
     * Get value of attribute "number:display-factor".
     */
    public Double getDisplayFactor()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "display-factor" ) );
        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:display-factor".
     */
    public void setDisplayFactor( Double _aDisplayFactor )
    {                    
        String aStringVal = Double.toString( _aDisplayFactor );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "display-factor" ), aStringVal );
    }

    /**
     * Get value of attribute "number:decimal-places".
     */
    public Integer getDecimalPlaces()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "decimal-places" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:decimal-places".
     */
    public void setDecimalPlaces( Integer _aDecimalPlaces )
    {                    
        String aStringVal = Integer.toString( _aDecimalPlaces );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "decimal-places" ), aStringVal );
    }

    /**
     * Get value of attribute "number:min-integer-digits".
     */
    public Integer getMinIntegerDigits()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "min-integer-digits" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:min-integer-digits".
     */
    public void setMinIntegerDigits( Integer _aMinIntegerDigits )
    {                    
        String aStringVal = Integer.toString( _aMinIntegerDigits );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "min-integer-digits" ), aStringVal );
    }

    /**
     * Get value of attribute "number:grouping".
     */
    public Boolean getGrouping()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "grouping" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:grouping".
     */
    public void setGrouping( Boolean _aGrouping )
    {                    
        String aStringVal = OdfBoolean.toString( _aGrouping );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "grouping" ), aStringVal );
    }

}
