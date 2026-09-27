package defpackage;

import android.util.FloatProperty;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class lg8 extends FloatProperty {
    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((FocusRingDrawable) obj).k);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f) {
        FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
        focusRingDrawable.k = f;
        focusRingDrawable.invalidateSelf();
    }
}
