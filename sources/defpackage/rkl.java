package defpackage;

import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class rkl {
    public static final vl4 a = new vl4(new on4(3), false, 814365537);

    public static final Flow a(Flow flow, long j) {
        if (j >= 0) {
            if (j == 0) {
                return flow;
            }
            return new q71(new fc8(new u10(j, 13), flow, null), 5);
        }
        dmk.v("Debounce timeout should not be negative");
        return null;
    }
}
