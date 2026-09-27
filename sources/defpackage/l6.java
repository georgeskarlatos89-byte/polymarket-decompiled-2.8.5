package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l6 extends ClickableSpan {
    public final int a;
    public final d7 b;
    public final int c;

    public l6(int i, d7 d7Var, int i2) {
        this.a = i;
        this.b = d7Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
