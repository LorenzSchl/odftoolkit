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

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;


/**
 * ODF DOM Element implementation for element "<db:table-representation>".
 */
public abstract class OdfTableRepresentationElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DB, "table-representation" );

    public OdfTableRepresentationElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aName)
    {
        setName( _aName );
    }

    /**
     * Get value of attribute "db:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "name" ) );
    }

    /**
     * Set value of attribute "db:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "name" ), _aName );
    }

    /**
     * Get value of attribute "db:catalog-name".
     */
    public String getCatalogName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "catalog-name" ) );
    }

    /**
     * Set value of attribute "db:catalog-name".
     */
    public void setCatalogName( String _aCatalogName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "catalog-name" ), _aCatalogName );
    }

    /**
     * Get value of attribute "db:schema-name".
     */
    public String getSchemaName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "schema-name" ) );
    }

    /**
     * Set value of attribute "db:schema-name".
     */
    public void setSchemaName( String _aSchemaName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "schema-name" ), _aSchemaName );
    }

    /**
     * Get value of attribute "db:title".
     */
    public String getTitle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "title" ) );
    }

    /**
     * Set value of attribute "db:title".
     */
    public void setTitle( String _aTitle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "title" ), _aTitle );
    }

    /**
     * Get value of attribute "db:description".
     */
    public String getDescription()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "description" ) );
    }

    /**
     * Set value of attribute "db:description".
     */
    public void setDescription( String _aDescription )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "description" ), _aDescription );
    }

    /**
     * Get value of attribute "db:style-name".
     */
    public String getStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:style-name".
     */
    public void setStyleName( String _aStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "db:default-row-style-name".
     */
    public String getDefaultRowStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "default-row-style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:default-row-style-name".
     */
    public void setDefaultRowStyleName( String _aDefaultRowStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aDefaultRowStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "default-row-style-name" ), aStringVal );
    }

}
