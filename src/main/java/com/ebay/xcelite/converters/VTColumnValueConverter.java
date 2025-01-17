/*
  Copyright [2013-2014] eBay Software Foundation

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.ebay.xcelite.converters;

import java.util.Collection;

import com.google.common.collect.Lists;

/**
 * Serializes a Collection object to a VT separated String. 
 * Deserializes a VT separated String to an ArrayList. If a different Collection is required
 * other than {@link java.util.ArrayList}, extend this class to override {@link #getCollection(Iterable)} method.
 * 
 * @author kharel (kharel@ebay.com)
 * 
 */
public class VTColumnValueConverter extends DelimiterColumnValueConverter {

  private static final String VT = "\013";
  
  @Override
  protected String getDelimiter() {
    return VT;
  }

  @Override
  protected Collection<?> getCollection(Iterable<?> iterable) {
    return Lists.newArrayList(iterable);
  }
}
