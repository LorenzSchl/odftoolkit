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

package org.odftoolkit.odfdom.dom.element.chart;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.type.OdfCellRangeAddressList;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;


/**
 * ODF DOM Element implementation for element "<chart:title>".
 */
public abstract class OdfTitleElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.CHART, "title" );

    public OdfTitleElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.Chart, OdfName.get( OdfNamespace.CHART, "style-name" ) );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "table:cell-range".
     */
    public String getCellRange()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "cell-range" ) );
        return OdfCellRangeAddressList.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:cell-range".
     */
    public void setCellRange( String _aCellRange )
    {                    
        String aStringVal = OdfCellRangeAddressList.toString( _aCellRange );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "cell-range" ), aStringVal );
    }

    /**
     * Get value of attribute "svg:x".
     */
    public String getX()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ) );
    }

    /**
     * Set value of attribute "svg:x".
     */
    public void setX( String _aX )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ), _aX );
    }

    /**
     * Get value of attribute "svg:y".
     */
    public String getY()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ) );
    }

    /**
     * Set value of attribute "svg:y".
     */
    public void setY( String _aY )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ), _aY );
    }

    /**
     * Get value of attribute "chart:style-name".
     */
    public String getStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.CHART, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "chart:style-name".
     */
    public void setStyleName( String _aStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.CHART, "style-name" ), aStringVal );
    }

}
