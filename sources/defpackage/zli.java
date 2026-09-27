package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zli implements bmi {
    public final Throwable a;
    public final cmi b;
    public final rmi c;

    public zli(Throwable th, cmi cmiVar, rmi rmiVar) {
        cmiVar.getClass();
        this.a = th;
        this.b = cmiVar;
        this.c = rmiVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zli) {
                zli zliVar = (zli) obj;
                if (!Intrinsics.areEqual(this.a, zliVar.a) || !Intrinsics.areEqual(this.b, zliVar.b) || !Intrinsics.areEqual(this.c, zliVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FailedCollection(error=" + this.a + ", errorCode=" + this.b + ", errorMessage=" + this.c + ")";
    }
}
