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


/**
 * ODF DOM Element implementation for element "<text:character-count>".
 */
public abstract class OdfCharacterCountElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "character-count" );

    public OdfCharacterCountElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "style:num-format".
     */
    public String getNumFormat()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-format" ) );
    }

    /**
     * Set value of attribute "style:num-format".
     */
    public void setNumFormat( String _aNumFormat )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-format" ), _aNumFormat );
    }

    /**
     * Get value of attribute "style:num-letter-sync".
     */
    public Boolean getNumLetterSync()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-letter-sync" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:num-letter-sync".
     */
    public void setNumLetterSync( Boolean _aNumLetterSync )
    {                    
        String aStringVal = OdfBoolean.toString( _aNumLetterSync );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-letter-sync" ), aStringVal );
    }

}
