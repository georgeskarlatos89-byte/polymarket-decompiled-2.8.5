package defpackage;

import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kdc implements zrb {
    public final zrb a;

    public kdc(zrb zrbVar) {
        this.a = zrbVar;
    }

    @Override // defpackage.zrb
    public final void log(String str) {
        str.getClass();
        while (true) {
            int length = str.length();
            zrb zrbVar = this.a;
            int i = 4000;
            if (length > 4000) {
                String substring = str.substring(0, 4000);
                int U = StringsKt.U(substring, '\n', 0, 6);
                if (U >= 3000) {
                    substring = substring.substring(0, U);
                    i = U + 1;
                }
                zrbVar.log(substring);
                str = str.substring(i);
            } else {
                zrbVar.log(str);
                return;
            }
        }
    }
}
