package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ct8 {
    public final bt8 a;
    public final int[] b;

    public ct8(bt8 bt8Var, int[] iArr) {
        if (iArr.length != 0) {
            this.a = bt8Var;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.b = new int[]{0};
                    return;
                }
                int i2 = length - i;
                int[] iArr2 = new int[i2];
                this.b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i2);
                return;
            }
            this.b = iArr;
            return;
        }
        omf.a();
        throw null;
    }

    public final ct8 a(ct8 ct8Var) {
        bt8 bt8Var = ct8Var.a;
        bt8 bt8Var2 = this.a;
        if (bt8Var2.equals(bt8Var)) {
            if (c()) {
                return ct8Var;
            }
            if (ct8Var.c()) {
                return this;
            }
            int[] iArr = ct8Var.b;
            int[] iArr2 = this.b;
            if (iArr2.length > iArr.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = iArr2[i - length] ^ iArr[i];
            }
            return new ct8(bt8Var2, iArr3);
        }
        dmk.v("GenericGFPolys do not have same GenericGF field");
        return null;
    }

    public final int b() {
        return this.b.length - 1;
    }

    public final boolean c() {
        if (this.b[0] != 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        if (c()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b = b(); b >= 0; b--) {
            int[] iArr = this.b;
            int i = iArr[(iArr.length - 1) - b];
            if (i != 0) {
                if (i < 0) {
                    if (b == b()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || i != 1) {
                    bt8 bt8Var = this.a;
                    if (i != 0) {
                        int i2 = bt8Var.b[i];
                        if (i2 == 0) {
                            sb.append('1');
                        } else if (i2 == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i2);
                        }
                    } else {
                        bt8Var.getClass();
                        omf.a();
                        return null;
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
