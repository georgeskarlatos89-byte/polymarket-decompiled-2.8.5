package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldb5;", "Leb5;", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class db5 extends eb5 {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db5(CharSequence charSequence, String str) {
        super(charSequence, str);
        str.getClass();
        this.c = str;
        if (str.length() > 0) {
            return;
        }
        dmk.v("type must not be empty");
        throw null;
    }

    @Override // defpackage.eb5
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }
}
