package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loc5;", "Ls6i;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class oc5 extends s6i {
    public final Exception f;

    public oc5(Exception exc) {
        super(0, 31, null, null, null, null);
        this.f = exc;
    }

    @Override // defpackage.s6i
    public final String a() {
        return "merchantReturnedCreateIntentCallbackFailure";
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f;
    }
}
