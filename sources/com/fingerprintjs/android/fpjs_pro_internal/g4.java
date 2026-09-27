package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class g4 extends Lambda implements Function0<String> {
    public static final g4 h = new Lambda(0);
    public static int i = 0;
    public static int j = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.g4, kotlin.jvm.internal.Lambda] */
    static {
        if (((0 - (-90)) - 1) % 2 != 0) {
        } else {
            throw null;
        }
    }

    public g4() {
        super(0);
    }

    public final String b() {
        String str = Build.MODEL;
        int i2 = i + 69;
        j = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i2 = i + 121;
        j = i2 % 128;
        if (i2 % 2 != 0) {
            String b = b();
            int i3 = j;
            i = ((i3 & 21) + (i3 | 21)) % 128;
            return b;
        }
        b();
        throw null;
    }
}
