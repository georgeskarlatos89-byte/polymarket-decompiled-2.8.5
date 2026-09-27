package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class u62 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ u62(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Window window;
        Window window2;
        Window window3;
        int i = this.a;
        ls6 ls6Var = null;
        View view = this.b;
        switch (i) {
            case 0:
                ViewParent parent = view.getParent();
                if (parent instanceof ls6) {
                    ls6Var = (ls6) parent;
                }
                if (ls6Var != null && (window = ls6Var.getWindow()) != null) {
                    window.clearFlags(2);
                }
                return Unit.INSTANCE;
            case 1:
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof ls6) {
                    ls6Var = (ls6) parent2;
                }
                if (ls6Var != null && (window2 = ls6Var.getWindow()) != null) {
                    window2.clearFlags(2);
                    window2.addFlags(40);
                    window2.setGravity(49);
                    window2.setLayout(-2, -2);
                    window2.setWindowAnimations(0);
                }
                return Unit.INSTANCE;
            default:
                ViewParent parent3 = view.getParent();
                if (parent3 instanceof ls6) {
                    ls6Var = (ls6) parent3;
                }
                if (ls6Var != null && (window3 = ls6Var.getWindow()) != null) {
                    window3.clearFlags(2);
                }
                return Unit.INSTANCE;
        }
    }
}
