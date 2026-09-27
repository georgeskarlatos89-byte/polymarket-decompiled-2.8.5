package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tz7 extends lm0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tz7(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.e = i;
    }

    @Override // defpackage.oo5
    public final Class b() {
        switch (this.e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.lm0
    public final void f(Object obj) {
        switch (this.e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.lm0
    public final Object h(AssetManager assetManager, String str) {
        switch (this.e) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
