package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ot1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ot1(int i) {
        this.a = i;
    }

    public final int a(Object obj) {
        switch (this.a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String c() {
        switch (this.a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
