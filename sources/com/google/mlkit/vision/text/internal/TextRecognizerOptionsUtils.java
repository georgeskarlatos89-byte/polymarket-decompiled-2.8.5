package com.google.mlkit.vision.text.internal;

import com.google.mlkit.common.sdkinternal.MlKitContext;
import defpackage.m57;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class TextRecognizerOptionsUtils {
    private TextRecognizerOptionsUtils() {
    }

    public static boolean isThickClient(AtomicReference<Boolean> atomicReference, String str) {
        boolean z;
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        if (m57.a(MlKitContext.getInstance().getApplicationContext(), str) > 0) {
            z = true;
        } else {
            z = false;
        }
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
