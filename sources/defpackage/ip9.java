package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ip9 {
    public final Drawable A;
    public final Integer B;
    public final Drawable C;
    public final zi6 D;
    public final cc6 E;
    public final Context a;
    public final Object b;
    public final woi c;
    public final fp9 d;
    public final s9c e;
    public final String f;
    public final Bitmap.Config g;
    public final c1f h;
    public final List i;
    public final acj j;
    public final Headers k;
    public final wki l;
    public final boolean m;
    public final boolean n;
    public final jt2 o;
    public final jt2 p;
    public final jt2 q;
    public final g85 r;
    public final g85 s;
    public final g85 t;
    public final g85 u;
    public final p6b v;
    public final p9h w;
    public final phg x;
    public final xud y;
    public final Integer z;

    public ip9(Context context, Object obj, woi woiVar, fp9 fp9Var, s9c s9cVar, String str, Bitmap.Config config, c1f c1fVar, List list, acj acjVar, Headers headers, wki wkiVar, boolean z, boolean z2, jt2 jt2Var, jt2 jt2Var2, jt2 jt2Var3, g85 g85Var, g85 g85Var2, g85 g85Var3, g85 g85Var4, p6b p6bVar, p9h p9hVar, phg phgVar, xud xudVar, Integer num, Drawable drawable, Integer num2, Drawable drawable2, zi6 zi6Var, cc6 cc6Var) {
        this.a = context;
        this.b = obj;
        this.c = woiVar;
        this.d = fp9Var;
        this.e = s9cVar;
        this.f = str;
        this.g = config;
        this.h = c1fVar;
        this.i = list;
        this.j = acjVar;
        this.k = headers;
        this.l = wkiVar;
        this.m = z;
        this.n = z2;
        this.o = jt2Var;
        this.p = jt2Var2;
        this.q = jt2Var3;
        this.r = g85Var;
        this.s = g85Var2;
        this.t = g85Var3;
        this.u = g85Var4;
        this.v = p6bVar;
        this.w = p9hVar;
        this.x = phgVar;
        this.y = xudVar;
        this.z = num;
        this.A = drawable;
        this.B = num2;
        this.C = drawable2;
        this.D = zi6Var;
        this.E = cc6Var;
    }

    public static cp9 a(ip9 ip9Var) {
        Context context = ip9Var.a;
        ip9Var.getClass();
        return new cp9(context, ip9Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ip9) {
                ip9 ip9Var = (ip9) obj;
                if (Intrinsics.areEqual(this.a, ip9Var.a) && Intrinsics.areEqual(this.b, ip9Var.b) && Intrinsics.areEqual(this.c, ip9Var.c) && Intrinsics.areEqual(this.d, ip9Var.d) && Intrinsics.areEqual(this.e, ip9Var.e) && Intrinsics.areEqual(this.f, ip9Var.f) && this.g == ip9Var.g && Intrinsics.areEqual(null, null) && this.h == ip9Var.h && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.i, ip9Var.i) && Intrinsics.areEqual(this.j, ip9Var.j) && Intrinsics.areEqual(this.k, ip9Var.k) && Intrinsics.areEqual(this.l, ip9Var.l) && this.m == ip9Var.m && this.n == ip9Var.n && this.o == ip9Var.o && this.p == ip9Var.p && this.q == ip9Var.q && Intrinsics.areEqual(this.r, ip9Var.r) && Intrinsics.areEqual(this.s, ip9Var.s) && Intrinsics.areEqual(this.t, ip9Var.t) && Intrinsics.areEqual(this.u, ip9Var.u) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.z, ip9Var.z) && Intrinsics.areEqual(this.A, ip9Var.A) && Intrinsics.areEqual(this.B, ip9Var.B) && Intrinsics.areEqual(this.C, ip9Var.C) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.v, ip9Var.v) && Intrinsics.areEqual(this.w, ip9Var.w) && this.x == ip9Var.x && Intrinsics.areEqual(this.y, ip9Var.y) && Intrinsics.areEqual(this.D, ip9Var.D) && Intrinsics.areEqual(this.E, ip9Var.E)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i8 = 0;
        woi woiVar = this.c;
        if (woiVar != null) {
            i = woiVar.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 31;
        fp9 fp9Var = this.d;
        if (fp9Var != null) {
            i2 = fp9Var.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        s9c s9cVar = this.e;
        if (s9cVar != null) {
            i3 = s9cVar.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        String str = this.f;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int c = sv6.c(this.y.a, (this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + hdi.g(hdi.g(hdi.g(hdi.g(sv6.c(this.l.a, (this.k.hashCode() + ((this.j.hashCode() + hdi.f((this.h.hashCode() + ((this.g.hashCode() + ((i11 + i4) * 31)) * 961)) * 29791, 31, this.i)) * 31)) * 31, 31), 31, true), 31, this.m), 31, this.n), 31, true)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 961);
        Integer num = this.z;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (c + i5) * 31;
        Drawable drawable = this.A;
        if (drawable != null) {
            i6 = drawable.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        Integer num2 = this.B;
        if (num2 != null) {
            i7 = num2.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (i13 + i7) * 31;
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            i8 = drawable2.hashCode();
        }
        return this.E.hashCode() + ((this.D.hashCode() + ((i14 + i8) * 29791)) * 31);
    }
}
