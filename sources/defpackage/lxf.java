package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lxf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final jjc g;

    public lxf(long j, long j2, long j3, long j4, long j5, float[] fArr, jjc jjcVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = jjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean areEqual;
        if (this != obj) {
            if (obj != null && lxf.class == obj.getClass()) {
                lxf lxfVar = (lxf) obj;
                if (this.a == lxfVar.a && this.b == lxfVar.b && this.e == lxfVar.e && e1a.b(this.c, lxfVar.c) && e1a.b(this.d, lxfVar.d)) {
                    float[] fArr = lxfVar.f;
                    float[] fArr2 = this.f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            areEqual = true;
                            if (areEqual && Intrinsics.areEqual(this.g, lxfVar.g)) {
                            }
                        }
                        areEqual = false;
                        if (areEqual) {
                        }
                    } else {
                        if (fArr != null) {
                            areEqual = Intrinsics.areEqual(fArr2, fArr);
                            if (areEqual) {
                            }
                        }
                        areEqual = false;
                        if (areEqual) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int d = woa.d(woa.d(woa.d(woa.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        } else {
            i = 0;
        }
        return this.g.hashCode() + ((d + i) * 31);
    }
}
