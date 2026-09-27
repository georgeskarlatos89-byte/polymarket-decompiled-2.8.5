package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qrl {
    public static final qrl d = new qrl();
    public final Runnable a;
    public final Executor b;
    public qrl c;

    public qrl() {
        this.a = null;
        this.b = null;
    }

    public qrl(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
