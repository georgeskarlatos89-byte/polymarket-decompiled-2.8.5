package defpackage;

import bo.app.wf;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class vz5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf b;

    public /* synthetic */ vz5(wf wfVar, int i) {
        this.a = i;
        this.b = wfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        wf wfVar = this.b;
        switch (i) {
            case 0:
                return "Configured image download retry backoff from server config: min=" + wfVar.k() + "ms, max=" + wfVar.j() + "ms, scale=" + wfVar.l();
            default:
                return wf.a(wfVar);
        }
    }
}
