package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ek4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pk4 b;

    public /* synthetic */ ek4(pk4 pk4Var, int i) {
        this.a = i;
        this.b = pk4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [n0d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Bundle bundle;
        int i = this.a;
        pk4 pk4Var = this.b;
        switch (i) {
            case 0:
                pk4Var.reportFullyDrawn();
                return Unit.INSTANCE;
            case 1:
                return pk4.d(pk4Var);
            case 2:
                ?? obj = new Object();
                pk4Var.getNavigationEventDispatcher().b(obj);
                return obj;
            case 3:
                Application application = pk4Var.getApplication();
                if (pk4Var.getIntent() != null) {
                    bundle = pk4Var.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new pgg(application, pk4Var, bundle);
            default:
                zhd zhdVar = new zhd(new dk4(pk4Var, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new e10(20, pk4Var, zhdVar));
                    } else {
                        pk4Var.getLifecycle().a(new fk4(0, zhdVar, pk4Var));
                    }
                }
                return zhdVar;
        }
    }
}
