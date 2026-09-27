package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v2b implements dch {
    public final /* synthetic */ z2b a;
    public final /* synthetic */ ech b;

    public v2b(z2b z2bVar, ech echVar) {
        this.a = z2bVar;
        this.b = echVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (java.lang.Math.abs(r9) <= java.lang.Math.abs(r8)) goto L41;
     */
    @Override // defpackage.dch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        p1b p1bVar;
        long e;
        z2b z2bVar = this.a;
        List list = z2bVar.h().k;
        int size = list.size();
        char c = 0;
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            m2b m2bVar = (m2b) list.get(i);
            if (m2bVar instanceof p1b) {
                p1bVar = (p1b) m2bVar;
            } else {
                p1bVar = null;
            }
            if (p1bVar == null || !p1bVar.f()) {
                r2b h = z2bVar.h();
                if (h.p == xmd.Vertical) {
                    e = h.e() & 4294967295L;
                } else {
                    e = h.e() >> 32;
                }
                int i2 = (int) e;
                int i3 = -z2bVar.h().l;
                int i4 = z2bVar.h().q;
                int i5 = ((s2b) m2bVar).q;
                int i6 = ((s2b) m2bVar).p;
                int i7 = z2bVar.h().n;
                float d = i6 - this.b.d(i2, i5, i3, i4);
                if (d <= 0.0f && d > f3) {
                    f3 = d;
                }
                if (d >= 0.0f && d < f2) {
                    f2 = d;
                }
            }
        }
        if (Math.abs(f) >= ((r2b) z2bVar.f.getValue()).i.t0(400.0f)) {
            if (f > 0.0f) {
                c = 1;
            } else {
                c = 2;
            }
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    f3 = 0.0f;
                }
            }
            f3 = f2;
        }
        if (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f3;
    }

    @Override // defpackage.dch
    public final float b(float f, float f2) {
        float abs = Math.abs(f2);
        List list = this.a.h().k;
        int i = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            int size2 = list.size();
            int i2 = 0;
            while (i < size2) {
                i2 += ((s2b) ((m2b) list.get(i))).q;
                i++;
            }
            i = i2 / size;
        }
        float f3 = abs - i;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return Math.signum(f2) * f3;
    }
}
