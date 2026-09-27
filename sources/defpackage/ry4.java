package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ry4 {
    public boolean a = false;
    public qy4 b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public ry4(ry4 ry4Var, Object obj) {
        ry4Var.getClass();
        this.b = ry4Var.b;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, ry4] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        qy4 qy4Var;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), nlf.d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        qy4 qy4Var2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                qy4Var2 = qy4.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    qy4Var = qy4.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    qy4Var = qy4.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    qy4Var = qy4.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    qy4Var = qy4.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    qy4Var = qy4.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    qy4Var = qy4.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    qy4Var = qy4.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    qy4Var = qy4.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                qy4Var2 = qy4Var;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            ?? obj3 = new Object();
            obj3.b = qy4Var2;
            obj3.a = z;
            obj3.b(obj);
            hashMap.put(str, obj3);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (this.b.ordinal()) {
            case 0:
            case 7:
                this.c = ((Integer) obj).intValue();
                return;
            case 1:
                this.d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                return;
            case 4:
                this.e = (String) obj;
                return;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
