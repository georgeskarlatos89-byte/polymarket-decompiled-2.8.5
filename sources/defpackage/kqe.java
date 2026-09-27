package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.g;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kqe extends g {
    public final TextView a;
    public final View b;

    public kqe(View view) {
        super(view);
        if (u1k.a < 26) {
            view.setFocusable(true);
        }
        this.a = (TextView) view.findViewById(R.id.exo_text);
        this.b = view.findViewById(R.id.exo_check);
    }
}
