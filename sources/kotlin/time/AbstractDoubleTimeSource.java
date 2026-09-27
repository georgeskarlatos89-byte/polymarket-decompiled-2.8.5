package kotlin.time;

import defpackage.d47;
import defpackage.h2j;
import defpackage.hm6;
import defpackage.w1;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@hm6
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "", "w1", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractDoubleTimeSource implements h2j {
    @Override // defpackage.h2j
    public final TimeMark a() {
        double b = b();
        d47.b.getClass();
        return new w1(b, this, 0L, null);
    }

    public abstract double b();
}
