package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class wzb {
    public int a;
    public int b;
    public int c;
    public Object d;

    public wzb() {
        if (qgj.b == null) {
            qgj.b = new qgj(2);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((xzb) this.d).h == this.c) {
            return;
        }
        f27.g();
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.a;
            xzb xzbVar = (xzb) this.d;
            if (i < xzbVar.f && xzbVar.c[i] < 0) {
                this.a = i + 1;
            } else {
                return;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            k9k.d(view);
            view.setTag(this.a, obj);
            k9k.f(view, this.c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        if (this.a < ((xzb) this.d).f) {
            return true;
        }
        return false;
    }

    public void remove() {
        xzb xzbVar = (xzb) this.d;
        b();
        if (this.b != -1) {
            xzbVar.c();
            xzbVar.k(this.b);
            this.b = -1;
            this.c = xzbVar.h;
            return;
        }
        dmk.n("Call next() before removing element from the iterator.");
    }
}
