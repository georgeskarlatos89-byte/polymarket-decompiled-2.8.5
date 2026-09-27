package defpackage;

import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kj4 extends CompletableFuture {
    public final chd a;

    public kj4(chd chdVar) {
        this.a = chdVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.a.cancel();
        }
        return super.cancel(z);
    }
}
