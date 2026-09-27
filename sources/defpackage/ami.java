package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ami implements bmi {
    public final Throwable a;
    public final rmi b;

    public ami(Throwable th, rmi rmiVar) {
        this.a = th;
        this.b = rmiVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ami) {
                ami amiVar = (ami) obj;
                if (!Intrinsics.areEqual(this.a, amiVar.a) || !Intrinsics.areEqual(this.b, amiVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UnsupportedDevice(error=" + this.a + ", errorMessage=" + this.b + ")";
    }
}
