package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wba {
    public final kij a;
    public final yba b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final s7h f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ wba(kij kijVar, boolean z, boolean z2, Set set, int i) {
        this(kijVar, r2, r3, r4, (i & 16) != 0 ? null : set, null);
        boolean z3;
        boolean z4;
        yba ybaVar = yba.INFLEXIBLE;
        if ((i & 4) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 8) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
    }

    public static wba a(wba wbaVar, yba ybaVar, boolean z, Set set, s7h s7hVar, int i) {
        kij kijVar = wbaVar.a;
        if ((i & 2) != 0) {
            ybaVar = wbaVar.b;
        }
        yba ybaVar2 = ybaVar;
        if ((i & 4) != 0) {
            z = wbaVar.c;
        }
        boolean z2 = z;
        boolean z3 = wbaVar.d;
        if ((i & 16) != 0) {
            set = wbaVar.e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            s7hVar = wbaVar.f;
        }
        wbaVar.getClass();
        kijVar.getClass();
        ybaVar2.getClass();
        return new wba(kijVar, ybaVar2, z2, z3, set2, s7hVar);
    }

    public final wba b(yba ybaVar) {
        ybaVar.getClass();
        return a(this, ybaVar, false, null, null, 61);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wba)) {
            return false;
        }
        wba wbaVar = (wba) obj;
        if (!Intrinsics.areEqual(wbaVar.f, this.f) || wbaVar.a != this.a || wbaVar.b != this.b || wbaVar.c != this.c || wbaVar.d != this.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        s7h s7hVar = this.f;
        if (s7hVar != null) {
            i = s7hVar.hashCode();
        } else {
            i = 0;
        }
        int hashCode = this.a.hashCode() + (i * 31) + i;
        int hashCode2 = this.b.hashCode() + (hashCode * 31) + hashCode;
        int i2 = (hashCode2 * 31) + (this.c ? 1 : 0) + hashCode2;
        return (i2 * 31) + (this.d ? 1 : 0) + i2;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.b + ", isRaw=" + this.c + ", isForAnnotationParameter=" + this.d + ", visitedTypeParameters=" + this.e + ", defaultType=" + this.f + ')';
    }

    public wba(kij kijVar, yba ybaVar, boolean z, boolean z2, Set set, s7h s7hVar) {
        kijVar.getClass();
        ybaVar.getClass();
        kijVar.getClass();
        this.a = kijVar;
        this.b = ybaVar;
        this.c = z;
        this.d = z2;
        this.e = set;
        this.f = s7hVar;
    }
}
