package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class he7 extends e9i {
    public final /* synthetic */ je7 b;

    public he7(je7 je7Var) {
        super(1);
        this.b = je7Var;
    }

    @Override // defpackage.e9i, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.b().a();
    }

    @Override // defpackage.e9i, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.b().b();
    }
}
