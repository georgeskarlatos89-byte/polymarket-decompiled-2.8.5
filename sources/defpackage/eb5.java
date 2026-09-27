package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Leb5;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class eb5 extends Exception {
    public static final /* synthetic */ int b = 0;
    public final String a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eb5(CharSequence charSequence, String str) {
        super(r1);
        String str2;
        str.getClass();
        if (charSequence != null) {
            str2 = charSequence.toString();
        } else {
            str2 = null;
        }
        this.a = str;
    }

    /* renamed from: a, reason: from getter */
    public String getA() {
        return this.a;
    }
}
