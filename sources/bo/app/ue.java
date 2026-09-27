package bo.app;

import defpackage.ix2;
import defpackage.woa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ue {
    public boolean a;
    public Long b;
    public String c;
    public long d;
    public long e;
    public long f;

    public ue(boolean z, Long l, String str, long j, long j2, long j3) {
        this.a = z;
        this.b = l;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue)) {
            return false;
        }
        ue ueVar = (ue) obj;
        if (this.a == ueVar.a && Intrinsics.areEqual(this.b, ueVar.b) && Intrinsics.areEqual(this.c, ueVar.c) && this.d == ueVar.d && this.e == ueVar.e && this.f == ueVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.a) * 31;
        Long l = this.b;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return Long.hashCode(this.f) + woa.d(woa.d((i2 + i) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(isEnabled=");
        sb.append(this.a);
        sb.append(", sdkDebuggerExpirationTime=");
        sb.append(this.b);
        sb.append(", sdkDebuggerAuthCode=");
        sb.append(this.c);
        sb.append(", sdkDebuggerFlushIntervalBytes=");
        sb.append(this.d);
        sb.append(", sdkDebuggerFlushIntervalSeconds=");
        sb.append(this.e);
        sb.append(", sdkDebuggerMaxPayloadBytes=");
        return ix2.n(sb, this.f, ')');
    }

    public /* synthetic */ ue() {
        this(false, null, null, 0L, 0L, 0L);
    }
}
