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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfCellAddress;


/**
 * ODF DOM Element implementation for element "<table:named-expression>".
 */
public abstract class OdfNamedExpressionElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "named-expression" );

    public OdfNamedExpressionElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aName, String _aExpression)
    {
        setName( _aName );
        setExpression( _aExpression );
    }

    /**
     * Get value of attribute "table:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "name" ) );
    }

    /**
     * Set value of attribute "table:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "name" ), _aName );
    }

    /**
     * Get value of attribute "table:expression".
     */
    public String getExpression()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "expression" ) );
    }

    /**
     * Set value of attribute "table:expression".
     */
    public void setExpression( String _aExpression )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "expression" ), _aExpression );
    }

    /**
     * Get value of attribute "table:base-cell-address".
     */
    public String getBaseCellAddress()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "base-cell-address" ) );
        return OdfCellAddress.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:base-cell-address".
     */
    public void setBaseCellAddress( String _aBaseCellAddress )
    {                    
        String aStringVal = OdfCellAddress.toString( _aBaseCellAddress );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "base-cell-address" ), aStringVal );
    }

}
