package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "", "a", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class d2 extends Lambda implements Function1<SafeWithTimeoutProContext, Boolean> {
    public final /* synthetic */ Location h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(Location location) {
        super(1);
        this.h = location;
    }

    public final Boolean a(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        return Boolean.valueOf(this.h.isMock());
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        return a(safeWithTimeoutProContext);
    }
}
