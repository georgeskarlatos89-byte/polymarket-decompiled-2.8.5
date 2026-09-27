package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w96 implements ImageDecoder.OnHeaderDecodedListener {
    public final g49 a = g49.a();
    public final int b;
    public final int c;
    public final dx5 d;
    public final by6 e;
    public final boolean f;
    public final k2f g;

    public w96(int i, int i2, ild ildVar) {
        boolean z;
        this.b = i;
        this.c = i2;
        this.d = (dx5) ildVar.a(ey6.f);
        this.e = (by6) ildVar.a(by6.g);
        cld cldVar = ey6.i;
        if (ildVar.a(cldVar) != null && ((Boolean) ildVar.a(cldVar)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.g = (k2f) ildVar.a(ey6.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.graphics.ImageDecoder$OnPartialImageListener, java.lang.Object] */
    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        g49 g49Var = this.a;
        int i = this.b;
        int i2 = this.c;
        if (g49Var.b(i, i2, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == dx5.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new Object());
        Size size = imageInfo.getSize();
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.e.b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * b);
        int round2 = Math.round(b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        k2f k2fVar = this.g;
        if (k2fVar != null) {
            if (k2fVar == k2f.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else {
                named = ColorSpace.Named.SRGB;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }
}
