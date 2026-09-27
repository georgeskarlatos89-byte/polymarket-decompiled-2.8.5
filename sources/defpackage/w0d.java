package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class w0d extends x0d {
    public final String a;
    public final rxe b;
    public final boolean c;

    public w0d(String str, rxe rxeVar, boolean z) {
        str.getClass();
        this.a = str;
        this.b = rxeVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w0d) {
                w0d w0dVar = (w0d) obj;
                if (!Intrinsics.areEqual(this.a, w0dVar.a) || !Intrinsics.areEqual(this.b, w0dVar.b) || this.c != w0dVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        if (this.b == null) {
            i = 0;
        } else {
            i = 122269371;
        }
        return Boolean.hashCode(this.c) + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigateTo(route=");
        sb.append(this.a);
        sb.append(", popUpTo=");
        sb.append(this.b);
        sb.append(", isSingleTop=");
        return ix2.r(sb, this.c, ")");
    }
}
