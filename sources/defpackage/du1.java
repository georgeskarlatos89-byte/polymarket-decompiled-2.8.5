package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class du1 {
    public final ArrayDeque a;

    public du1(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayDeque();
                return;
            default:
                this.a = new ArrayDeque(0);
                return;
        }
    }

    public synchronized void a(sv8 sv8Var) {
        sv8Var.b = null;
        sv8Var.c = null;
        this.a.offer(sv8Var);
    }
}
