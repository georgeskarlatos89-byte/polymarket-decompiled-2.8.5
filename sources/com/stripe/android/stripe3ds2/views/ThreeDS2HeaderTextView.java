package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import defpackage.h8i;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "3ds2sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThreeDS2HeaderTextView extends ThreeDS2TextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
    }

    @Override // com.stripe.android.stripe3ds2.views.ThreeDS2TextView
    public final void d(String str, h8i h8iVar) {
        setText(str);
        if (h8iVar != null) {
            String str2 = h8iVar.d;
            if (str2 != null) {
                setTextColor(Color.parseColor(str2));
            }
            Integer valueOf = Integer.valueOf(h8iVar.f);
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                setTextSize(2, valueOf.intValue());
            }
            String str3 = h8iVar.e;
            if (str3 != null) {
                setTypeface(Typeface.create(str3, 0));
            }
        }
    }
}
