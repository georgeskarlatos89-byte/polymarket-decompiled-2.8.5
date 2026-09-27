package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ubc {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;
    public final Float f;

    public /* synthetic */ ubc(float f, float f2, int i) {
        this(4, (i & 2) != 0 ? 2.5f : f, (i & 4) != 0 ? 0.66f : f2, 1.34f, true, (i & 32) != 0 ? null : Float.valueOf(0.2f));
    }

    public static ubc a(ubc ubcVar, boolean z) {
        int i = ubcVar.a;
        float f = ubcVar.b;
        float f2 = ubcVar.c;
        float f3 = ubcVar.d;
        Float f4 = ubcVar.f;
        ubcVar.getClass();
        return new ubc(i, f, f2, f3, z, f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubc)) {
            return false;
        }
        ubc ubcVar = (ubc) obj;
        if (this.a == ubcVar.a && Float.compare(this.b, ubcVar.b) == 0 && Float.compare(this.c, ubcVar.c) == 0 && Float.compare(this.d, ubcVar.d) == 0 && this.e == ubcVar.e && Intrinsics.areEqual(this.f, ubcVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g = hdi.g(sv6.a(sv6.a(sv6.a(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e);
        Float f = this.f;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        return g + hashCode;
    }

    public final String toString() {
        return "MeshConfiguration(gridSize=" + this.a + ", speed=" + this.b + ", amplitude=" + this.c + ", waveFrequency=" + this.d + ", animated=" + this.e + ", minimumDarkness=" + this.f + ")";
    }

    public ubc(int i, float f, float f2, float f3, boolean z, Float f4) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = z;
        this.f = f4;
    }
}
