package bo.app;

import defpackage.dmk;
import defpackage.yj9;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum ng implements yj9 {
    SUBSCRIBED,
    UNSUBSCRIBED;

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return "unsubscribed";
            }
            dmk.a();
            return null;
        }
        return "subscribed";
    }
}
