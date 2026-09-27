package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class dia implements Comparable {
    public final int a;
    public final int b;
    public final int c;

    static {
        new dia(lfc.g.a);
        new dia(lfc.h.a);
    }

    public dia(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i3 >= 0) {
                    return;
                }
                dmk.v("Patch version should be not less than 0");
                throw null;
            }
            dmk.v("Minor version should be not less than 0");
            throw null;
        }
        dmk.v("Major version should be not less than 0");
        throw null;
    }

    public final int a(dia diaVar) {
        diaVar.getClass();
        int d = Intrinsics.d(this.a, diaVar.a);
        if (d != 0) {
            return d;
        }
        int d2 = Intrinsics.d(this.b, diaVar.b);
        if (d2 != 0) {
            return d2;
        }
        return Intrinsics.d(this.c, diaVar.c);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((dia) obj);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(dia.class, cls)) {
            return false;
        }
        obj.getClass();
        dia diaVar = (dia) obj;
        if (this.a == diaVar.a && this.b == diaVar.b && this.c == diaVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dia(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}
