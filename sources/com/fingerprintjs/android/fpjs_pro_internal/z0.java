package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class z0 extends Lambda implements Function0<Integer> {
    public static final z0 h = new Lambda(0);
    public static int i = 0;
    public static int j = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.z0, kotlin.jvm.internal.Lambda] */
    static {
        if ((((1 | 63) << 1) - (1 ^ 63)) % 2 == 0) {
        } else {
            throw null;
        }
    }

    public z0() {
        super(0);
    }

    public final Integer b() {
        int i2 = i;
        j = (((i2 | 39) << 1) - (i2 ^ 39)) % 128;
        Runtime runtime = Runtime.getRuntime();
        runtime.getClass();
        Integer valueOf = Integer.valueOf(runtime.availableProcessors());
        int i3 = j;
        i = ((i3 ^ 1) + ((i3 & 1) << 1)) % 128;
        return valueOf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Integer invoke() {
        int i2 = i + 109;
        j = i2 % 128;
        int i3 = i2 % 2;
        Integer b = b();
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return b;
    }
}
