package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class y4k extends a5k implements Iterable, xja {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final ArrayList j;

    public y4k(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof y4k)) {
                y4k y4kVar = (y4k) obj;
                if (Intrinsics.areEqual(this.a, y4kVar.a) && this.b == y4kVar.b && this.c == y4kVar.c && this.d == y4kVar.d && this.e == y4kVar.e && this.f == y4kVar.f && this.g == y4kVar.g && this.h == y4kVar.h && Intrinsics.areEqual(this.i, y4kVar.i) && Intrinsics.areEqual(this.j, y4kVar.j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.j.hashCode() + hdi.f(sv6.a(sv6.a(sv6.a(sv6.a(sv6.a(sv6.a(sv6.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), 31, this.i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new o3(this);
    }
}
