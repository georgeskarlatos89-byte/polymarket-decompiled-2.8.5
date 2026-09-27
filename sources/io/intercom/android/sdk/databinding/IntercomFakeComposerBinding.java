package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import defpackage.dmk;
import defpackage.y8k;
import io.intercom.android.sdk.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomFakeComposerBinding implements y8k {
    public final EditText composerInputView;
    private final EditText rootView;

    private IntercomFakeComposerBinding(EditText editText, EditText editText2) {
        this.rootView = editText;
        this.composerInputView = editText2;
    }

    public static IntercomFakeComposerBinding bind(View view) {
        if (view != null) {
            EditText editText = (EditText) view;
            return new IntercomFakeComposerBinding(editText, editText);
        }
        dmk.s("rootView");
        return null;
    }

    public static IntercomFakeComposerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_fake_composer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.y8k
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @Override // defpackage.y8k
    public EditText getRoot() {
        return this.rootView;
    }

    public static IntercomFakeComposerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
