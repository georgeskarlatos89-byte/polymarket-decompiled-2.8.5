package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ikl;
import defpackage.kvd;
import defpackage.nrf;
import defpackage.pq4;
import defpackage.r1;
import defpackage.s1;
import defpackage.sr8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Ls1;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "", "value", "b", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeView extends s1 {
    public final kvd a;

    /* renamed from: b, reason: from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.a = ikl.c(null);
    }

    @Override // defpackage.s1
    public final void Content(pq4 pq4Var, int i) {
        int i2;
        boolean z;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(420213850);
        if (sr8Var.j(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i3 & 1, z)) {
            Function2 function2 = (Function2) this.a.getValue();
            if (function2 == null) {
                sr8Var.e0(-1238823553);
            } else {
                sr8Var.e0(98585282);
                function2.invoke(sr8Var, 0);
            }
            sr8Var.s(false);
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new r1(this, i, 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.s1
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(Function2<? super pq4, ? super Integer, Unit> content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.a.setValue(content);
        if (!isAttachedToWindow() && getComposeViewContext$ui() == null) {
            return;
        }
        createComposition();
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
