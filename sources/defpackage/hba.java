package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.JavaI420Buffer;
import org.webrtc.YuvConverter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class hba implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ hba(ByteBuffer byteBuffer, int i) {
        this.a = i;
        this.b = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ByteBuffer byteBuffer = this.b;
        switch (i) {
            case 0:
                JavaI420Buffer.a(byteBuffer);
                return;
            default:
                YuvConverter.a(byteBuffer);
                return;
        }
    }
}
