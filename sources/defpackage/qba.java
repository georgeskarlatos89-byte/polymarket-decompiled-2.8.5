package defpackage;

import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qba {
    public final JsReplyProxyBoundaryInterface a;

    public qba(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.a = jsReplyProxyBoundaryInterface;
    }

    public final void a(String str) {
        if (mik.g.a()) {
            this.a.postMessage(str);
            return;
        }
        throw mik.a();
    }
}
