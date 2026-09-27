package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f67 extends View {
    public final /* synthetic */ tb1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f67(tb1 tb1Var, Context context) {
        super(context);
        this.a = tb1Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.a.run();
    }
}
