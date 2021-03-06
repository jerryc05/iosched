/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.iosched.model.userdata

import com.google.samples.apps.iosched.model.SessionId

/**
 * Data for a user's personalized event stored in a Firestore document.
 */
data class UserEvent(
    /**
     * The unique ID for the event.
     */
    val id: SessionId,

    /** Tracks whether the user has starred the event. */
    val isStarred: Boolean = false,

    /** Tracks whether the user has provided feedback for the event. */
    val isReviewed: Boolean = false
) {
    fun isPinned(): Boolean {
        return isStarred
    }
}
