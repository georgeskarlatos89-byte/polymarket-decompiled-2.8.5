package defpackage;

import android.graphics.ImageDecoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class zs3 implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ int a;

    public /* synthetic */ zs3(int i) {
        this.a = i;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        switch (this.a) {
            case 0:
                imageDecoder.getClass();
                imageInfo.getClass();
                source.getClass();
                imageDecoder.setAllocator(1);
                imageDecoder.setMutableRequired(false);
                int max = Math.max(imageInfo.getSize().getWidth(), imageInfo.getSize().getHeight());
                if (max > 2048) {
                    float f = 2048.0f / max;
                    imageDecoder.setTargetSize(Math.max(1, i5c.e(imageInfo.getSize().getWidth() * f)), Math.max(1, i5c.e(imageInfo.getSize().getHeight() * f)));
                    return;
                }
                return;
            case 1:
                imageDecoder.setAllocator(1);
                imageDecoder.setMutableRequired(false);
                int max2 = Math.max(imageInfo.getSize().getWidth(), imageInfo.getSize().getHeight());
                if (max2 > 2048) {
                    imageDecoder.setTargetSampleSize(Math.max(1, max2 / 2048));
                    return;
                }
                return;
            default:
                imageDecoder.setAllocator(1);
                imageDecoder.setMutableRequired(true);
                return;
        }
    }
}
