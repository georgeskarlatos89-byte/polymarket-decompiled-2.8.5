package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wl9 {
    public final String a;
    public final String b;
    public final Map c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wl9(String str, String str2, int i) {
        this(str, str2, r5);
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl9)) {
            return false;
        }
        wl9 wl9Var = (wl9) obj;
        if (Intrinsics.areEqual(this.a, wl9Var.a) && Intrinsics.areEqual(this.b, wl9Var.b) && Intrinsics.areEqual(this.c, wl9Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.c.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Identity(userId=");
        sb.append((Object) this.a);
        sb.append(", deviceId=");
        sb.append((Object) this.b);
        sb.append(", userProperties=");
        return hdi.s(sb, this.c, ')');
    }

    public wl9(String str, String str2, Map map) {
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
    }
}
