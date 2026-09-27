package defpackage;

import android.view.View;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.g;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w8b {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.k.size();
        View view2 = null;
        int i = bd0.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((g) this.k.get(i2)).itemView;
            tsf tsfVar = (tsf) view3.getLayoutParams();
            if (view3 != view && !tsfVar.a.isRemoved() && (layoutPosition = (tsfVar.a.getLayoutPosition() - this.d) * this.e) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((tsf) view2.getLayoutParams()).a.getLayoutPosition();
        }
    }

    public final View b(f fVar) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((g) this.k.get(i)).itemView;
                tsf tsfVar = (tsf) view.getLayoutParams();
                if (!tsfVar.a.isRemoved() && this.d == tsfVar.a.getLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View d = fVar.d(this.d);
        this.d += this.e;
        return d;
    }
}
