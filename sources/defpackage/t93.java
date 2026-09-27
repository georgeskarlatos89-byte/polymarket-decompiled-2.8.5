package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t93 extends z8b {
    public final /* synthetic */ int q = 1;

    public /* synthetic */ t93(Context context) {
        super(context);
    }

    @Override // defpackage.z8b
    public int b(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.z8b
    public int c(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.z8b
    public float d(DisplayMetrics displayMetrics) {
        switch (this.q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.z8b
    public PointF f(int i) {
        switch (this.q) {
            case 0:
                return null;
            default:
                return super.f(i);
        }
    }

    public t93(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
