package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b11 {
    public final /* synthetic */ int a;

    public /* synthetic */ b11(int i) {
        this.a = i;
    }

    public final Set a() {
        switch (this.a) {
            case 0:
                return Set.of('<');
            case 1:
                return Set.of('\\');
            case 2:
                return Set.of('`');
            case 3:
                return Set.of('&');
            default:
                return Set.of('<');
        }
    }
}
