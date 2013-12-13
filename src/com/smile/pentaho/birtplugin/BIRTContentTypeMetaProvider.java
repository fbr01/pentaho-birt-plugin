/*
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
 */
package com.smile.pentaho.birtplugin;


import java.io.InputStream;
import org.pentaho.platform.api.engine.IFileInfo;
import org.pentaho.platform.api.engine.ISolutionFile;
import org.pentaho.platform.api.engine.SolutionFileMetaAdapter;
import org.pentaho.platform.engine.core.solution.FileInfo;
import org.pentaho.platform.util.logging.Logger;


public class BIRTContentTypeMetaProvider extends SolutionFileMetaAdapter {

  public IFileInfo getFileInfo(ISolutionFile solutionFile, InputStream in) {
      try {
          String title = solutionFile.getFileName();
          if (title != null && title.endsWith(".rptdesign")) {
                  title = title.substring(0,title.indexOf(".rptdesign"));
          }
          IFileInfo info = new FileInfo();
          info.setAuthor("");
          info.setDescription("");
          info.setTitle(title);
          return info;
      } catch (Exception e) {
          Logger.error(getClass().getName(), e.getMessage());
      }
      return null;
  }

}
