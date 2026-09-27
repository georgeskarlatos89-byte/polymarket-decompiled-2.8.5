package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.StatFs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class n2 extends Lambda implements Function0<Long> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(c cVar) {
        super(0);
        this.h = cVar;
    }

    public final Long b() {
        int i = c.d + 69;
        c.e = i % 128;
        int i2 = i % 2;
        StatFs statFs = this.h.b;
        if (i2 == 0) {
            int i3 = 28 / 0;
        }
        statFs.getClass();
        return Long.valueOf(statFs.getTotalBytes());
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Long invoke() {
        return b();
    }
}
