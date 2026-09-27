package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lvb {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public lvb(int i, Integer num, Integer num2) {
        num2 = (i & 2) != 0 ? null : num2;
        this.a = num;
        this.b = num2;
        this.c = num2 != null ? num2 : null;
    }

    public final float a(mvb mvbVar) {
        mvbVar.getClass();
        if (this.c == null) {
            return 1.0f;
        }
        return lnf.d(r1.intValue() / mvbVar.m, 0.0f, 1.0f);
    }

    public final float b(mvb mvbVar) {
        mvbVar.getClass();
        return lnf.d(this.a.intValue() / mvbVar.m, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lvb) {
            lvb lvbVar = (lvb) obj;
            if (Intrinsics.areEqual(this.a, lvbVar.a) && Intrinsics.areEqual(this.b, lvbVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return Boolean.hashCode(true) + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "Frame(min=" + this.a + ", max=" + this.b + ", maxInclusive=true)";
    }
}
