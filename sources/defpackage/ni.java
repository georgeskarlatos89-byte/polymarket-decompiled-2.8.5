package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ni {
    public static final ni c = new ni("TINK", 0);
    public static final ni d = new ni("CRUNCHY", 0);
    public static final ni e = new ni("LEGACY", 0);
    public static final ni f = new ni("NO_PREFIX", 0);
    public static final ni g = new ni("TINK", 1);
    public static final ni h = new ni("CRUNCHY", 1);
    public static final ni i = new ni("NO_PREFIX", 1);
    public static final ni j = new ni("ENABLED", 2);
    public static final ni k = new ni("DISABLED", 2);
    public static final ni l = new ni("DESTROYED", 2);
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ ni(String str, int i2) {
        this.a = i2;
        this.b = str;
    }

    public String toString() {
        int i2 = this.a;
        String str = this.b;
        switch (i2) {
            case 0:
            case 1:
            case 2:
                return str;
            default:
                return super.toString();
        }
    }
}
