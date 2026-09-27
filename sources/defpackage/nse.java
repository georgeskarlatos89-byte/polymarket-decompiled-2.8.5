package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nse {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public nse q;

    public nse(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        nse nseVar = this.q;
        if (nseVar == null) {
            this.o = true;
            this.p = true;
        } else if (nseVar != null) {
            nseVar.a();
        }
    }

    public final boolean b() {
        nse nseVar = this.q;
        if (nseVar != null) {
            return nseVar.b();
        }
        if (!this.o && !this.p) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) jqn.f(this.a));
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append((Object) ogd.h(this.c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append((Object) ogd.h(this.g));
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        sb.append((Object) xse.a(this.i));
        sb.append(", historical=");
        Object obj = this.m;
        if (obj == null) {
            obj = CollectionsKt.emptyList();
        }
        sb.append(obj);
        sb.append(", scrollDelta=");
        sb.append((Object) ogd.h(this.j));
        sb.append(", scaleFactor=");
        sb.append(this.k);
        sb.append(", panOffset=");
        sb.append((Object) ogd.h(this.l));
        sb.append(')');
        return sb.toString();
    }

    public nse(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
