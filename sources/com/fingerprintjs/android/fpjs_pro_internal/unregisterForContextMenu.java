package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import defpackage.hdi;
import defpackage.woa;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class unregisterForContextMenu {
    public static int o;
    public static int p;
    public final boolean a;
    public final long b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final int l;
    public final boolean m;
    public final boolean n;

    public unregisterForContextMenu(boolean z, long j, int i, int i2, boolean z2, long j2, int i3, int i4, boolean z3, boolean z4, long j3, int i5, boolean z5, boolean z6) {
        this.a = z;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = z2;
        this.f = j2;
        this.g = i3;
        this.h = i4;
        this.i = z3;
        this.j = z4;
        this.k = j3;
        this.l = i5;
        this.m = z5;
        this.n = z6;
    }

    public static int component5() {
        int i = o;
        int i2 = i % 6631723;
        o = i + 1;
        if (i2 != 0) {
            return p;
        }
        int myPid = Process.myPid();
        p = myPid;
        return myPid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unregisterForContextMenu)) {
            return false;
        }
        unregisterForContextMenu unregisterforcontextmenu = (unregisterForContextMenu) obj;
        if (this.a == unregisterforcontextmenu.a && this.b == unregisterforcontextmenu.b && this.c == unregisterforcontextmenu.c && this.d == unregisterforcontextmenu.d && this.e == unregisterforcontextmenu.e && this.f == unregisterforcontextmenu.f && this.g == unregisterforcontextmenu.g && this.h == unregisterforcontextmenu.h && this.i == unregisterforcontextmenu.i && this.j == unregisterforcontextmenu.j && this.k == unregisterforcontextmenu.k && this.l == unregisterforcontextmenu.l && this.m == unregisterforcontextmenu.m && this.n == unregisterforcontextmenu.n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + hdi.g(woa.b(this.l, woa.d(hdi.g(hdi.g(woa.b(this.h, woa.b(this.g, woa.d(hdi.g(woa.b(this.d, woa.b(this.c, woa.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31), 31), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m);
    }

    public final String toString() {
        return "";
    }
}
