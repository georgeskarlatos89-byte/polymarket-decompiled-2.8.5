package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lo4 extends ClickableSpan {
    public final qab a;

    public lo4(qab qabVar) {
        this.a = qabVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        qab qabVar = this.a;
        ffb a = qabVar.a();
        if (a != null) {
            a.a(qabVar);
        }
    }
}
