package defpackage;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sv8 {
    public ByteBuffer b;
    public rv8 c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final boolean a() {
        if (this.c.b != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, mv8] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object, mv8] */
    public final rv8 b() {
        boolean z;
        boolean z2;
        boolean z3;
        byte[] bArr;
        boolean z4;
        if (this.b != null) {
            if (a()) {
                return this.c;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append((char) c());
            }
            boolean startsWith = sb.toString().startsWith("GIF");
            rv8 rv8Var = this.c;
            if (!startsWith) {
                rv8Var.b = 1;
            } else {
                rv8Var.f = this.b.getShort();
                this.c.g = this.b.getShort();
                int c = c();
                rv8 rv8Var2 = this.c;
                if ((c & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                rv8Var2.h = z;
                rv8Var2.i = (int) Math.pow(2.0d, (c & 7) + 1);
                this.c.j = c();
                rv8 rv8Var3 = this.c;
                c();
                rv8Var3.getClass();
                if (this.c.h && !a()) {
                    rv8 rv8Var4 = this.c;
                    rv8Var4.a = e(rv8Var4.i);
                    rv8 rv8Var5 = this.c;
                    rv8Var5.k = rv8Var5.a[rv8Var5.j];
                }
            }
            if (!a()) {
                boolean z5 = false;
                while (!z5 && !a() && this.c.c <= Integer.MAX_VALUE) {
                    int c2 = c();
                    if (c2 != 33) {
                        if (c2 != 44) {
                            if (c2 != 59) {
                                this.c.b = 1;
                            } else {
                                z5 = true;
                            }
                        } else {
                            rv8 rv8Var6 = this.c;
                            mv8 mv8Var = rv8Var6.d;
                            mv8 mv8Var2 = mv8Var;
                            if (mv8Var == null) {
                                ?? obj = new Object();
                                rv8Var6.d = obj;
                                mv8Var2 = obj;
                            }
                            mv8Var2.a = this.b.getShort();
                            this.c.d.b = this.b.getShort();
                            this.c.d.c = this.b.getShort();
                            this.c.d.d = this.b.getShort();
                            int c3 = c();
                            if ((c3 & 128) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c3 & 7) + 1);
                            mv8 mv8Var3 = this.c.d;
                            if ((c3 & 64) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            mv8Var3.e = z3;
                            if (z2) {
                                mv8Var3.k = e(pow);
                            } else {
                                mv8Var3.k = null;
                            }
                            this.c.d.j = this.b.position();
                            c();
                            f();
                            if (!a()) {
                                rv8 rv8Var7 = this.c;
                                rv8Var7.c++;
                                rv8Var7.e.add(rv8Var7.d);
                            }
                        }
                    } else {
                        int c4 = c();
                        if (c4 != 1) {
                            if (c4 != 249) {
                                if (c4 != 254) {
                                    if (c4 != 255) {
                                        f();
                                    } else {
                                        d();
                                        StringBuilder sb2 = new StringBuilder();
                                        int i2 = 0;
                                        while (true) {
                                            bArr = this.a;
                                            if (i2 >= 11) {
                                                break;
                                            }
                                            sb2.append((char) bArr[i2]);
                                            i2++;
                                        }
                                        if (sb2.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                d();
                                                if (bArr[0] == 1) {
                                                    byte b = bArr[1];
                                                    byte b2 = bArr[2];
                                                    this.c.getClass();
                                                }
                                                if (this.d > 0) {
                                                }
                                            } while (!a());
                                        } else {
                                            f();
                                        }
                                    }
                                } else {
                                    f();
                                }
                            } else {
                                this.c.d = new Object();
                                c();
                                int c5 = c();
                                mv8 mv8Var4 = this.c.d;
                                int i3 = (c5 & 28) >> 2;
                                mv8Var4.g = i3;
                                if (i3 == 0) {
                                    mv8Var4.g = 1;
                                }
                                if ((c5 & 1) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                mv8Var4.f = z4;
                                short s = this.b.getShort();
                                if (s < 2) {
                                    s = 10;
                                }
                                mv8 mv8Var5 = this.c.d;
                                mv8Var5.i = s * 10;
                                mv8Var5.h = c();
                                c();
                            }
                        } else {
                            f();
                        }
                    }
                }
                rv8 rv8Var8 = this.c;
                if (rv8Var8.c < 0) {
                    rv8Var8.b = 1;
                }
            }
            return this.c;
        }
        dmk.n("You must call setData() before parseHeader()");
        return null;
    }

    public final int c() {
        try {
            return this.b.get() & MessagePack.Code.EXT_TIMESTAMP;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int c = c();
        this.d = c;
        if (c > 0) {
            int i = 0;
            while (true) {
                try {
                    int i2 = this.d;
                    if (i < i2) {
                        int i3 = i2 - i;
                        this.b.get(this.a, i, i3);
                        i += i3;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    Log.isLoggable("GifHeaderParser", 3);
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & MessagePack.Code.EXT_TIMESTAMP;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & MessagePack.Code.EXT_TIMESTAMP;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & MessagePack.Code.EXT_TIMESTAMP);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.c.b = 1;
            return iArr;
        }
    }

    public final void f() {
        int c;
        do {
            c = c();
            this.b.position(Math.min(this.b.position() + c, this.b.limit()));
        } while (c > 0);
    }
}
