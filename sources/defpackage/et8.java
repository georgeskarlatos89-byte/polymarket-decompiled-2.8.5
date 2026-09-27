package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Let8;", "Ls6i;", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class et8 extends s6i {
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et8(String str, Throwable th) {
        super(0, 7, null, null, th.getMessage(), th);
        th.getClass();
        this.f = str;
    }

    @Override // defpackage.s6i
    public final String a() {
        String str = this.f;
        if (str == null) {
            return "unknown";
        }
        return str;
    }
}
