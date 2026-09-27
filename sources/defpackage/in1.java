package defpackage;

import bo.app.qe;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class in1 {
    public final qe a;

    public in1(qe qeVar) {
        this.a = qeVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof in1) || !Intrinsics.areEqual(this.a, ((in1) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
