package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vl9 {
    public final String a;
    public final String b;

    public vl9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl9)) {
            return false;
        }
        vl9 vl9Var = (vl9) obj;
        if (Intrinsics.areEqual(this.a, vl9Var.a) && Intrinsics.areEqual(this.b, vl9Var.b)) {
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
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Identity(userId=");
        sb.append(this.a);
        sb.append(", deviceId=");
        return m51.m(sb, this.b, ')');
    }
}
