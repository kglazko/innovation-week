/* This Source Code Form is subject to the terms of the Mozilla Public
* License, v. 2.0. If a copy of the MPL was not distributed with this
* file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.tv.firefox.utils

import org.mozilla.tv.firefox.BuildConfig

/**
 * Simple feature flags.
 */
class Features {
    companion object {
        /**
         * Swipe-to-refresh: Currently disabled due to various UX issues: #1776
         */
        @JvmField
        val SWIPE_TO_REFRESH: Boolean = BuildConfig.DEBUG
    }
}
