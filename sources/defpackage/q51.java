package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.polymarket.android.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class q51 {
    public final p51 a;
    public final p51 b = new p51();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public q51(Context context) {
        AttributeSet attributeSet;
        int i;
        boolean z;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int i2;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        int intValue15;
        int intValue16;
        boolean booleanValue;
        int next;
        p51 p51Var = new p51();
        int i3 = p51Var.a;
        if (i3 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i3);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), MetricTracker.Object.BADGE)) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        attributeSet = asAttributeSet;
                        i = asAttributeSet.getStyleAttribute();
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) MetricTracker.Object.BADGE) + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i3));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray d = o2n.d(context, attributeSet, jlf.c, R.attr.badgeStyle, i == 0 ? R.style.Widget_MaterialComponents_Badge : i, new int[0]);
        Resources resources = context.getResources();
        this.c = d.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = d.getDimensionPixelSize(15, -1);
        this.e = d.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = d.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = d.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.h = d.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = d.getInt(25, 1);
        this.l = d.getInt(2, 0);
        p51 p51Var2 = this.b;
        int i4 = p51Var.i;
        p51Var2.i = i4 == -2 ? 255 : i4;
        int i5 = p51Var.k;
        if (i5 != -2) {
            p51Var2.k = i5;
        } else {
            boolean hasValue = d.hasValue(24);
            p51 p51Var3 = this.b;
            if (hasValue) {
                p51Var3.k = d.getInt(24, 0);
            } else {
                p51Var3.k = -1;
            }
        }
        String str = p51Var.j;
        if (str != null) {
            this.b.j = str;
        } else if (d.hasValue(8)) {
            this.b.j = d.getString(8);
        }
        p51 p51Var4 = this.b;
        p51Var4.o = p51Var.o;
        CharSequence charSequence = p51Var.p;
        p51Var4.p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        p51 p51Var5 = this.b;
        int i6 = p51Var.q;
        p51Var5.q = i6 == 0 ? R.plurals.mtrl_badge_content_description : i6;
        int i7 = p51Var.r;
        p51Var5.r = i7 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i7;
        Boolean bool = p51Var.t;
        if (bool != null && !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        p51Var5.t = Boolean.valueOf(z);
        p51 p51Var6 = this.b;
        int i8 = p51Var.l;
        p51Var6.l = i8 == -2 ? d.getInt(22, -2) : i8;
        p51 p51Var7 = this.b;
        int i9 = p51Var.m;
        p51Var7.m = i9 == -2 ? d.getInt(23, -2) : i9;
        p51 p51Var8 = this.b;
        Integer num = p51Var.e;
        if (num == null) {
            intValue = d.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue = num.intValue();
        }
        p51Var8.e = Integer.valueOf(intValue);
        p51 p51Var9 = this.b;
        Integer num2 = p51Var.f;
        if (num2 == null) {
            intValue2 = d.getResourceId(7, 0);
        } else {
            intValue2 = num2.intValue();
        }
        p51Var9.f = Integer.valueOf(intValue2);
        p51 p51Var10 = this.b;
        Integer num3 = p51Var.g;
        if (num3 == null) {
            intValue3 = d.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue3 = num3.intValue();
        }
        p51Var10.g = Integer.valueOf(intValue3);
        p51 p51Var11 = this.b;
        Integer num4 = p51Var.h;
        if (num4 == null) {
            intValue4 = d.getResourceId(17, 0);
        } else {
            intValue4 = num4.intValue();
        }
        p51Var11.h = Integer.valueOf(intValue4);
        p51 p51Var12 = this.b;
        Integer num5 = p51Var.b;
        if (num5 == null) {
            intValue5 = wen.b(context, d, 1).getDefaultColor();
        } else {
            intValue5 = num5.intValue();
        }
        p51Var12.b = Integer.valueOf(intValue5);
        p51 p51Var13 = this.b;
        Integer num6 = p51Var.d;
        if (num6 == null) {
            intValue6 = d.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge);
        } else {
            intValue6 = num6.intValue();
        }
        p51Var13.d = Integer.valueOf(intValue6);
        Integer num7 = p51Var.c;
        if (num7 != null) {
            this.b.c = num7;
        } else {
            boolean hasValue2 = d.hasValue(10);
            p51 p51Var14 = this.b;
            if (hasValue2) {
                p51Var14.c = Integer.valueOf(wen.b(context, d, 10).getDefaultColor());
            } else {
                int intValue17 = p51Var14.d.intValue();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue17, ulf.w);
                obtainStyledAttributes.getDimension(0, 0.0f);
                ColorStateList b = wen.b(context, obtainStyledAttributes, 3);
                wen.b(context, obtainStyledAttributes, 4);
                wen.b(context, obtainStyledAttributes, 5);
                obtainStyledAttributes.getInt(2, 0);
                obtainStyledAttributes.getInt(1, 1);
                if (obtainStyledAttributes.hasValue(12)) {
                    i2 = 12;
                } else {
                    i2 = 10;
                }
                obtainStyledAttributes.getResourceId(i2, 0);
                obtainStyledAttributes.getString(i2);
                obtainStyledAttributes.getBoolean(14, false);
                wen.b(context, obtainStyledAttributes, 6);
                obtainStyledAttributes.getFloat(7, 0.0f);
                obtainStyledAttributes.getFloat(8, 0.0f);
                obtainStyledAttributes.getFloat(9, 0.0f);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue17, jlf.D);
                obtainStyledAttributes2.hasValue(0);
                obtainStyledAttributes2.getFloat(0, 0.0f);
                obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
                obtainStyledAttributes2.recycle();
                this.b.c = Integer.valueOf(b.getDefaultColor());
            }
        }
        p51 p51Var15 = this.b;
        Integer num8 = p51Var.s;
        if (num8 == null) {
            intValue7 = d.getInt(3, 8388661);
        } else {
            intValue7 = num8.intValue();
        }
        p51Var15.s = Integer.valueOf(intValue7);
        p51 p51Var16 = this.b;
        Integer num9 = p51Var.u;
        if (num9 == null) {
            intValue8 = d.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            intValue8 = num9.intValue();
        }
        p51Var16.u = Integer.valueOf(intValue8);
        p51 p51Var17 = this.b;
        Integer num10 = p51Var.v;
        if (num10 == null) {
            intValue9 = d.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            intValue9 = num10.intValue();
        }
        p51Var17.v = Integer.valueOf(intValue9);
        p51 p51Var18 = this.b;
        Integer num11 = p51Var.w;
        if (num11 == null) {
            intValue10 = d.getDimensionPixelOffset(19, 0);
        } else {
            intValue10 = num11.intValue();
        }
        p51Var18.w = Integer.valueOf(intValue10);
        p51 p51Var19 = this.b;
        Integer num12 = p51Var.x;
        if (num12 == null) {
            intValue11 = d.getDimensionPixelOffset(26, 0);
        } else {
            intValue11 = num12.intValue();
        }
        p51Var19.x = Integer.valueOf(intValue11);
        p51 p51Var20 = this.b;
        Integer num13 = p51Var.y;
        if (num13 == null) {
            intValue12 = d.getDimensionPixelOffset(20, p51Var20.w.intValue());
        } else {
            intValue12 = num13.intValue();
        }
        p51Var20.y = Integer.valueOf(intValue12);
        p51 p51Var21 = this.b;
        Integer num14 = p51Var.z;
        if (num14 == null) {
            intValue13 = d.getDimensionPixelOffset(27, p51Var21.x.intValue());
        } else {
            intValue13 = num14.intValue();
        }
        p51Var21.z = Integer.valueOf(intValue13);
        p51 p51Var22 = this.b;
        Integer num15 = p51Var.C;
        if (num15 == null) {
            intValue14 = d.getDimensionPixelOffset(21, 0);
        } else {
            intValue14 = num15.intValue();
        }
        p51Var22.C = Integer.valueOf(intValue14);
        p51 p51Var23 = this.b;
        Integer num16 = p51Var.A;
        if (num16 == null) {
            intValue15 = 0;
        } else {
            intValue15 = num16.intValue();
        }
        p51Var23.A = Integer.valueOf(intValue15);
        p51 p51Var24 = this.b;
        Integer num17 = p51Var.B;
        if (num17 == null) {
            intValue16 = 0;
        } else {
            intValue16 = num17.intValue();
        }
        p51Var24.B = Integer.valueOf(intValue16);
        p51 p51Var25 = this.b;
        Boolean bool2 = p51Var.D;
        if (bool2 == null) {
            booleanValue = d.getBoolean(0, false);
        } else {
            booleanValue = bool2.booleanValue();
        }
        p51Var25.D = Boolean.valueOf(booleanValue);
        d.recycle();
        Locale locale = p51Var.n;
        p51 p51Var26 = this.b;
        if (locale == null) {
            p51Var26.n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            p51Var26.n = locale;
        }
        this.a = p51Var;
    }
}
