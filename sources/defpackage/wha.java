package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wha extends i0n {
    public final String k;
    public final String l;

    public wha(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.k = str;
        this.l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wha)) {
            return false;
        }
        wha whaVar = (wha) obj;
        if (Intrinsics.areEqual(this.k, whaVar.k) && Intrinsics.areEqual(this.l, whaVar.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode() + (this.k.hashCode() * 31);
    }

    public final String toString() {
        return this.k + ':' + this.l;
    }
}
