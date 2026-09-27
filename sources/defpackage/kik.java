package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkik;", "", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class kik extends Throwable {
    public final String a;
    public final Integer b;
    public final String c;

    public kik(Integer num, String str, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
