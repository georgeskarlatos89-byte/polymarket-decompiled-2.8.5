package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class z08 extends b3 {
    public final ArrayDeque c;
    public final /* synthetic */ b18 d;

    public z08(b18 b18Var) {
        this.d = b18Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        File file = b18Var.a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            file.getClass();
            arrayDeque.push(new a18(file));
        } else {
            this.a = 2;
        }
    }

    @Override // defpackage.b3
    public final void a() {
        File file;
        File a;
        while (true) {
            ArrayDeque arrayDeque = this.c;
            a18 a18Var = (a18) arrayDeque.peek();
            if (a18Var == null) {
                file = null;
                break;
            }
            a = a18Var.a();
            if (a == null) {
                arrayDeque.pop();
            } else if (Intrinsics.areEqual(a, a18Var.a) || !a.isDirectory() || arrayDeque.size() >= this.d.f) {
                break;
            } else {
                arrayDeque.push(b(a));
            }
        }
        file = a;
        if (file != null) {
            this.b = file;
            this.a = 1;
        } else {
            this.a = 2;
        }
    }

    public final u08 b(File file) {
        int i = y08.a[this.d.b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new v08(this, file);
            }
            dmk.a();
            return null;
        }
        return new x08(this, file);
    }
}
