package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import defpackage.e9i;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class b extends e9i {
    public final /* synthetic */ ChipTextInputComboView b;

    public b(ChipTextInputComboView chipTextInputComboView) {
        super(1);
        this.b = chipTextInputComboView;
    }

    @Override // defpackage.e9i, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.b;
        if (isEmpty) {
            chipTextInputComboView.d = ChipTextInputComboView.a(chipTextInputComboView, "00");
            return;
        }
        String a = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(a)) {
            a = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chipTextInputComboView.d = a;
    }
}
