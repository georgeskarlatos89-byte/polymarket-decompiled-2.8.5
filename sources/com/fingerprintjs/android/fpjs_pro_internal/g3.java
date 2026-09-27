package com.fingerprintjs.android.fpjs_pro_internal;

import android.util.Log;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import defpackage.ace;
import java.util.Iterator;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g3 implements d4 {
    public final void a(SafeWithTimeoutProContext safeWithTimeoutProContext, String str) {
        Iterator it = StringsKt.c0(ace.m(safeWithTimeoutProContext.getClass().getCanonicalName(), ": ", str), new char[]{'\n'}).iterator();
        while (it.hasNext()) {
            Log.e("FingerprintJS", (String) it.next());
        }
    }
}
