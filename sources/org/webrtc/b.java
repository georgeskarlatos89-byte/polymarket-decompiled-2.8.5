package org.webrtc;

import org.webrtc.Camera1Session;
import org.webrtc.TextureBufferImpl;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Camera1Session.AnonymousClass2.a((Camera1Session.AnonymousClass2) obj2, (byte[]) obj);
                return;
            case 1:
                Camera1Session.AnonymousClass2.b((Camera1Session.AnonymousClass2) obj2, (byte[]) obj);
                return;
            default:
                TextureBufferImpl.a((TextureBufferImpl) obj2, (TextureBufferImpl.RefCountMonitor) obj);
                return;
        }
    }
}
