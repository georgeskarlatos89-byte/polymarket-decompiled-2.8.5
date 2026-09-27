package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qag extends w75 {
    @Override // defpackage.w75
    public final w75 a(y75 y75Var, y75 y75Var2, y75 y75Var3, y75 y75Var4) {
        return new w75(y75Var, y75Var2, y75Var3, y75Var4);
    }

    @Override // defpackage.w75
    public final knd c(long j, float f, float f2, float f3, float f4, owa owaVar) {
        float f5;
        float f6;
        float f7;
        float f8;
        if (f + f2 + f3 + f4 == 0.0f) {
            return new ind(vtn.b(0L, j));
        }
        zrf b = vtn.b(0L, j);
        owa owaVar2 = owa.Ltr;
        if (owaVar == owaVar2) {
            f5 = f;
        } else {
            f5 = f2;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        if (owaVar == owaVar2) {
            f6 = f2;
        } else {
            f6 = f;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (owaVar == owaVar2) {
            f7 = f3;
        } else {
            f7 = f4;
        }
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
        if (owaVar == owaVar2) {
            f8 = f4;
        } else {
            f8 = f3;
        }
        return new jnd(new mag(b.a, b.b, b.c, b.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qag)) {
            return false;
        }
        qag qagVar = (qag) obj;
        if (Intrinsics.areEqual(this.a, qagVar.a) && Intrinsics.areEqual(this.b, qagVar.b) && Intrinsics.areEqual(this.c, qagVar.c) && Intrinsics.areEqual(this.d, qagVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
