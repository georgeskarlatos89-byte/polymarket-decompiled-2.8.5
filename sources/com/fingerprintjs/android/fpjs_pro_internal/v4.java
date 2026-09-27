package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "a", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class v4 extends Lambda implements Function1<Long, Boolean> {
    public static final v4 h = new Lambda(1);
    public static int i = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.v4, kotlin.jvm.internal.Lambda] */
    static {
        if ((1 + 17) % 2 == 0) {
        } else {
            throw null;
        }
    }

    public v4() {
        super(1);
    }

    public final Boolean a(long j) {
        int i2 = i;
        boolean z = true;
        int i3 = (i2 ^ 115) + ((i2 & 115) << 1);
        int i4 = i3 % 128;
        if (i3 % 2 == 0 ? j == 0 : j == 0) {
            i = ((i4 ^ 105) + ((i4 & 105) << 1)) % 128;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Long l) {
        return a(l.longValue());
    }
}
