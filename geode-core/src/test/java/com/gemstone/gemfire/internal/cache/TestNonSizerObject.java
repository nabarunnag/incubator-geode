/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gemstone.gemfire.internal.cache;

import java.io.Serializable;

/**
 * Test object which does not implement ObjectSizer, used as Key/Value in put operation.
 * 
 * 
 */
public class TestNonSizerObject implements Serializable {

  private static final long serialVersionUID = 0L;

  private String testString;

  public TestNonSizerObject(String testString) {
    super();
    this.testString = testString;
  }

  public String getTestString() {
    return testString;
  }

  public void setTestString(String testString) {
    this.testString = testString;
  }

  @Override
  public int hashCode() {
    return Integer.parseInt(this.testString);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof TestNonSizerObject) {
      TestNonSizerObject other = (TestNonSizerObject)obj;
      if (this.testString == other.testString) {
        return true;
      }
    }

    return false;
  }

}
