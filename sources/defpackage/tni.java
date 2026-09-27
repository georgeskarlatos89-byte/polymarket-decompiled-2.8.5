package defpackage;

import java.io.Closeable;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class tni implements Closeable {
    public abstract void e(pq4 pq4Var, int i);

    public final void g(pq4 pq4Var, int i) {
        int i2;
        boolean z;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-1050066964);
        if (sr8Var.h(this)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i3 & 1, z)) {
            e(sr8Var, i3 & WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new zsg(this, i, 27);
        }
    }

    public abstract swh o();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
