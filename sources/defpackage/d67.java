package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d67 {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public d67(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        float f;
        boolean z = false;
        if (edgeEffect == null) {
            return false;
        }
        try {
            f = edgeEffect.getDistance();
        } catch (Throwable unused) {
            f = 0.0f;
        }
        if (f == 0.0f) {
            z = true;
        }
        return !z;
    }

    public final EdgeEffect a(xmd xmdVar) {
        EdgeEffect edgeEffect;
        Context context = this.a;
        try {
            edgeEffect = new EdgeEffect(context, null);
        } catch (Throwable unused) {
            edgeEffect = new EdgeEffect(context);
        }
        edgeEffect.setColor(this.b);
        if (!n1a.b(this.c, 0L)) {
            xmd xmdVar2 = xmd.Vertical;
            long j = this.c;
            if (xmdVar == xmdVar2) {
                edgeEffect.setSize((int) (j >> 32), (int) (j & 4294967295L));
            } else {
                edgeEffect.setSize((int) (4294967295L & j), (int) (j >> 32));
            }
        }
        return edgeEffect;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect == null) {
            EdgeEffect a = a(xmd.Vertical);
            this.e = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect == null) {
            EdgeEffect a = a(xmd.Horizontal);
            this.f = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect == null) {
            EdgeEffect a = a(xmd.Horizontal);
            this.g = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect == null) {
            EdgeEffect a = a(xmd.Vertical);
            this.d = a;
            return a;
        }
        return edgeEffect;
    }
}
