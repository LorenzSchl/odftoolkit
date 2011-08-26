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
package org.odftoolkit.odfdom.dom.type.chart;

public enum OdfLabelPositionType
{
              RIGHT( "right" ), INSIDE( "inside" ), TOP( "top" ), TOP_RIGHT( "top-right" ), LEFT( "left" ), OUTSIDE( "outside" ), BOTTOM_LEFT( "bottom-left" ), BOTTOM( "bottom" ), AVOID_OVERLAP( "avoid-overlap" ), CENTER( "center" ), NEAR_ORIGIN( "near-origin" ), BOTTOM_RIGHT( "bottom-right" ), TOP_LEFT( "top-left" );

    private String m_aValue;

    OdfLabelPositionType( String _aValue )
    {
        m_aValue = _aValue;
    }

    public String toString()
    {
        return m_aValue;
    }

    public static String toString( OdfLabelPositionType _aEnum )
    {
        return _aEnum.toString();
    }

    public static OdfLabelPositionType enumValueOf( String _aString )
    {
        for( OdfLabelPositionType aIter : values() )
        {
            if( _aString.equals( aIter.toString() ) )
            {
                return aIter;
            }
        }
        return null;
    }

}
