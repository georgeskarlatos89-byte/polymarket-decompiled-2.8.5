package defpackage;

import com.polymarket.data.EEvent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class p93 implements r93 {
    public final EEvent a;

    public p93(EEvent eEvent) {
        eEvent.getClass();
        this.a = eEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p93) && Intrinsics.areEqual(this.a, ((p93) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Event(event=" + this.a + ")";
    }
}
