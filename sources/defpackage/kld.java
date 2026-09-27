package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kld {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final b9h d;
    public final phg e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final Headers j;
    public final wki k;
    public final xud l;
    public final jt2 m;
    public final jt2 n;
    public final jt2 o;

    public kld(Context context, Bitmap.Config config, ColorSpace colorSpace, b9h b9hVar, phg phgVar, boolean z, boolean z2, boolean z3, String str, Headers headers, wki wkiVar, xud xudVar, jt2 jt2Var, jt2 jt2Var2, jt2 jt2Var3) {
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = b9hVar;
        this.e = phgVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str;
        this.j = headers;
        this.k = wkiVar;
        this.l = xudVar;
        this.m = jt2Var;
        this.n = jt2Var2;
        this.o = jt2Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kld) {
            kld kldVar = (kld) obj;
            if (Intrinsics.areEqual(this.a, kldVar.a) && this.b == kldVar.b && Intrinsics.areEqual(this.c, kldVar.c) && Intrinsics.areEqual(this.d, kldVar.d) && this.e == kldVar.e && this.f == kldVar.f && this.g == kldVar.g && this.h == kldVar.h && Intrinsics.areEqual(this.i, kldVar.i) && Intrinsics.areEqual(this.j, kldVar.j) && Intrinsics.areEqual(this.k, kldVar.k) && Intrinsics.areEqual(this.l, kldVar.l) && this.m == kldVar.m && this.n == kldVar.n && this.o == kldVar.o) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i2 = 0;
        ColorSpace colorSpace = this.c;
        if (colorSpace != null) {
            i = colorSpace.hashCode();
        } else {
            i = 0;
        }
        int g = hdi.g(hdi.g(hdi.g((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + i) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        if (str != null) {
            i2 = str.hashCode();
        }
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + sv6.c(this.l.a, sv6.c(this.k.a, (this.j.hashCode() + ((g + i2) * 31)) * 31, 31), 31)) * 31)) * 31);
    }
}
