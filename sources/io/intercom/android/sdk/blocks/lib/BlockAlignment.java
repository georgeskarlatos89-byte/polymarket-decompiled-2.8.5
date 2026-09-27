package io.intercom.android.sdk.blocks.lib;

import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum BlockAlignment {
    LEFT { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.1
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return 8388611;
        }
    },
    CENTER { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.2
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return 1;
        }
    },
    RIGHT { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.3
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return 8388613;
        }
    };

    public static BlockAlignment alignValueOf(String str) {
        try {
            return valueOf(str.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException | NullPointerException unused) {
            return LEFT;
        }
    }

    public abstract int getGravity();

    /* synthetic */ BlockAlignment(AnonymousClass1 anonymousClass1) {
        this();
    }
}
