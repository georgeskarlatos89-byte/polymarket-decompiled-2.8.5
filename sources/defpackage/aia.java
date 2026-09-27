package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class aia extends h0n {
    public final String c;
    public final String d;

    public aia(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.h0n
    public final String a() {
        return this.c + ':' + this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aia)) {
            return false;
        }
        aia aiaVar = (aia) obj;
        if (Intrinsics.areEqual(this.c, aiaVar.c) && Intrinsics.areEqual(this.d, aiaVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
