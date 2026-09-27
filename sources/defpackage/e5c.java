package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class e5c extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5c(Context context, AttributeSet attributeSet, int i) {
        super(u8m.e(context, attributeSet, i, 0), attributeSet, i);
        Context context2 = getContext();
        if (uen.b(context2.getTheme(), R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = jlf.E;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
            int[] iArr2 = {1, 2};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = wen.c(context2, obtainStyledAttributes, iArr2[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, jlf.D);
                    Context context3 = getContext();
                    int[] iArr3 = {2, 4};
                    int i4 = -1;
                    for (int i5 = 0; i5 < 2 && i4 < 0; i5++) {
                        i4 = wen.c(context3, obtainStyledAttributes3, iArr3[i5], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i4 >= 0) {
                        setLineHeight(i4);
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (uen.b(context.getTheme(), R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, jlf.D);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = wen.c(context2, obtainStyledAttributes, iArr[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 >= 0) {
                setLineHeight(i2);
            }
        }
    }
}
