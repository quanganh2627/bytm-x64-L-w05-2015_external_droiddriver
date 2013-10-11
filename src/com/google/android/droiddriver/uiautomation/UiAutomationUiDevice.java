/*
 * Copyright (C) 2013 DroidDriver committers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.droiddriver.uiautomation;

import android.graphics.Bitmap;
import android.util.Log;

import com.google.android.droiddriver.base.BaseUiDevice;
import com.google.android.droiddriver.util.Logs;

class UiAutomationUiDevice extends BaseUiDevice {
  private final UiAutomationContext context;

  UiAutomationUiDevice(UiAutomationContext context) {
    this.context = context;
  }

  @Override
  protected Bitmap takeScreenshot() {
    try {
      return context.getUiAutomation().takeScreenshot();
    } catch (Throwable e) {
      Logs.log(Log.ERROR, e);
      return null;
    }
  }

  @Override
  protected UiAutomationContext getContext() {
    return context;
  }
}
