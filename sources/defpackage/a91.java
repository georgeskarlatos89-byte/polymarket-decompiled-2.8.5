package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class a91 extends BasePendingResult {
    public abstract void f(cd0 cd0Var);

    public final void g(Status status) {
        arn.a("Failed result must not be success", !status.O());
        e(b(status));
    }
}
