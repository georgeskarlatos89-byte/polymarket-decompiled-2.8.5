package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bt7 {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;

    public bt7(String str, String str2, String str3, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bt7) {
                bt7 bt7Var = (bt7) obj;
                if (!Intrinsics.areEqual(this.a, bt7Var.a) || !Intrinsics.areEqual(this.b, bt7Var.b) || !Intrinsics.areEqual(this.c, bt7Var.c) || !Intrinsics.areEqual(this.d, bt7Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map map = this.d;
        if (map != null) {
            i = map.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exposure(flagKey=");
        sb.append(this.a);
        sb.append(", variant=");
        sb.append(this.b);
        sb.append(", experimentKey=");
        sb.append(this.c);
        sb.append(", metadata=");
        return hdi.s(sb, this.d, ')');
    }
}
