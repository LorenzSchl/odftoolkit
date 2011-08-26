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
import org.odftoolkit.odfdom.dom.type.OdfStyleName;


/**
 * ODF DOM Element implementation for element "<text:alphabetical-index-source>".
 */
public abstract class OdfAlphabeticalIndexSourceElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "alphabetical-index-source" );

    public OdfAlphabeticalIndexSourceElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
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
     * Get value of attribute "text:ignore-case".
     */
    public Boolean getIgnoreCase()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "ignore-case" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:ignore-case".
     */
    public void setIgnoreCase( Boolean _aIgnoreCase )
    {                    
        String aStringVal = OdfBoolean.toString( _aIgnoreCase );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "ignore-case" ), aStringVal );
    }

    /**
     * Get value of attribute "text:main-entry-style-name".
     */
    public String getMainEntryStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "main-entry-style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:main-entry-style-name".
     */
    public void setMainEntryStyleName( String _aMainEntryStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aMainEntryStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "main-entry-style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "text:alphabetical-separators".
     */
    public Boolean getAlphabeticalSeparators()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "alphabetical-separators" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:alphabetical-separators".
     */
    public void setAlphabeticalSeparators( Boolean _aAlphabeticalSeparators )
    {                    
        String aStringVal = OdfBoolean.toString( _aAlphabeticalSeparators );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "alphabetical-separators" ), aStringVal );
    }

    /**
     * Get value of attribute "text:combine-entries".
     */
    public Boolean getCombineEntries()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "combine-entries" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:combine-entries".
     */
    public void setCombineEntries( Boolean _aCombineEntries )
    {                    
        String aStringVal = OdfBoolean.toString( _aCombineEntries );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "combine-entries" ), aStringVal );
    }

    /**
     * Get value of attribute "text:combine-entries-with-dash".
     */
    public Boolean getCombineEntriesWithDash()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "combine-entries-with-dash" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:combine-entries-with-dash".
     */
    public void setCombineEntriesWithDash( Boolean _aCombineEntriesWithDash )
    {                    
        String aStringVal = OdfBoolean.toString( _aCombineEntriesWithDash );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "combine-entries-with-dash" ), aStringVal );
    }

    /**
     * Get value of attribute "text:combine-entries-with-pp".
     */
    public Boolean getCombineEntriesWithPp()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "combine-entries-with-pp" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:combine-entries-with-pp".
     */
    public void setCombineEntriesWithPp( Boolean _aCombineEntriesWithPp )
    {                    
        String aStringVal = OdfBoolean.toString( _aCombineEntriesWithPp );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "combine-entries-with-pp" ), aStringVal );
    }

    /**
     * Get value of attribute "text:use-keys-as-entries".
     */
    public Boolean getUseKeysAsEntries()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-keys-as-entries" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:use-keys-as-entries".
     */
    public void setUseKeysAsEntries( Boolean _aUseKeysAsEntries )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseKeysAsEntries );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "use-keys-as-entries" ), aStringVal );
    }

    /**
     * Get value of attribute "text:capitalize-entries".
     */
    public Boolean getCapitalizeEntries()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "capitalize-entries" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:capitalize-entries".
     */
    public void setCapitalizeEntries( Boolean _aCapitalizeEntries )
    {                    
        String aStringVal = OdfBoolean.toString( _aCapitalizeEntries );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "capitalize-entries" ), aStringVal );
    }

    /**
     * Get value of attribute "text:comma-separated".
     */
    public Boolean getCommaSeparated()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "comma-separated" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:comma-separated".
     */
    public void setCommaSeparated( Boolean _aCommaSeparated )
    {                    
        String aStringVal = OdfBoolean.toString( _aCommaSeparated );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "comma-separated" ), aStringVal );
    }

    /**
     * Get value of attribute "fo:language".
     */
    public String getLanguage()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FO, "language" ) );
    }

    /**
     * Set value of attribute "fo:language".
     */
    public void setLanguage( String _aLanguage )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FO, "language" ), _aLanguage );
    }

    /**
     * Get value of attribute "fo:country".
     */
    public String getCountry()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FO, "country" ) );
    }

    /**
     * Set value of attribute "fo:country".
     */
    public void setCountry( String _aCountry )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FO, "country" ), _aCountry );
    }

    /**
     * Get value of attribute "fo:script".
     */
    public String getScript()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FO, "script" ) );
    }

    /**
     * Set value of attribute "fo:script".
     */
    public void setScript( String _aScript )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FO, "script" ), _aScript );
    }

    /**
     * Get value of attribute "style:rfc-language-tag".
     */
    public String getRfcLanguageTag()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "rfc-language-tag" ) );
    }

    /**
     * Set value of attribute "style:rfc-language-tag".
     */
    public void setRfcLanguageTag( String _aRfcLanguageTag )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "rfc-language-tag" ), _aRfcLanguageTag );
    }

    /**
     * Get value of attribute "text:sort-algorithm".
     */
    public String getSortAlgorithm()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "sort-algorithm" ) );
    }

    /**
     * Set value of attribute "text:sort-algorithm".
     */
    public void setSortAlgorithm( String _aSortAlgorithm )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "sort-algorithm" ), _aSortAlgorithm );
    }

}
