package defpackage;

import android.util.Size;
import android.view.Surface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pq9 extends gi6 {
    public final /* synthetic */ int o = 0;
    public final Object p;

    public pq9(Surface surface) {
        super(gi6.k, 0);
        this.p = surface;
    }

    @Override // defpackage.gi6
    public final ujb f() {
        int i = this.o;
        Object obj = this.p;
        switch (i) {
            case 0:
                return t79.d((Surface) obj);
            default:
                return ((lei) obj).f;
        }
    }

    public pq9(Surface surface, Size size, int i) {
        super(size, i);
        this.p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq9(lei leiVar, Size size) {
        super(size, 34);
        this.p = leiVar;
    }
}
