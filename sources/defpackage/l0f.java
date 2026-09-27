package defpackage;

import java.io.InputStream;
import kotlin.text.Regex;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class l0f {
    public int a;
    public int b;
    public Object c;

    public l0f(int i, int i2, Regex regex) {
        this.a = i;
        this.b = i2;
        this.c = regex;
    }

    public static l0f h(InputStream inputStream, int i) {
        if (i > 0) {
            if (inputStream == null) {
                j7l j7lVar = new j7l(l8l.a);
                try {
                    j7lVar.a(0);
                    return j7lVar;
                } catch (p8l e) {
                    xbc.s(e);
                    return null;
                }
            }
            return new k7l(inputStream, i);
        }
        dmk.v("bufferSize must be > 0");
        return null;
    }

    public static int j(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long k(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract int a(int i);

    public abstract void b(int i);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract int f(byte[] bArr, int i, int i2);

    public abstract void g(int i);

    public void i() {
        int l;
        do {
            l = l();
            if (l != 0) {
                int i = this.a;
                int i2 = this.b;
                if (i + i2 < 100) {
                    this.b = i2 + 1;
                    this.b--;
                } else {
                    t4n.a("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    return;
                }
            } else {
                return;
            }
        } while (n(l));
    }

    public abstract int l();

    public abstract void m(int i);

    public abstract boolean n(int i);

    public abstract double o();

    public abstract float p();

    public abstract long q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract boolean v();

    public abstract String w();

    public abstract String x();

    public abstract h7l y();

    public abstract byte[] z();
}
