package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld0;", "Ls6i;", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d0 extends s6i {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d0(int i, int i2, q6i q6iVar, String str, String str2, Throwable th) {
        super(r3, r4, r5, r6, str2);
        int i3;
        q6i q6iVar2;
        String str3;
        Throwable th2;
        q6iVar = (i2 & 1) != 0 ? null : q6iVar;
        str = (i2 & 2) != 0 ? null : str;
        i = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            if (q6iVar != null) {
                str2 = q6iVar.b;
            } else {
                str2 = null;
            }
        }
        if ((i2 & 16) != 0) {
            q6i q6iVar3 = q6iVar;
            i3 = i;
            q6iVar2 = q6iVar3;
            str3 = str;
            th2 = null;
        } else {
            q6i q6iVar4 = q6iVar;
            i3 = i;
            q6iVar2 = q6iVar4;
            str3 = str;
            th2 = th;
        }
    }

    @Override // defpackage.s6i
    public final String a() {
        return "apiError";
    }
}
