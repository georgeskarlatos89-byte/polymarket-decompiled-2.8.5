package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.places.internal.zzqv;
import defpackage.d55;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzae implements View.OnFocusChangeListener {
    public /* synthetic */ zzae(byte[] bArr) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) d55.l(view.getContext(), InputMethodManager.class);
            if (inputMethodManager == null) {
                return;
            }
            if (z) {
                inputMethodManager.showSoftInput(view, 1);
            } else {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    private zzae() {
        throw null;
    }
}
