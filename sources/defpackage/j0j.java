package defpackage;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j0j {
    public final int a;
    public final jjc b;
    public final Function1 c;
    public j0j d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ k0j h;

    public j0j(k0j k0jVar, int i, jjc jjcVar, Function1 function1) {
        this.h = k0jVar;
        this.a = i;
        this.b = jjcVar;
        this.c = function1;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        lxf lxfVar;
        lxf lxfVar2;
        long j5 = this.h.f;
        jjc jjcVar = this.b;
        x8d e = nj6.e(jjcVar, 2);
        LayoutNode h = nj6.h(jjcVar);
        if (!h.T()) {
            lxfVar2 = null;
        } else {
            if (h.getOuterCoordinator$ui() != e) {
                long floatToRawIntBits = (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = e.c;
                x8d outerCoordinator$ui = h.getOuterCoordinator$ui();
                outerCoordinator$ui.getClass();
                lxfVar = new lxf(frm.m(outerCoordinator$ui.z(e, floatToRawIntBits, true)), (4294967295L & (((int) (r3 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (r3 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, jjcVar);
            } else {
                lxfVar = new lxf(j, j2, j3, j4, j5, fArr, jjcVar);
            }
            lxfVar2 = lxfVar;
        }
        if (lxfVar2 == null) {
            return;
        }
        this.c.invoke(lxfVar2);
    }

    public final void b() {
        j0j j0jVar;
        k0j k0jVar = this.h;
        bpc bpcVar = k0jVar.a;
        int i = this.a;
        j0j j0jVar2 = (j0j) bpcVar.g(i);
        if (j0jVar2 != null) {
            if (Intrinsics.areEqual(j0jVar2, this)) {
                j0j j0jVar3 = this.d;
                this.d = null;
                if (j0jVar3 != null) {
                    int d = bpcVar.d(i);
                    Object[] objArr = bpcVar.c;
                    Object obj = objArr[d];
                    bpcVar.b[d] = i;
                    objArr[d] = j0jVar3;
                    return;
                }
                LayoutNode h = nj6.h(this.b.a);
                if (h.g) {
                    mxa.a(h).getRectManager().b.E(h.b, false);
                    return;
                }
                return;
            }
            int d2 = bpcVar.d(i);
            Object[] objArr2 = bpcVar.c;
            Object obj2 = objArr2[d2];
            bpcVar.b[d2] = i;
            objArr2[d2] = j0jVar2;
            while (true) {
                j0j j0jVar4 = j0jVar2.d;
                if (j0jVar4 == null) {
                    break;
                }
                if (j0jVar4 == this) {
                    j0jVar2.d = this.d;
                    this.d = null;
                    return;
                }
                j0jVar2 = j0jVar4;
            }
        }
        j0j j0jVar5 = k0jVar.b;
        if (j0jVar5 == this) {
            k0jVar.b = j0jVar5.d;
            this.d = null;
            return;
        }
        if (j0jVar5 != null) {
            j0jVar = j0jVar5.d;
        } else {
            j0jVar = null;
        }
        while (true) {
            j0j j0jVar6 = j0jVar5;
            j0jVar5 = j0jVar;
            if (j0jVar5 != null) {
                if (j0jVar5 == this) {
                    if (j0jVar6 != null) {
                        j0jVar6.d = j0jVar5.d;
                    }
                    this.d = null;
                    return;
                }
                j0jVar = j0jVar5.d;
            } else {
                return;
            }
        }
    }
}
