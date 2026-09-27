package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class wga implements Closeable, Flushable {
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int a = 0;
    public int[] b = new int[32];
    public String[] c = new String[32];
    public int[] d = new int[32];
    public int i = -1;

    public abstract wga A(String str);

    public abstract wga D();

    public final int G() {
        int i = this.a;
        if (i != 0) {
            return this.b[i - 1];
        }
        dmk.n("JsonWriter is closed.");
        return 0;
    }

    public final void K(int i) {
        int[] iArr = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        iArr[i2] = i;
    }

    public void N(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.e = str;
    }

    public abstract wga R(double d);

    public abstract wga X(long j);

    public abstract wga Y(Float f);

    public abstract wga a0(String str);

    public abstract wga e();

    public abstract wga e0(boolean z);

    public abstract wga g();

    public final void o() {
        int i = this.a;
        int[] iArr = this.b;
        if (i != iArr.length) {
            return;
        }
        if (i != 256) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (this instanceof vga) {
                vga vgaVar = (vga) this;
                Object[] objArr = vgaVar.j;
                vgaVar.j = Arrays.copyOf(objArr, objArr.length * 2);
                return;
            }
            return;
        }
        throw new RuntimeException("Nesting too deep at " + z() + ": circular reference?");
    }

    public abstract wga p();

    public abstract wga y();

    public final String z() {
        return ozm.d(this.a, this.b, this.c, this.d);
    }
}
