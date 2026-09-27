package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ht0 {
    public final jr9 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public ht0(jr9 jr9Var) {
        this.a = jr9Var;
        it0 it0Var = it0.e;
        this.d = false;
    }

    public final void a() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        int i = 0;
        while (true) {
            jr9 jr9Var = this.a;
            if (i >= jr9Var.size()) {
                break;
            }
            kt0 kt0Var = (kt0) jr9Var.get(i);
            kt0Var.flush();
            if (kt0Var.isActive()) {
                arrayList.add(kt0Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((kt0) arrayList.get(i2)).a();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        if (this.d && ((kt0) this.b.get(b())).e() && !this.c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        boolean z2;
        for (boolean z3 = true; z3; z3 = z) {
            z = false;
            for (int i = 0; i <= b(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    kt0 kt0Var = (kt0) arrayList.get(i);
                    if (kt0Var.e()) {
                        if (!this.c[i].hasRemaining() && i < b()) {
                            ((kt0) arrayList.get(i + 1)).d();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.c[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = kt0.a;
                        }
                        long remaining = byteBuffer2.remaining();
                        kt0Var.b(byteBuffer2);
                        this.c[i] = kt0Var.a();
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        z |= z2;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht0)) {
            return false;
        }
        jr9 jr9Var = ((ht0) obj).a;
        jr9 jr9Var2 = this.a;
        if (jr9Var2.size() != jr9Var.size()) {
            return false;
        }
        for (int i = 0; i < jr9Var2.size(); i++) {
            if (jr9Var2.get(i) != jr9Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
