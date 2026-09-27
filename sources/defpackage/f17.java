package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class f17 implements km9 {
    public final Drawable a;

    public f17(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.km9
    public final boolean a() {
        return false;
    }

    @Override // defpackage.km9
    public final void b(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f17) && Intrinsics.areEqual(this.a, ((f17) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.km9
    public final int getHeight() {
        return i2k.a(this.a);
    }

    @Override // defpackage.km9
    public final long getSize() {
        Drawable drawable = this.a;
        long b = i2k.b(drawable) * 4 * i2k.a(drawable);
        if (b < 0) {
            return 0L;
        }
        return b;
    }

    @Override // defpackage.km9
    public final int getWidth() {
        return i2k.b(this.a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
