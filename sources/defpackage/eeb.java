package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class eeb implements geb {
    public final bdb a;

    public eeb(bdb bdbVar) {
        bdbVar.getClass();
        this.a = bdbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof eeb) && Intrinsics.areEqual(this.a, ((eeb) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Available(configuration=" + this.a + ")";
    }
}
