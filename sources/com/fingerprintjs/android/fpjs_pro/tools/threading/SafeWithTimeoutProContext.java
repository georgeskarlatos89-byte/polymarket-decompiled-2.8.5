package com.fingerprintjs.android.fpjs_pro.tools.threading;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SafeWithTimeoutProContext {
    public static final SafeWithTimeoutProContext INSTANCE = new Object();
    public static int a = 0;
    public static int b = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext] */
    static {
        if (((1 ^ 79) + ((1 & 79) << 1)) % 2 != 0) {
            int i = 80 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (java.lang.Thread.interrupted() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (java.lang.Thread.interrupted() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        throw new java.lang.InterruptedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext.b;
        com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext.a = ((r0 ^ 93) + ((r0 & 93) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a() {
        int i = a;
        int i2 = ((i | 67) << 1) - (i ^ 67);
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
    }
}
