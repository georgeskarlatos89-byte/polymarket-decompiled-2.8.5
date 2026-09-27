package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/m2;", "", "b", "a", "Lcom/fingerprintjs/android/fpjs_pro_internal/m2$b;", "Lcom/fingerprintjs/android/fpjs_pro_internal/m2$a;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class m2 {
    public static int a;
    public static int b;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/m2$a;", "Lcom/fingerprintjs/android/fpjs_pro_internal/m2;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends m2 {
        public static final a c = new m2(null);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/m2$b;", "Lcom/fingerprintjs/android/fpjs_pro_internal/m2;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends m2 {
        public static final b c = new m2(null);
    }

    public m2(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static int a() {
        int i = a;
        int i2 = i % 7843288;
        a = i + 1;
        if (i2 != 0) {
            return b;
        }
        int myPid = Process.myPid();
        b = myPid;
        return myPid;
    }
}
