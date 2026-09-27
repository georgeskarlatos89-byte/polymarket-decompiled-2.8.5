package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e1h {
    public final ArrayList a;
    public PointF b;
    public boolean c;

    public e1h(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.a.size());
        sb.append("closed=");
        return hdi.t(sb, this.c, '}');
    }

    public e1h() {
        this.a = new ArrayList();
    }
}
