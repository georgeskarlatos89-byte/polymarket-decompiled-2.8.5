package defpackage;

import com.polymarket.android.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldt8;", "Lr6d;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class dt8 extends r6d {
    public final String b;
    public final d3g c;
    public final Map d;

    public dt8(String str, il9 il9Var, int i) {
        il9Var = (i & 2) != 0 ? xun.b(R.string.stripe_tap_to_add_card_default_error_action) : il9Var;
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        this.b = str;
        this.c = il9Var;
        this.d = zc7Var;
    }

    @Override // defpackage.r6d
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // defpackage.r6d
    /* renamed from: b, reason: from getter */
    public final Map getD() {
        return this.d;
    }

    @Override // defpackage.r6d
    /* renamed from: c, reason: from getter */
    public final d3g getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dt8) {
                dt8 dt8Var = (dt8) obj;
                if (!Intrinsics.areEqual(this.b, dt8Var.b) || !Intrinsics.areEqual(this.c, dt8Var.c) || !Intrinsics.areEqual(this.d, dt8Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("GenericNfcScanningError(errorCode=");
        sb.append(this.b);
        sb.append(", userMessage=");
        sb.append(this.c);
        sb.append(", parameters=");
        return ace.n(sb, this.d, ")");
    }
}
