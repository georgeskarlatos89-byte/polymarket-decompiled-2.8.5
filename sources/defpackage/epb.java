package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lepb;", "Ls6i;", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class epb extends s6i {
    public final String f;
    public final String g;

    public epb(String str, String str2, String str3, String str4, String str5) {
        super(0, 14, new q6i(str5, str3, str4, 234), null, str, null);
        this.f = str;
        this.g = str2;
    }

    @Override // defpackage.s6i
    public final String a() {
        String str = this.g;
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public /* synthetic */ epb(String str, String str2) {
        this(str, str2, null, null, null);
    }
}
