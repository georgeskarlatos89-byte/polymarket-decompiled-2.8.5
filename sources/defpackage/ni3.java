package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ni3 extends cnn {
    public static final ni3 b = new ni3(0);
    public static final ni3 c = new ni3(1);
    public static final ni3 d = new ni3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ ni3(int i) {
        this.a = i;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "ChannelsStateData.Loading";
            case 1:
                return "ChannelsStateData.NoQueryActive";
            default:
                return "ChannelsStateData.OfflineNoResults";
        }
    }
}
