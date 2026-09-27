package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class hci implements gci, Serializable {
    public final transient Object a = new Object();
    public final gci b;
    public volatile transient boolean c;
    public transient Object d;

    public hci(gci gciVar) {
        gciVar.getClass();
        this.b = gciVar;
    }

    @Override // defpackage.gci
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.c) {
            obj = ix2.o(new StringBuilder("<supplier that returned "), this.d, ">");
        } else {
            obj = this.b;
        }
        return ix2.o(sb, obj, ")");
    }
}
