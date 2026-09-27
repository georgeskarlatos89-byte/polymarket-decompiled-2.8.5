package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class k6f {
    public int a;
    public ko0[] b;

    public final void a(ko0 ko0Var, int i) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            ko0 ko0Var2 = this.b[i2];
            ko0Var2.getClass();
            if (Intrinsics.e(0L, ko0Var.getTimeoutAt$okio() - ko0Var2.getTimeoutAt$okio()) <= 0) {
                break;
            }
            ko0Var2.index = i;
            this.b[i] = ko0Var2;
            i = i2;
        }
        this.b[i] = ko0Var;
        ko0Var.index = i;
    }

    public final void b(ko0 ko0Var) {
        ko0 ko0Var2;
        int i = ko0Var.index;
        if (i != -1) {
            int i2 = this.a;
            ko0 ko0Var3 = this.b[i2];
            ko0Var3.getClass();
            ko0Var.index = -1;
            this.b[i2] = null;
            this.a = i2 - 1;
            if (ko0Var == ko0Var3) {
                return;
            }
            int e = Intrinsics.e(0L, ko0Var3.getTimeoutAt$okio() - ko0Var.getTimeoutAt$okio());
            if (e == 0) {
                this.b[i] = ko0Var3;
                ko0Var3.index = i;
                return;
            }
            if (e < 0) {
                while (true) {
                    int i3 = i << 1;
                    int i4 = i3 + 1;
                    int i5 = this.a;
                    if (i4 <= i5) {
                        ko0Var2 = this.b[i3];
                        ko0Var2.getClass();
                        ko0 ko0Var4 = this.b[i4];
                        ko0Var4.getClass();
                        if (Intrinsics.e(0L, ko0Var4.getTimeoutAt$okio() - ko0Var2.getTimeoutAt$okio()) >= 0) {
                            ko0Var2 = ko0Var4;
                        }
                    } else {
                        if (i3 > i5) {
                            break;
                        }
                        ko0Var2 = this.b[i3];
                        ko0Var2.getClass();
                    }
                    if (Intrinsics.e(0L, ko0Var2.getTimeoutAt$okio() - ko0Var3.getTimeoutAt$okio()) <= 0) {
                        break;
                    }
                    int i6 = ko0Var2.index;
                    ko0Var2.index = i;
                    this.b[i] = ko0Var2;
                    i = i6;
                }
                this.b[i] = ko0Var3;
                ko0Var3.index = i;
                return;
            }
            a(ko0Var3, i);
            return;
        }
        dmk.v("Failed requirement.");
    }
}
