/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.atlas.model.glossary.enums;

public enum AtlasTermAssignmentStatus {
    DISCOVERED(0),
    PROPOSED(1),
    IMPORTED(2),
    VALIDATED(3),
    DEPRECATED(4),
    OBSOLETE(5),
    OTHER(6);

    private final int value;

    AtlasTermAssignmentStatus(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
