package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rzm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0n b;

    public rzm(q0n q0nVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(q0nVar);
                this.b = q0nVar;
                return;
            default:
                Objects.requireNonNull(q0nVar);
                this.b = q0nVar;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        q0n q0nVar = this.b;
        switch (i) {
            case 0:
                q0nVar.e = q0nVar.j;
                return;
            default:
                q0nVar.j = null;
                return;
        }
    }
}
