package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lykd;", "Lk91;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ykd extends k91 {
    public final String b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykd(String str, String str2) {
        super(str2);
        str2.getClass();
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.k91, java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }
}
