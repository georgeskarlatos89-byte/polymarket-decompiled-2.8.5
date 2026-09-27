package com.socure.idplus.device.internal.input.manager.view;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import com.socure.idplus.device.internal.behavior.model.InputChangeAction;
import com.socure.idplus.device.internal.behavior.model.InputChangeEvent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a implements TextWatcher {
    public final int a;
    public InputChangeAction b = InputChangeAction.UNKNOWN;
    public final /* synthetic */ b c;

    public a(b bVar, int i) {
        this.c = bVar;
        this.a = i;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            this.b = InputChangeAction.UNKNOWN;
            b bVar = this.c;
            if (bVar.b.b && i3 == 0) {
                String valueOf = String.valueOf(bVar.a());
                if (valueOf.length() == i2 && Intrinsics.areEqual(charSequence.subSequence(i, i2 + i).toString(), valueOf)) {
                    this.b = InputChangeAction.CUT;
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        if (!Intrinsics.areEqual(this.c.g, String.valueOf(charSequence))) {
            this.c.g = String.valueOf(charSequence);
            if (charSequence != null) {
                b bVar = this.c;
                if (bVar.b.b && i3 != 0) {
                    String valueOf = String.valueOf(bVar.a());
                    if (valueOf.length() == i3 && Intrinsics.areEqual(charSequence.subSequence(i, i3 + i).toString(), valueOf)) {
                        this.b = InputChangeAction.PASTE;
                    }
                }
            }
            com.socure.idplus.device.internal.input.producer.c cVar = this.c.d;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.c.f == this.a) {
                z = true;
            } else {
                z = false;
            }
            InputChangeEvent inputChangeEvent = new InputChangeEvent(uptimeMillis, z, this.b);
            cVar.getClass();
            cVar.a(inputChangeEvent);
            this.b = InputChangeAction.UNKNOWN;
            this.c.b.b = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }
}
