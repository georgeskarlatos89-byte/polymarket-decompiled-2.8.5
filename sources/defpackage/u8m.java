package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.Layout;
import android.util.AttributeSet;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.interfaces.uicustomisation.font.FontStyle;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class u8m {
    public static final int[] a = {R.attr.theme, com.polymarket.android.R.attr.theme};
    public static final int[] b = {com.polymarket.android.R.attr.materialThemeOverlay};

    public static final float a(Layout layout, int i, Paint paint) {
        int i2;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = bxi.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null) {
            i2 = -1;
        } else {
            i2 = jt9.a[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float b(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = bxi.a;
        if (layout.getEllipsisCount(i) > 0) {
            int i2 = -1;
            if (layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
                float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
                if (paragraphAlignment != null) {
                    i2 = jt9.a[paragraphAlignment.ordinal()];
                }
                if (i2 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = (layout.getWidth() - measureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = layout.getWidth() - measureText;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static final xxi c(wxi wxiVar, boolean z) {
        long c;
        int i;
        oh8 oh8Var;
        u3g u3gVar;
        qi8 qi8Var;
        long j;
        long j2;
        wxiVar.getClass();
        long j3 = f9m.j(wxiVar.a);
        if (z) {
            c = ib4.m;
        } else {
            c = hpn.c(wxiVar.e);
        }
        long j4 = c;
        int i2 = nqi.a[wxiVar.f.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i = 3;
            if (i2 != 2) {
                if (i2 == 3) {
                    i = 6;
                } else {
                    dmk.a();
                    return null;
                }
            }
        } else {
            i = 5;
        }
        int i4 = i;
        FontFamily fontFamily = wxiVar.b;
        FontFamily.Default r8 = FontFamily.Default.INSTANCE;
        oh8 oh8Var2 = oh8.a;
        oh8 oh8Var3 = (nii) d1c.e(new Pair(r8, oh8Var2), new Pair(FontFamily.Serif.INSTANCE, oh8.c), new Pair(FontFamily.SansSerif.INSTANCE, oh8.b), new Pair(FontFamily.Monospace.INSTANCE, oh8.d), new Pair(FontFamily.Cursive.INSTANCE, oh8.e)).get(fontFamily);
        if (oh8Var3 != null) {
            oh8Var = oh8Var3;
        } else {
            if (fontFamily instanceof FontFamily.Custom) {
                FontFamily.Custom custom = (FontFamily.Custom) fontFamily;
                Integer valueOf = Integer.valueOf(custom.getNormalFont());
                qi8 qi8Var2 = qi8.g;
                u3g a2 = ool.a(valueOf, qi8Var2);
                Integer normalItalicFont = custom.getNormalItalicFont();
                if (normalItalicFont != null) {
                    u3gVar = tol.a(normalItalicFont.intValue(), qi8Var2, 1, 8);
                } else {
                    u3gVar = null;
                }
                oh8Var2 = new sh8(CollectionsKt.U(a2, u3gVar, ool.a(custom.getLightFont(), qi8.f), ool.a(custom.getMediumFont(), qi8.h), ool.a(custom.getSemiBold(), qi8.i), ool.a(custom.getBoldFont(), qi8.j), ool.a(custom.getExtraBoldFont(), qi8.k)));
            }
            oh8Var = oh8Var2;
        }
        if (wxiVar.c == FontStyle.Normal) {
            i3 = 0;
        }
        switch (si8.a[wxiVar.d.ordinal()]) {
            case 1:
                qi8Var = qi8.f;
                break;
            case 2:
                qi8Var = qi8.g;
                break;
            case 3:
                qi8Var = qi8.h;
                break;
            case 4:
                qi8Var = qi8.i;
                break;
            case 5:
                qi8Var = qi8.j;
                break;
            case 6:
                qi8Var = qi8.k;
                break;
            default:
                dmk.a();
                return null;
        }
        Integer num = wxiVar.g;
        if (num != null) {
            j = f9m.j(num.intValue());
        } else {
            j = cyi.c;
        }
        long j5 = j;
        Integer num2 = wxiVar.h;
        if (num2 != null) {
            j2 = f9m.j(num2.intValue());
        } else {
            j2 = cyi.c;
        }
        return new xxi(j4, j3, qi8Var, new li8(i3), oh8Var, null, j2, 0L, null, null, i4, j5, f8b.c, 14516048);
    }

    public static Context d(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i3 = iArr2[0];
        if ((context instanceof k55) && ((k55) context).a == i3) {
            z = true;
        } else {
            z = false;
        }
        if (i3 != 0 && !z) {
            k55 k55Var = new k55(context, i3);
            int length = iArr.length;
            int[] iArr3 = new int[length];
            if (iArr.length > 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    iArr3[i4] = obtainStyledAttributes2.getResourceId(i4, 0);
                }
                obtainStyledAttributes2.recycle();
            }
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = iArr3[i5];
                if (i6 != 0) {
                    k55Var.getTheme().applyStyle(i6, true);
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, a);
            int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
            obtainStyledAttributes3.recycle();
            if (resourceId == 0) {
                resourceId = resourceId2;
            }
            if (resourceId != 0) {
                k55Var.getTheme().applyStyle(resourceId, true);
            }
            return k55Var;
        }
        return context;
    }

    public static Context e(Context context, AttributeSet attributeSet, int i, int i2) {
        return d(i, i2, context, attributeSet, new int[0]);
    }
}
