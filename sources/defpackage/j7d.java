package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j7d {
    public final toi a;
    public final b7d b;

    public j7d(toi toiVar, b7d b7dVar) {
        toiVar.getClass();
        this.a = toiVar;
        this.b = b7dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j7d) {
                j7d j7dVar = (j7d) obj;
                if (!Intrinsics.areEqual(this.a, j7dVar.a) || !Intrinsics.areEqual(this.b, j7dVar.b)) {
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
        return "NfcScanningViewState(tapZone=" + this.a + ", status=" + this.b + ")";
    }
}
