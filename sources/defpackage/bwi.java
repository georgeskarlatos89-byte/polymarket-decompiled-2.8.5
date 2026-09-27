package defpackage;

import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bwi {
    public final TextInputService a;
    public final PlatformTextInputService b;

    public bwi(TextInputService textInputService, PlatformTextInputService platformTextInputService) {
        this.a = textInputService;
        this.b = platformTextInputService;
    }

    public final void a(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        if (Intrinsics.areEqual((bwi) this.a.b.get(), this)) {
            this.b.updateState(textFieldValue, textFieldValue2);
        }
    }
}
