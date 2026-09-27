package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Paint;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c extends Lambda implements Function0 {
    public static final c i = new c(0, 0);
    public static final c j = new c(0, 1);
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            default:
                return new Paint();
        }
    }
}
