package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a70 implements q9k {
    public final ViewConfiguration a;

    public a70(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.q9k
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.q9k
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.q9k
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return b30.b(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.q9k
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.q9k
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.q9k
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return b30.u(this.a);
        }
        return 16.0f;
    }
}
