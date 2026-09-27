package defpackage;

import com.polymarket.chartlogic.ChartSeriesSnapshot;
import com.polymarket.data.ETimeSeriesEntry;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ph {
    public final String a;
    public final ETimeSeriesEntry b;
    public final ChartSeriesSnapshot c;
    public final long d;
    public final List e;

    public ph(String str, ETimeSeriesEntry eTimeSeriesEntry, ChartSeriesSnapshot chartSeriesSnapshot, long j, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = eTimeSeriesEntry;
        this.c = chartSeriesSnapshot;
        this.d = j;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ph) {
                ph phVar = (ph) obj;
                if (Intrinsics.areEqual(this.a, phVar.a) && Intrinsics.areEqual(this.b, phVar.b) && Intrinsics.areEqual(this.c, phVar.c)) {
                    long j = phVar.d;
                    int i = ib4.n;
                    if (!hkj.a(this.d, j) || !Intrinsics.areEqual(this.e, phVar.e)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return this.e.hashCode() + woa.d(hashCode, 31, this.d);
    }

    public final String toString() {
        String h = ib4.h(this.d);
        StringBuilder sb = new StringBuilder("AdvancedPreparedSeries(id=");
        sb.append(this.a);
        sb.append(", entry=");
        sb.append(this.b);
        sb.append(", snapshot=");
        sb.append(this.c);
        sb.append(", color=");
        sb.append(h);
        sb.append(", normalizedPoints=");
        return ix2.q(sb, this.e, ")");
    }
}
