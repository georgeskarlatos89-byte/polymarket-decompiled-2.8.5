package defpackage;

import androidx.compose.ui.text.input.TextInputService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hk6 implements xdh {
    public final TextInputService a;

    public hk6(TextInputService textInputService) {
        this.a = textInputService;
    }

    public final void a() {
        this.a.a.hideSoftwareKeyboard();
    }

    public final void b() {
        TextInputService textInputService = this.a;
        if (((bwi) textInputService.b.get()) != null) {
            textInputService.a.showSoftwareKeyboard();
        }
    }
}
