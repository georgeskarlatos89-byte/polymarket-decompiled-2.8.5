package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Arrays;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xkd extends aln {
    public int b;
    public int d;
    public int f;
    public i78[] a = new i78[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    public final void d() {
        this.b = 0;
        this.d = 0;
        Arrays.fill(this.e, 0, this.f, (Object) null);
        this.f = 0;
    }

    public final void e(qj0 qj0Var, iah iahVar, cd6 cd6Var, vkd vkdVar) {
        if (this.b != 0) {
            gg1 gg1Var = new gg1(this, 6);
            xkd xkdVar = (xkd) gg1Var.e;
            while (true) {
                i78 i78Var = xkdVar.a[gg1Var.b];
                nr8 f = i78Var.f(gg1Var);
                qj0 qj0Var2 = qj0Var;
                iah iahVar2 = iahVar;
                cd6 cd6Var2 = cd6Var;
                vkd vkdVar2 = vkdVar;
                try {
                    i78Var.d(gg1Var, qj0Var2, iahVar2, cd6Var2, vkdVar2);
                    int i = gg1Var.b;
                    int i2 = xkdVar.b;
                    if (i < i2) {
                        i78 i78Var2 = xkdVar.a[i];
                        gg1Var.c += i78Var2.b;
                        gg1Var.d += i78Var2.c;
                        int i3 = i + 1;
                        gg1Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        qj0Var = qj0Var2;
                        iahVar = iahVar2;
                        cd6Var = cd6Var2;
                        vkdVar = vkdVar2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        d();
    }

    public final boolean f() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final void g(i78 i78Var) {
        int i;
        int i2;
        int i3 = this.b;
        i78[] i78VarArr = this.a;
        int length = i78VarArr.length;
        int i4 = Barcode.FORMAT_UPC_E;
        if (i3 == length) {
            if (i3 > 1024) {
                i2 = 1024;
            } else {
                i2 = i3;
            }
            i78[] i78VarArr2 = new i78[i2 + i3];
            System.arraycopy(i78VarArr, 0, i78VarArr2, 0, i3);
            this.a = i78VarArr2;
        }
        int i5 = this.d;
        int i6 = i78Var.b;
        int i7 = i78Var.c;
        int i8 = i5 + i6;
        int[] iArr = this.c;
        int length2 = iArr.length;
        if (i8 > length2) {
            if (length2 > 1024) {
                i = 1024;
            } else {
                i = length2;
            }
            int i9 = i + length2;
            if (i9 >= i8) {
                i8 = i9;
            }
            int[] iArr2 = new int[i8];
            ArraysKt.k(0, 0, length2, iArr, iArr2);
            this.c = iArr2;
        }
        int i10 = this.f + i7;
        Object[] objArr = this.e;
        int length3 = objArr.length;
        if (i10 > length3) {
            if (length3 <= 1024) {
                i4 = length3;
            }
            int i11 = i4 + length3;
            if (i11 >= i10) {
                i10 = i11;
            }
            Object[] objArr2 = new Object[i10];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.e = objArr2;
        }
        i78[] i78VarArr3 = this.a;
        int i12 = this.b;
        this.b = i12 + 1;
        i78VarArr3[i12] = i78Var;
        this.d += i78Var.b;
        this.f += i7;
    }
}
