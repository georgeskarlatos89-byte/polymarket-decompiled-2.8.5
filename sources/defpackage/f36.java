package defpackage;

import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f36 {
    public final h36 a;
    public final al7 b;
    public final Semaphore c;

    public f36(h36 h36Var, al7 al7Var, boolean z) {
        Semaphore semaphore;
        this.a = h36Var;
        this.b = al7Var;
        if (z) {
            semaphore = new Semaphore(0);
        } else {
            semaphore = null;
        }
        this.c = semaphore;
    }
}
