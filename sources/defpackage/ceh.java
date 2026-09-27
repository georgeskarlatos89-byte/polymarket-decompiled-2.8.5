package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ceh implements Comparable {
    public boolean a;
    public float e;
    public beh i;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public jl0[] j = new jl0[16];
    public int k = 0;
    public int l = 0;

    public ceh(beh behVar) {
        this.i = behVar;
    }

    public final void a(jl0 jl0Var) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            jl0[] jl0VarArr = this.j;
            if (i < i2) {
                if (jl0VarArr[i] == jl0Var) {
                    return;
                } else {
                    i++;
                }
            } else {
                if (i2 >= jl0VarArr.length) {
                    jl0VarArr = (jl0[]) Arrays.copyOf(jl0VarArr, jl0VarArr.length * 2);
                    this.j = jl0VarArr;
                }
                int i3 = this.k;
                jl0VarArr[i3] = jl0Var;
                this.k = i3 + 1;
                return;
            }
        }
    }

    public final void b(jl0 jl0Var) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == jl0Var) {
                while (i2 < i - 1) {
                    jl0[] jl0VarArr = this.j;
                    int i3 = i2 + 1;
                    jl0VarArr[i2] = jl0VarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.i = beh.UNKNOWN;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((ceh) obj).b;
    }

    public final void d(a9b a9bVar, float f) {
        this.e = f;
        this.f = true;
        int i = this.k;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].h(a9bVar, this, false);
        }
        this.k = 0;
    }

    public final void e(a9b a9bVar, jl0 jl0Var) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].i(a9bVar, jl0Var, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
