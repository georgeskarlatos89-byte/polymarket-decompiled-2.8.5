package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q2k implements Cloneable {
    public static final asb h = csb.b(q2k.class);
    public static final q2k i;
    public static final int j;
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public volatile byte[] g;

    static {
        q2k q2kVar = new q2k(new byte[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new byte[]{0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        i = q2kVar;
        j = q2kVar.b().length;
    }

    public q2k(byte[] bArr) {
        byte[] bArr2 = new byte[256];
        this.a = bArr2;
        byte[] bArr3 = new byte[256];
        this.b = bArr3;
        byte[] bArr4 = new byte[256];
        this.c = bArr4;
        byte[] bArr5 = new byte[256];
        this.d = bArr5;
        byte[] bArr6 = new byte[256];
        this.e = bArr6;
        byte[] bArr7 = new byte[256];
        this.f = bArr7;
        this.g = null;
        if (bArr.length == bArr2.length + bArr3.length + bArr4.length + bArr5.length + bArr6.length + bArr7.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int length = bArr2.length;
            System.arraycopy(bArr, length, bArr3, 0, bArr3.length);
            int length2 = length + bArr3.length;
            System.arraycopy(bArr, length2, bArr4, 0, bArr4.length);
            int length3 = length2 + bArr4.length;
            System.arraycopy(bArr, length3, bArr5, 0, bArr5.length);
            int length4 = length3 + bArr5.length;
            System.arraycopy(bArr, length4, bArr6, 0, bArr6.length);
            System.arraycopy(bArr, length4 + bArr6.length, bArr7, 0, bArr7.length);
            return;
        }
        omf.a();
        throw null;
    }

    public static boolean a(int i2, short s, short s2, short s3, short s4, String str) {
        boolean z;
        asb asbVar = h;
        if (s <= 3 && s >= 0) {
            z = true;
        } else {
            asbVar.d("VCDiff: Bad code table; opcode {} has invalid {} instruction type {}", Integer.valueOf(i2), str, Short.valueOf(s));
            z = false;
        }
        if (s3 > s4 || s3 < 0) {
            asbVar.d("VCDiff: Bad code table; opcode {} has invalid {} mode {}", Integer.valueOf(i2), str, Short.valueOf(s3));
            z = false;
        }
        if (s == 0 && s2 != 0) {
            asbVar.d("VCDiff: Bad code table; opcode {} has {} instruction NOOP with nonzero size {}", Integer.valueOf(i2), str, Short.valueOf(s2));
            z = false;
        }
        if (s2 < 0) {
            asbVar.d("VCDiff: Bad code table; opcode {} has {} instruction with size less than zero {}", Integer.valueOf(i2), str, Short.valueOf(s2));
            z = false;
        }
        if (s != 3 && s3 != 0) {
            asbVar.d("VCDiff: Bad code table; opcode {} has non-COPY {} instruction with nonzero mode {}", Integer.valueOf(i2), str, Short.valueOf(s3));
            return false;
        }
        return z;
    }

    public final byte[] b() {
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        this.g = new byte[this.a.length + this.b.length + this.c.length + this.d.length + this.e.length + this.f.length];
                        System.arraycopy(this.a, 0, this.g, 0, this.a.length);
                        int length = this.a.length;
                        System.arraycopy(this.b, 0, this.g, length, this.b.length);
                        int length2 = length + this.b.length;
                        System.arraycopy(this.c, 0, this.g, length2, this.c.length);
                        int length3 = length2 + this.c.length;
                        System.arraycopy(this.d, 0, this.g, length3, this.d.length);
                        int length4 = length3 + this.d.length;
                        System.arraycopy(this.e, 0, this.g, length4, this.e.length);
                        System.arraycopy(this.f, 0, this.g, length4 + this.e.length, this.f.length);
                    }
                } finally {
                }
            }
        }
        return this.g;
    }

    public final Object clone() {
        return new q2k(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public q2k() {
        this.a = new byte[256];
        this.b = new byte[256];
        this.c = new byte[256];
        this.d = new byte[256];
        this.e = new byte[256];
        this.f = new byte[256];
        this.g = null;
    }

    public q2k(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        byte[] bArr7 = new byte[256];
        this.a = bArr7;
        byte[] bArr8 = new byte[256];
        this.b = bArr8;
        byte[] bArr9 = new byte[256];
        this.c = bArr9;
        byte[] bArr10 = new byte[256];
        this.d = bArr10;
        byte[] bArr11 = new byte[256];
        this.e = bArr11;
        byte[] bArr12 = new byte[256];
        this.f = bArr12;
        this.g = null;
        if (bArr.length == 256 && bArr2.length == 256 && bArr3.length == 256 && bArr4.length == 256 && bArr5.length == 256 && bArr6.length == 256) {
            System.arraycopy(bArr, 0, bArr7, 0, 256);
            System.arraycopy(bArr2, 0, bArr8, 0, 256);
            System.arraycopy(bArr3, 0, bArr9, 0, 256);
            System.arraycopy(bArr4, 0, bArr10, 0, 256);
            System.arraycopy(bArr5, 0, bArr11, 0, 256);
            System.arraycopy(bArr6, 0, bArr12, 0, 256);
            return;
        }
        omf.a();
        throw null;
    }
}
