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
import org.odftoolkit.odfdom.dom.type.text.OdfIndexScopeType;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<text:user-index-source>".
 */
public abstract class OdfUserIndexSourceElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "user-index-source" );

    public OdfUserIndexSourceElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aIndexName)
    {
        setIndexName( _aIndexName );
    }

    /**
     * Get value of attribute "text:index-scope".
     */
    public OdfIndexScopeType getIndexScope()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "index-scope" ) );
        return OdfIndexScopeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:index-scope".
     */
    public void setIndexScope( OdfIndexScopeType _aIndexScope )
    {                    
        String aStringVal = OdfIndexScopeType.toString( _aIndexScope );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "index-scope" ), aStringVal );
    }

    /**
     * Get value of attribute "text:relative-tab-stop-position".
     */
    public Boolean getRelativeTabStopPosition()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "relative-tab-stop-position" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:relative-tab-stop-position".
     */
    public void setRelativeTabStopPosition( Boolean _aRelativeTabStopPosition )
    {                    
        String aStringVal = OdfBoolean.toString( _aRelativeTabStopPosition );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "relative-tab-stop-position" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-index-marks".
     */
    public Boolean getUseIndexMarks()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-index-marks" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-index-marks".
     */
    public void setUseIndexMarks( Boolean _aUseIndexMarks )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseIndexMarks );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-index-marks" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-index-source-styles".
     */
    public Boolean getUseIndexSourceStyles()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-index-source-styles" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-index-source-styles".
     */
    public void setUseIndexSourceStyles( Boolean _aUseIndexSourceStyles )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseIndexSourceStyles );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-index-source-styles" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-graphics".
     */
    public Boolean getUseGraphics()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-graphics" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-graphics".
     */
    public void setUseGraphics( Boolean _aUseGraphics )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseGraphics );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-graphics" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-tables".
     */
    public Boolean getUseTables()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-tables" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-tables".
     */
    public void setUseTables( Boolean _aUseTables )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseTables );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-tables" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-floating-frames".
     */
    public Boolean getUseFloatingFrames()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-floating-frames" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-floating-frames".
     */
    public void setUseFloatingFrames( Boolean _aUseFloatingFrames )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseFloatingFrames );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-floating-frames" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-objects".
     */
    public Boolean getUseObjects()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-objects" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-objects".
     */
    public void setUseObjects( Boolean _aUseObjects )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseObjects );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-objects" ), aStringVal );
    }

    /**
     * Get value of attribute "text:copy-outline-levels".
     */
    public Boolean getCopyOutlineLevels()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "copy-outline-levels" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:copy-outline-levels".
     */
    public void setCopyOutlineLevels( Boolean _aCopyOutlineLevels )
    {                    
        String aStringVal = OdfBoolean.toString( _aCopyOutlineLevels );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "copy-outline-levels" ), aStringVal );
    }

    /**
     * Get value of attribute "text:index-name".
     */
    public String getIndexName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "index-name" ) );
    }

    /**
     * Set value of attribute "text:index-name".
     */
    public void setIndexName( String _aIndexName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "index-name" ), _aIndexName );
    }

}
