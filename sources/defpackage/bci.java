package defpackage;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bci {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;

    public bci(View view) {
        this.a = (TextView) view.findViewById(R.id.text1);
        this.b = (TextView) view.findViewById(R.id.text2);
        this.c = (ImageView) view.findViewById(R.id.icon1);
        this.d = (ImageView) view.findViewById(R.id.icon2);
        this.e = (ImageView) view.findViewById(com.polymarket.android.R.id.edit_query);
    }
}
