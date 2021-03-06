/*
 * Copyright (C) 2015 Piotr Wittchen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pwittchen.kirai.library;

public final class Preconditions {
  /**
   * Throws an exception with a message, when CharSequence is null
   *
   * @param str is a CharSequence to examine
   * @param message for IllegalArgumentException
   */
  public static void checkNotEmpty(CharSequence str, String message) {
    if (str == null || str.length() == 0) {
      throw new IllegalArgumentException(message);
    }
  }

  /**
   * Throws an exception with a message, when object is null
   *
   * @param object to examine
   * @param message for IllegalArgumentException
   */
  public static void checkNotNull(Object object, String message) {
    if (object == null) {
      throw new IllegalArgumentException(message);
    }
  }
}
