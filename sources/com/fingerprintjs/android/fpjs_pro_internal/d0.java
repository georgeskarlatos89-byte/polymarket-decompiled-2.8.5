package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/d0;", "", "c", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class d0 {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final long a;
    public final long b;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/d0$a;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.d0$a, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static int a;
        public static int b;

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static int a() {
            int i = a;
            int i2 = i % 5684983;
            a = i + 1;
            if (i2 != 0) {
                return b;
            }
            int myUid = Process.myUid();
            b = myUid;
            return myUid;
        }
    }

    public d0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.a == d0Var.a && this.b == d0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
