package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class w3c {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public m21 f;

    public w3c(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = uen.c(context, R.attr.motionDurationMedium2, 300);
        this.d = uen.c(context, R.attr.motionDurationShort3, 150);
        this.e = uen.c(context, R.attr.motionDurationShort2, 100);
    }
}
