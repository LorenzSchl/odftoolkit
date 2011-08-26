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
import org.odftoolkit.odfdom.dom.type.office.OdfValueType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.odftoolkit.odfdom.dom.type.OdfDate;
import javax.xml.datatype.Duration;
import org.odftoolkit.odfdom.dom.type.OdfDuration;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.text.OdfValueNoneDisplayType;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;


/**
 * ODF DOM Element implementation for element "<text:variable-set>".
 */
public abstract class OdfVariableSetElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "variable-set" );

    public OdfVariableSetElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aName, OdfValueType _aValueType, Double _aValue, XMLGregorianCalendar _aDateValue, Duration _aTimeValue, Boolean _aBooleanValue)
    {
        setName( _aName );
        setValueType( _aValueType );
        setValue( _aValue );
        setDateValue( _aDateValue );
        setTimeValue( _aTimeValue );
        setBooleanValue( _aBooleanValue );
    }

    /**
     * Get value of attribute "text:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "name" ) );
    }

    /**
     * Set value of attribute "text:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "name" ), _aName );
    }

    /**
     * Get value of attribute "text:formula".
     */
    public String getFormula()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "formula" ) );
    }

    /**
     * Set value of attribute "text:formula".
     */
    public void setFormula( String _aFormula )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "formula" ), _aFormula );
    }

    /**
     * Get value of attribute "office:value-type".
     */
    public OdfValueType getValueType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value-type" ) );
        return OdfValueType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:value-type".
     */
    public void setValueType( OdfValueType _aValueType )
    {                    
        String aStringVal = OdfValueType.toString( _aValueType );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value-type" ), aStringVal );
    }

    /**
     * Get value of attribute "office:value".
     */
    public Double getValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value" ) );
        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:value".
     */
    public void setValue( Double _aValue )
    {                    
        String aStringVal = Double.toString( _aValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:currency".
     */
    public String getCurrency()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "currency" ) );
    }

    /**
     * Set value of attribute "office:currency".
     */
    public void setCurrency( String _aCurrency )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "currency" ), _aCurrency );
    }

    /**
     * Get value of attribute "office:date-value".
     */
    public XMLGregorianCalendar getDateValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "date-value" ) );
        return OdfDate.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:date-value".
     */
    public void setDateValue( XMLGregorianCalendar _aDateValue )
    {                    
        String aStringVal = OdfDate.toString( _aDateValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "date-value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:time-value".
     */
    public Duration getTimeValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "time-value" ) );
        return OdfDuration.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:time-value".
     */
    public void setTimeValue( Duration _aTimeValue )
    {                    
        String aStringVal = OdfDuration.toString( _aTimeValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "time-value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:boolean-value".
     */
    public Boolean getBooleanValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "boolean-value" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:boolean-value".
     */
    public void setBooleanValue( Boolean _aBooleanValue )
    {                    
        String aStringVal = OdfBoolean.toString( _aBooleanValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "boolean-value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:string-value".
     */
    public String getStringValue()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "string-value" ) );
    }

    /**
     * Set value of attribute "office:string-value".
     */
    public void setStringValue( String _aStringValue )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "string-value" ), _aStringValue );
    }

    /**
     * Get value of attribute "text:display".
     */
    public OdfValueNoneDisplayType getDisplay()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display" ) );
        return OdfValueNoneDisplayType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:display".
     */
    public void setDisplay( OdfValueNoneDisplayType _aDisplay )
    {                    
        String aStringVal = OdfValueNoneDisplayType.toString( _aDisplay );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display" ), aStringVal );
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

}
