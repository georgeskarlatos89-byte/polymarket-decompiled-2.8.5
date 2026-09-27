package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gf1 extends iq9 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf1(ImageView imageView, int i) {
        super(imageView);
        this.a = i;
    }

    @Override // defpackage.iq9
    public final void setResource(Object obj) {
        switch (this.a) {
            case 0:
                ((ImageView) this.view).setImageBitmap((Bitmap) obj);
                return;
            default:
                ((ImageView) this.view).setImageDrawable((Drawable) obj);
                return;
        }
    }
}
