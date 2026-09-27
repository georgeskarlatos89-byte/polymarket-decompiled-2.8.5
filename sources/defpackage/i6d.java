package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li6d;", "Lr6d;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i6d extends r6d {
    public final r6d b;
    public final String c;
    public final d3g d;
    public final LinkedHashMap e;

    public i6d(r6d r6dVar, ArrayList arrayList) {
        this.b = r6dVar;
        this.c = r6dVar.getC();
        this.d = r6dVar.getD();
        this.e = d1c.j(r6dVar.getD(), c1c.b(new Pair("executed_commands", arrayList)));
    }

    @Override // defpackage.r6d
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // defpackage.r6d
    /* renamed from: b */
    public final Map getD() {
        return this.e;
    }

    @Override // defpackage.r6d
    /* renamed from: c, reason: from getter */
    public final d3g getD() {
        return this.d;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
