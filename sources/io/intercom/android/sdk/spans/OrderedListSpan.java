package io.intercom.android.sdk.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.woa;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class OrderedListSpan implements LeadingMarginSpan {
    private final int gapWidth;
    private final String number;

    public OrderedListSpan(int i, String str) {
        this.gapWidth = i;
        this.number = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            float f = i;
            if (i2 == -1) {
                f -= paint.measureText(this.number);
            }
            canvas.drawText(woa.r(new StringBuilder(), this.number, ApiConstant.SPACE), f, i4, paint);
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return (int) (new Paint().measureText(this.number) + this.gapWidth);
    }
}
