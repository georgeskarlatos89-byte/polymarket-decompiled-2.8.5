package defpackage;

import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qwi implements y0c {
    public static owi b(pwi pwiVar) {
        String str;
        boolean z;
        Integer num = null;
        if (pwiVar != null) {
            str = pwiVar.a;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (pwiVar != null) {
            num = pwiVar.b;
        }
        if (StringsKt.T(str) && num == null) {
            z = false;
        } else {
            z = true;
        }
        return new owi(ikl.c(str), ikl.c(num), ikl.c(Boolean.valueOf(z)));
    }

    @Override // defpackage.y0c
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return b((pwi) obj);
    }
}
