package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qeg implements teg {
    public final mzj a;

    public qeg(mzj mzjVar) {
        mzjVar.getClass();
        this.a = mzjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qeg) && Intrinsics.areEqual(this.a, ((qeg) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Complete(userInput=" + this.a + ")";
    }
}
