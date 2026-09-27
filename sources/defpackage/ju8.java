package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ju8 {
    public final List a;

    public ju8(List list) {
        list.getClass();
        this.a = list;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<rd5> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (rd5 rd5Var : list2) {
                    }
                }
                for (rd5 rd5Var2 : this.a) {
                }
                return;
            }
            return;
        }
        dmk.v("credentialOptions should not be empty");
        throw null;
    }
}
