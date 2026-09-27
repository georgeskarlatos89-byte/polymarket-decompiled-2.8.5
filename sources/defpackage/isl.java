package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class isl implements Callable {
    public static final /* synthetic */ isl b = new isl(0);
    public static final /* synthetic */ isl c = new isl(1);
    public final /* synthetic */ int a;

    public /* synthetic */ isl(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                r5n r5nVar = new r5n("internal.platform", 4);
                r5nVar.b.put("getVersion", new r5n("getVersion", 3));
                return r5nVar;
            default:
                return null;
        }
    }
}
