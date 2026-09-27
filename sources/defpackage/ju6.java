package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ju6 {
    public static final ju6 b = new ju6(0);
    public static final ju6 c = new ju6(1);
    public static final ju6 d = new ju6(2);
    public final /* synthetic */ int a;

    public /* synthetic */ ju6(int i) {
        this.a = i;
    }

    public final boolean a(ep5 ep5Var) {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                if (ep5Var != ep5.DATA_DISK_CACHE && ep5Var != ep5.MEMORY_CACHE) {
                    return true;
                }
                return false;
            default:
                if (ep5Var == ep5.REMOTE) {
                    return true;
                }
                return false;
        }
    }
}
