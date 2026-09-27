package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class myi {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public myi(Context context) {
        g6i g6iVar = new g6i(context);
        int a = a(context, g6iVar.b, R.color.stripe_accent_color_default);
        this.a = a;
        a(context, g6iVar.c, R.color.stripe_control_normal_color_default);
        int a2 = a(context, g6iVar.e, R.color.stripe_color_text_secondary_default);
        this.b = a2;
        this.c = fc4.j(a, context.getResources().getInteger(R.integer.stripe_light_text_alpha_hex));
        this.d = fc4.j(a2, context.getResources().getInteger(R.integer.stripe_light_text_alpha_hex));
    }

    public static int a(Context context, int i, int i2) {
        if (Color.alpha(i) < 16) {
            return d55.d(context, i2);
        }
        return i;
    }

    public myi(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
