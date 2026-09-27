package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bgj extends wfj {
    public final /* synthetic */ int a;

    public /* synthetic */ bgj(int i) {
        this.a = i;
    }

    @Override // defpackage.wfj
    public final Object b(ufa ufaVar) {
        switch (this.a) {
            case 0:
                try {
                    return new AtomicInteger(ufaVar.nextInt());
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            default:
                return new AtomicBoolean(ufaVar.A());
        }
    }

    @Override // defpackage.wfj
    public final void c(xga xgaVar, Object obj) {
        switch (this.a) {
            case 0:
                xgaVar.N(((AtomicInteger) obj).get());
                return;
            default:
                xgaVar.Y(((AtomicBoolean) obj).get());
                return;
        }
    }
}
