package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v98 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ v98(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ViewGroup viewGroup = null;
        View view = this.b;
        Context context = (Context) obj;
        switch (i) {
            case 0:
                context.getClass();
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                return view;
            default:
                context.getClass();
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent2;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                return view;
        }
    }
}
