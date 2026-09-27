package defpackage;

import com.polymarket.android.R;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbje;", "Lr6d;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class bje extends r6d {
    public final Throwable b;
    public final String c = "pdolParsingError";
    public final il9 d = xun.b(R.string.stripe_something_went_wrong);
    public final String e = "Failed to parse PDOL template";

    public bje(Throwable th) {
        this.b = th;
    }

    @Override // defpackage.r6d
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // defpackage.r6d
    /* renamed from: c */
    public final d3g getD() {
        return this.d;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.e;
    }
}
