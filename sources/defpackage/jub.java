package defpackage;

import java.util.Arrays;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jub implements il6 {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    public final /* synthetic */ lub d;

    public jub(lub lubVar) {
        this.d = lubVar;
    }

    public final nwa a() {
        this.a = true;
        lub lubVar = this.d;
        nwa N0 = lubVar.N0();
        if (e1a.b(this.b, 9223372034707292159L)) {
            this.b = frm.m(N0.P(0L));
            this.c = N0.h();
        }
        lubVar.R0().getLayoutDelegate().b();
        return N0;
    }

    public final void b(vc9 vc9Var, float f) {
        lub lubVar = this.d;
        pb pbVar = lubVar.m;
        if (pbVar == null) {
            pbVar = new pb();
            lubVar.m = pbVar;
        }
        int E = ArraysKt.E((vc9[]) pbVar.b, vc9Var);
        if (E < 0) {
            int i = pbVar.a;
            vc9[] vc9VarArr = (vc9[]) pbVar.b;
            if (i == vc9VarArr.length) {
                int i2 = i * 2;
                pbVar.b = (vc9[]) Arrays.copyOf(vc9VarArr, i2);
                pbVar.c = Arrays.copyOf((float[]) pbVar.c, i2);
                pbVar.d = Arrays.copyOf((byte[]) pbVar.d, i2);
            }
            ((vc9[]) pbVar.b)[i] = vc9Var;
            ((byte[]) pbVar.d)[i] = 3;
            ((float[]) pbVar.c)[i] = f;
            pbVar.a++;
            return;
        }
        float[] fArr = (float[]) pbVar.c;
        if (fArr[E] == f) {
            byte[] bArr = (byte[]) pbVar.d;
            if (bArr[E] == 2) {
                bArr[E] = 0;
                return;
            }
            return;
        }
        fArr[E] = f;
        ((byte[]) pbVar.d)[E] = 1;
    }

    @Override // defpackage.il6
    public final float getDensity() {
        return this.d.getDensity();
    }

    @Override // defpackage.il6
    public final float q0() {
        return this.d.q0();
    }
}
