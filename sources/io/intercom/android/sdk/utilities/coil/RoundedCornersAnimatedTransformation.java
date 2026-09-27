package io.intercom.android.sdk.utilities.coil;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import defpackage.ume;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/utilities/coil/RoundedCornersAnimatedTransformation;", "", "radius", "<init>", "(F)V", "Landroid/graphics/Canvas;", "canvas", "Lume;", "transform", "(Landroid/graphics/Canvas;)Lume;", "F", "getRadius", "()F", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoundedCornersAnimatedTransformation {
    public static final int $stable = 0;
    private final float radius;

    public RoundedCornersAnimatedTransformation(float f) {
        this.radius = f;
    }

    public final float getRadius() {
        return this.radius;
    }

    public ume transform(Canvas canvas) {
        canvas.getClass();
        Paint paint = new Paint(3);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        float f = this.radius;
        path.addRoundRect(0.0f, 0.0f, width, height, f, f, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return ume.TRANSLUCENT;
    }
}
