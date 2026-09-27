package androidx.compose.ui.text.input;

import defpackage.hm6;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@hm6
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextInputService;", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class TextInputService {
    public final PlatformTextInputService a;
    public final AtomicReference b = new AtomicReference(null);

    public TextInputService(PlatformTextInputService platformTextInputService) {
        this.a = platformTextInputService;
    }
}
