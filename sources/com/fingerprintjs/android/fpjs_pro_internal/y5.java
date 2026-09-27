package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.C1722;
import defpackage.ace;
import io.ably.lib.util.AgentHeaderCreator;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/y5;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y5 {
    public static final y5 a = new Object();
    public static final IntRange b = new kotlin.ranges.a(0, 15, 1);
    public static int c = 0;
    public static int d = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.y5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    static {
        if (((0 - (-26)) - 1) % 2 != 0) {
        } else {
            throw null;
        }
    }

    public static String a(String str) {
        int i = d;
        c = ((i & 3) + (i | 3)) % 128;
        String m = ace.m(C1722.fe.e.setPivotYN16904(), AgentHeaderCreator.AGENT_DIVIDER, str);
        int i2 = c;
        d = (((i2 | 23) << 1) - (i2 ^ 23)) % 128;
        return m;
    }
}
