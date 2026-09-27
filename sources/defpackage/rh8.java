package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rh8 extends MetricAffectingSpan {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rh8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                return;
            default:
                textPaint.setTypeface((Typeface) obj);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                return;
            default:
                textPaint.setTypeface((Typeface) obj);
                return;
        }
    }
}
