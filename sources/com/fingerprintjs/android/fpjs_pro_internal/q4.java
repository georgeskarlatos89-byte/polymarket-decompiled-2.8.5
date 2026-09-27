package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class q4 extends Lambda implements Function1<String, Boolean> {
    public static final q4 h = new Lambda(1);
    public static int i = 0;
    public static int j = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.q4, kotlin.jvm.internal.Lambda] */
    static {
        if (((1 & 71) + (1 | 71)) % 2 != 0) {
            int i2 = 78 / 0;
        }
    }

    public q4() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r2.length() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r1 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.q4.i = (com.fingerprintjs.android.fpjs_pro_internal.q4.j + 21) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean a(String str) {
        int i2 = j + 121;
        i = i2 % 128;
        boolean z = false;
        if (i2 % 2 != 0) {
            int length = str.length();
            int i3 = 19 / 0;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(String str) {
        int i2 = i;
        j = ((i2 & 123) + (i2 | 123)) % 128;
        Boolean a = a(str);
        i = (j + 111) % 128;
        return a;
    }
}
