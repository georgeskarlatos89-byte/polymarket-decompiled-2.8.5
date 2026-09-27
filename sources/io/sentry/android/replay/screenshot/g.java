package io.sentry.android.replay.screenshot;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g extends Lambda implements Function0 {
    public static final g h = new Lambda(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        return paint;
    }
}
