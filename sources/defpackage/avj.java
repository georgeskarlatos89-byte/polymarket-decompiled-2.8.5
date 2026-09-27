package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class avj extends RippleDrawable {
    public final boolean a;
    public ib4 b;
    public boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public avj(boolean z) {
        super(r0, null, r2);
        ColorDrawable colorDrawable;
        ColorStateList valueOf = ColorStateList.valueOf(-16777216);
        if (z) {
            colorDrawable = new ColorDrawable(-1);
        } else {
            colorDrawable = null;
        }
        this.a = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.a) {
            this.c = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.c = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.c;
    }
}
