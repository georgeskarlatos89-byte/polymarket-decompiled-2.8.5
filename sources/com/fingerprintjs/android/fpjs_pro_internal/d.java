package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b0\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/d;", "", "a", "b", "com/fingerprintjs/android/fpjs_pro_internal/b", "Lcom/fingerprintjs/android/fpjs_pro_internal/d$a;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/d$a;", "Lcom/fingerprintjs/android/fpjs_pro_internal/d;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends d {
        public static final a b = new d(null);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/d$b;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.d$b, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static int a;
        public static int b;

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static int a() {
            int i = a;
            int i2 = i % 8366054;
            a = i + 1;
            if (i2 != 0) {
                return b;
            }
            int uptimeMillis = (int) SystemClock.uptimeMillis();
            b = uptimeMillis;
            return uptimeMillis;
        }
    }

    public d(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
