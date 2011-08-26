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

package org.odftoolkit.odfdom.dom.element.presentation;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.presentation.OdfSpeedType;


/**
 * ODF DOM Element implementation for element "<presentation:play>".
 */
public abstract class OdfPlayElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.PRESENTATION, "play" );

    public OdfPlayElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aShapeId)
    {
        setShapeId( _aShapeId );
    }

    /**
     * Get value of attribute "draw:shape-id".
     */
    public String getShapeId()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "shape-id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:shape-id".
     */
    public void setShapeId( String _aShapeId )
    {                    
        String aStringVal = OdfId.toString( _aShapeId );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "shape-id" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:speed".
     */
    public OdfSpeedType getSpeed()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "speed" ) );
        return OdfSpeedType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:speed".
     */
    public void setSpeed( OdfSpeedType _aSpeed )
    {                    
        String aStringVal = OdfSpeedType.toString( _aSpeed );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "speed" ), aStringVal );
    }

}
