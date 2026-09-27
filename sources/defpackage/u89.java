package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u89 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final ArrayList h;
    public final boolean i;
    public final long j;
    public final long k;
    public final jr9 l;
    public final jr9 m;
    public final jr9 n;

    public u89(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, wwf wwfVar) {
        boolean z2;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z2 = false;
        } else {
            z2 = true;
        }
        pfn.b(z2);
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = jr9.m(arrayList2);
        this.m = jr9.m(arrayList3);
        this.n = jr9.m(wwfVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u89) {
                u89 u89Var = (u89) obj;
                if (this.d == u89Var.d && this.e == u89Var.e && this.f == u89Var.f && this.g == u89Var.g && this.i == u89Var.i && this.j == u89Var.j && this.k == u89Var.k && this.a.equals(u89Var.a) && Objects.equals(this.b, u89Var.b) && Objects.equals(this.c, u89Var.c) && this.h.equals(u89Var.h) && Objects.equals(this.l, u89Var.l) && Objects.equals(this.m, u89Var.m) && Objects.equals(this.n, u89Var.n)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n);
    }
}
