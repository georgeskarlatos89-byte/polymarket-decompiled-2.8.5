package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class au1 implements k3g {
    public final /* synthetic */ int a;
    public final ff1 b;

    public au1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ff1();
                return;
            default:
                this.b = new ff1();
                return;
        }
    }

    @Override // defpackage.k3g
    public final boolean a(Object obj, ild ildVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // defpackage.k3g
    public final h3g b(Object obj, int i, int i2, ild ildVar) {
        int i3 = this.a;
        ff1 ff1Var = this.b;
        switch (i3) {
            case 0:
                return ff1Var.c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, ildVar);
            default:
                return ff1Var.c(ImageDecoder.createSource(hu1.b((InputStream) obj)), i, i2, ildVar);
        }
    }
}
