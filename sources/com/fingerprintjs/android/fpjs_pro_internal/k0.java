package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "", "a", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class k0 extends Lambda implements Function1<SafeWithTimeoutProContext, String> {
    public static final k0 h = new Lambda(1);

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.Lambda, com.fingerprintjs.android.fpjs_pro_internal.k0] */
    static {
        if (((1 & 107) + (1 | 107)) % 2 == 0) {
        } else {
            throw null;
        }
    }

    public k0() {
        super(1);
    }

    public final String a(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        String id = timeZone.getID();
        id.getClass();
        return id;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ String invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        return a(safeWithTimeoutProContext);
    }
}
