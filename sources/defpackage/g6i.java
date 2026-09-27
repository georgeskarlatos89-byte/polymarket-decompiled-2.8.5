package defpackage;

import android.R;
import android.content.Context;
import android.util.TypedValue;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g6i {
    public final Context a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public g6i(Context context) {
        context.getClass();
        this.a = context;
        this.b = a(R.attr.colorAccent).data;
        this.c = a(R.attr.colorControlNormal).data;
        this.d = a(R.attr.textColorPrimary).data;
        this.e = a(R.attr.textColorSecondary).data;
        this.f = a(R.attr.colorPrimary).data;
    }

    public final TypedValue a(int i) {
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue;
    }
}
