package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qz4 {
    public static final qz4 i;
    public final v3d a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set h;

    static {
        v3d v3dVar = v3d.NOT_REQUIRED;
        v3dVar.getClass();
        i = new qz4(v3dVar, false, false, false, false, -1L, -1L, fd7.a);
    }

    public qz4(qz4 qz4Var) {
        qz4Var.getClass();
        this.b = qz4Var.b;
        this.c = qz4Var.c;
        this.a = qz4Var.a;
        this.d = qz4Var.d;
        this.e = qz4Var.e;
        this.h = qz4Var.h;
        this.f = qz4Var.f;
        this.g = qz4Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(qz4.class, obj.getClass())) {
            return false;
        }
        qz4 qz4Var = (qz4) obj;
        if (this.b != qz4Var.b || this.c != qz4Var.c || this.d != qz4Var.d || this.e != qz4Var.e || this.f != qz4Var.f || this.g != qz4Var.g || this.a != qz4Var.a) {
            return false;
        }
        return Intrinsics.areEqual(this.h, qz4Var.h);
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.b + ", requiresDeviceIdle=" + this.c + ", requiresBatteryNotLow=" + this.d + ", requiresStorageNotLow=" + this.e + ", contentTriggerUpdateDelayMillis=" + this.f + ", contentTriggerMaxDelayMillis=" + this.g + ", contentUriTriggers=" + this.h + ", }";
    }

    public qz4(v3d v3dVar, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        v3dVar.getClass();
        set.getClass();
        this.a = v3dVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = j2;
        this.h = set;
    }
}
