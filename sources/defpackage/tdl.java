package defpackage;

import android.os.SystemClock;
import android.text.TextPaint;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tdl {
    public final /* synthetic */ int a;

    public /* synthetic */ tdl(int i) {
        this.a = i;
    }

    public static final void a(TextPaint textPaint, float f) {
        if (!Float.isNaN(f)) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            textPaint.setAlpha(Math.round(f * 255.0f));
        }
    }

    public final long b() {
        switch (this.a) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
